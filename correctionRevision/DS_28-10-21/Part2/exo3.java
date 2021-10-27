class exo3 extends Program{
    void algorithm(){
        boolean ok=false;
        int nbLigne=0;
        while(!ok){
            print("Nombre de lignes (<=40) ?");
            nbLigne=readInt();
            if(nbLigne<=40 && nbLigne>0){
                ok=true;
            }
        }

        for(int i=1;i<=nbLigne;i++){
            int aud=0;
            if(i<10){
                aud=i;
            } else if (i<20){
                aud=(i-9)*10;
            } else if (i<29){
                aud=(i-18)*100;
            } else{
                aud=(i-27)*1000;
            }
            double AUDtoINR=50.7;
            double INR= ((double) aud*AUDtoINR);
            println("("+i+") "+aud+" AUD = "+INR+" INR");
        }
    }
}