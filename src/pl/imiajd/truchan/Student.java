package pl.imiajd.truchan;


import java.time.LocalDate;

public class Student extends Osoba {
    private double sredniaOcen;

    private String kierunek;
    public Student(String nazwisko, String[] imiona, LocalDate dataUrodzenia,boolean plec, String kierunek,double sredniaOcen) {
        super(nazwisko,imiona, dataUrodzenia,plec);
        this.kierunek=kierunek;
        this.sredniaOcen=sredniaOcen;
    }

    public String getKierunek()
    {
        return this.kierunek;
    }
    public double getSredniaOcen()
    {
        return this.sredniaOcen;
    }
    public void setSredniaOcen(double srednia)
    {
        this.sredniaOcen=srednia;
    }
    public String toString()
    {
        return String.format("%s, jego kierunek to: %s, a średnia ocen: %f \n",super.toString(),this.kierunek,this.sredniaOcen);
    }

}
