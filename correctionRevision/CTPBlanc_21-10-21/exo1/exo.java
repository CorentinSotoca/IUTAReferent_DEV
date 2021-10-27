class exo extends Program{
    void testComplementaire(){
        assertEquals("ATTAATGTCTGGACTT",complementaire("TAATTACAGACCTGAA"));
        assertEquals("",complementaire(""));
    }

    String complementaire(String chaine){
        if(equals(chaine,"")){              // si on nous donne une chaine vide, on renvoi cette chaine vide
            return "";
        }

        String res="";                      // On initialise une chaine de caractére vide
        for(int i=0;i<length(chaine);i++){  // On defile sur tout les caractéres de la chaine

            if(charAt(chaine,i)=='A'){      // Si le caractére est 'A', on ajoute l'opposé a la chaine vide, donc 'T'
                res=res+'T';
            }else if(charAt(chaine,i)=='T'){// etc
                res=res+'A';
            }else if(charAt(chaine,i)=='G'){// etc
                res=res+'C';
            }else{                          // On part du principe qu'il ne peut y avoir que ATCG, donc si ce n'est pas A T ou G, c'est forcement C.
                res=res+'G';
            }
        }
        return res; // On renvoi notre resultat
    }
}


