package javaStarter.hw4.task4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        String aboutWeather = sc.next();
        if (aboutWeather == "солнечно") res = "sunny";
        else if (aboutWeather.equals("пасмурно")) res +="gloomy";
        else if (aboutWeather.equals("облачно")) res += "cloudy";
        else if (aboutWeather.equals("ветрено")) res += "windy";
        else if (aboutWeather.equals("влажно")) res += "humid";
        else if (aboutWeather.equals("туманно")) res += "foggy";
        else if (aboutWeather.equals("дождливо")) res += "rainy";
        else if (aboutWeather.equals("снежно")) res += "snowy";
        else if (aboutWeather.equals("сыро")) res += "wet";
        else if (aboutWeather.equals("очень ветрено")) res += "stormy";
        else res ="I don't know this word";
        System.out.println("Translation of a word into English - " + res);
    }
}
