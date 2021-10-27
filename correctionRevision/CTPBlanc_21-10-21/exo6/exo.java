class exo extends Program {
    void testPosition(){
        assertEquals( 7, position("TAATTACAGACCTGAA","AGACC"));
        assertEquals(10, position("TAATTACAGACCTGAA","CCTGAA"));
        assertEquals( 0, position("TAATTACAGACCTGAA","T"));
        assertEquals( 1, position("TAATTACAGACCTGAA","AA"));
        assertEquals(-1, position("TAATTACAGACCTGAA","TTGC"));
    }

    int position(String sequence, String code){
        int position = -1;     // Contiendra la position du code ADN s'il est trouvé, sinon la valeur restera -1.
        boolean found = false; // Une variable qui permet de savoir si on a trouvé ou non la chaine.
        for (int i = 0; !found && i <= length(sequence)-length(code); i++){ // On boucle de i=0 à i=longueur de la sequence - longueur de code, et tant que l'inverse de found est true.
        // (écrire "!found" reviens à écrire "!found == true", donc on teste si "l'inverse de found est true", si found = false la condition est vérifiée)
            if (equals(substring(sequence,i,i+length(code)),code)){ // On teste si la sous-chaine de sequence de l'indice i à l'indice i + longueur de la chaine code est égal à la chaine code.
                position = i; // Si c'est le cas, la position retournée à la fin prend la valeur de i.
                found = true; // On a trouvé la chaine.
            }
        }
        return position; // On retourne la position.
    }
}