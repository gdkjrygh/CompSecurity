// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;

public final class gxy
{

    public static AlertDialog a(Context context, gmg gmg1, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        if (!gmg1.b(gsn.b))
        {
            String s1 = gpp.a(context, gmg1.a(gsn.b, "handle_fee", 0.0D));
            if (gmg1.a(gsn.a, "go_digital"))
            {
                String s = a(context, gmg1);
                s1 = a(context, gmg1, s1, gsg.ub__payment_cash_go_digital_message);
                String s2 = b(context, gmg1);
                gmg1 = c(context, gmg1);
                return (new android.app.AlertDialog.Builder(context)).setTitle(s).setMessage(s1).setNegativeButton(gmg1, onclicklistener).setPositiveButton(s2, onclicklistener).setOnCancelListener(oncancellistener).create();
            }
            if (gmg1.a(gsn.a, "default"))
            {
                gmg1 = a(context, gmg1, s1, gsg.ub__payment_cash_handle_fee_dialog_message);
                return (new android.app.AlertDialog.Builder(context)).setMessage(gmg1).setNegativeButton(context.getString(gsg.ub__payment_cancel), onclicklistener).setPositiveButton(context.getString(gsg.ub__payment_ok), onclicklistener).setOnCancelListener(oncancellistener).create();
            }
        }
        return null;
    }

    private static String a(Context context, gmg gmg1)
    {
        return gmg1.a(gsn.a, "handle_fee_tittle", context.getString(gsg.ub__payment_cash_go_digital_title).toUpperCase());
    }

    private static String a(Context context, gmg gmg1, String s, int i)
    {
        String s1 = String.format(context.getString(i), new Object[] {
            s
        });
        context = gmg1.b(gsn.a, "handle_fee_body");
        if (!TextUtils.isEmpty(context)) goto _L2; else goto _L1
_L1:
        context = s1;
_L4:
        if (!TextUtils.isEmpty(context))
        {
            return String.format(context, new Object[] {
                s
            });
        }
        break; /* Loop/switch isn't completed */
_L2:
        context = String.format(context, new Object[] {
            s
        });
        continue; /* Loop/switch isn't completed */
        context;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return s1;
    }

    private static String b(Context context, gmg gmg1)
    {
        return gmg1.a(gsn.a, "handle_fee_positive", context.getString(gsg.ub__payment_cash_go_digital_switch_now).toUpperCase());
    }

    private static String c(Context context, gmg gmg1)
    {
        return gmg1.a(gsn.a, "handle_fee_negative", context.getString(gsg.ub__payment_cash_go_digital_no).toUpperCase());
    }
}
