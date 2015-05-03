/**
 * Generates the end record for object file
 */
public class ObjectRecordEnd implements ObjectRecordInterface {
	//start address of program
    private final int _startAddress;
    
    //constructor
    public ObjectRecordEnd(int startAddr) {
        _startAddress = startAddr;
    }
    
    //get the string representation of the end record
    public String toObjectProgram() {
        return String.format("E%1$06X", _startAddress);
    }
    
}