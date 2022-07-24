package cz.eng.weather.utils;

import cz.eng.weather.R;

public class UI {


//دالة بسيطة بنندها في كل ال activities علشان اختار ال theme اللي انت عاوزة
    //بتاخد مدخل واحد وهو ال key بتاع ال SharedPreferences
    public static int getTheme(String themePref) {
        switch (themePref) {
            case "dark":
                return R.style.AppTheme_NoActionBar_Dark;
            case "black":
                return R.style.AppTheme_NoActionBar_Black;
            case "classic":
                return R.style.AppTheme_NoActionBar_Classic;
            case "classicdark":
                return R.style.AppTheme_NoActionBar_Classic_Dark;
            case "classicblack":
                return R.style.AppTheme_NoActionBar_Classic_Black;
            default:
                return R.style.AppTheme_NoActionBar;
        }
    }
}
