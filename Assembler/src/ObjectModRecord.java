/**
 * Generates the modification record for object file
 */

public class ObjectModRecord implements ObjectRecordInterface {
	//location
    private final int _location;
    
    //length
    private final int _length;
    
    //constructor
    public ObjectModRecord(int modifiedLoc, int modifiedLen) {
        _location = modifiedLoc;
        _length = modifiedLen;
    }
    
    //get string representation of this modification record
    public String toObjectProgram() {
        return String.format("M%06X%02X", _location, _length);
    }
    
}