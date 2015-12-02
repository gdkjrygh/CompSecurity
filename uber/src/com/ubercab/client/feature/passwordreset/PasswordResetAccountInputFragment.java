// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.passwordreset;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.locale.name.NameInput;
import com.ubercab.locale.phone.PhoneNumberView;
import czb;
import czj;
import dce;
import dfp;
import djb;
import dkf;
import duj;
import elz;
import ema;
import eml;
import emm;
import emp;
import emu;
import gow;
import gpp;
import java.util.Locale;
import l;
import n;

public class PasswordResetAccountInputFragment extends czb
{

    public chp c;
    public dce d;
    public dkf e;
    public emu f;
    NameInput mNameView;
    PhoneNumberView mPhoneNumberView;

    public PasswordResetAccountInputFragment()
    {
    }

    public static PasswordResetAccountInputFragment a()
    {
        return new PasswordResetAccountInputFragment();
    }

    private void a(eml eml1)
    {
        eml1.a(this);
    }

    private eml b()
    {
        return elz.a().a(new djb(this)).a((emp)((RiderActivity)getActivity()).d()).a(new emm()).a();
    }

    protected final czj a(dfp dfp)
    {
        return b();
    }

    public final volatile void a(czj czj)
    {
        a((eml)czj);
    }

    public final cic f()
    {
        return l.dB;
    }

    public void onClickButtonNext()
    {
        c.a(n.bV);
        String s = duj.c(mPhoneNumberView.g(), mPhoneNumberView.d());
        String s1 = mNameView.c();
        String s2 = mNameView.d();
        if ((!s1.isEmpty() || !s2.isEmpty()) && s != null && !s.isEmpty())
        {
            f.a(s);
            e.a(s, s1, s2);
            b(getString(0x7f070296));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300e8, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = d().b();
        actionbar.a(getString(0x7f07031a).toUpperCase());
        actionbar.b(true);
        actionbar.b(0x7f020343);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = mNameView;
        int i;
        if ("CHINA".equals(d.a()) && gpp.a(Locale.getDefault()))
        {
            i = gow.b;
        } else
        {
            i = gow.a;
        }
        view.a(i);
    }
}
