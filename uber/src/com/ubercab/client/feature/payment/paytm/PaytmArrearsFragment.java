// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import com.ubercab.client.core.realtime.model.ParcelableUnpaidBill;
import com.ubercab.client.feature.payment.paytm.v2.PaytmAddFundsCustomDialogFragment;
import com.ubercab.client.feature.payment.paytm.v2.PaytmAddFundsFragmentBase;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czj;
import dfp;
import djb;
import dki;
import dmk;
import dml;
import dmm;
import dtp;
import erm;
import ert;
import ete;
import etf;
import etx;
import gpp;
import hkr;
import java.util.ArrayList;
import java.util.Queue;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmAddFundsWebViewActivity

public class PaytmArrearsFragment extends PaytmAddFundsFragmentBase
{

    public chp c;
    public cev d;
    public hkr e;
    public dki f;
    private double k;
    private ArrayList l;
    Button mButtonSuggested;
    TextView mTextViewAmountDue;
    TextView mTextViewDescription;

    public PaytmArrearsFragment()
    {
    }

    public static PaytmArrearsFragment a(String s, ArrayList arraylist)
    {
        Bundle bundle = new Bundle();
        bundle.putString("uuid", s);
        bundle.putParcelableArrayList("unpaid_bills", arraylist);
        s = new PaytmArrearsFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(etx etx1)
    {
        etx1.a(this);
    }

    private etx b(dfp dfp)
    {
        return ete.a().a(new djb(this)).a(dfp).a();
    }

    private double g()
    {
        String s;
        if (l != null && !l.isEmpty())
        {
            s = ((ParcelableUnpaidBill)l.get(0)).getAmount();
        } else
        {
            s = null;
        }
        if (!TextUtils.isEmpty(s))
        {
            return Math.abs(Double.parseDouble(s));
        } else
        {
            return 0.0D;
        }
    }

    protected final Intent a(Context context, String s, String s1, String s2)
    {
        return PaytmAddFundsWebViewActivity.d(context, s, s1, s2);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    protected final void a()
    {
        c.a(n.t);
    }

    protected final void a(int i, String s)
    {
        String s1;
        switch (i)
        {
        case 0: // '\0'
        default:
            return;

        case -1: 
            c.a(l.T);
            s = e.c();
            if (s != null && s.getPaymentProfiles() != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                s = s.findPaymentProfileByUuid(g);
            } else
            {
                s = null;
            }
            h.add(new erm(s));
            return;

        case 1: // '\001'
            c.a(l.S);
            s1 = s;
            break;
        }
        if (TextUtils.isEmpty(s))
        {
            s1 = getString(0x7f070046);
        }
        dtp.a(d(), -1, s1);
    }

    public final volatile void a(czj czj)
    {
        a((etx)czj);
    }

    public final cic f()
    {
        return l.dR;
    }

    public void onClickButtonChange()
    {
        c.a(n.p);
        PaytmAddFundsCustomDialogFragment.b(d(), g(), k);
    }

    public void onClickButtonIntlCc()
    {
        c.a(n.o);
        d.c(new ert());
    }

    public void onClickButtonSuggested()
    {
        c.a(n.s);
        a(k);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        l = getArguments().getParcelableArrayList("unpaid_bills");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030111, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onPayBillResponseEvent(dmk dmk1)
    {
        if (dmk1.e())
        {
            c(getString(0x7f070349));
        }
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml1)
    {
        super.onPaymentCheckBalanceResponseEvent(dml1);
        if (!dml1.i())
        {
            return;
        } else
        {
            double d1 = Math.abs(((PaymentCheckBalanceResponse)dml1.g()).getAmount().doubleValue());
            double d2 = g();
            k = (200D + d2) - d1;
            dml1 = gpp.a(getActivity(), d2);
            String s = gpp.a(getActivity(), k);
            mTextViewAmountDue.setText(dml1);
            mTextViewDescription.setText(getString(0x7f070348, new Object[] {
                s
            }));
            mButtonSuggested.setText(getString(0x7f070347, new Object[] {
                s
            }));
            return;
        }
    }

    public void onPaymentDepositRequestResponseEvent(dmm dmm)
    {
        super.onPaymentDepositRequestResponseEvent(dmm);
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(0x7f070048);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        f.a(g);
    }
}
