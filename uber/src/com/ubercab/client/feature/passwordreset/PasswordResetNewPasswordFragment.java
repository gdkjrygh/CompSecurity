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
import com.ubercab.ui.FloatingLabelEditText;
import czb;
import czj;
import dfp;
import djb;
import dkf;
import emj;
import emk;
import emp;
import emu;
import ene;
import l;
import n;

public class PasswordResetNewPasswordFragment extends czb
{

    public chp c;
    public dkf d;
    public emu e;
    FloatingLabelEditText mEditTextNewPassword1;
    FloatingLabelEditText mEditTextNewPassword2;

    public PasswordResetNewPasswordFragment()
    {
    }

    public static PasswordResetNewPasswordFragment a()
    {
        return new PasswordResetNewPasswordFragment();
    }

    private void a(ene ene1)
    {
        ene1.a(this);
    }

    private ene b()
    {
        return emj.a().a(new djb(this)).a((emp)((RiderActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return b();
    }

    public final volatile void a(czj czj)
    {
        a((ene)czj);
    }

    public final cic f()
    {
        return l.dC;
    }

    public void onClickButtonNewPassword()
    {
        String s = mEditTextNewPassword1.i().toString();
        if (s.equals(mEditTextNewPassword2.i().toString()))
        {
            if (!s.isEmpty())
            {
                e.b(s);
                d.b(e.a(), s);
                b(getString(0x7f070296));
            }
        } else
        {
            c(getString(0x7f07030d));
        }
        c.a(n.bU);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300eb, viewgroup, false);
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
        actionbar.a(getString(0x7f070323).toUpperCase());
        actionbar.b(true);
        actionbar.b(0x7f020343);
    }
}
