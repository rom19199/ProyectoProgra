public class Operaciones {
  private float MIC;
  private String complexion;
  public Operaciones (){
    MIC = 0;
    complexion = "";
  }
  Public float encontrarMIC (Calendario persona) {
    MIC = getPesoKilogramos() / getEstaturaCentimetros();
    return MIC;
  }
  public String encontrarComplexion () {
    if (MIC > 25) {
      complexion
}
