package pl.imiajd.truchan;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args)
    {
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        LocalDate rokProdukcji= LocalDate.of(2008,5,23);
        orkiestra.add(new Flet("Toshiba",rokProdukcji));
        orkiestra.add(new Fortepian("Vivaldi",rokProdukcji));
        orkiestra.add(new Skrzypce("Alvaro",rokProdukcji));
        orkiestra.add(new Flet("Toshiba",rokProdukcji));
        orkiestra.add(new Flet("Toshiba",rokProdukcji));
        System.out.print(orkiestra.get(0).dzwiek());
        System.out.print(orkiestra.get(1).dzwiek());
        System.out.print(orkiestra.get(2).dzwiek());
        System.out.print(orkiestra.get(3).dzwiek());
        System.out.print(orkiestra.get(4).dzwiek());
    }

}