import java.util.HashMap;
import java.util.Map;

public class TableBuilder {
	private static final Map<String, Instruction> _operationTable;
	private static final Map<String, Integer> _registerTable;

	static {
		_operationTable = new HashMap<>();

		_operationTable.put("ADD", new Instruction("ADD", "3/4", "18"));
		_operationTable.put("ADDF", new Instruction("ADDF", "3/4", "58"));
		_operationTable.put("ADDR", new Instruction("ADDR", "2", "90"));
		_operationTable.put("AND", new Instruction("AND", "3/4", "40"));
		_operationTable.put("CLEAR", new Instruction("CLEAR", "2", "B4"));
		_operationTable.put("COMP", new Instruction("COMP", "3/4", "28"));
		_operationTable.put("COMPF", new Instruction("COMPF", "3/4", "88"));
		_operationTable.put("COMPR", new Instruction("COMPR", "2", "A0"));
		_operationTable.put("DIV", new Instruction("DIV", "3/4", "24"));
		_operationTable.put("DIVF", new Instruction("DIVF", "3/4", "64"));
		_operationTable.put("DIVR", new Instruction("DIVR", "2", "9C"));
		_operationTable.put("FIX", new Instruction("FIX", "1", "C4"));
		_operationTable.put("FLOAT", new Instruction("FLOAT", "1", "C0"));
		_operationTable.put("HIO", new Instruction("HIO", "1", "F4"));
		_operationTable.put("J", new Instruction("J", "3/4", "3C"));
		_operationTable.put("JEQ", new Instruction("JEQ", "3/4", "30"));
		_operationTable.put("JGT", new Instruction("JGT", "3/4", "34"));
		_operationTable.put("JLT", new Instruction("JLT", "3/4", "38"));
		_operationTable.put("JSUB", new Instruction("JSUB", "3/4", "48"));
		_operationTable.put("LDA", new Instruction("LDA", "3/4", "00"));
		_operationTable.put("LDB", new Instruction("LDB", "3/4", "68"));
		_operationTable.put("LDCH", new Instruction("LDCH", "3/4", "50"));
		_operationTable.put("LDF", new Instruction("LDF", "3/4", "70"));
		_operationTable.put("LDL", new Instruction("LDL", "3/4", "08"));
		_operationTable.put("LDS", new Instruction("LDS", "3/4", "6C"));
		_operationTable.put("LDT", new Instruction("LDT", "3/4", "74"));
		_operationTable.put("LDX", new Instruction("LDX", "3/4", "04"));
		_operationTable.put("LPS", new Instruction("LPS", "3/4", "D0"));
		_operationTable.put("MUL", new Instruction("MUL", "3/4", "20"));
		_operationTable.put("MULF", new Instruction("MULF", "3/4", "60"));
		_operationTable.put("MULR", new Instruction("MULR", "2", "98"));
		_operationTable.put("NORM", new Instruction("NORM", "1", "C8"));
		_operationTable.put("OR", new Instruction("OR", "3/4", "44"));
		_operationTable.put("RD", new Instruction("RD", "3/4", "D8"));
		_operationTable.put("RMO", new Instruction("RMO", "3/4", "AC"));
		_operationTable.put("RSUB", new Instruction("RSUB", "3/4", "4C"));
		_operationTable.put("SHIFTL", new Instruction("SHIFTL", "2", "A4"));
		_operationTable.put("SHIFTR", new Instruction("SHIFTR", "2", "A8"));
		_operationTable.put("SIO", new Instruction("SIO", "1", "F0"));
		_operationTable.put("SSK", new Instruction("SSK", "3/4", "EC"));
		_operationTable.put("STA", new Instruction("STA", "3/4", "0C"));
		_operationTable.put("STB", new Instruction("STB", "3/4", "78"));
		_operationTable.put("STCH", new Instruction("STCH", "3/4", "54"));
		_operationTable.put("STF", new Instruction("STF", "3/4", "80"));
		_operationTable.put("STI", new Instruction("STI", "3/4", "D4"));
		_operationTable.put("STL", new Instruction("STL", "3/4", "14"));
		_operationTable.put("STS", new Instruction("STS", "3/4", "7C"));
		_operationTable.put("STSW", new Instruction("STSW", "3/4", "E8"));
		_operationTable.put("STT", new Instruction("STT", "3/4", "84"));
		_operationTable.put("STX", new Instruction("STX", "3/4", "10"));
		_operationTable.put("SUB", new Instruction("SUB", "3/4", "1C"));
		_operationTable.put("SUBF", new Instruction("SUBF", "3/4", "5C"));
		_operationTable.put("SUBR", new Instruction("SUBR", "2", "94"));
		_operationTable.put("SVC", new Instruction("SVC", "2", "B0"));
		_operationTable.put("TD", new Instruction("TD", "3/4", "E0"));
		_operationTable.put("TIO", new Instruction("TIO", "1", "F8"));
		_operationTable.put("TIX", new Instruction("TIX", "3/4", "2C"));
		_operationTable.put("TIXR", new Instruction("TIXR", "2", "B8"));
		_operationTable.put("WD", new Instruction("WD", "3/4", "DC"));

		_registerTable = new HashMap<>();

		_registerTable.put(null, 0);
		_registerTable.put("A", 0);
		_registerTable.put("X", 1);
		_registerTable.put("L", 2);
		_registerTable.put("B", 3);
		_registerTable.put("S", 4);
		_registerTable.put("T", 5);
		_registerTable.put("F", 6);
		_registerTable.put("SW", 9);

	}

	public static Map<String, Instruction> getOperaionTable() {
		return _operationTable;
	}

	public static Map<String, Integer> getRegisterTable() {
		return _registerTable;
	}
}