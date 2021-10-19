class exo extends Program {
    void testGenerationAleatoire(){
        String seq1 = generationAleatoire(10);
        assertTrue(length(seq1) == 10);
        int longueur = (int) (random()*12);
        String seq2 = generationAleatoire(longueur);
        assertTrue(length(seq2) == longueur);
    }

    String generationAleatoire(int longueurSeq){
        String sequence = "";   // Contiendra la séquence ADN générée
        int aleatoire = 0;      // Contiendra une valeur utilisée pour déterminer aléatoirement le nucléotide
        for (int i = 0; i < longueurSeq; i++){
            aleatoire = (int) (random()*4); // La fonction random() génère un nombre décimal entre 0 et 1 exclu. Ici le multiplier par 4 donner un nombre entre 0 et 4 exclu.
                                    // On n'oublie pas de le convertir en int avec (int) devant, pour ne garder que la partie entière.
            if (aleatoire == 0){
                sequence = sequence + 'A'; // En fonction de la valeur de la variable aleatoire, on ajoute un des 4 nucléotides possibles
            } else if (aleatoire == 1){
                sequence = sequence + 'T';
            } else if (aleatoire == 2){
                sequence = sequence + 'G';
            } else {                        // Si la variable aléatoire n'est pas égale à 0, 1 ni 2, alors elle est forcément égale à 3.
                sequence = sequence + 'C';  // Donc inutile de vérifier la condition (aleatoire == 3).
            }
        }
        println(sequence); // On affiche la séquence ADN, comme demandé.
        return sequence;   // Puis on retourne cette séquence.
    }
}