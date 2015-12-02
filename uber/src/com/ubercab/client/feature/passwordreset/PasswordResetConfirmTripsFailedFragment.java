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
import czb;
import czj;
import dfp;
import djb;
import dkf;
import dtj;
import emf;
import emg;
import emp;
import emu;
import emy;
import l;
import n;

public class PasswordResetConfirmTripsFailedFragment extends czb
{

    public chp c;
    public dkf d;
    public emu e;

    public PasswordResetConfirmTripsFailedFragment()
    {
    }

    public static PasswordResetConfirmTripsFailedFragment a()
    {
        return new PasswordResetConfirmTripsFailedFragment();
    }

    private void a(emy emy1)
    {
        emy1.a(this);
    }

    private emy b()
    {
        return emf.a().a(new djb(this)).a((emp)((RiderActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return b();
    }

    public final volatile void a(czj czj)
    {
        a((emy)czj);
    }

    public final cic f()
    {
        return l.dH;
    }

    public void onClickButtonResetAccount()
    {
        c.a(n.bS);
        String s = getString(0x7f070314).toUpperCase();
        String s1 = getString(0x7f070313);
        String s2 = getString(0x7f07009e).toUpperCase();
        String s3 = getString(0x7f07007b).toUpperCase();
        dtj.a(d(), 3, s, s1, s2, s3, false);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ed, viewgroup, false);
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
        actionbar.a(getString(0x7f070319).toUpperCase());
        actionbar.b(true);
        actionbar.b(0x7f020343);
    }
}
