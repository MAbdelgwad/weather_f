package cz.eng.weather.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import cz.eng.weather.R;

//الكلاس المسؤول عن ال about اللي في المنيو
public class AboutDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //دة سياق الديالوج اللي هنعرض فيه البيانات بتاعت ال About
        Context context = getContext();



        AlertDialog alertDialog = new AlertDialog.Builder(context)
                //التايتل بتاع الدايلاوج
                .setTitle(getText(R.string.app_name))
                // البيانات اللي عاوز اكتبها
                .setMessage(TextUtils.concat( "\n\n",
                        getText(R.string.about_description), "\n\n",
                        getText(R.string.about_developers), "\n\n",
                        getText(R.string.about_data)))
                //ال button  اللي بينهي الديلاوج
                .setPositiveButton(R.string.dialog_ok, null)
                //اعمل كريشن للديلاوج
                .create();
        //بعد كدا اعمل عرض للديلاوج بقي
        alertDialog.show();
        //فيو تلقائية المكان بتاعها دة android/data/res/leyout-television/user_switching_dialog.xml
        //بتاعت الديلاوج
        TextView message = alertDialog.findViewById(android.R.id.message);
        // null لو الماسج ################################################
        if (message != null) {
            message.setMovementMethod(LinkMovementMethod.getInstance());
        }

        return alertDialog;
    }
}
