// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.client.feature.payment.paytm.PaytmAddFundsActivity;
import com.ubercab.client.feature.payment.paytm.PaytmOtpFragment;
import com.ubercab.client.feature.signup.paytm.SignupPaytmAddFundsActivity;

public class fod extends PaytmOtpFragment
{

    public fod()
    {
    }

    public static fod a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("uuid", s);
        s = new fod();
        s.setArguments(bundle);
        return s;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    protected final cic b()
    {
        return l.hx;
    }

    protected final euf b(dfp dfp)
    {
        return etk.a().a(new djb(this)).a(dfp).a();
    }

    public final cic f()
    {
        return l.hw;
    }

    protected final cic g()
    {
        return l.hy;
    }

    protected final cif h()
    {
        return n.gG;
    }

    protected final cif i()
    {
        return n.gH;
    }

    protected final cif j()
    {
        return n.gI;
    }

    protected final cif k()
    {
        return n.gJ;
    }

    public void onManualRefreshEvent(dli dli)
    {
        super.onManualRefreshEvent(dli);
        if (d.b(dbf.bv))
        {
            startActivity(PaytmAddFundsActivity.a(c, d, e));
            return;
        } else
        {
            startActivity(SignupPaytmAddFundsActivity.a(c, e));
            return;
        }
    }

    public void onPaymentSendCodeResponseEvent(dmn dmn)
    {
        super.onPaymentSendCodeResponseEvent(dmn);
    }

    public void onPaymentValidateCodeResponseEvent(dmo dmo)
    {
        super.onPaymentValidateCodeResponseEvent(dmo);
    }

    public void onPingEvent(dar dar)
    {
        super.onPingEvent(dar);
    }
}
