public class Carro {
    public static final String PRETO = "PRETO";

    public static final String Quatro = "Quatro";

    private Integer quantidadePneus;
    private Integer quantidadeRetrovisor;
    private Integer quantidadeCombustivel;

    public Carro(Integer quantidadePneus) {

        setQuantidadePneus(quantidadePneus);
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;

    }

    public void setQuantidadePneus(Integer quantidadePneus) {
               quantidadeRetrovisor = quantidadePneus - 2;
               quantidadeCombustivel = quantidadePneus * 20;
              this.quantidadePneus = quantidadePneus;
    }
    public void setCor(String cor) {

        System.out.println(cor);
    
    }

              public Integer getQuantidadeRetrovisor() {
                return quantidadeRetrovisor;
              }

              public Integer getQuantidadeCombustivel() {
                   return quantidadeCombustivel;
              }


    public void setPortas(String portas) {
        System.out.print("Quantidade portas:");
        System.out.println(portas);

    }

    public void imprimeValores() {
            System.out.println("Quantidade Pneus: " + getQuantidadePneus());
            System.out.println("Quantidade Retrovisor:" + getQuantidadeRetrovisor());
            System.out.println("Quantidade tanque de gasolina: " + getQuantidadeCombustivel() + " Litros");

    }
         }

//
//