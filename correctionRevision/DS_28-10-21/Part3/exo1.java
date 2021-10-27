class exo1 extends Program{
    void testNombreCouples(){
        assertEquals(0, nombreCouples(""));
        assertEquals(1, nombreCouples("a0"));
        assertEquals(3, nombreCouples("b3a1c0"));
    }

    int nombreCouples(String chaine){
        return (length(chaine)/2);
    }

    void testPlusPetitQue(){
        assertTrue(plusPetitQue('a',1,'b',1));
        assertTrue(plusPetitQue('a',1,'b',2));
    }

    boolean plusPetitQue(char fLettre, int fNb, char sLettre, int sNb){
        boolean res=false;
        if(fNb<sNb){
            res=true;
        }else if (fNb>sNb){
            res=false;
        } else {
            if(fLettre<sLettre){
                res=true;
            }else{
                res=false;
            } 
        }

        return res;
    }

    void testPlusPetitQue_String(){
        assertTrue(plusPetitQue_String("a1","b1"));
        assertTrue(plusPetitQue_String("a1","a2"));
    }

    boolean plusPetitQue_String(String first, String second){
        char fLettre=charAt(first, 0);
        char sLettre=charAt(second, 0);
        int fNb=charAt(first, 1);
        int sNb=charAt(second, 1);
        return plusPetitQue(fLettre, fNb, sLettre, sNb);
    }

    void testEstPresent(){
        assertTrue(estPresent("a1b2a2b1",'a', 2));
        assertTrue(estPresent("a1b2a2b1",'b', 1));
        assertFalse(estPresent("a1b2a2b1",'a', 3));
    }

    boolean estPresent(String chaine, char lettre, int nb){
        String search= ""+lettre+nb;
        boolean res=false;

        for(int i = 0;i<length(chaine) && res==false;i=i+2){
            String tmp = substring(chaine, i, i+2);
            res=equals(tmp, search);
        }

        return res;
    }

    void testEstStrictementOrdonne(){
        assertTrue(estStrictementOrdonne("a0a1c2"));
        assertFalse(estStrictementOrdonne("a0a0a1"));
        assertFalse(estStrictementOrdonne("a1a0"));
    }

    boolean estStrictementOrdonne(String chaine){
        boolean res=true;
        for(int i=0;i<length(chaine)-2 && res;i=i+2){
            String first=substring(chaine, i, i+2);
            String second=substring(chaine, i+2, i+4);
            if(!plusPetitQue_String(first, second)){
                res=false;
            }
        }
        return res;
    }

    void testFusionner(){
        assertEquals("a1a1b0b1c1c2", fusionner("a1b0c2","a1b1c1"));
    }

    String fusionner(String first, String second){
        int idxFirst=0;
        int idxSecond=0;
        String res="";
        boolean stop=false;
        while(!stop){
            if(length(res)==(length(first)+length(second))){
                stop = true;
            }else if(idxFirst>=length(first)){
                String subSecond=substring(second, idxSecond, idxSecond+2);
                res=res+subSecond;
                idxSecond=idxSecond+2;
            }else if(idxSecond>=length(second)){
                String subFirst=substring(first, idxFirst, idxFirst+2);
                res=res+subFirst;
                idxFirst=idxFirst+2;
            } else{
                String subFirst=substring(first, idxFirst, idxFirst+2);
                String subSecond=substring(second, idxSecond, idxSecond+2);
                if(plusPetitQue_String(subFirst, subSecond)){
                    res=res+subFirst;
                    idxFirst=idxFirst+2;
                }else{
                    res=res+subSecond;
                    idxSecond=idxSecond+2;
                }
            }   
        }
        return res;
    }
}