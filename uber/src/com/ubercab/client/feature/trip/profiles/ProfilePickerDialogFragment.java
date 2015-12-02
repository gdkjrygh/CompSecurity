// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.profiles;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import cgh;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.profiles.ProfilesAdapter;
import com.ubercab.rider.realtime.model.Profile;
import cyz;
import czb;
import czj;
import dfp;
import diw;
import dtf;
import eyv;
import eyy;
import ezd;
import ezg;
import fqp;
import gdd;
import gde;
import gdf;
import gmg;
import hkr;

public class ProfilePickerDialogFragment extends cyz
    implements eyv
{

    public chp a;
    public cev b;
    public hkr c;
    public gmg d;
    public cgh g;
    public ezd h;
    public eyy i;
    ProfilesAdapter j;
    private int k;
    private View l;
    ListView mProfilesListView;

    public ProfilePickerDialogFragment()
    {
    }

    private void a(gdf gdf1)
    {
        gdf1.a(this);
    }

    public static ProfilePickerDialogFragment d()
    {
        Bundle bundle = new Bundle();
        ProfilePickerDialogFragment profilepickerdialogfragment = new ProfilePickerDialogFragment();
        profilepickerdialogfragment.setArguments(bundle);
        return profilepickerdialogfragment;
    }

    private gdf e()
    {
        return gdd.a().a(new diw(this)).a((fqp)((RiderActivity)getActivity()).d()).a();
    }

    private void f()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(getActivity());
        mProfilesListView.addHeaderView(layoutinflater.inflate(0x7f03013e, mProfilesListView, false), null, false);
        mProfilesListView.addHeaderView(layoutinflater.inflate(0x7f030097, mProfilesListView, false), null, false);
    }

    public final cic a()
    {
        return czb.a;
    }

    protected final czj a(dfp dfp)
    {
        return e();
    }

    public final void a(Profile profile, boolean flag)
    {
        j.a(profile);
        j.notifyDataSetChanged();
        l.postDelayed(new Runnable(profile) {

            final Profile a;
            final ProfilePickerDialogFragment b;

            public final void run()
            {
                b.dismiss();
                b.h.a(a, false);
            }

            
            {
                b = ProfilePickerDialogFragment.this;
                a = profile;
                super();
            }
        }, k);
    }

    public final volatile void a(czj czj)
    {
        a((gdf)czj);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = dtf.a(getActivity());
        l = LayoutInflater.from(getActivity()).inflate(0x7f03014f, null, false);
        ButterKnife.inject(this, l);
        j = new ProfilesAdapter(getActivity(), this, ezg.c, i, d, g, c, a);
        f();
        mProfilesListView.setAdapter(j);
        if (c.c() != null)
        {
            j.notifyDataSetChanged();
        }
        k = getActivity().getResources().getInteger(0x7f0b000c);
        bundle.setView(l);
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }
}
