class exo1 extends Program {
    void testChar2Int(){
        assertEquals(0, char2Int('0'));
        assertEquals(8, char2Int('8'));
    }

    int char2Int(char chiffre){
        int res=((int) chiffre)-48;
        return res;
    }

    // ---------------------------------------

    void testQueDesChiffres(){
        assertTrue(queDesChiffres("128"));
        assertTrue(queDesChiffres("128"));
        assertTrue(queDesChiffres("128"));        
    }

    boolean queDesChiffres(String chiffre){
        boolean res=true;
        for(int i=0;i<length(chiffre);i++){

            // int caractere=char2Int(charAt(chiffre, i));
            // ou
            char caractere=charAt(chiffre, i);
            // et donc
            // if(caractere>9 || caractere <0){
            // ou
            if(caractere>9+48 || caractere <0+48){
                res=false;
            }
        }
        return res;
    }

    // -------------------------------------------------

    void testConvertStringToInt(){
        assertEquals(128, converStringToInt("128"));
        assertEquals(0, converStringToInt("0"));
        assertEquals(42, converStringToInt("42"));
        assertEquals(42, converStringToIntWithoutPow("42"));
        assertEquals(128, converStringToIntWithoutPow("128"));

    }

    int converStringToInt(String chaine){
        int res=0;
        for(int i=0;i<length(chaine);i++){
            int tmp = (char2Int(charAt(chaine, i))) ;
            res = res+ (tmp * (int) pow(10.0, (double) length(chaine)-i-1));
        }
        return res;
    }

    int converStringToIntWithoutPow(String chaine){
        int res=0;
        for(int i=0;i<length(chaine);i++){
            int tmp = (char2Int(charAt(chaine, i))) ;
            int power = 1;
            for(int y=length(chaine)-2-i;y>=0;y=y-1){
                power=power*10;
            }
            res = res+ (tmp * power);
        }
        return res;
    } 

    // --------------------------------

    /*void testRobusReadInt(){
        assertEquals(0, robustReadInt());
        assertEquals(57, robustReadInt());
    }*/

    int robustReadInt(){
        int res=0;
        boolean ok=false;

        while(!ok){
            String tmp = readString();
            if(queDesChiffres(tmp)){
                res=converStringToInt(tmp);
                ok=true;
            }
        }
        
        return res;
    }
}