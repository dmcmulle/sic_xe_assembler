/**
 * Basic object to store opcode format, mneomonic, and format type (used in optab)
 */
public class Instruction {
	//variable to store mnemonic
    private String _mnemonic;
    
    //variable to store opcode
    private String _opcode;
    
    //variable to store format
    private String _format;
    
    //constructor
    public Instruction(String mnemonic, String format, String opcode) {
        _mnemonic = mnemonic;
        _opcode = opcode;
        _format = format;
    }
    
    //getter mnemonic
    public String mnemonic() {
        return _mnemonic;
    }
    
    //getter opcode
    public String opcode() {
        return _opcode;
    }
    
    //getter format
    public String format() {
        return _format;
    }
}