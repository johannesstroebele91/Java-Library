package de.hdm_stuttgart.mi.Operators;

public class CompoundAssignment {

    public static void main(String[] args) {



        // =	Assign right to left operand
        int age = 40;

        // Attention! Hidden casting!!!!
        int x = 5;
        x += 1.1;    // just fine; hidden cast, x == 1 after assignment
        // x = x + 1.1; // won't compile! 'cannot convert from double to int'

        // +=	Assign sum of operands to left operand
        age += 12;
        System.out.println("age += 12: " + age);

        // -=	Assign difference of operands to left operand
        age -= 8;
        System.out.println("age -= 8: " + age);

        // *=	Assign product of operands to left operand
        age *= 2;
        System.out.println("age += 2: " + age);

        // /=	Assign quotient of operands to left operand
        age /= 3;
        System.out.println("age /= 3: " + age);

        // %=	Assign remainder of operands to left operand
        age %= 2;
        System.out.println("age += 2: " + age);

        // Special case
        int a = 6,
            b = 7,
            c = -3,
            result = 0;


        // result += ++a - b++ + --c; // schlecht geschrieben

        ++a; // Incrementing ++a happens prior
        --c; // decrementing --c happens prior
        result += a - b + c; // or even: result = result + a - b + c;
        b++; // b-- in contrast happens after

    }
}
