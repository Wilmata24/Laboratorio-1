package laboratorio1;

    
  public enum Frutas {
      
    MANZANA("Manzana"), 
    PERA("Pera"), 
    LIMON("Limón"), 
    MELON("Melón"), 
    NARANJA("Naranja");
    
    private String fruta;
    private Frutas(String tipo){
        
        fruta = tipo;
    }
    public String getTipoFruta(){
        
        return fruta;
    }
    
}
