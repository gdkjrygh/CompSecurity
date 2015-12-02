// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class hft extends gkv
    implements android.app.DatePickerDialog.OnDateSetListener
{

    private String a;
    private hfu b;

    public hft()
    {
    }

    public hft(String s)
    {
        a = s;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b = (hfu)activity;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (bundle != null)
        {
            a = bundle.getString("com.ubercab.rds.EXTRA_FIELD_ID");
        }
        bundle = Calendar.getInstance();
        int i = bundle.get(1);
        int j = bundle.get(2);
        int k = bundle.get(5);
        return new DatePickerDialog(getActivity(), this, i, j, k);
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        datepicker = new GregorianCalendar(i, j, k);
        datepicker = DateFormat.getDateInstance(3).format(Long.valueOf(datepicker.getTimeInMillis()));
        b.a(a, datepicker);
    }

    public void onDetach()
    {
        super.onDetach();
        b = null;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.ubercab.rds.EXTRA_FIELD_ID", a);
    }
}
