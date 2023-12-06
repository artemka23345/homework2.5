public class Main {
    public static void main(String[] args) {
        try {
            Validate("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!login.matches("^\\w{1,20}$")) {
            throw new WrongLoginException("Не верное значение логина");
        }
        if (!password.equals(confirmPassword) || !password.matches("^\\w{1,20}$")) {
            throw new WrongPasswordException("Не верное значение пароля");
        }
    }
}

