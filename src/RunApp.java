import java.text.DecimalFormat;
import java.util.Scanner;

public class RunApp
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("-------KAVOMAT DE_LUXE-------");
		System.out.println("Výber nápojov: ");

		// zoznam

		Napoj n1 = new Napoj("Čaj Velký", 1.1, "E", "0.3l");
		Napoj n2 = new Napoj("Čaj Malý", 0.8, "E", "0.2l");
		Napoj n3 = new Napoj("Káva Velká", 1.2, "E", "0.3l");
		Napoj n4 = new Napoj("Káva Malá", 1, "E", "0.2l");
		Napoj n5 = new Napoj("Čokoláda", 1.2, "E", "0.3");
		Napoj n6 = new Napoj("Káva Velká s mliekom", 1.4, "E", "0.3l");
		Napoj n7 = new Napoj("Káva Malá s mliekom", 1.2, "E", "0.2l");
		Napoj n8 = new Napoj("Capuccino Velká", 1.4, "E", "0.3l");
		Napoj n9 = new Napoj("Capucciono Malá", 1.2, "E", "0.2l");
		Napoj n10 = new Napoj("Polievka", 0.9, "E", "0.25l");

		Napoj[] napoje =
		{ n1, n2, n3, n4, n5, n6, n7, n8, n9, n10 };
		System.out.println("-----------------------------");

		// vyber napoja

		for (int i = 0; i < napoje.length; i++)
		{
			System.out
					.println((i + 1) + " " + napoje[i].getNazov() + " " + napoje[i].getCena() + " " + napoje[i].getE());
		}
		System.out.println("-----------------------------");
		
		int volba = 0;
		do
		{
			try
			{System.out.print("Zvoľ si nápoj: ");
				volba = sc.nextInt();
			} catch (Exception e1)
			{
			}
			sc.nextLine();
		} while (!(volba > 0 && volba < 10));
		Napoj n = napoje[volba - 1];

		System.out.println("-----------------------------");
		// cukor

		
		int cukor = 0;
		do
		{
			try
			{System.out.print("Prosíte si cukor?\n 0/Nie\n 1/Áno");
				cukor = sc.nextInt();
			} catch (Exception e1)
			{
			}
			sc.nextLine();
		} while (cukor<=-1 || cukor >=2);
		System.out.println("-----------------------------");
		if (cukor == 1)
		{
			System.out.println("Vybrali ste si nápoj:\n" + n.getNazov() + " s cukrom!");
		} else
		{
			System.out.println("Vybrali ste si nápoj:\n" + n.getNazov() + " bez cukru!");
		}
		System.out.println("-----------------------------");

		// kredit,priprava

		double kredit = 0;

		try
		{
			System.out.println("Vhoď kredit!");
			kredit = sc.nextDouble();
		} catch (Exception e)
		{

			System.out.println("Vhoď kredit!");
			sc.nextLine();
			kredit = sc.nextDouble();
		}

		// System.out.println(kredit);
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		if (kredit * 10 < n.getCena() * 10)
		{
			do
			{
				System.out.println("Vhoď viac eur!");
				double dohodil = sc.nextDouble();
				kredit = ((kredit) + dohodil) * 10;
				kredit = kredit / 10;

				System.out.println("Aktuálny kredit je: " + new DecimalFormat("0.00").format(kredit));
				System.out.println("-----------------------------");
				System.out.println("-----------------------------");
				if (kredit * 10 >= n.getCena() * 10)
				{
					System.out.println("Nápoj " + n.getNazov() + " sa pripravuje!");
				}
			} while (kredit * 10 < n.getCena() * 10);

		} else
			System.out.println("Nápoj " + n.getNazov() + " " + n.getVelkost() + " sa pripravuje!");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");

		// vydavok

		if (kredit > n.getCena())
		{
			double vydavok = (kredit - n.getCena());
			System.out.println();
			System.out.println("Vraciam výdavok: " + new DecimalFormat("0.00").format(vydavok) + " E");
		}
		System.out.println("-----------------------------");
		System.out.println();

		// end
		System.out.println("Ďakujeme, že ste si kúpili náš nápoj!");
		System.out.println();
		System.out.println("-------KAVOVAR DE_LUXE-------");

	}
}
