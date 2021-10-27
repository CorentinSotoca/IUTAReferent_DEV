class exo2 extends Program{
    void testConversion(){
        assertEquals("1 AUD = 50.7 INR\n", conversion(50.7, -1));
        assertEquals("1 AUD = 50.7 INR\n", conversion(50.7, 1));
        assertEquals("1 AUD = 50.7 INR\n2 AUD = 101.4 INR\n", conversion(50.7, 2));
    }
    
    String conversion(double AUDtoINR,int nb){
        if(nb<1){
            nb=1;
        } else if(nb>10) {
            nb=10;
        }

        String res="";

        for(int i=0;i<nb;i++){
            int AUD=i+1;
            double INR= ((double) AUD*AUDtoINR);
            res=res+AUD+" AUD = "+INR+" INR\n";
        }

        return res;
    }
}