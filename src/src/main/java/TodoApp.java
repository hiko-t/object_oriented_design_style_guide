import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("シンプルTODOアプリ (add:追加, list:一覧, exit:終了)");
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equals("exit")) {
                System.out.println("終了します。");
                break;
            } else if (input.equals("list")) {
                if (todos.isEmpty()) {
                    System.out.println("TODOはありません。");
                } else {
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.printf("%d: %s\n", i + 1, todos.get(i));
                    }
                }
            } else if (input.startsWith("add ")) {
                String todo = input.substring(4).trim();
                if (!todo.isEmpty()) {
                    todos.add(todo);
                    System.out.println("追加しました: " + todo);
                } else {
                    System.out.println("追加する内容を入力してください。");
                }
            } else {
                System.out.println("コマンドが不明です (add/list/exit)");
            }
        }
        scanner.close();
    }
}
