package nelioAlves;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat data01 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat data03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		data03.setTimeZone(TimeZone.getTimeZone("GMT")); //Formatação para o padrão GMT desconsiderando o atrado de 3 horas do Brasil em relação a greenwich
		
		//Date em Java, considera os padrões de datas e horários UTC e GMT no meridiano de Greenwich
		//UTC atrasa o horário brasileiro em 3 horas (GMT -3h00min), comparado a Greenwich
		//GMT devolve o mesmo horário de Greenwich
		//O padrão ISO 8601 é atualmente um dos mais usados para se trabalhar com datas em Java
		
		Date dat = data01.parse("25/06/2018");
		Date dat_1 = data02.parse("25/06/2018 13:10:25");
		
		Date x1 = new Date(); //Captura a data e o horário atual
		Date x2 = new Date (System.currentTimeMillis()); //Captura a data e o horário do sistema
		Date x3 = new Date (50000); //Gera uma data correspondente a 50 mil milissegundos após 00h00min de 01/01/1970
									//É preciso considerar que os horários no Brasil está 3 horas atrasados em relação ao referido meridiano
		
		Date x4 = Date.from (Instant.parse("2018-06-25T15:42:07Z")); //Data no padrão ISO 8601
		
		
		
		System.out.println("Imprimindo sem format: ");
		System.out.println(dat);
		System.out.println(dat_1);
		System.out.println("Variável x1 :" + x1);
		System.out.println("Variável x2 :" + x2);
		System.out.println("Variável x3 :" + x3);
		System.out.println("Variável x4 -- Saída no formato UTC : :" + x4);

		
		System.out.println("---------------------------------");
		System.out.println("Imprimindo com format: ");
		System.out.println(data01.format(dat));
		System.out.println(data01.format(dat_1));
		System.out.println("Variável x1 :" + data02.format(x1));
		System.out.println("Variável x2 :" + data02.format(x2));
		System.out.println("Variável x4 -- Saída no formato GMT :" + data03.format(x4)); //Saída no formato GMT
		
	}

}
