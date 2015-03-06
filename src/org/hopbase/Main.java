package org.hopbase;

import org.hopbase.Fastq.FastqSequence;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hell world");
        try {
            FastqSequence test = new FastqSequence("ATGATGATGATG");
            FastqSequence test1 = new FastqSequence("ATGATGATTATG");
            FastqSequence test2 = new FastqSequence("ATGATGATGATG");
            System.out.println("Test done");

            System.out.println(test.equals( test1 ));
            System.out.println(test.equals( test2 ));
            System.out.println(test.equals( test ));
            System.out.println(test);
            System.out.println("Test done");

        } catch (Exception e){
            System.out.println("Message");
            e.printStackTrace();
        }
    }

    public static void dedup(String leftReads, String rightReads){

    }
}
