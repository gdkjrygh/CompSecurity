// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.emergency;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import cwm;
import cyz;
import czj;
import dbf;
import dfp;
import diw;
import drc;
import dza;
import dzb;
import dze;
import dzi;
import gmg;
import l;
import n;

public class EmergencyFragment extends cyz
{

    public chp a;
    public drc b;
    public dzi c;
    public gmg d;
    Button mButtonDisable;
    TextView mTextViewNotifying;

    public EmergencyFragment()
    {
    }

    public static void a(RiderActivity rideractivity)
    {
        (new EmergencyFragment()).show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/emergency/EmergencyFragment.getName());
    }

    private void a(dze dze1)
    {
        dze1.a(this);
    }

    private dze b(dfp dfp)
    {
        return dza.a().a(new diw(this)).a(dfp).a();
    }

    public final cic a()
    {
        return l.gd;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dze)czj);
    }

    void onClickCallPolice()
    {
        Integer integer = b.a();
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.es);
        Object obj;
        if (integer != null)
        {
            obj = integer;
        } else
        {
            obj = "";
        }
        obj = analyticsevent.setValue(obj);
        a.a(((AnalyticsEvent) (obj)));
        if (integer != null)
        {
            obj = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder("tel:")).append(integer).toString()));
        } else
        {
            obj = new Intent("android.intent.action.DIAL");
        }
        try
        {
            startActivity(((Intent) (obj)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            cwm.a(getActivity(), getString(0x7f0702d2));
        }
    }

    void onClickDisableEmergency()
    {
        a.a(n.et);
        c.d();
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(2, 0x7f090184);
        if (!c.e())
        {
            c.c();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03005b, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = d.b(dbf.cc, "safety_emergency_not_emergency");
        if (!TextUtils.isEmpty(view))
        {
            mButtonDisable.setText(view);
        }
        view = d.b(dbf.cc, "safety_emergency_notifying");
        if (!TextUtils.isEmpty(view))
        {
            mTextViewNotifying.setText(view);
        }
    }
}
