package datatypes;

import java.lang.reflect.Array;
import java.math.BigDecimal;

class MedicalStaff {
}

class Doctor extends MedicalStaff {
}

class Nurse extends MedicalStaff {
}

class HeadDoctor extends Doctor {
}

public class Tries {

    public static void main(String[] args) {

        Number n = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };

        n = 5;
        System.out.println(n.longValue());

        BigDecimal bigDecimal = new BigDecimal("1.2");
        System.out.println(bigDecimal);

        Object var9 = 356f;

        double x = 0, y = 2, z;
        z = y / x;
        System.out.println("z=" + z);

        MedicalStaff medic = new HeadDoctor();
        if (medic instanceof Nurse) {
            System.out.println("Nurse");
        } else if (medic instanceof Doctor) {
            System.out.println("Doctor");
        } else if (medic instanceof HeadDoctor) {
            System.out.println("HeadDoctor");
        }

        System.out.println();

        int[] ar = new int[]{};
        if (ar instanceof Object) {
            System.out.println("yes");
        }

        System.out.println();

        char[] chAr = (new Integer("123")).toString().toCharArray();
        System.out.println(chAr.length);

        int mas7 [] [] = new int [4] [];

    }
}
