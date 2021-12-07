import pl.imiajd.truchan.Pracownik;
import pl.imiajd.truchan.Student;
import pl.imiajd.truchan.Osoba;
import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args)
    {
        String[] imiona= new String[2];
        imiona[0]="Aleksander";
        imiona[1]="Klemens";
        LocalDate data= LocalDate.of(2021,10,10);

        Student stu = new Student("Kozłowski",imiona, data,true,"Informatyka",4.4);
        System.out.println(stu.getimiona()[0]);
        System.out.println(stu.getplec());
        System.out.println(stu.getNazwisko());
        System.out.println(stu.getDataUrodzenia());
        stu.setSredniaOcen(5.2);
        System.out.println(stu.getSredniaOcen());
        System.out.println(stu.getKierunek());
        System.out.println(stu.toString());




    }
}