package view;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public int getInput() {
        System.out.print("Введите номер ячейки (0-8): ");
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}