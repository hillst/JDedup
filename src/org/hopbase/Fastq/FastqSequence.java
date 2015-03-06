package org.hopbase.Fastq;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Hill on 3/5/15.
 */
public class FastqSequence {
    private ArrayList<FastqChar> sequence;
    public FastqSequence(String sequence) throws Exception{
        this.sequence = new ArrayList<FastqChar>(150);
        for (int i = 0; i < sequence.length(); i++){
            this.sequence.add(new FastqChar(sequence.charAt(i)));
        }
    }

    public boolean equals(FastqSequence b){
        if (this.sequence.size() != b.sequence.size()){
            return false;
        }
        for (int i = 0; i < this.sequence.size(); i++){
            if (! this.sequence.get(i).equals(b.sequence.get(i))){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<FastqChar> concatenate(FastqSequence a, FastqSequence b){
        ArrayList<FastqChar> newList = new ArrayList<FastqChar>(300);
        newList.addAll(a.getData());
        newList.addAll(b.getData());
        return newList;
    }

    public ArrayList<FastqChar> getData(){
        return this.sequence;
    }

    public String toString(){
        String fastqString = "";
        for (int i = 0; i < this.sequence.size(); i++){
            fastqString += this.sequence.get(i).toString();
        }
        return fastqString;
    }
}
