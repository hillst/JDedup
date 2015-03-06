package org.hopbase.Fastq;

/**
 * Created by Hill on 3/5/15.
 */
public class FastqChar{
    private boolean bits[];

    /**
     * Defines a compressed version of whatever base we are operating in.
     * @param base
     * @throws Exception
     */
    public FastqChar(char base) throws Exception{
        boolean bits[] = {false, false, false};
        this.bits = bits;
        switch (base) {
            case 'A':
                this.bits[0] = true;
                break;
            case 'T':
                this.bits[0] = true;
                this.bits[1] = true;
                break;
            case 'G':
                this.bits[0] = true;
                this.bits[1] = true;
                this.bits[2] = true;
                break;
            case 'C':
                this.bits[1] = true;
                this.bits[2] = true;
                break;
            case 'N':
                this.bits[2] = true;
                break;
            default:
                throw new Exception("Invalid character type: " + base);
        }
    }

    /**
     * Returns the character associated with the underlying bitmask
     * @return
     * @throws Exception
     */
    public char toChar() throws Exception{
        if (this.bits[0] == true && this.bits[1] == true && this.bits[2] == true){
            return 'G';
        }
        else if (this.bits[0] == true && this.bits[1] == true ){
            return 'T';
        }
        else if (this.bits[1] == true && this.bits[2] == true){
            return 'C';
        }
        else if (this.bits[0] == true){
            return 'A';
        }
        else if (this.bits[2] == true){
            return 'N';
        }
        else{
            throw new Exception("Uninitialized bit array");
        }
    }
    public String toString(){
        if (this.bits[0] == true && this.bits[1] == true && this.bits[2] == true){
            return "G";
        }
        else if (this.bits[0] == true && this.bits[1] == true ){
            return "T";
        }
        else if (this.bits[1] == true && this.bits[2] == true){
            return "C";
        }
        else if (this.bits[0] == true){
            return "A";
        }
        else if (this.bits[2] == true){
            return "A";
        }
        return "";
    }

    public boolean equals(FastqChar b){
        if (this.bits[0] == b.bits[0] && this.bits[1] == b.bits[1] && this.bits[2] == b.bits[2]){
            return true;
        } else{
            return false;
        }
    }
}
