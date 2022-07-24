package cz.eng.weather.utils;

import android.content.Context;
import cz.eng.weather.utils.formatters.WeatherFormatter;

public class Formatting {

    private Context context;

    public Formatting(Context context) {
        this.context = context;
    }

    public String getWeatherIcon(int actualId, boolean isDay) {
        return WeatherFormatter.getWeatherIconAsText(actualId, isDay, context);
    }
}
