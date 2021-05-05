package be.bxl.formation;

public class Main {

    public static void main(String[] args) {
        // ### Avec le type Wrapper

        int primitif = 42;
        // -> Type valeur

        // Boxing
        Integer wrapper = primitif;
        // -> Type Reference (classe)

        // Unboxing
        int recup = wrapper;
        // -> Type valeur

        System.out.println(primitif);
        System.out.println(wrapper);
        System.out.println(recup);

        //----------------------------------------------------------------------
        // ### Avec le type Objet

        double nb1 = 3.14;

        // Boxing
        Object obj = nb1;

        // Unboxing
        double nb2 = (double)obj;


        System.out.println(nb1);
        System.out.println(obj);
        System.out.println(nb2);

        //----------------------------------------------------------------------
        // ## Question Patrick

        double d1 = 3.14;
        double d2 = 6.32;

        Double o1 = d1;

        o1 = o1 + 3.50;

    }

}
