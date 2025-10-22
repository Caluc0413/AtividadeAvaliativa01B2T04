package Todas;

import java.util.Scanner;

public class ExerciciosJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS ===");
            System.out.println("1. Conta Bancária");
            System.out.println("2. Filme");
            System.out.println("3. Funcionário");
            System.out.println("4. Retângulo");
            System.out.println("5. Música");
            System.out.println("6. Pessoa (IMC)");
            System.out.println("7. Conta de Luz");
            System.out.println("8. Bicicleta Alugada");
            System.out.println("9. Produto em Estoque");
            System.out.println("10. Temperatura");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    contaBancaria(sc);
                    break;
                case 2:
                    filme(sc);
                    break;
                case 3:
                    funcionario(sc);
                    break;
                case 4:
                    retangulo(sc);
                    break;
                case 5:
                    musica(sc);
                    break;
                case 6:
                    pessoa(sc);
                    break;
                case 7:
                    contaLuz(sc);
                    break;
                case 8:
                    bicicletaAlugada(sc);
                    break;
                case 9:
                    produtoEstoque(sc);
                    break;
                case 10:
                    temperatura(sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    // Atividades

    public static void contaBancaria(Scanner sc) {
        System.out.print("Titular: ");
        String t = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double s = sc.nextDouble();

        ContaBancariaEx c = new ContaBancariaEx(t, s);

        System.out.print("Valor do depósito: ");
        c.depositar(sc.nextDouble());
        System.out.print("Valor do saque: ");
        c.sacar(sc.nextDouble());

        System.out.println("Saldo final de " + t + ": R$ " + c.getSaldo());
    }

    public static void filme(Scanner sc) {
        System.out.print("Título do primeiro filme: ");
        String t1 = sc.nextLine();
        System.out.print("Avaliação (0-5): ");
        double a1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Título do segundo filme: ");
        String t2 = sc.nextLine();
        System.out.print("Avaliação (0-5): ");
        double a2 = sc.nextDouble();

        FilmeEx f1 = new FilmeEx(t1, a1);
        FilmeEx f2 = new FilmeEx(t2, a2);

        f1.exibir();
        f2.exibir();
    }

    public static void funcionario(Scanner sc) {
        System.out.print("Nome do funcionário: ");
        String n = sc.nextLine();
        System.out.print("Salário atual: ");
        double s = sc.nextDouble();
        System.out.print("Percentual de aumento: ");
        double p = sc.nextDouble();

        FuncionarioEx f = new FuncionarioEx(n, s);
        System.out.println("Salário antes: R$ " + s);
        f.aumentarSalario(p);
        System.out.println("Salário depois: R$ " + f.getSalario());
    }

    public static void retangulo(Scanner sc) {
        System.out.print("Largura: ");
        double l = sc.nextDouble();
        System.out.print("Altura: ");
        double a = sc.nextDouble();

        RetanguloEx r = new RetanguloEx(l, a);
        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
    }

    public static void musica(Scanner sc) {
        sc.nextLine(); // limpar buffer
        System.out.print("Título da primeira música: ");
        String t1 = sc.nextLine();
        System.out.print("Duração em segundos: ");
        int d1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Título da segunda música: ");
        String t2 = sc.nextLine();
        System.out.print("Duração em segundos: ");
        int d2 = sc.nextInt();

        MusicaEx m1 = new MusicaEx(t1, d1);
        MusicaEx m2 = new MusicaEx(t2, d2);

        System.out.println(m1.getTitulo() + " - " + m1.formatarDuracao());
        System.out.println(m2.getTitulo() + " - " + m2.formatarDuracao());
    }

    public static void pessoa(Scanner sc) {
        sc.nextLine(); // limpar buffer
        System.out.print("Nome: ");
        String n = sc.nextLine();
        System.out.print("Peso (kg): ");
        double p = sc.nextDouble();
        System.out.print("Altura (m): ");
        double a = sc.nextDouble();

        PessoaEx pessoa = new PessoaEx(n, p, a);
        System.out.println("IMC: " + pessoa.calcularIMC());
        System.out.println("Classificação: " + pessoa.classificacaoIMC());
    }

    public static void contaLuz(Scanner sc) {
        System.out.print("Consumo em kWh: ");
        double c = sc.nextDouble();
        System.out.print("Valor por kWh: ");
        double v = sc.nextDouble();

        ContaLuzEx conta = new ContaLuzEx(c, v);
        System.out.println("Valor a pagar: R$ " + conta.calcularValorTotal());
    }

    public static void bicicletaAlugada(Scanner sc) {
        System.out.print("Horas de aluguel: ");
        int h = sc.nextInt();
        System.out.print("Valor por hora: ");
        double v = sc.nextDouble();

        BicicletaAlugadaEx b = new BicicletaAlugadaEx(h, v);
        System.out.println("Valor final do aluguel: R$ " + b.calcularValor());
    }

    public static void produtoEstoque(Scanner sc) {
        sc.nextLine(); // limpar buffer
        System.out.print("Nome do produto: ");
        String n = sc.nextLine();
        System.out.print("Quantidade inicial: ");
        int q = sc.nextInt();
        ProdutoEstoqueEx p = new ProdutoEstoqueEx(n, q);

        System.out.print("Quantidade a adicionar: ");
        p.adicionarEstoque(sc.nextInt());
        System.out.print("Quantidade a remover: ");
        p.removerEstoque(sc.nextInt());

        System.out.println("Quantidade final: " + p.getQuantidade());
    }

    public static void temperatura(Scanner sc) {
        System.out.print("Temperatura em Celsius: ");
        double c = sc.nextDouble();

        TemperaturaEx t = new TemperaturaEx(c);
        System.out.println("Fahrenheit: " + t.paraFahrenheit() + " °F");
        System.out.println("Kelvin: " + t.paraKelvin() + " K");
    }

    // Classes auxiliares

    static class ContaBancariaEx {
        private double saldo;
        public ContaBancariaEx(String t, double s) { saldo = s; }
        public void depositar(double v) { if(v>0) saldo+=v; }
        public void sacar(double v) { if(v>0 && saldo>=v) saldo-=v; }
        public double getSaldo() { return saldo; }
    }

    static class FilmeEx {
        private String titulo; private double avaliacao;
        public FilmeEx(String t, double a){ titulo=t; avaliacao=a; }
        public void exibir(){ System.out.println("Filme: "+titulo+" | Avaliação: "+avaliacao+" ⭐"); }
    }

    static class FuncionarioEx {
        private double salario;
        public FuncionarioEx(String n,double s){ salario=s; }
        public void aumentarSalario(double p){ salario+=salario*(p/100); }
        public double getSalario(){ return salario; }
    }

    static class RetanguloEx {
        private double l,h;
        public RetanguloEx(double l,double h){ this.l=l; this.h=h; }
        public double area(){ return l*h; }
        public double perimetro(){ return 2*(l+h); }
    }

    static class MusicaEx {
        private String titulo; private int duracao;
        public MusicaEx(String t,int d){ titulo=t; duracao=d; }
        public String formatarDuracao(){ return String.format("%02d:%02d", duracao/60,duracao%60); }
        public String getTitulo(){ return titulo; }
    }

    static class PessoaEx {
        private double peso,altura;
        public PessoaEx(String n,double p,double a){ peso=p; altura=a; }
        public double calcularIMC(){ return peso/(altura*altura); }
        public String classificacaoIMC(){
            double imc = calcularIMC();
            if(imc<18.5) return "Abaixo do peso";
            else if(imc<25) return "Normal";
            else if(imc<30) return "Sobrepeso";
            else return "Obesidade";
        }
    }

    static class ContaLuzEx {
        private double consumo, valorKwh;
        public ContaLuzEx(double c,double v){ consumo=c; valorKwh=v; }
        public double calcularValorTotal(){ return consumo*valorKwh; }
    }

    static class BicicletaAlugadaEx {
        private int horas; private double valorHora;
        public BicicletaAlugadaEx(int h,double v){ horas=h; valorHora=v; }
        public double calcularValor(){ return horas*valorHora; }
    }

    static class ProdutoEstoqueEx {
        private int quantidade;
        public ProdutoEstoqueEx(String n,int q){ quantidade=q; }
        public void adicionarEstoque(int qtd){ quantidade+=qtd; }
        public void removerEstoque(int qtd){ if(quantidade-qtd>=0) quantidade-=qtd; }
        public int getQuantidade(){ return quantidade; }
    }

    static class TemperaturaEx {
        private double c;
        public TemperaturaEx(double c){ this.c=c; }
        public double paraFahrenheit(){ return (c*9/5)+32; }
        public double paraKelvin(){ return c+273.15; }
    }
}
