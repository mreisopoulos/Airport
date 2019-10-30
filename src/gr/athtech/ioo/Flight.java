package gr.athtech.ioo;

public class Flight {
   private String arAirport;
   private String depAirport;

public void setArAirport(String arAirport){
    this.arAirport=arAirport;
}
public void setDepAirport(String depAirport){
    this.depAirport=depAirport;
}



public String getArAirport(){
    return arAirport;
}
public  String getDepAirport(){
    return  depAirport;
}

public String toString(){
    return "gr.athtech.ioo.Flight - From : "+depAirport+" , To " +arAirport;
}



}
