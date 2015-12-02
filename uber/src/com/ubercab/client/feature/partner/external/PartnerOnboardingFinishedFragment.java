// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.partner.external;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.ui.Button;
import csa;
import cwm;
import czb;
import czj;
import dfp;
import djb;
import els;
import elt;
import elw;
import l;
import n;

public class PartnerOnboardingFinishedFragment extends czb
{

    public chp c;
    Button mButton;

    public PartnerOnboardingFinishedFragment()
    {
    }

    private void a(elw elw1)
    {
        elw1.a(this);
    }

    private elw b(dfp dfp)
    {
        return els.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((elw)czj);
    }

    public final cic f()
    {
        return l.fY;
    }

    public void onClick()
    {
        android.content.Intent intent = csa.a(getActivity().getPackageManager());
        if (intent != null)
        {
            getActivity().startActivity(intent);
        } else
        {
            cwm.a(getContext(), getString(0x7f07005f));
        }
        c.a(n.em);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300e3, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        ButterKnife.reset(this);
        super.onDestroy();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
    }
}
