package utp.edu.pe.mypetsfriend.activities;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;

import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;



import java.util.Calendar;

/**
 * Created by Marco on 07/11/2016.
 */

public class TimeDialog   extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    EditText txtTime;
    public TimeDialog(View view)
    {
        txtTime = (EditText) view;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Calendar c= Calendar.getInstance();
        int hours = c.get(Calendar.HOUR);
        int  minute = c.get(Calendar.MINUTE);


        return new TimePickerDialog( getActivity() , this,hours,minute, false   );
    }


        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            String time = hourOfDay +":" +(minute)  ;
            txtTime.setText(time);
        }





}
