/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author vinic_hfpvuto
 */
import java.util.Scanner;

public class Principal {

    static String usuarioSalvo = "";
    static String senhaSalva = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE LOGIN ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Fazer login");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrar(sc);
                    break;
                case 2:
                    login(sc);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }

    public static void cadastrar(Scanner sc) {
        System.out.print("Digite um usuário: ");
        usuarioSalvo = sc.nextLine();

        System.out.print("Digite uma senha: ");
        senhaSalva = sc.nextLine();

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static void login(Scanner sc) {
        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioSalvo) && senha.equals(senhaSalva)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }
    }
}