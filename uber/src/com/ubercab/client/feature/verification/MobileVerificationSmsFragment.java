// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dar;
import dfp;
import djb;
import dkn;
import dmv;
import dpg;
import duj;
import gil;
import gim;
import gja;
import gjb;
import gjq;
import hku;
import ica;
import icl;
import l;
import n;

public class MobileVerificationSmsFragment extends czb
{

    public chp c;
    public cev d;
    public hku e;
    public dpg f;
    public dkn g;
    private icl h;
    TextView mTextViewPhoneNumber;
    TextView mTextViewReplyTitle;

    public MobileVerificationSmsFragment()
    {
    }

    public static MobileVerificationSmsFragment a()
    {
        return new MobileVerificationSmsFragment();
    }

    private void a(gjb gjb1)
    {
        gjb1.a(this);
    }

    private gjb b(dfp dfp)
    {
        return gil.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gjb)czj);
    }

    public final void a(String s, String s1)
    {
        s = duj.b(s, s1);
        mTextViewPhoneNumber.setText(s);
    }

    public final cic f()
    {
        return l.jg;
    }

    public void onClickButtonChangeNumber()
    {
        d.c(new gjq());
        c.a(n.jy);
    }

    public void onClickButtonResendSms()
    {
        b(getString(0x7f0703a7));
        g.f();
        c.a(n.jB);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030213, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        h.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (f.n())
        {
            return;
        } else
        {
            dar1 = dar1.a().getClient();
            a(dar1.getMobileDigits(), dar1.getMobileCountryIso2());
            return;
        }
    }

    public void onRequestMobileConfirmationResponseEvent(dmv dmv1)
    {
        e();
        if (!dmv1.e())
        {
            c(dmv1.a(getActivity()));
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f07064b));
        h = e.d().c(new gja(this, (byte)0));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = new SpannableString(getString(0x7f0707ab));
        view.setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0d0078)), 0, view.length(), 33);
        view.setSpan(new StyleSpan(1), 0, view.length(), 33);
        view = getString(0x7f070662, new Object[] {
            view
        });
        mTextViewReplyTitle.setText(view);
    }
}
