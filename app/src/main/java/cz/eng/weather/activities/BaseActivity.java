package cz.eng.weather.activities;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import cz.eng.weather.R;
import cz.eng.weather.utils.UI;

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {

    protected int theme;
    protected boolean darkTheme;
    protected boolean blackTheme;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ال SharedPreferences دة عبارة عن ملف xml مخزن علي الذاكرة الداخلية للتطبيق بخزن فيه البيانات السريعة زي ال اعدادات ال setting
        //هنا بال getDefaultSharedPreferences بخلية بجيبلي ملف ال preference الافتراضي للمشروع كلة علشان ابدأ اتعامل معاه و اخزن فية اللي عاوزه
        //(مؤشر علي الملف البريفرانس العام التابع للتطبيق كلة)
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //noinspection Constant Conditions
        //ببعتلها int لل style resId اللي عاوز اطبقة واللي بجيبة من class ال utils.Ui عن طريق الدالة getTheme
        //ال gitString بترجع key & value طب لو ملقناش val بترجع default val اللي هو fresh علشان كدا بديها ال key & value
        setTheme(theme = UI.getTheme(prefs.getString("theme", "fresh")));

        darkTheme = theme == R.style.AppTheme_NoActionBar_Dark || theme == R.style.AppTheme_NoActionBar_Classic_Dark;
        blackTheme= theme == R.style.AppTheme_NoActionBar_Black|| theme == R.style.AppTheme_NoActionBar_Classic_Black;

       // UI.setNavigationBarMode(BaseActivity.this, darkTheme, blackTheme);
    }
}
