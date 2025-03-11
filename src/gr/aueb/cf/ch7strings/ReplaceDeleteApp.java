package gr.aueb.cf.ch7strings;

public class ReplaceDeleteApp {

    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String simpleName;
        String nickname;
        String oneName;

        // Replaces dash with whitespace
        simpleName = firstname.replace("-", " ");
        System.out.println(simpleName);

        // Replaces with empty string (string with length() == 0), thus essentially deletes
        nickname = firstname.replace("-", "");
        System.out.println(nickname);

        // Replaces with empty string - Deletes
        oneName = firstname.replace("-Helen", "");
        System.out.println(oneName);
    }
}
