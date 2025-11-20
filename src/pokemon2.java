public class pokemon2 {
    private String nombre;
    private String tipo;
    private int velocidad;
    private int ps;
    private int ataque;
    private int atacar;


    public pokemon2  (String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.velocidad = 20;
        this.ps = 35;
        this.ataque = 10;
        this.atacar=ataque;
        this.atacar = -ps;


    }
    public String getNombre(){
        return  nombre;
    }
    public String getTipo(){
        return tipo;

    }
    public int getVelocidad(){
        return velocidad;
    }
    public int getPs(){
        return ps;
    }
    public int getAtaque(){
        return ataque;
    }
    public void comerBayas(){
        velocidad -= 2;
        ps +=2;
        ataque +=2;

    }
    public void beberAgua(){
        velocidad -= 1;
        ps += 1;
        ataque +=1;
    }
    public void tomarPocionVida(){
        ps +=10;
    }
    public void tomarPocionDaño(){
        ataque += 5;
    }
    public void amuletoVelocidad(){ velocidad +=10;}
    public void atacar(){
        atacar = ataque;
        atacar -= ps;
    }
}
