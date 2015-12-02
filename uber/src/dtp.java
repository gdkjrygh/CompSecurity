// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.ubercab.client.core.app.RiderActivity;

public class dtp extends dta
{

    gmg a;

    public dtp()
    {
    }

    public static void a(RiderActivity rideractivity, int i, String s)
    {
        a(rideractivity, i, null, s, rideractivity.getString(0x104000a));
    }

    public static void a(RiderActivity rideractivity, int i, String s, String s1, String s2)
    {
        b(rideractivity, i, s, s1, s2);
    }

    private void a(dtq dtq1)
    {
        dtq1.a(this);
    }

    private dtq b(dfp dfp)
    {
        return dtn.a().a(new diw(this)).a(dfp).a();
    }

    private static void b(RiderActivity rideractivity, int i, String s, String s1, String s2)
    {
        s = a(s, s1, i);
        s.putString("dialog.button_positive_text", s2);
        s1 = new dtp();
        s1.setArguments(s);
        rideractivity = rideractivity.getSupportFragmentManager().beginTransaction();
        rideractivity.add(s1, s1.getClass().getName());
        rideractivity.commitAllowingStateLoss();
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
        a((dtq)czj);
    }

    public void onClick(DialogInterface dialoginterface, int i)
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
        dismissAllowingStateLoss();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = d();
        bundle.setCanceledOnTouchOutside(false);
        if (getArguments() != null && !TextUtils.isEmpty(getArguments().getString("dialog.button_positive_text")))
        {
            bundle.setButton(-1, getArguments().getString("dialog.button_positive_text"), this);
        }
        return bundle;
    }
}
