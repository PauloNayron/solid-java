package LSP;

class A {
    public String getNome() {
        return "Meu nome é A";
    }
}

class B extends A {
    public String getNome() {
        return "Meu nome é B";
    }
}

public class LSPApplication {
    public static void main(String[] args) {
        var a = new A();
        imprimeNome(a);

        var b = new B();
        imprimeNome(b);
    }

    private static void imprimeNome(A a) {
        System.out.println(a.getNome());
    }
}
