package com.hw.maxim;

public class Main {

    public static void main(String[] args) {

//                new Gryffindor("Harry Potter", 100, 100, 100, 100, 100),
//                new Gryffindor("Hermoine Granger", 85, 55, 68, 70, 30),
//                new Gryffindor("Ron Weasley", 50, 60, 70, 80, 40)
//
//                new Puffledui("Zakharia Smith", 50, 80, 60, 30, 20),
//                new Puffledui("Cedrick Diggory", 65, 40, 70, 50, 80),
//                new Puffledui("Justin Finch-Fletchlie", 10, 20, 30, 40, 50)
//
//                new Kogtevran("Cho Chang", 90, 80, 70, 60, 50, 40),
//                new Kogtevran("Padma Patil", 60, 40, 50, 30, 70, 80),
//                new Kogtevran("Marcus Belbie", 70, 70, 60, 60, 70, 70)

//                new Slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100),
//                new Slytherin("Graham Montague", 60, 70, 30, 20, 75, 60, 20),
//                new Slytherin("Gregory Goyle", 50, 50, 50, 80, 50, 50, 50)


        Hogwarts harry = new Gryffindor("Harry Potter", 100, 100, 100, 100, 100);
        Hogwarts draco = new Slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100);
        Hogwarts gregoryGoyle = new Slytherin("Gregory Goyle", 50, 50, 50, 80, 50, 50, 50);

        gregoryGoyle.compare(draco);
        harry.compare(draco);
    }
}
