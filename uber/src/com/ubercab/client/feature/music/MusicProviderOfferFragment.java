// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverCapabilities;
import czb;
import czj;
import dfp;
import djb;
import dkv;
import ehf;
import ehg;
import eix;
import ejy;
import ekh;
import hkr;

public class MusicProviderOfferFragment extends czb
    implements android.content.DialogInterface.OnDismissListener
{

    public cev c;
    public hkr d;
    public dkv e;

    public MusicProviderOfferFragment()
    {
    }

    static MusicProviderOfferFragment a(String s, String s1, String s2, String s3)
    {
        Bundle bundle = new Bundle();
        bundle.putString("access_token", s1);
        bundle.putString("city_name", s3);
        bundle.putString("provider_id", s);
        bundle.putString("eligible_trial", s2);
        s = new MusicProviderOfferFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(eix eix1)
    {
        eix1.a(this);
    }

    private eix b(dfp dfp)
    {
        return ehf.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eix)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    void onClickLinkProvider()
    {
        a(getString(0x7f07044a), this);
        Object obj = getArguments();
        String s = ((Bundle) (obj)).getString("provider_id");
        String s1 = ((Bundle) (obj)).getString("eligible_trial");
        obj = ((Bundle) (obj)).getString("city_name");
        e.b(s, s1, ((String) (obj)));
    }

    void onClickNoThanks()
    {
        c.c(new ejy());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300bd, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
    }

    public void onStartTrialResponseEvent(ekh ekh1)
    {
        Object obj;
        if (ekh1.i())
        {
            if ((obj = d.f()) != null && ((Trip) (obj)).getDriver() != null && ((Trip) (obj)).getDriver().getCapabilities() != null && ((Trip) (obj)).getDriver().getCapabilities().getMusic())
            {
                obj = ((Trip) (obj)).getUuid();
                Bundle bundle = getArguments();
                String s = bundle.getString("provider_id");
                ekh1 = (TunesProvider)ekh1.g();
                if (ekh1 != null)
                {
                    ekh1 = ekh1.getAccessToken();
                } else
                {
                    ekh1 = bundle.getString("access_token");
                }
                e.a(((String) (obj)), s, ekh1);
                return;
            }
        }
    }
}
