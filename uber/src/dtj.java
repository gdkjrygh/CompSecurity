// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import com.ubercab.client.core.app.RiderActivity;

public final class dtj extends dta
    implements android.content.DialogInterface.OnClickListener
{

    public dtj()
    {
    }

    public static void a(RiderActivity rideractivity, int i, String s, String s1, String s2, String s3)
    {
        a(rideractivity, i, s, s1, s2, s3, ((Bundle) (null)));
    }

    public static void a(RiderActivity rideractivity, int i, String s, String s1, String s2, String s3, Bundle bundle)
    {
        s = a(s, s1, i);
        s.putString("dialog.button_positive_text", s2);
        s.putString("dialog.button_negative_text", s3);
        if (bundle != null)
        {
            s.putAll(bundle);
        }
        s1 = new dtj();
        s1.setArguments(s);
        s1.show(rideractivity.getSupportFragmentManager(), s1.getClass().getName());
    }

    public static void a(RiderActivity rideractivity, int i, String s, String s1, String s2, String s3, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("dialog.canceled_on_touch_outside", flag);
        bundle.putBoolean("dialog.gray_negative_button", true);
        a(rideractivity, i, s, s1, s2, s3, bundle);
    }

    private void a(dtk dtk1)
    {
        dtk1.a(this);
    }

    private dtk b(dfp dfp)
    {
        return dtl.a().a(new diw(this)).a(dfp).a();
    }

    public final cic a()
    {
        return cyz.e;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dtk)czj);
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        byte byte0 = -1;
        if (i == -1)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        c(i);
        dismiss();
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getArguments();
        AlertDialog alertdialog = d();
        alertdialog.setButton(-1, bundle.getString("dialog.button_positive_text"), this);
        alertdialog.setButton(-2, bundle.getString("dialog.button_negative_text"), this);
        alertdialog.setCanceledOnTouchOutside(bundle.getBoolean("dialog.canceled_on_touch_outside"));
        return alertdialog;
    }

    public final void onStart()
    {
        super.onStart();
        Bundle bundle = getArguments();
        if (bundle != null && bundle.getBoolean("dialog.gray_negative_button"))
        {
            Button button = ((AlertDialog)getDialog()).getButton(-2);
            if (button != null)
            {
                button.setTextColor(getResources().getColor(0x7f0d0071));
            }
        }
    }
}
