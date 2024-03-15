package pres;

import dao.DaoImpl;
import dao.DaoImplV2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("Result = " + metier.calcul());
    }
}
