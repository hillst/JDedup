package org.hopbase.Fastq;
import org.hopbase.Exceptions.MalformedFastqException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Hill on 3/5/15.
 */
public class FastqStream{

    String file = "";
    private  BufferedReader fq;
    public FastqStream(String filename) throws FileNotFoundException {
        this.fq = new BufferedReader(new FileReader(filename));
    }
    public FastqRead getRead() throws IOException, MalformedFastqException {
        String header = "";
        String sequence = "";
        String plus = "";
        String quality = "";
        for (int i = 0; i < 4; i++){
            if (line = this.fq.readLine() == null){
                throw new MalformedFastqException("Error, malformed fasta, lines not a multiple of four.");
            }
            if (i == 0){

            }
            if (i == 1){

            }
            if (i == 2){

            }
            if (i == 3){
                
            }

        }


        while ((line = this.fq.readLine())  != null) {
        }
        return null;
    }

}
