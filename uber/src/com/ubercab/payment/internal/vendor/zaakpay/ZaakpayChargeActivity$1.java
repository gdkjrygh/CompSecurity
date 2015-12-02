// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.zaakpay;

import com.ubercab.payment.internal.vendor.zaakpay.model.ChargeBillErrorContainer;
import cwm;
import gsg;
import gtc;
import gzg;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.zaakpay:
//            ZaakpayChargeActivity, ZaakpayWebViewActivity

final class a extends gtc
{

    final ZaakpayChargeActivity a;

    private void a(ChargeBillErrorContainer chargebillerrorcontainer)
    {
        if (a.isFinishing())
        {
            return;
        }
        if ("cvv_entry_required".equals(chargebillerrorcontainer.getError()))
        {
            ZaakpayChargeActivity.a(a).a();
            return;
        }
        if ("web_auth_required".equals(chargebillerrorcontainer.getError()))
        {
            a.startActivityForResult(ZaakpayWebViewActivity.a(a, chargebillerrorcontainer.getErrorObj()), 1000);
            return;
        } else
        {
            cwm.a(a, chargebillerrorcontainer.getError());
            a.finish();
            return;
        }
    }

    public final void a(Exception exception)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            cwm.a(a, gsg.ub__payment_unexpected_error);
            a.finish();
            return;
        }
    }

    public final void a(Object obj)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            a.setResult(-1);
            a.finish();
            return;
        }
    }

    public final void a(RetrofitError retrofiterror)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            cwm.a(a, gsg.ub__payment_network_error);
            a.finish();
            return;
        }
    }

    public final void b(Object obj)
    {
        a((ChargeBillErrorContainer)obj);
    }

    tainer(ZaakpayChargeActivity zaakpaychargeactivity, Class class1)
    {
        a = zaakpaychargeactivity;
        super(class1);
    }
}
