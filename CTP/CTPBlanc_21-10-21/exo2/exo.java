class exo extends Program{
    void testCompterNucleotide(){
        assertEquals("A:7 C:3 T:4 G:2",compterNucleotide("TAATTACAGACCTGAA"));
        assertEquals("A:0 C:2 T:3 G:1",compterNucleotide("CTTGCT"));
        assertEquals("A:0 C:0 T:0 G:0",compterNucleotide(""));
    }

    String compterNucleotide(String chaine){
        int a=0;        // On initialise des compteurs pour chacune de nos 4 variables
        int c=0;
        int t=0;
        int g=0;

        for(int i=0; i<length(chaine);i++){ // Comme dans l'exo 1, on defile tout les caractéres de la chaine
            if(charAt(chaine,i)=='A'){      // Si on trouve un 'A', on ajoute 1 a la variable a
                a=a+1;
            }else if(charAt(chaine,i)=='T'){// etc
                t=t+1;
            }else if(charAt(chaine,i)=='G'){// etc
                g=g+1;
            }else{                          // Comme dans l'exo 1, on sais que ATG sont passé c'est forcément C
                c=c+1;
            }
        }

        String res="A:"+a+" C:"+c+" T:"+t+" G:"+g; // On crée une chaine de caractéres sous le format attendu

        return res; // Et on la renvoi
    }
}


