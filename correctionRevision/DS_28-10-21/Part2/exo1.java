class exo1 extends Program{
    void algorithm(){
        double AUDtoINR=50.7;
        println("Taux du dollar australien en roupie indienne ? "+ AUDtoINR);
        for(int i=0;i<10;i++){
            int AUD=i+1;
            double INR= ((double) AUD*AUDtoINR);
            println(AUD+" AUD = "+INR+" INR");
        }
    }
}