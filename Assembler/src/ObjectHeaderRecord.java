/**
 * Generates the header record for object file
 */
public class ObjectHeaderRecord implements ObjectRecordInterface {
	//program name
    private final String _programName;
    
    //program start address
    private final int _startAddress;
    
    //program length
    private final int _programLength;
    
    //constructor
    public ObjectHeaderRecord(String name, int startAddr, int length) {
        _programName = name;
        _startAddress = startAddr;
        _programLength = length;
    }
    
    //get the string representation of this header record
    public String toObjectProgram() {
        return String.format("H%1$-6s%2$06X%3$06X", _programName, _startAddress, _programLength);
    }
    
}