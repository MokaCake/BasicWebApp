package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Mango_cake";
        }
        if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            return Integer.toString(Integer.parseInt(parts[3]) + Integer.parseInt(parts[5]));
        }

        if (query.toLowerCase().contains("multiplied")) {
            String[] parts = query.split(" ");
            return Integer.toString(Integer.parseInt(parts[3]) * Integer.parseInt(parts[5]));
        }

        if (query.toLowerCase().contains("the largest")) {
            String[] sub = query.split(":");
            String[] parts = sub[2].split(",");
            int[] parts_num = new int[parts.length];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < parts.length; i ++){
                parts_num[i] = Integer.parseInt(parts[i]);
            }
            for (int i = 0; i < parts.length; i ++){
                if (max < parts_num[i]){
                    max = parts_num[i];
                }
            }
            return Integer.toString(max);
        }
        

        return "";
    }
}
