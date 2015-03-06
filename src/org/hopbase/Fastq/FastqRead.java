package org.hopbase.Fastq;
import java.util.LinkedList;

import java.util.ArrayList;

/**
 * Created by Hill on 3/5/15.
 */
public class FastqRead {
    private String header;
    private String plus;
    private String quality;
    private FastqSequence sequence;

    public FastqRead(String header, String sequence, String plus, String quality) throws Exception{
        this.header = header;
        this.plus = plus;
        this.sequence = new FastqSequence(sequence);
    }
}
