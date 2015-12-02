// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.about;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.android.location.UberLocation;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.rider.realtime.model.City;
import czb;
import czj;
import dak;
import dfp;
import djb;
import dsx;
import dsz;
import duc;
import dve;
import dxx;
import dxy;
import dyb;
import dyg;
import dyh;
import hkr;
import java.util.ArrayList;
import java.util.List;

public class OtherFragment extends czb
{

    public Application c;
    public cev d;
    public hkr e;
    public dak f;
    private dsz g;
    ListView mListView;

    public OtherFragment()
    {
    }

    public static OtherFragment a()
    {
        return new OtherFragment();
    }

    private void a(dyb dyb1)
    {
        dyb1.a(this);
    }

    private static boolean a(Context context, City city)
    {
        return city != null && context.getString(0x7f0706b7).equals(city.getCityName());
    }

    public static boolean a(Context context, City city, UberLocation uberlocation)
    {
        return b(context, city, uberlocation) != 0;
    }

    private static int b(Context context, City city, UberLocation uberlocation)
    {
        if (duc.a(context, uberlocation, "california"))
        {
            return 1;
        }
        if (a(context, city))
        {
            return 2;
        }
        return !duc.a(context, uberlocation, "japan") ? 0 : 3;
    }

    private dyb b(dfp dfp)
    {
        return dxx.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dyb)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030028, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onItemClickOther(int i)
    {
        switch (g.b(i).a())
        {
        default:
            return;

        case 0: // '\0'
            String s = getString(0x7f07028c);
            d.c(new dyh(s, "file:///android_asset/licenses/japan-travel-agency-license-information.html"));
            return;

        case 1: // '\001'
            d.c(new dyg("https://www.uber.com/tokyo/travelagreement"));
            return;

        case 2: // '\002'
            String s1 = dve.a("https://www.uber.com/legal/%s/ca-tnc?plain=true");
            String s2 = getString(0x7f070079);
            d.c(new dyh(s2, s1));
            return;

        case 3: // '\003'
            d.c(new dyg("https://s3.amazonaws.com/uber-regulatory-documents/insurance/Chicago_Certificates_of_Insurance.pdf"));
            break;
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070308));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = new ArrayList();
        view = f.c();
        if (view != null)
        {
            view = view.getLocation();
        } else
        {
            view = null;
        }
        b(c, e.b(), view);
        JVM INSTR tableswitch 1 3: default 76
    //                   1 116
    //                   2 136
    //                   3 160;
           goto _L1 _L2 _L3 _L4
_L1:
        g = new dsz(getActivity());
        g.a(bundle);
        mListView.setAdapter(g);
        return;
_L2:
        bundle.add(new dsx(2, "CA TNC"));
        continue; /* Loop/switch isn't completed */
_L3:
        bundle.add(new dsx(3, getString(0x7f070092)));
        continue; /* Loop/switch isn't completed */
_L4:
        bundle.add(new dsx(0, getString(0x7f07028c)));
        bundle.add(new dsx(1, getString(0x7f07028d)));
        if (true) goto _L1; else goto _L5
_L5:
    }
}
