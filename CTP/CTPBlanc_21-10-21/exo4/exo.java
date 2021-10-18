class exo extends Program{
    void testSequenceADNcorrecte(){
        assertEquals(true,sequenceADNcorrecte("TAATTACAGACCTGAA"));
        assertEquals(false,sequenceADNcorrecte("CT TGCT"));
        assertEquals(false,sequenceADNcorrecte("TAATTBCAGACCTGAA"));
    }

    boolean sequenceADNcorrecte(String chaine){
        boolean ok=true;                            // On a un boolean qui dit que la chaine est correct
        for(int i=0; i<length(chaine) && ok==true;i++){ // On boucle toute la taille de la chaine, on s'arrête si ok == false ou si i est plus grand ou egal a la taille de la chaine
            if(!(charAt(chaine,i)=='A' || charAt(chaine,i)=='C' || charAt(chaine,i)=='G' || charAt(chaine,i)=='T')){    // Si on trouve un caractére qui n'est ni A ni C ni G ni T
                ok=false;       // Alors on dit que la chaine est incorrect
            }                   // Sinon on garde la valeur par defaut, true
        }
        return ok;              // Et on renvoi notre valeur
    }
}