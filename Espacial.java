public class Espacial extends Plana{
    
    public String PiramideB3(){
        double aB = (this.a * this.b) / 2;
        double aL = 3 * ((this.a * this.g) / 2);
        double aT = aB + aL; 
        double V = (this.h * aB) / 3;
        
        return String.valueOf(aB) + " " + String.valueOf(aL) + " " + String.valueOf(aT) +" " + String.valueOf(V); 
    }

    public String PiramideB4(){
        double aB = Math.sqrt(this.a);
        double aL = 4 * ((this.a * this.g) / 2);
        double aT = aB + aL; 
        double V = (this.h * aB) / 3;
        
        return String.valueOf(aB) + " " + String.valueOf(aL) + " " + String.valueOf(aT) +" " + String.valueOf(V); 
    }
    
    public String PiramideB5(){
        double aB = ((5 * this.a) * this.b) / 2;
        double aL = 5 * ((this.a * this.g) / 2);
        double aT = aB + aL; 
        double V = (this.h * aB) / 3;
        
        return String.valueOf(aB) + " " + String.valueOf(aL) + " " + String.valueOf(aT) +" " + String.valueOf(V); 
    
    }

    public String PrismaB3(){
        double aB = (this.a * this.b) / 2;
        double aL = (this.a * this.b) * 3;
        double aT = (aB * 2) * aL; 
        double V = aB * this.h; 

        return String.valueOf(aB) + " " + String.valueOf(aL) + " " + String.valueOf(aT) +" " + String.valueOf(V); 
    }

    public String PrismaB4(){
        double aB = this.a * this.b;
        double aL = (this.a * this.b) * 4;
        double aT = (aB * 2) + aL; 
        double V = aB * this.h; 
        
        return String.valueOf(aB) + " " + String.valueOf(aL) + " " + String.valueOf(aT) +" " + String.valueOf(V); 
    }

    public String PrismaB5(){
        double aB = ((5 * this.a) * this.b) / 2;
        double aL = (this.a * this.b) * 5;
        double aT = aB * aL; 
        double V = aB * this.h; 
    
        return String.valueOf(aB) + " " + String.valueOf(aL) + " " + String.valueOf(aT) +" " + String.valueOf(V);
    }

    public String Cilindro(){
        double aB = Math.PI * Math.pow(this.r, 2);
        double aL = 2 * Math.PI * this.r * this.h;
        double aT = (aB * 2) + aL;
        double V = Math.PI * this.r * this.h; 

        return String.valueOf(aB) + " " + String.valueOf(aL) + " " + String.valueOf(aT) +" " + String.valueOf(V);
    }

    public String Cone(){
        double aB = Math.PI * Math.pow(this.r, 2);
        double aL = Math.PI * this.r * this.g; 
        double aT = aB + aL; 
        double V = aB * h; 
    
        return String.valueOf(aB) + " " + String.valueOf(aL) + " " + String.valueOf(aT) +" " + String.valueOf(V);
    }

    public String Esfera(){
        double aS = 4 * Math.pow(this.r,2) * Math.PI;
        double V  = (Math.PI * Math.pow(3, this.r) * 3) / 4;
        return String.valueOf(aS) + " " + String.valueOf(V);
    }

    public String TroncoQ(){
        double SB = Math.sqrt(this.L);
        double Sb = Math.sqrt(this.l);
        double V = (this.h/3) * (SB + Math.sqrt(SB*Sb) + Sb); 
        return String.valueOf(SB) + " " + String.valueOf(Sb) + " " + String.valueOf(V);
    }

    public String TroncoC(){
        double V = Math.PI * this.h * (Math.pow(this.r, 2) + this.r * this.R + Math.pow(this.R, 2));
        return String.valueOf(V);
    }
}
