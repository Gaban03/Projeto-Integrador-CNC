package projetoIntegrador;

public class Funcoes {

	// Método para verificação do codigo G e M
	public boolean verCodG(String cod) {
		// Vetor de códigos G
		boolean verifica = false;
		if(cod.length() == 3)
			cod = cod.substring(0, 2);
		else if (cod.length() > 3)
			cod = cod.substring(0, 3);
		cod = cod.toUpperCase();
		String[] codigosG = { 
				"G00", "G01", "G02", "G03", "G04", "G10", "G17", "G18", "G19", "G20", "G21", "G28", "G40",
				"G41", "G42", "G43", "G49", "G50", "G51", "G52", "G53", "G54", "G55", "G56", "G57", "G58", "G59", "G61",
				"G64", "G65", "G68", "G69", "G73", "G80", "G81", "G82", "G83", "G84", "G85", "G86", "G87", "G88", "G89",
				"G90", "G91", "G92", "G94", "G95", "G96", "G97", "G98", "G99", "G100", "G101", "G103", "G107", "G110",
				"G111", "G112", "G113", "G114", "G115", "G116", "G117", "G118" 
				};

		// Vetor de códigos M
		String[] codigosM = {
				"M00", "M01", "M02", "M03", "M04", "M05", "M06", "M07", "M08", "M09", "M10", "M11", "M12",
				"M13", "M14", "M15", "M16", "M17", "M18", "M19", "M20", "M21", "M22", "M23", "M24", "M25", "M26", "M27",
				"M28", "M29", "M30", "M31", "M32", "M33", "M34", "M35", "M36", "M37", "M38", "M39", "M40", "M41", "M42",
				"M43", "M44", "M45", "M46", "M47", "M48", "M49", "M50", "M51", "M52", "M53", "M54", "M55", "M56", "M57",
				"M58", "M59", "M60", "M61", "M62", "M63", "M64", "M65", "M66", "M67", "M68", "M69", "M70", "M71", "M72",
				"M73", "M74", "M75", "M76", "M77", "M78", "M79", "M80", "M81", "M82", "M83", "M84", "M85", "M86", "M87",
				"M88", "M89", "M90", "M91", "M92", "M93", "M94", "M95", "M96", "M97", "M98", "M99" 
				};
		if (cod.startsWith("G")) {
			for (String vCod : codigosG) {
				if (vCod.equals(cod)) {
					verifica = true;
					return verifica;

				}
			}
		} else if (cod.startsWith("M")) {
			for (String vCod : codigosM) {
				if (vCod.equals(cod)) {
					verifica = true;
					return verifica;
				}
			}
		}else{
		return verifica;
		}

	}

	

}
