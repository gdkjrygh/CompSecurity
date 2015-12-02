// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.content.DialogInterface;
import android.os.Bundle;
import chp;
import com.ubercab.payment.internal.inject.HandlePaymentErrorActivityWithInjection;
import com.ubercab.payment.model.PaymentError;
import com.ubercab.payment.model.PaymentProfile;
import gsg;
import gss;
import gvj;
import gwq;
import gwr;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsActivity

public class AirtelHandlePaymentErrorActivity extends HandlePaymentErrorActivityWithInjection
{

    public chp a;

    public AirtelHandlePaymentErrorActivity()
    {
    }

    static PaymentProfile a(AirtelHandlePaymentErrorActivity airtelhandlepaymenterroractivity)
    {
        return airtelhandlepaymenterroractivity.d();
    }

    private void a(int i)
    {
        setResult(i);
        finish();
    }

    static void a(AirtelHandlePaymentErrorActivity airtelhandlepaymenterroractivity, int i)
    {
        airtelhandlepaymenterroractivity.a(i);
    }

    private void a(gvj gvj1)
    {
        gvj1.a(this);
    }

    private gvj f()
    {
        return gwq.a().a(gss.a(getApplication())).a();
    }

    private void h()
    {
        (new android.app.AlertDialog.Builder(this)).setTitle(gsg.ub__payment_insufficient_funds_title).setMessage(gsg.ub__payment_insufficient_funds_message).setPositiveButton(gsg.ub__payment_add_funds, new android.content.DialogInterface.OnClickListener() {

            final AirtelHandlePaymentErrorActivity a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.startActivity(AirtelAddFundsActivity.a(a, AirtelHandlePaymentErrorActivity.a(a).getUuid(), true));
                AirtelHandlePaymentErrorActivity.a(a, -1);
            }

            
            {
                a = AirtelHandlePaymentErrorActivity.this;
                super();
            }
        }).setNegativeButton(gsg.ub__payment_cancel, new android.content.DialogInterface.OnClickListener() {

            final AirtelHandlePaymentErrorActivity a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                AirtelHandlePaymentErrorActivity.a(a, 0);
            }

            
            {
                a = AirtelHandlePaymentErrorActivity.this;
                super();
            }
        }).show();
    }

    protected final volatile void a(Object obj)
    {
        a((gvj)obj);
    }

    protected final Object e()
    {
        return f();
    }

    protected void onCreate(Bundle bundle)
    {
        byte byte0;
        super.onCreate(bundle);
        bundle = c();
        if (bundle.getCode() != null)
        {
            bundle = bundle.getCode();
        } else
        {
            bundle = Integer.toString(bundle.getErrorCode());
        }
        bundle.hashCode();
        JVM INSTR lookupswitch 2: default 52
    //                   -628062029: 107
    //                   51510: 93;
           goto _L1 _L2 _L3
_L1:
        byte0 = -1;
          goto _L4
_L3:
        if (!bundle.equals("402")) goto _L1; else goto _L5
_L5:
        byte0 = 0;
          goto _L4
_L2:
        if (!bundle.equals("rtapi.riders.pickup.insufficient_balance")) goto _L1; else goto _L6
_L6:
        byte0 = 1;
_L4:
        switch (byte0)
        {
        default:
            a(0);
            return;

        case 0: // '\0'
        case 1: // '\001'
            h();
            break;
        }
        return;
    }
}
