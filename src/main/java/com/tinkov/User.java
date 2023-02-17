package com.tinkov;

import java.util.Objects;

public class User {
    private final String login;
    private final String email;

    public User(String login, String email) {
        this.login = login;
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new EmailException("Не верно указан email");
        }
    }

    public User() {
        throw new EmailException("Не заполнены поля");
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
