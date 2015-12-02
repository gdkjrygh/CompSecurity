// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.estimate;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.City;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.CnLocation;
import com.ubercab.client.core.model.Itinerary;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.request.param.Location;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dal;
import dfp;
import djb;
import dkn;
import dnf;
import dpg;
import dul;
import eaq;
import ear;
import eaw;
import eax;
import eaz;
import ebb;
import ebc;
import fqg;
import hkm;
import hkr;
import ica;
import icl;
import ico;

// Referenced classes of package com.ubercab.client.feature.estimate:
//            FareEstimateMultiAddressView

public class FareEstimateFragment extends czb
    implements eaz
{

    public cev c;
    public hkr d;
    public dpg e;
    public dkn f;
    public hkm g;
    public dal h;
    private float i;
    private long j;
    private RiderLocation k;
    private RiderLocation l;
    private icl m;
    FareEstimateMultiAddressView mMultiAddressView;
    public TextView mTextViewFare;
    public TextView mTextViewFarePoints;
    public TextView mTextViewFarePointsExplanation;
    public TextView mTextViewMessage;
    public TextView mTextViewVehicle;
    public LinearLayout mViewGroupResults;
    public LinearLayout mViewGroupSurge;

    public FareEstimateFragment()
    {
    }

    public static FareEstimateFragment a(RiderLocation riderlocation, RiderLocation riderlocation1, long l1, Float float1)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("fare_id", l1);
        bundle.putParcelable("pickup_location", riderlocation);
        bundle.putParcelable("destination_location", riderlocation1);
        bundle.putFloat("currency_to_rewards_ratio", float1.floatValue());
        riderlocation = new FareEstimateFragment();
        riderlocation.setArguments(bundle);
        return riderlocation;
    }

    public static void a(FareEstimateFragment fareestimatefragment)
    {
        fareestimatefragment.h();
    }

    private void a(eaw eaw1)
    {
        eaw1.a(this);
    }

    public static float b(FareEstimateFragment fareestimatefragment)
    {
        return fareestimatefragment.i;
    }

    private eaw b(dfp dfp)
    {
        return eaq.a().a(new djb(this)).a(dfp).a();
    }

    private void g()
    {
        String s = h.E();
        if (TextUtils.isEmpty(s) || !TextUtils.isDigitsOnly(s))
        {
            h();
            return;
        }
        b(getString(0x7f070226));
        Object obj1 = k.getCnLocation();
        Object obj = l.getCnLocation();
        if (!e.q())
        {
            f.a(Integer.valueOf(s).intValue(), j, k.getCnLocation(), l.getCnLocation(), null, 0);
            return;
        } else
        {
            obj1 = Location.create(((CnLocation) (obj1)).getLatitude(), ((CnLocation) (obj1)).getLongitude());
            obj = Location.create(((CnLocation) (obj)).getLatitude(), ((CnLocation) (obj)).getLongitude());
            m = g.a(Integer.valueOf(s).intValue(), ((Location) (obj1)), ((Location) (obj)), Integer.valueOf(0), null).a(ico.a()).a(new eax(this, (byte)0));
            return;
        }
    }

    private void h()
    {
        mTextViewFare.setVisibility(8);
        mTextViewVehicle.setVisibility(8);
        mViewGroupSurge.setVisibility(8);
        mTextViewMessage.setVisibility(0);
        mViewGroupResults.setVisibility(0);
        mTextViewMessage.setText(getString(0x7f07022f));
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        c.c(new ebc());
    }

    final void a(RiderLocation riderlocation, RiderLocation riderlocation1)
    {
        if (k.equals(riderlocation) && l.equals(riderlocation1))
        {
            return;
        } else
        {
            mMultiAddressView.a(riderlocation, riderlocation1);
            k = riderlocation;
            l = riderlocation1;
            g();
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((eaw)czj);
    }

    public final void b()
    {
        c.c(new ebb());
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            bundle = getArguments();
            i = bundle.getFloat("currency_to_rewards_ratio", 0.0F);
            j = bundle.getLong("fare_id", 0L);
            k = (RiderLocation)bundle.getParcelable("pickup_location");
            l = (RiderLocation)bundle.getParcelable("destination_location");
            return;
        } else
        {
            i = bundle.getFloat("currency_to_rewards_ratio", 0.0F);
            j = bundle.getLong("fare_id");
            k = (RiderLocation)bundle.getParcelable("pickup_location");
            l = (RiderLocation)bundle.getParcelable("destination_location");
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030063, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        mMultiAddressView.b(this);
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        if (m != null)
        {
            m.b();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putDouble("currency_to_rewards_ratio", i);
        bundle.putLong("fare_id", j);
        bundle.putParcelable("pickup_location", k);
        bundle.putParcelable("destination_location", l);
    }

    public void onSetDestinationResponseEvent(dnf dnf1)
    {
        e();
        Ping ping = (Ping)dnf1.g();
        if (!dnf1.e() || !dul.m(ping) || !dul.d(ping))
        {
            h();
        } else
        {
            dnf1 = ping.getClient().getLastEstimatedTrip();
            if (TextUtils.isEmpty(dnf1.getFareEstimateString()))
            {
                h();
                return;
            }
            mTextViewFare.setVisibility(0);
            mTextViewFare.setText(dnf1.getFareEstimateString());
            dnf1 = dnf1.getFareEstimateRange();
            if (dnf1 != null && i != 0.0F)
            {
                dnf1 = fqg.a(dnf1, i);
                mTextViewFarePoints.setText(getString(0x7f070232, new Object[] {
                    dnf1
                }));
                mTextViewFarePoints.setVisibility(0);
                mTextViewFarePointsExplanation.setText(getString(0x7f070233));
                mTextViewFarePointsExplanation.setVisibility(0);
            }
            mViewGroupResults.setVisibility(0);
            mTextViewMessage.setVisibility(0);
            mTextViewMessage.setText(getString(0x7f070230));
            dnf1 = h.E();
            if (dul.b(ping, dnf1))
            {
                VehicleView vehicleview = ping.getCity().findVehicleViewById(dnf1);
                mTextViewVehicle.setText(vehicleview.getDescription());
                mTextViewVehicle.setVisibility(0);
                if (dul.d(ping, dnf1))
                {
                    mViewGroupSurge.setVisibility(0);
                    return;
                } else
                {
                    mViewGroupSurge.setVisibility(8);
                    return;
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d().b().a(getString(0x7f07022e));
        mMultiAddressView.a(getString(0x7f070357));
        mMultiAddressView.b(getString(0x7f07025a));
        mMultiAddressView.c(getString(0x7f0703df));
        mMultiAddressView.a(this);
        mMultiAddressView.a(k, l);
        g();
    }
}
