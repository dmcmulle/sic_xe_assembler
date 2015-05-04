import java.io.Serializable;

/**
 * Stores a serializable object representation of a line.
 * These objects will be written to a temporary interfile for later use
 * when creating the object file.
 */
public class Statement implements Serializable, Comparable<Object> {
	//serial id for this object
	private static final long serialVersionUID = 1277501718493758171L;

	//variable to store the statements label
    private final String _label;
    
    //variable to store the operation
    private final String _operation;
    
    //variable to store the symbols
    private final String[] _symbols;
    
    //variable to store the commment
    private final String _comment;
    
    //variable to store if extended format
    private final boolean _extended;
    
    //variable to store 
    private int _location;
    
    /**
     * Constructor that supports comment
     * @param label
     * @param operation
     * @param extended
     * @param symbols
     * @param comment
     */
    private Statement(String label, String operation, boolean extended, String[] symbols, String comment) {
        _label = label;
        _operation = operation;
        _extended = extended;
        _symbols = symbols;
        _comment = comment;
    }
    
    /**
     * Constructor that has null comment
     * @param label
     * @param operation
     * @param extended
     * @param symbols
     */
    public Statement(String label, String operation, boolean extended, String[] symbols) {
        this(label, operation, extended, symbols, null);
    }
    
    /**
     * Statement that is ONLY a comment
     * @param comment
     */
    public Statement(String comment) {
        this(null, ".", false, null, comment);
    }
    
    //getter label
    public String label() {
        return _label;
    }
    
    //getter operation
    public String operation() {
        return _operation;
    }
    
    //getter operand 1
    public String firstOperand() {
        return _symbols[0];
    }
    
    //getter operand 2
    public String secondOperand() {
        return _symbols[1];
    }
    
    //return true if comment
    public boolean isComment() {
        return _comment != null;
    }
    
    //return true if extended format
    public boolean isExtended() {
        return _extended;
    }
    
    //set location
    public void setLocation(int loc) {
        _location = loc;
    }
    
    //getter location
    public int location() {
        return _location;
    }
    
    /**
     * Parses a line, building the appropriate tokens.
     * This function is used during the first pass.
     * @param statement - text of the statement
     * @return - statement object containing info from the line
     */
    public static Statement parse(String statement) {
    	//push words with commas together
    	String temp = statement.replaceAll(",\\s+", ",");
    	
    	//replace every instance of a space to a singular space
    	temp = temp.trim().replaceAll("\\s+", " ");
    	
    	//split based on said space
        String[] tokens = temp.split(" ");
        
        //keep track if we are on a comment
        boolean onComment = false;
        
		for(int i = 0; i < tokens.length; i++)
		{
			String firstCharacter = ("");
			if(tokens[i].length() > 0)
				firstCharacter = Character.toString(tokens[i].charAt(0));
			
			//if the character starts with a period, we must erase all lines after (inclusive)
			if(firstCharacter.equals(".") || onComment)
			{
				//erase all comment tokens
				int newLength = i;
				String[] newTokens = new String[newLength];
				
				for(int j = 0; j < newLength; j++)
					newTokens[j] = tokens[j];
				
				tokens = newTokens;
			}
		}
		        
		//default variable values
        String label, operation;
        String[] symbols;
        
        //keep track if this command is extended
        boolean extended = false;
        int index = 0;

        //if 3 tokens, the label is located at the 1st token
        if (tokens.length == 3) {
            label = tokens[index++];
        } else {
        	//else, no label
            label = null;
        }
        
        //ignore blank lines
        if(tokens.length == 0)
        	return null;
        	
        //operation equals 2nd value
        operation = tokens[index++];
        
        //if first character is +, we are in extended mode
        if (operation.charAt(0) == '+') {
        	//set exteded on
            extended = true;
            
            //trim the plus sign off
            operation = operation.substring(1);
        }
        
        //TODO: Handle use assembler directive
        //if (operation.equals("USE"))
        //{
        //	return null;
        //}

        //blank symbols variable
        symbols = new String[2];
        
        //if there are still remaining tokens to be parsed
        if (index < tokens.length) {
        	//split the tokens that are seperated with commas
            int pos = tokens[index].indexOf(',');
            if (pos >= 0) {
                symbols[0] = tokens[index].substring(0, pos);
                symbols[1] = tokens[index].substring(pos + 1);
            } else {
                symbols[0] = tokens[index];
                symbols[1] = null;
            }
        } else {
        	//symbols are nothing
            symbols[0] = symbols[1] = null;
        }

        return new Statement(label, operation, extended, symbols);
    }
    
    /**
     * Simple tostring method, used when writing the readable interfile
     */
    @Override
    public String toString() {
        String s = String.format("%1$04X", _location) + "\t\t";
        
        if (isComment()) {
            s += ".\t" + _comment;
        } else {
            if (_label != null) {
                s += _label;
            }
            
            if(_label != null && _label.length() >= 4)
            	s += "\t";
            else
            	s+="\t\t";
            
            if (_extended) {
                s += '+';
            }
            
            s += _operation;
            
            if(_operation.length() >= 4)
            	s+="\t";
            else
            	if(_operation.length() == 3 && _extended)
            		s+="\t";
            	else
            		s+="\t\t";
            if (_symbols != null) {
                if (_symbols[0] != null) {
                    s += _symbols[0];
                }

                if (_symbols[1] != null) {
                    s +=  "," + _symbols[1];
                }
            }
        }
        
        return s;
    }

    /**
     * Compare to (needed for serialization and comparable)
     */
    @Override
    public int compareTo(Object o) {
        return _operation.compareTo((String) o);
    }
}