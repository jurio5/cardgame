import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    List<WiseSaying> wiseSayingList = new ArrayList<>();

    public void run() {
        System.out.println("== 명령 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.startsWith("삭제?id=")) {
                delete(cmd);
                continue;
            }

            if (cmd.startsWith("수정?id=")) {
                modify(cmd);
                continue;
            }
            switch (cmd) {
                case "등록":
                    add();
                    break;
                case "목록":
                    list();
                    break;
                case "종료":
                    System.out.print("명령 앱이 종료되었습니다.");
                    scanner.close();
                    return;
            }
        }
    }

    private void add() {
        System.out.print("명언 : ");
        String comment = scanner.nextLine();

        System.out.print("작가 : ");
        String author = scanner.nextLine();

        wiseSayingList.add(new WiseSaying(++count, comment, author));
        System.out.println(count + "번 명언이 등록되었습니다.");

    }

    private void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("-----------------------");

        wiseSayingList.stream().sorted((a, b) -> Integer.compare(b.getId(), a.getId())).forEach(e -> System.out.println(e.getId() + " / " + e.getAuthor() + " / " + e.getComment()));
    }

    private void delete(String cmd) {
        String div = cmd.split("=", 2)[1];
        int convert = Integer.parseInt(div);

        WiseSaying wiseSaying = wiseSayingList.stream().filter(e -> e.getId() == convert).findFirst().orElse(null);

        boolean remove = wiseSayingList.remove(wiseSaying);

        if (remove) {
            System.out.println(convert + "번 명언이 삭제되었습니다.");
        } else {
            System.out.println(convert + "번 명언은 존재하지 않습니다.");
        }
    }

    private void modify(String cmd) {
        String div = cmd.split("=", 2)[1];
        int convert = Integer.parseInt(div);
        WiseSaying wiseSaying = wiseSayingList.stream().filter(e -> e.getId() == convert).findFirst().orElse(null);

        System.out.println("명언(기존) : " + wiseSaying.getComment());
        System.out.print("명언 : ");
        String comment = scanner.nextLine();

        System.out.print("작가 : ");
        String author = scanner.nextLine();

        wiseSaying.setComment(comment);
        wiseSaying.setAuthor(author);

        System.out.println("명언 게시판 수정이 완료되었습니다.");

    }
}
