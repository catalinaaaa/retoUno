public class Vehiculo{
    private String marca;
    private String modelo;
    private Integer anoFabricacion;
    private Integer cantidadVehiculos = 0;
    private String placa;
    private String color;
    
    public Vehiculo(String pColor, String pPlaca){
      this.color = pColor;
      this.placa = pPlaca;
    }

    public Vehiculo(String pMarca, Integer pAnoFabricacion, String pModelo){
      this.marca = pMarca;
      this.anoFabricacion = pAnoFabricacion;
      this.modelo = pModelo;
    }
    
    public String getMarca(){
      return marca;
    }
    
    public void setMarca(String pMarca){
      this.marca = pMarca;
    }
    
    public String getModelo(){
      return modelo;
    }
        
    public void setModelo(String pModelo){
      this.modelo = pModelo;
    }
    
    public Integer getAnoFabricacion(){
      return anoFabricacion;
    }
        
    public void setAnoFabricacion(Integer pAnoFabricacion){
      this.anoFabricacion = pAnoFabricacion;
    }
    
    public String getPlaca(){
      return placa;
    }
        
    public void setPlaca(String pPlaca){
      this.placa = pPlaca;
    }
    
    public String getColor(){
      return color;
    }
        
    public void setColor(String pColor){
      this.color = pColor;
    }
    
    public void determinarDiaRestriccion(String placa){
      int finalPlaca = Integer.parseInt(placa) % 10;
      switch(finalPlaca){
      case 1: restriccionLunes(finalPlaca);
              break;
      case 2: restriccionMartes(finalPlaca);
              break;
      case 3: restriccionMiercoles(finalPlaca);
              break;
      case 4: restriccionJueves(finalPlaca);
              break;
      case 5: restriccionViernes(finalPlaca);
              break;
      default:
        System.out.println("La placa no termina en número, ingrese una placa válida");
        break;
      }
    }
    
    public void restriccionLunes(int finalPlaca){
      if(finalPlaca == 1 || finalPlaca == 2){
        System.out.println("Día de restricción: lunes");
      }
    }
    
    public void restriccionMartes(int finalPlaca){
      if(finalPlaca == 3 || finalPlaca == 4){
        System.out.println("Día de restricción: martes");
      }
    }
    
    public void restriccionMiercoles(int finalPlaca){
      if(finalPlaca == 5 || finalPlaca == 6){
        System.out.println("Día de restricción: miércoles");
      }
    }
    
    public void restriccionJueves(int finalPlaca){
      if(finalPlaca == 7 || finalPlaca == 8){
        System.out.println("Día de restricción: jueves");
      }
    }
    
    public void restriccionViernes(int finalPlaca){
      if(finalPlaca == 9 || finalPlaca == 0){
        System.out.println("Día de restricción: viernes");
      }
    }
   
    public boolean placaEsValidaParaRestriccion(){
    
    }
    
    public Integer getCantidadVehiculos(){
      return cantidadVehiculos;
    }
}
