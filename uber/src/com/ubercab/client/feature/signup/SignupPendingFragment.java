// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dfp;
import djb;
import fla;
import flb;
import flz;
import fmp;
import fnf;
import l;

public class SignupPendingFragment extends czb
    implements flz
{

    public cev c;
    private String d;
    TextView mEmail;

    public SignupPendingFragment()
    {
    }

    public static SignupPendingFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("email", s);
        s = new SignupPendingFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(fmp fmp1)
    {
        fmp1.a(this);
    }

    private fmp b(dfp dfp)
    {
        return fla.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
    }

    public final volatile void a(czj czj)
    {
        a((fmp)czj);
    }

    public final cic f()
    {
        return l.hz;
    }

    public void onClickDone()
    {
        c.c(new fnf());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = getArguments().getString("email");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03018c, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070245));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mEmail.setText(d);
    }
}
