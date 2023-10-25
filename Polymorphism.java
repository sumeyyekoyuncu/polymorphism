class hayvan{
    private String isim;
    public hayvan(String isim){
        this.isim=isim;
    }
    public void Setisim(String isim){
        this.isim=isim;
    }
    public String Getisim(){
        return isim;
    }
    public String konus(){
        return "hayvan konusuyor...";
    }
}
class kedi extends hayvan{
    public kedi(String isim){
        super(isim);
    }
    public String konus(){   //burda methodu override ettik.
        return  this.Getisim()+" miyavliyor";
    }
}
class kopek extends hayvan{
    public kopek(String isim){
        super(isim);
    }

   
    public String konus() {
        return this.Getisim()+" havliyor.."; 
    }
    
}
class at extends hayvan{
    public at(String isim){
        super(isim);
    }

    
    public String konus() {
        return this.Getisim()+" kisniyor...";
    }
    
}

public class Polymorphism {

    public static void main(String[] args) {
        // hayvan hayvan1=new hayvan("pamuk"); çıktısı -> hayvan konusuyor...
        hayvan hayvan1=new kedi("tekir");
         System.out.println(hayvan1.konus());
         hayvan hayvan2=new at("katır");
         System.out.println(hayvan2.konus());
         hayvan hayvan3=new kopek("karabas");
         System.out.println(hayvan3.konus());
    }
}
