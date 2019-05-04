package nelioAlves;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Calendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from (Instant.parse("2018-06-25T15:42:07Z")); //Data no padrão ISO 8601
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);	//Adicionando 4 horas do dia
		d= cal.getTime();
		
		int minutos = cal.get(Calendar.MINUTE); //retorna a quantidade de minutos
		int mes = 1 + cal.get(Calendar.MONTH);		//Retorna o mÊs. A adição de 1 se dá pelo fato da contangem dos meses iniciar em zero
		
		System.out.println(sdf.format(d));
		System.out.println("minutos :" + minutos);

	}

}
