package pl.imiajd.truchan;

import java.time.LocalDate;

public class Osoba {
    private String nazwisko;

    private String imiona[];
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String nazwisko, String imiona[], LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko=nazwisko;
        this.imiona=imiona;
        this.dataUrodzenia=dataUrodzenia;
        this.plec=plec;
    }
    public String getNazwisko()
    {
        return this.nazwisko;
    }
    public String[] getimiona()
    {
        return this.imiona;
    }
    public LocalDate getDataUrodzenia()
    {
        return this.dataUrodzenia;
    }
    public String getplec()
    {
        return this.plec ? "Mężczyzna" : "Kobieta";
    }

}