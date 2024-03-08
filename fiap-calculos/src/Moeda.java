public class Moeda {
    public double valorReal;
    public double cotacaoDolar;
    public double quantidadeDolar;

    public void calcularConversao(){
      //this = estou usando um atributo dessa classe - operador que afirma um atributo/método da classe
      this.quantidadeDolar = this.valorReal/this.cotacaoDolar;

    }

    public double retornarCalculoConversao(){
        double dolar = this.valorReal/this.cotacaoDolar;
        return dolar;
    }
}
