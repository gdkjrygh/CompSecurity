// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;

public final class cpy extends cqo
    implements android.content.DialogInterface.OnClickListener
{

    public cpy()
    {
    }

    public static cpy a(PartnerFunnelActivity partnerfunnelactivity, int i, String s, String s1, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("dialog.canceled_on_touch_outside", true);
        return a(partnerfunnelactivity, i, s, s1, s2, bundle);
    }

    public static cpy a(PartnerFunnelActivity partnerfunnelactivity, int i, String s, String s1, String s2, Bundle bundle)
    {
        return a(partnerfunnelactivity, i, s, s1, s2, false, bundle);
    }

    public static cpy a(PartnerFunnelActivity partnerfunnelactivity, int i, String s, String s1, String s2, boolean flag, Bundle bundle)
    {
        s = a(null, s, i);
        s.putBoolean("dialog.button_emphasize_positive_button", flag);
        s.putString("dialog.button_positive_text", s1);
        s.putString("dialog.button_negative_text", s2);
        if (bundle != null)
        {
            s.putAll(bundle);
        }
        s1 = new cpy();
        s1.setArguments(s);
        s1.show(partnerfunnelactivity.getSupportFragmentManager(), s1.getClass().getName());
        return s1;
    }

    public static cpy a(PartnerFunnelActivity partnerfunnelactivity, String s, String s1, String s2)
    {
        return a(partnerfunnelactivity, 106, s, s1, s2, null);
    }

    private void a(cpz cpz1)
    {
        cpz1.a(this);
    }

    private cpz c()
    {
        return cqa.a().a(new cru(this)).a(crt.a()).a();
    }

    public final crf a()
    {
        return c();
    }

    public final volatile void a(crf crf)
    {
        a((cpz)crf);
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
        a(i);
        dismiss();
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getArguments();
        AlertDialog alertdialog = b();
        alertdialog.setButton(-1, bundle.getString("dialog.button_positive_text"), this);
        alertdialog.setButton(-2, bundle.getString("dialog.button_negative_text"), this);
        alertdialog.setCanceledOnTouchOutside(bundle.getBoolean("dialog.canceled_on_touch_outside"));
        return alertdialog;
    }

    public final void onStart()
    {
        super.onStart();
        if (getArguments() != null && getArguments().getBoolean("dialog.button_emphasize_positive_button"))
        {
            ((AlertDialog)getDialog()).getButton(-1).setTextColor(getResources().getColor(cny.ub__uber_blue_100));
            ((AlertDialog)getDialog()).getButton(-2).setTextColor(getResources().getColor(cny.ub__uber_black_60));
        }
    }
}
