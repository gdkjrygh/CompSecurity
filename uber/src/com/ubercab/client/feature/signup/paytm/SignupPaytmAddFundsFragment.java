// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.paytm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.payment.paytm.PaytmAddFundsWebViewActivity;
import com.ubercab.client.feature.payment.paytm.v2.PaytmAddFundsCustomDialogFragment;
import com.ubercab.client.feature.payment.paytm.v2.PaytmAddFundsFragmentBase;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czj;
import dbf;
import dbq;
import dfp;
import djb;
import dki;
import dkn;
import dml;
import dmm;
import dpg;
import dtp;
import duo;
import fnq;
import fnr;
import fny;
import gmg;
import gpp;
import hkp;
import ica;
import icl;
import ico;
import l;
import n;

public class SignupPaytmAddFundsFragment extends PaytmAddFundsFragmentBase
{

    public chp c;
    public gmg d;
    public dki e;
    public dpg f;
    public dkn k;
    public hkp l;
    private double m;
    TextView mTextViewBonus;
    ViewGroup mViewGroupBalance;
    ViewGroup mViewGroupBonus;
    private double n;
    private double o;
    private icl p;
    private String q;

    public SignupPaytmAddFundsFragment()
    {
    }

    public static SignupPaytmAddFundsFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("uuid", s);
        s = new SignupPaytmAddFundsFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(fny fny1)
    {
        fny1.a(this);
    }

    private fny b(dfp dfp)
    {
        return fnq.a().a(new djb(this)).a(dfp).a();
    }

    protected final Intent a(Context context, String s, String s1, String s2)
    {
        return PaytmAddFundsWebViewActivity.c(context, s, s1, s2);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    protected final void a()
    {
        c.a(n.gu);
    }

    protected final void a(double d1)
    {
        m = d1;
        super.a(d1);
    }

    public final void a(int i, int j, Bundle bundle)
    {
        if (i == 1 && j == -1)
        {
            a(PaytmAddFundsCustomDialogFragment.a(bundle));
        }
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
            if (m >= o && !TextUtils.isEmpty(q))
            {
                c.a(l.hs);
                if (f.c())
                {
                    p = l.a(q, false).a(ico.a()).b(duo.a());
                } else
                {
                    k.a(q, false);
                }
                c(getString(0x7f07034a));
            } else
            {
                c.a(l.hr);
                c(getString(0x7f070349));
            }
            s = getActivity();
            s.setResult(-1);
            s.finish();
            return;

        case 1: // '\001'
            c.a(l.hq);
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
        a((fny)czj);
    }

    public final cic f()
    {
        return l.hm;
    }

    public void onClickButtonChange()
    {
        c.a(n.gv);
        PaytmAddFundsCustomDialogFragment.a(d(), o, n);
    }

    public void onClickButtonSuggested()
    {
        c.a(AnalyticsEvent.create("tap").setName(n.gz).setValue(String.valueOf(o)));
        a(o);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = d.a(dbf.bv, "amount_add", 0.0D);
        n = d.a(dbf.bv, "amount_bonus", 0.0D);
        q = d.b(dbf.bv, "promo_code");
        if (bundle != null)
        {
            m = bundle.getDouble("amount_adding");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100015, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03018b, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06c4)
        {
            c.a(n.gy);
            getActivity().finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        super.onPause();
        if (p != null)
        {
            p.b();
        }
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml)
    {
        super.onPaymentCheckBalanceResponseEvent(dml);
    }

    public void onPaymentDepositRequestResponseEvent(dmm dmm)
    {
        super.onPaymentDepositRequestResponseEvent(dmm);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putDouble("amount_adding", m);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (d.b(dbf.bv) || d.a(dbf.bv, dbq.a))
        {
            mViewGroupBalance.setVisibility(0);
            mViewGroupBonus.setVisibility(8);
            o = 200D;
            view = gpp.a(getActivity(), o);
            mButtonSuggested.setText(getString(0x7f070347, new Object[] {
                view
            }));
            mTextViewDescription.setText(getString(0x7f070346, new Object[] {
                view
            }));
            e.a(g);
            return;
        } else
        {
            mViewGroupBalance.setVisibility(8);
            mViewGroupBonus.setVisibility(0);
            view = gpp.a(getActivity(), n);
            bundle = gpp.a(getActivity(), o);
            mButtonSuggested.setText(getString(0x7f070347, new Object[] {
                bundle
            }));
            mTextViewBonus.setText(view);
            mTextViewDescription.setText(getString(0x7f070345, new Object[] {
                bundle, view
            }));
            b();
            return;
        }
    }
}
