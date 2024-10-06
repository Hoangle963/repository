package com.java.ktra;


import java.util.regex.Pattern;

public class ktra {



    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidBirthDate(String birthDate) {
        // Kiểm tra định dạng ngày sinh (YYYY-MM-DD)
        return birthDate != null && birthDate.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean isValidEmail(String email) {
        // Kiểm tra định dạng email
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    public static boolean isValidGender(String gender) {
        return gender != null && (gender.equalsIgnoreCase("Nam") || gender.equalsIgnoreCase("Nữ"));
    }

    public static boolean isValidStudentRecord(String name, String birthDate, String email, String gender) {
        return isValidName(name) && isValidBirthDate(birthDate) && isValidEmail(email) && isValidGender(gender);
    }
}
	