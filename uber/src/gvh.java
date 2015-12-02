// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.ubercab.payment.internal.vendor.airtel.AirtelEditPaymentActivity;
import com.ubercab.payment.model.PaymentProfile;
import java.lang.ref.WeakReference;

public final class gvh
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener
{

    private final chp a;
    private final WeakReference b;

    public gvh(AirtelEditPaymentActivity airteleditpaymentactivity, chp chp1)
    {
        a = chp1;
        b = new WeakReference(airteleditpaymentactivity);
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -2 -1: default 24
    //                   -2 82
    //                   -1 25;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        a.a(f.x);
        dialoginterface = (AirtelEditPaymentActivity)b.get();
        if (dialoginterface != null && !dialoginterface.isFinishing())
        {
            dialoginterface.startActivityForResult(gsa.a(dialoginterface, AirtelEditPaymentActivity.c(dialoginterface).getTokenType()).b(AirtelEditPaymentActivity.d(dialoginterface)), 100);
            return;
        }
          goto _L1
_L2:
        a.a(f.w);
        return;
    }

    public final void onShow(DialogInterface dialoginterface)
    {
        a.a(e.x);
    }
}
