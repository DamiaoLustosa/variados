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
		data03.setTimeZone(TimeZone.getTimeZone("GMT")); //Formata��o para o padr�o GMT desconsiderando o atrado de 3 horas do Brasil em rela��o a greenwich
		
		//Date em Java, considera os padr�es de datas e hor�rios UTC e GMT no meridiano de Greenwich
		//UTC atrasa o hor�rio brasileiro em 3 horas (GMT -3h00min), comparado a Greenwich
		//GMT devolve o mesmo hor�rio de Greenwich
		//O padr�o ISO 8601 � atualmente um dos mais usados para se trabalhar com datas em Java
		
		Date dat = data01.parse("25/06/2018");
		Date dat_1 = data02.parse("25/06/2018 13:10:25");
		
		Date x1 = new Date(); //Captura a data e o hor�rio atual
		Date x2 = new Date (System.currentTimeMillis()); //Captura a data e o hor�rio do sistema
		Date x3 = new Date (50000); //Gera uma data correspondente a 50 mil milissegundos ap�s 00h00min de 01/01/1970
									//� preciso considerar que os hor�rios no Brasil est� 3 horas atrasados em rela��o ao referido meridiano
		
		Date x4 = Date.from (Instant.parse("2018-06-25T15:42:07Z")); //Data no padr�o ISO 8601
		
		
		
		System.out.println("Imprimindo sem format: ");
		System.out.println(dat);
		System.out.println(dat_1);
		System.out.println("Vari�vel x1 :" + x1);
		System.out.println("Vari�vel x2 :" + x2);
		System.out.println("Vari�vel x3 :" + x3);
		System.out.println("Vari�vel x4 -- Sa�da no formato UTC : :" + x4);

		
		System.out.println("---------------------------------");
		System.out.println("Imprimindo com format: ");
		System.out.println(data01.format(dat));
		System.out.println(data01.format(dat_1));
		System.out.println("Vari�vel x1 :" + data02.format(x1));
		System.out.println("Vari�vel x2 :" + data02.format(x2));
		System.out.println("Vari�vel x4 -- Sa�da no formato GMT :" + data03.format(x4)); //Sa�da no formato GMT
		
	}

}
