import java.util.HashMap;
import java.util.Map;

/**
 * A static object that stores optab and regtab hashmaps.
 */
public class TableBuilder {
	private static final Map<String, Instruction> OPTAB;
	private static final Map<String, Integer> REGTAB;

	static {
		OPTAB = new HashMap<>();

		OPTAB.put("ADD", new Instruction("ADD", "3/4", "18"));
		OPTAB.put("ADDF", new Instruction("ADDF", "3/4", "58"));
		OPTAB.put("ADDR", new Instruction("ADDR", "2", "90"));
		OPTAB.put("AND", new Instruction("AND", "3/4", "40"));
		OPTAB.put("CLEAR", new Instruction("CLEAR", "2", "B4"));
		OPTAB.put("COMP", new Instruction("COMP", "3/4", "28"));
		OPTAB.put("COMPF", new Instruction("COMPF", "3/4", "88"));
		OPTAB.put("COMPR", new Instruction("COMPR", "2", "A0"));
		OPTAB.put("DIV", new Instruction("DIV", "3/4", "24"));
		OPTAB.put("DIVF", new Instruction("DIVF", "3/4", "64"));
		OPTAB.put("DIVR", new Instruction("DIVR", "2", "9C"));
		OPTAB.put("FIX", new Instruction("FIX", "1", "C4"));
		OPTAB.put("FLOAT", new Instruction("FLOAT", "1", "C0"));
		OPTAB.put("HIO", new Instruction("HIO", "1", "F4"));
		OPTAB.put("J", new Instruction("J", "3/4", "3C"));
		OPTAB.put("JEQ", new Instruction("JEQ", "3/4", "30"));
		OPTAB.put("JGT", new Instruction("JGT", "3/4", "34"));
		OPTAB.put("JLT", new Instruction("JLT", "3/4", "38"));
		OPTAB.put("JSUB", new Instruction("JSUB", "3/4", "48"));
		OPTAB.put("LDA", new Instruction("LDA", "3/4", "00"));
		OPTAB.put("LDB", new Instruction("LDB", "3/4", "68"));
		OPTAB.put("LDCH", new Instruction("LDCH", "3/4", "50"));
		OPTAB.put("LDF", new Instruction("LDF", "3/4", "70"));
		OPTAB.put("LDL", new Instruction("LDL", "3/4", "08"));
		OPTAB.put("LDS", new Instruction("LDS", "3/4", "6C"));
		OPTAB.put("LDT", new Instruction("LDT", "3/4", "74"));
		OPTAB.put("LDX", new Instruction("LDX", "3/4", "04"));
		OPTAB.put("LPS", new Instruction("LPS", "3/4", "D0"));
		OPTAB.put("MUL", new Instruction("MUL", "3/4", "20"));
		OPTAB.put("MULF", new Instruction("MULF", "3/4", "60"));
		OPTAB.put("MULR", new Instruction("MULR", "2", "98"));
		OPTAB.put("NORM", new Instruction("NORM", "1", "C8"));
		OPTAB.put("OR", new Instruction("OR", "3/4", "44"));
		OPTAB.put("RD", new Instruction("RD", "3/4", "D8"));
		OPTAB.put("RMO", new Instruction("RMO", "3/4", "AC"));
		OPTAB.put("RSUB", new Instruction("RSUB", "3/4", "4C"));
		OPTAB.put("SHIFTL", new Instruction("SHIFTL", "2", "A4"));
		OPTAB.put("SHIFTR", new Instruction("SHIFTR", "2", "A8"));
		OPTAB.put("SIO", new Instruction("SIO", "1", "F0"));
		OPTAB.put("SSK", new Instruction("SSK", "3/4", "EC"));
		OPTAB.put("STA", new Instruction("STA", "3/4", "0C"));
		OPTAB.put("STB", new Instruction("STB", "3/4", "78"));
		OPTAB.put("STCH", new Instruction("STCH", "3/4", "54"));
		OPTAB.put("STF", new Instruction("STF", "3/4", "80"));
		OPTAB.put("STI", new Instruction("STI", "3/4", "D4"));
		OPTAB.put("STL", new Instruction("STL", "3/4", "14"));
		OPTAB.put("STS", new Instruction("STS", "3/4", "7C"));
		OPTAB.put("STSW", new Instruction("STSW", "3/4", "E8"));
		OPTAB.put("STT", new Instruction("STT", "3/4", "84"));
		OPTAB.put("STX", new Instruction("STX", "3/4", "10"));
		OPTAB.put("SUB", new Instruction("SUB", "3/4", "1C"));
		OPTAB.put("SUBF", new Instruction("SUBF", "3/4", "5C"));
		OPTAB.put("SUBR", new Instruction("SUBR", "2", "94"));
		OPTAB.put("SVC", new Instruction("SVC", "2", "B0"));
		OPTAB.put("TD", new Instruction("TD", "3/4", "E0"));
		OPTAB.put("TIO", new Instruction("TIO", "1", "F8"));
		OPTAB.put("TIX", new Instruction("TIX", "3/4", "2C"));
		OPTAB.put("TIXR", new Instruction("TIXR", "2", "B8"));
		OPTAB.put("WD", new Instruction("WD", "3/4", "DC"));

		REGTAB = new HashMap<>();

		REGTAB.put(null, 0);
		REGTAB.put("A", 0);
		REGTAB.put("X", 1);
		REGTAB.put("L", 2);
		REGTAB.put("B", 3);
		REGTAB.put("S", 4);
		REGTAB.put("T", 5);
		REGTAB.put("F", 6);
		REGTAB.put("SW", 9);

	}

	public static Map<String, Instruction> getOPTAB() {
		return OPTAB;
	}

	public static Map<String, Integer> getREGTAB() {
		return REGTAB;
	}
}