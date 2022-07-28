package app;

import java.time.YearMonth;
import java.util.Calendar;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.MainScreen;

public class Teste {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2022, 5, 29);
		Calendar c2 = Calendar.getInstance();
		
	//	System.out.println();
		//System.out.println(c2.get(Calendar.DAY_OF_MONTH) - c1.get(Calendar.DAY_OF_MONTH));
		
		if(c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH) == 1) {
			int anoC1 = c1.get(Calendar.YEAR);
			int mesC1 = c1.get(Calendar.MONTH);

			int anoC2 = c1.get(Calendar.YEAR);
			int mesC2 = c1.get(Calendar.MONTH);
			
			YearMonth d1 = YearMonth.of(anoC1, mesC1);
			int quantC1 = d1.lengthOfMonth();
			
			YearMonth d2 = YearMonth.of(anoC2, mesC2);
			int quantC2 = d2.lengthOfMonth();
			
			int diferenca = (quantC1 - c1.get(Calendar.DAY_OF_MONTH)) + c2.get(Calendar.DAY_OF_MONTH);
			
			System.out.println(diferenca);
			System.out.println(quantC2);
		}
	
	//testeTela
		MainScreen mc = new MainScreen();
		
	}
}
