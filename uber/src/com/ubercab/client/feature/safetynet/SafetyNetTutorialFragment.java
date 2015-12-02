// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czb;
import czj;
import dfp;
import djb;
import fea;
import feb;
import fei;
import fet;
import ffd;
import java.util.ArrayList;
import l;
import n;

public class SafetyNetTutorialFragment extends czb
{

    public cev c;
    public fei d;
    public chp e;

    public SafetyNetTutorialFragment()
    {
    }

    private void a(fet fet1)
    {
        fet1.a(this);
    }

    private fet b(dfp dfp)
    {
        return fea.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fet)czj);
    }

    public final cic f()
    {
        return l.gi;
    }

    void onClickAddContacts()
    {
        c.c(new ffd(d.d(), new ArrayList()));
        e.a(n.ex);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03016a, viewgroup, false);
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
        String s = getString(0x7f0703c5).toUpperCase();
        d().b().a(s);
    }
}
