package exercFixacao;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class FixacaoManipulacaoDataCalender {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//Criando uma intancia do tipo calender
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//adicionando 4 horas ao dia atual
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);
		/*Para o calender a contagem dos meses comça a partir do mes 0, ou seja, se vc deseja ter o numero certo do mes
		 * é necessario sempre somar o valor do mes que vc queria mais 1
		 */
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		System.out.println(sdf.format(d));

	}

}
