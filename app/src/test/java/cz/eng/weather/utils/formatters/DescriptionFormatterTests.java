package cz.eng.weather.utils.formatters;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import cz.eng.weather.models.ImmutableWeather;

@RunWith(AndroidJUnit4.class)
@Config(sdk = 27)
public class DescriptionFormatterTests {
    @Test
    public void getDescriptionReturnsDescriptionWithFirstUpperLetter() {
        String json = "{\"weather\": [{\"description\": \"clear sky\"}]}";
        ImmutableWeather weather = ImmutableWeather.fromJson(json, -1);

        Assert.assertEquals("description is wrong", "Clear sky",
                DescriptionFormatter.getDescription(weather));
    }

    @Test
    public void getDescriptionReturnsDoesNotTryToChangeEmptyString() {
        Assert.assertEquals("description is wrong", "",
                DescriptionFormatter.getDescription(ImmutableWeather.EMPTY));
    }

}
