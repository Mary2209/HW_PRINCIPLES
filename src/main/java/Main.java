import Birthdate.FormDate;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.passport = "1234 567890";
        post.patronymic = "Ivanovich";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Ivanov";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 1990;
    }
}
