// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.passwordreset;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cgh;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.feature.trip.TripCardView;
import czb;
import czj;
import dfp;
import djb;
import dkf;
import emh;
import emi;
import emp;
import emu;
import ena;
import enb;
import hcr;
import l;
import n;

public class PasswordResetConfirmTripsFragment extends czb
{

    public chp c;
    public dkf d;
    public emu e;
    public cgh f;
    private String g;
    private TripSummary h;
    TripCardView mTripCardView;

    public PasswordResetConfirmTripsFragment()
    {
    }

    public static PasswordResetConfirmTripsFragment a(String s, TripSummary tripsummary)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.ubercab.client.feature.passwordreset.EXTRA_TRIP_CHALLNEGE_ID", s);
        bundle.putParcelable("com.ubercab.client.feature.passwordreset.EXTRA_TRIP_SUMMARY", tripsummary);
        s = new PasswordResetConfirmTripsFragment();
        s.setArguments(bundle);
        return s;
    }

    private ena a()
    {
        return emh.a().a(new djb(this)).a(new enb(getActivity().getApplication())).a((emp)((RiderActivity)getActivity()).d()).a();
    }

    private void a(ena ena1)
    {
        ena1.a(this);
    }

    private void a(boolean flag)
    {
        d.a(e.a(), g, h.getId(), Boolean.valueOf(flag));
        b(getString(0x7f070296));
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.bO).setValue(Boolean.valueOf(flag));
        c.a(analyticsevent);
    }

    protected final volatile czj a(dfp dfp)
    {
        return a();
    }

    public final volatile void a(czj czj)
    {
        a((ena)czj);
    }

    public final void b(String s, TripSummary tripsummary)
    {
        g = s;
        h = tripsummary;
        s = getActivity().getResources();
        int i = hcr.a(s, 1.25F, true);
        mTripCardView.a(f, h, hcr.a(s, false), hcr.b(s, false), s.getDrawable(0x7f0d008a), "client", i, false, false);
        if (TextUtils.isEmpty(h.getDropoffAddress()) && TextUtils.isEmpty(h.getPickupAddress()))
        {
            mTripCardView.b();
        } else
        {
            mTripCardView.a();
        }
        mTripCardView.setVisibility(0);
    }

    public final cic f()
    {
        return l.dG;
    }

    public void onClickButtonNo()
    {
        a(false);
    }

    public void onClickButtonYes()
    {
        a(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ec, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = d().b();
        actionbar.a(getString(0x7f070321).toUpperCase());
        actionbar.b(true);
        actionbar.b(0x7f020343);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b(getArguments().getString("com.ubercab.client.feature.passwordreset.EXTRA_TRIP_CHALLNEGE_ID"), (TripSummary)getArguments().getParcelable("com.ubercab.client.feature.passwordreset.EXTRA_TRIP_SUMMARY"));
    }
}
