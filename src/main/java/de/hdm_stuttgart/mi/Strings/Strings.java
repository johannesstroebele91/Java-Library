package de.hdm_stuttgart.mi.Strings;

public class Strings {

    public static void main(String[] args) {

        /* 1) Strings created in the STRING POOL
         * Java has a pool in the heap where it stores all Strings
         * If a new one is created, it checks if its already in the pool or adds it
         */
        String s1 = "Hello";

        // https://freedocs.mi.hdm-stuttgart.de/sw1ChapterCoreClasses.html#6

        /* 2) Strings created on the HEAP
         * With the String copy constructor "public String(String original)"
         1) Obj "World" is created on the heap
         2) A copy of this obj "World" is created on the heap
         3) The reference s2 is created on the stack pointing to the copied obj "World"
         4) Again copy of the first obj "World" is created on the heap
         5) The reference s3 is created on the stack pointing to the 2. copied obj "World"
         */
        String s2 = new String ("World");
        String s3 = new String ("World");


    }
}
