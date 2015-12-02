// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
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
import cif;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dar;
import dfp;
import djb;
import dki;
import dkn;
import dli;
import dmn;
import dmo;
import dpg;
import dtp;
import dul;
import duo;
import etk;
import etl;
import eue;
import euf;
import gmg;
import hkm;
import hku;
import ica;
import icl;
import l;
import n;

public class PaytmOtpFragment extends czb
{

    public Application c;
    public gmg d;
    public String e;
    public chp f;
    public hku g;
    public dki h;
    public dpg i;
    public dkn j;
    public hkm k;
    private icl l;
    Button mButtonVerify;
    EditText mEditTextOtp;
    public TextView mTextViewOtpAddresses;

    public PaytmOtpFragment()
    {
    }

    public static PaytmOtpFragment a(String s, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("uuid", s);
        bundle.putBoolean("resend_otp", flag);
        s = new PaytmOtpFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(euf euf1)
    {
        euf1.a(this);
    }

    private void l()
    {
        b(getString(0x7f0703a2));
        f.a(j());
        mEditTextOtp.setText("");
        h.b(e);
    }

    private void m()
    {
        Button button = mButtonVerify;
        boolean flag;
        if (!TextUtils.isEmpty(mEditTextOtp.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
    }

    public czj a(dfp dfp)
    {
        return b(dfp);
    }

    final void a()
    {
        f.a(h());
    }

    final void a(int i1)
    {
        if (i1 == 900)
        {
            f.a(i());
        }
    }

    public final volatile void a(czj czj)
    {
        a((euf)czj);
    }

    public cic b()
    {
        return l.et;
    }

    public euf b(dfp dfp)
    {
        return etk.a().a(new djb(this)).a(dfp).a();
    }

    public cic f()
    {
        return l.es;
    }

    public cic g()
    {
        return l.eu;
    }

    public cif h()
    {
        return n.cM;
    }

    public cif i()
    {
        return n.cN;
    }

    public cif j()
    {
        return n.cO;
    }

    public cif k()
    {
        return n.cP;
    }

    public void onClickVerify()
    {
        b(getString(0x7f070668));
        f.a(k());
        h.a(e, mEditTextOtp.getText().toString());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        e = getArguments().getString("uuid");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f10000d, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030117, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onManualRefreshEvent(dli dli)
    {
        e();
        c(getString(0x7f070665));
        getActivity().finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06b8)
        {
            l();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
        l.b();
    }

    public void onPaymentSendCodeResponseEvent(dmn dmn1)
    {
        e();
        if (dmn1.i())
        {
            c(getString(0x7f0703a4));
            return;
        } else
        {
            c(getString(0x7f0703a3));
            return;
        }
    }

    public void onPaymentValidateCodeResponseEvent(dmo dmo1)
    {
        if (!dmo1.i())
        {
            f.a(b());
            mEditTextOtp.setText("");
            e();
            dtp.a((RiderActivity)getActivity(), 900, null, getString(0x7f07027b), getString(0x7f0704a2));
            return;
        }
        f.a(g());
        if (i.n())
        {
            k.a().b(duo.a());
            return;
        } else
        {
            j.b();
            return;
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!i.n())
        {
            if (dul.a(dar1 = dar1.a()))
            {
                dar1 = dar1.getClient();
                mTextViewOtpAddresses.setText(dar1.getMobile());
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070328));
        l = g.d().c(new eue(this, (byte)0));
    }

    public void onTextChangedOtp()
    {
        m();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        m();
        if (bundle == null && getArguments().getBoolean("resend_otp"))
        {
            l();
        }
    }
}
