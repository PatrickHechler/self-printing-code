package de.hechler.patrick;


public class SelfPrint {
	
	private static String HEAD = "package de.hechler.patrick;\r\n\r\n\r\npublic class SelfPrint {\r\n\t\r\n\tprivate static String HEAD = \"";
	private static String TAIL = "\";\r\n\t\r\n\tpublic static void main(String[] args) {\r\n\t\tSystem.out.print(HEAD);\r\n\t\tSystem.out.print(HEAD.replaceAll(\"\\r\", \"\\\\r\").replaceAll(\"\\n\", \"\\\\n\").replaceAll(\"\\t\", \"\\\\t\").replaceAll(\"\\\"\", \"\\\\\\\"\"));\r\n\t\tSystem.out.print(\"\\\";\\r\\n\\tprivate static String TAIL = \\\"\");\r\n\t\tSystem.out.print(TAIL.replaceAll(\"\\r\", \"\\\\r\").replaceAll(\"\\n\", \"\\\\n\").replaceAll(\"\\t\", \"\\\\t\").replaceAll(\"\\\"\", \"\\\\\\\"\"));\r\n\t\tSystem.out.print(TAIL);\r\n\t}\r\n\t\r\n}\r\n";
	
	public static void main(String[] args) {
		System.out.print(HEAD);
		System.out.print(HEAD.replaceAll("\r", "\\r").replaceAll("\n", "\\n").replaceAll("\t", "\\t").replaceAll("\"", "\\\""));
		System.out.print("\";\r\n\tprivate static String TAIL = \"");
		System.out.print(TAIL.replaceAll("\r", "\\r").replaceAll("\n", "\\n").replaceAll("\t", "\\t").replaceAll("\"", "\\\""));
		System.out.print(TAIL);
	}
	
}
