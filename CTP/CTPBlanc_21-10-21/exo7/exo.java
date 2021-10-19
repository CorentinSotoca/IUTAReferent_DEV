class exo extends Program {
    void testEnquete(){
        assertEquals("Le coupable est Mlle Rose", enquete());
    }

    String enquete(){
        String resultat = " ";
        //Colonel Moutarde
        String coupable1 = "CCTGGAGGGTGGCCCCACCGGCCGAGACAGCGAGCATATGCAGGAAGCGGCAGGAATAAGGAAAAGCAGC";

        //Mlle Rose
        String coupable2 = "CTCCTGATGCTCCTCGCTTGGTGGTTTGAGTGGACCTCCCAGGCCAGTGCCGGGCCCCTCATAGGAGAGG";

        //Mme Pervenche
        String coupable3 = "AAGCTCGGGAGGTGGCCAGGCGGCAGGAAGGCGCACCCCCCCAGTACTCCGCGCGCCGGGACAGAATGCC";

        //M. Leblanc
        String coupable4 = "CTGCAGGAACTTCTTCTGGAAGTACTTCTCCTCCTGCAAATAAAACCTCACCCATGAATGCTCACGCAAG";

        //2 brins d'ADN distants trouvés
        String codeTrouve1 = "CATA";
        String codeTrouve2 = "ATGC";

        if (estCoupable(coupable1, codeTrouve1, codeTrouve2)){
            resultat="Le coupable est Colonel Moutarde";
        }
        else if (estCoupable(coupable2, codeTrouve1, codeTrouve2)){
            resultat="Le coupable est Mlle Rose";
        }
        else if (estCoupable(coupable3, codeTrouve1, codeTrouve2)){
            resultat="Le coupable est Mme Pervenche";
        }
        else if (estCoupable(coupable4, codeTrouve1, codeTrouve2)){
            resultat="Le coupable est Mme Leblanc";
        }
        return resultat;
    }

    // Ici on peut réutiliser la fonction rédigée à l'exercice précédent
    int position(String sequence, String code){
        int position = -1;
        boolean found = false;
        for (int i = 0; !found && i <= length(sequence)-length(code); i++){
            if (equals(substring(sequence,i,i+length(code)),code)){
                position = i;
                found = true;
            }
        }
        return position;
    }

    boolean estCoupable(String coupable, String code1, String code2){
        int pos1 = position(coupable,code1); // Contient la position de la chaine code1 dans la sequence ADN du coupable
        int pos2 = position(coupable,code2); // Contient la position de la chaine code2 dans la sequence ADN du coupable
        boolean identifie = false; // Contient true si le coupable est identifié, false sinon.
        if (pos1 != -1 && pos2 != -1){ // On teste si les codes 1 et 2 sont tous les deux présents dans l'ADN du coupable
            if (pos2 < pos1){ // On s'assure que pos2 soit plus grand que pos1 pour obtenir un nombre positif en faisant la différence.
                int temp = pos1; // Si pos2 est inférieur à pos1, les deux variables vont intervertir leur valeur.
                pos1 = pos2;
                pos2 = temp;
            }
            if (pos2-pos1 > 4){ // Si l'écart entre les deux indices est supérieur à 4 caractères, celà signifie que les deux chaines ne sont pas juxtaposées.
                identifie = true; // Le coupable est donc identifié.
            }
        }
        return identifie; // On retourne si le coupable est identifié ou non.
    }
}