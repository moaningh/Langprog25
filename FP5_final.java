import java.util.list;
import java.util.Arraylist;

class kurs {
    static List<String> replan(List<String> plan, String newChapt, String beforeChapt) {
        int newChaptIndex = plan.IndexOf(beforeChapt);
        plan.add(newChaptIndex, newChapt);
        return plan;
    }
}

class kurs2 {
    static List<String> replan(List<String> plan, String newChapt, String beforeChapt) {
        int newChaptIndex = plan.IndexOf(beforeChapt);
        List<String> replanned = new ArrayList<>(plan);
        replanned.add(newChaptIndex, newChapt);
        return replanned;
    }
}

class FP5 {
    public static void main(String[] args) {
        List<String> planA = new ArrayList<>();
        planA.add("ВВЕДЕНИЕ");
        planA.add("ГЛАВА 1");
        planA.add("Создание видеоигр");
        planA.add("ГЛАВА 2");
        List<String> planB = new ArrayList<>();
        planB = kurs.replan(planA, "Анализ целевой аудитории", "ГЛАВА 2");
        planA.remove("Создание видеоигр");
        planA.subList(1, 3);
        List<String> planD = new ArrayList<>();
    }
}