package com.company.Stepik;

public class dfdf {
    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука",
                "Лука Лукич"
        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Господи боже! Я уронил своё пасхальное яйцо от неожиданности!"
        };
        printTextPerRole(roles,textLines);
    }
    static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();
        for (String n : roles) {
            int index = 0;
            String role = String.format("%s:", n);
            sb.append(role).append("\n");
            for (String m : textLines) {
                index++;
                if (m.startsWith(role)) {
                    sb.append(String.format("%d) %s\n", index, m.substring(role.length() + 1)));
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
