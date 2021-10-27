class exo extends Program{
    void testPresenceNucleotide(){
        assertEquals(true,presenceNucleotide("TAATTACAGACCTGAA",'A'));
        assertEquals(false,presenceNucleotide("CTTGCT",'A'));
        assertEquals(true,presenceNucleotide("CTTGCT",'C'));
    }

    boolean presenceNucleotide(String chaine, char lettre){
        boolean found=false;                        // On initialise un bool qui vas nous aider a savoir si on a trouvé la variable oui on non.
        int i=-1;                                   // On initialise un compteur a -1, pour faciliter le fonctionnement de la boucle.
        while(i<length(chaine)-1 && found==false){  // On boucle tant que i est plus petit que la taille de notre chaine -1 et qu'on ai pas trouvé la lettre.
                                                    // Si une des deux condition renvoi false, alors on arréte de boucler
            i=i+1;                                  // On commence donc avec i=0 et on ajoute 1 a chaque iteration
            if(charAt(chaine,i)==lettre){           // Si le charactére qui est a l'indice actuel est la lettre qu'on cherche, 
                found=true;                         // Alors on met found a true, ce qui empéche la boucle de boucler
            }                                       // Sinon found garde sa valeur par defaut, false
        }
        
        return found;                               // On renvoi found
    }
}

