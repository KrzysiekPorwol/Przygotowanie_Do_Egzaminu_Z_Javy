package Set_Task1;

import java.util.HashSet;
import java.util.Set;

public class App {

  static void main() {
    Set<String> tags = new HashSet<>();

    tags.add("java");
    tags.add("kotlin");
    tags.add("java");
    tags.add("sql");
    tags.add("kotlin");
    tags.add("java");

    System.out.println(tags.size());

    for (String s : tags) {
      System.out.println(s);
    }

    boolean sql = tags.contains("sql");
    boolean python = tags.contains("python");

    System.out.println("Czy w zbiorze jest sql? - " + sql);
    System.out.println("Czy w zbiorze jest python? - " + python);


  }

}


//Tworzy HashSet na String-i.
//Dodaje kilka tagów, w tym celowo powtórzone, np.: "java", "kotlin", "java", "sql", "kotlin", "java".
//      Wypisuje .size() — i zobacz sam, że mimo 6 wywołań add rozmiar jest mniejszy.
//Wypisuje wszystkie elementy pętlą.
//Sprawdza (przez odpowiednią metodę) i wypisuje: czy w zbiorze jest "sql"? A czy jest "python"?