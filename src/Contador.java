import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int firstParameter = scanner.nextInt();

    System.out.println("Digite o segundo parâmetro");
    int secondParameter = scanner.nextInt();
    
    try {
      count(firstParameter, secondParameter);
      scanner.close();
    } catch (Exception e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
  }

  static void count(int n1, int n2) throws ParametrosInvalidosException {
    if(n1 > n2) {
      throw new ParametrosInvalidosException();
    }

    int times = n2 - n1;

    for(int i = 1; i <= times; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}