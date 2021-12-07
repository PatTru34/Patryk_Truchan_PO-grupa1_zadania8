package pl.imiajd.truchan;

import java.time.LocalDate;

public class Pracownik extends Osoba {
    private String pensja;
    private LocalDate dataZatrudnienia;


    public Pracownik(String[] imiona,String nazwisko, LocalDate dataUrodzenia,boolean plec,String pensja,LocalDate dataZatrudnienia) {
        super(nazwisko,imiona, dataUrodzenia,plec);
        this.pensja=pensja;
        this.dataZatrudnienia=dataZatrudnienia;
    }
    public String getPensja()
    {
        return this.pensja;
    }
    public LocalDate getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }

    public String toString()
    {
        return String.format("%s, jego pensja wynosi: %s, i został zatrudniony w: %s \n",super.toString(),this.pensja,this.dataZatrudnienia);

    }
}