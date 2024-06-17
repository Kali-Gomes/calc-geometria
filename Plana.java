import java.lang.Math; 

public class Plana{
    double a;
    double b;
    double B;
    double c;
    double d; 
    double D;
    double g;
    double h;
    double n; 
    double r; 
    double R;
    double L; 
    double l; 

    public String Square(){
        double area = Math.pow(this.a, 2);
        double perimetro = 4 * this.a; 

        return "Área: " + String.valueOf(area) + " "+ "Perímetro: " + String.valueOf(perimetro);
    }

    public String Rectangle(){
        double area = this.a * this.b; 
        double perimetro = (2 * this.a) + (2 * this.b);
        
        return "Área: " + String.valueOf(area) + " "+ "Perímetro: " + String.valueOf(perimetro);
    }

    public String Triangle(){
        double area = (this.a * this.h) / 2; 
        double perimetro = this.a + this.b + this.c;         

        return "Área: " + String.valueOf(area) + " "+ "Perímetro: " + String.valueOf(perimetro);
    }    
    
    public String TriangleEqui(){
        double area = ((this.a * Math.sqrt(3)) / 4); 
        double perimetro = this.a * 3;         

        return "Área: " + String.valueOf(area) + " "+ "Perímetro: " + String.valueOf(perimetro);
    }

    public String Parelelogram(){
        double area = this.a * this.h;
        double perimetro = (2 * this.a) + (2 * this.b); 

        return "Área: " + String.valueOf(area) + " "+ "Perímetro: " + String.valueOf(perimetro);
    }

    public String Losangle(){
        double area = this.d * this.D;
        double perimetro = 4 * this.a; 
        
        return "Área: " + String.valueOf(area) + " "+ "Perímetro: " + String.valueOf(perimetro);
    }

    public String Trapezium(){
        double area = ((this.B * this.b) * this.h) / 2;
        double perimetro = this.c + this.b + this.d + this.D;

        return "Área: " + String.valueOf(area) + " "+ "Perímetro: " + String.valueOf(perimetro);
    }

    public String Circle(){
        double Comprimento = 2 * Math.PI * this.r;
        double area = Math.PI * Math.sqrt(r); 

        return "Área: " + String.valueOf(area) + " "+ "Perímetro: " + String.valueOf(Comprimento);
    } 
}