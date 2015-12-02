// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.payment.internal.inject.PaymentActivityWithInjection;
import com.ubercab.payment.internal.model.GatewayInfo;
import com.ubercab.payment.internal.vendor.airtel.ui.AirtelCardFieldsView;
import com.ubercab.ui.Button;
import cwz;
import e;
import f;
import gsd;
import gse;
import gsg;
import gst;
import gvn;
import gwu;
import gwv;
import gxh;

public final class AirtelLinkPaymentActivity extends PaymentActivityWithInjection
    implements gxh
{

    public chp a;
    private Button b;
    private AirtelCardFieldsView c;

    public AirtelLinkPaymentActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/ubercab/payment/internal/vendor/airtel/AirtelLinkPaymentActivity);
    }

    static void a(AirtelLinkPaymentActivity airtellinkpaymentactivity)
    {
        airtellinkpaymentactivity.f();
    }

    private void a(gvn gvn1)
    {
        gvn1.a(this);
    }

    private gvn e()
    {
        return gwu.a().a(new gst(getApplication())).a();
    }

    private void f()
    {
        a.a(f.C);
        cwz.b(getApplication(), b);
        GatewayInfo gatewayinfo = GatewayInfo.create(c.a(), c.b(), c.c(), c.d());
        Intent intent = new Intent();
        intent.putExtra("credit_card_info", gatewayinfo);
        intent.putExtra("card_type", c.e());
        setResult(-1, intent);
        finish();
    }

    protected final volatile void a(Object obj)
    {
        a((gvn)obj);
    }

    public final void a(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 32
    //                   67: 57
    //                   2175: 71;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 56
    //                   0 85
    //                   1 111;
           goto _L4 _L5 _L6
_L4:
        return;
_L2:
        if (s.equals("C"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s.equals("DC"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        s = "credit";
_L8:
        a.a(AnalyticsEvent.create("tap").setName(f.B).setValue(s));
        return;
_L6:
        s = "debit";
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(boolean flag)
    {
        b.setEnabled(flag);
    }

    protected final Object c()
    {
        return e();
    }

    public final void d()
    {
        a.a(f.A);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(gsg.ub__payment_airtel_link_payment);
        b().b(true);
        setContentView(gse.ub__payment_activity_airtel_card_link);
        c = (AirtelCardFieldsView)findViewById(gsd.ub__payment_airtel_cardfieldsview);
        c.a(this);
        b = (Button)findViewById(gsd.ub__payment_airtel_button_continue);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final AirtelLinkPaymentActivity a;

            public final void onClick(View view)
            {
                AirtelLinkPaymentActivity.a(a);
            }

            
            {
                a = AirtelLinkPaymentActivity.this;
                super();
            }
        });
        b.setEnabled(false);
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            a.a(f.z);
            break;
        }
        setResult(0);
        onBackPressed();
        return true;
    }

    protected final void onResume()
    {
        super.onResume();
        a.a(e.E);
    }
}
