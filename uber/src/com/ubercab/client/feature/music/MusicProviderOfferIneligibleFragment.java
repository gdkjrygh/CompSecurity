// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import cic;
import czb;
import czj;
import dfp;
import djb;
import ehh;
import ehi;
import eiz;
import ejy;

public class MusicProviderOfferIneligibleFragment extends czb
{

    public cev c;

    public MusicProviderOfferIneligibleFragment()
    {
    }

    static MusicProviderOfferIneligibleFragment a()
    {
        return new MusicProviderOfferIneligibleFragment();
    }

    private void a(eiz eiz1)
    {
        eiz1.a(this);
    }

    private eiz b(dfp dfp)
    {
        return ehh.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eiz)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300be, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onOkClicked()
    {
        c.c(new ejy());
    }
}
