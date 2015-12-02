// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm.v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.payment.paytm.PaytmAddFundsWebViewActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czj;
import dfp;
import djb;
import dki;
import dml;
import dmm;
import dtp;
import euq;
import eur;
import euw;
import gpp;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment.paytm.v2:
//            PaytmAddFundsFragmentBase, PaytmAddFundsCustomDialogFragment

public class PaytmAddFundsFragment extends PaytmAddFundsFragmentBase
{

    public chp c;

    public PaytmAddFundsFragment()
    {
    }

    public static PaytmAddFundsFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("uuid", s);
        s = new PaytmAddFundsFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(euw euw1)
    {
        euw1.a(this);
    }

    private euw b(dfp dfp)
    {
        return euq.a().a(new djb(this)).a(dfp).a();
    }

    protected final Intent a(Context context, String s, String s1, String s2)
    {
        return PaytmAddFundsWebViewActivity.b(context, s, s1, s2);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        c.a(n.cD);
    }

    protected final void a(int i, String s)
    {
        switch (i)
        {
        case 0: // '\0'
        default:
            return;

        case -1: 
            c.a(l.eq);
            c(getString(0x7f070047));
            s = getActivity();
            s.setResult(-1);
            s.finish();
            return;

        case 1: // '\001'
            c.a(l.ep);
            break;
        }
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = getString(0x7f070046);
        }
        dtp.a(d(), -1, s1);
    }

    public final volatile void a(czj czj)
    {
        a((euw)czj);
    }

    public final cic f()
    {
        return l.el;
    }

    public void onClickButtonChange()
    {
        c.a(n.cE);
        PaytmAddFundsCustomDialogFragment.a(d());
    }

    public void onClickButtonSuggested()
    {
        c.a(AnalyticsEvent.create("tap").setName(n.cI).setValue("200.0"));
        a(200D);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030115, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml)
    {
        super.onPaymentCheckBalanceResponseEvent(dml);
    }

    public void onPaymentDepositRequestResponseEvent(dmm dmm)
    {
        super.onPaymentDepositRequestResponseEvent(dmm);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = gpp.a(getActivity(), 200D);
        mButtonSuggested.setText(getString(0x7f070347, new Object[] {
            view
        }));
        mTextViewDescription.setText(getString(0x7f070346, new Object[] {
            view
        }));
        j.a(g);
    }
}
