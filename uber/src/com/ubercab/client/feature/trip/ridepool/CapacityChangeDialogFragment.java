// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.TripFareChange;
import com.ubercab.ui.TextView;
import dtf;
import dtp;

public class CapacityChangeDialogFragment extends dtp
{

    TextView mBodyTextView;
    ImageView mIcon;
    TextView mNewFareTextView;
    TextView mOldFareTextView;
    TextView mSeatDescriptionTextView;
    TextView mTitleTextView;

    public CapacityChangeDialogFragment()
    {
    }

    public static void a(RiderActivity rideractivity, TripFareChange tripfarechange)
    {
        if (tripfarechange != null)
        {
            Bundle bundle = new Bundle();
            bundle.putString("old_fare", tripfarechange.getOldFare());
            bundle.putString("updated_fare", tripfarechange.getUpdatedFare());
            bundle.putString("title", tripfarechange.getTitle());
            bundle.putString("body", tripfarechange.getDetailedMessage());
            bundle.putString("change_text", tripfarechange.getChangeTypeText());
            bundle.putString("change_type", tripfarechange.getChangeType());
            tripfarechange = new CapacityChangeDialogFragment();
            tripfarechange.setArguments(bundle);
            tripfarechange.show(rideractivity.getSupportFragmentManager(), tripfarechange.getClass().getName());
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = dtf.a(getActivity());
        android.view.View view = LayoutInflater.from(getActivity()).inflate(0x7f030039, null, false);
        ButterKnife.inject(this, view);
        Bundle bundle1 = getArguments();
        mTitleTextView.setText(bundle1.getString("title"));
        mNewFareTextView.setText(bundle1.getString("updated_fare"));
        mOldFareTextView.setText(bundle1.getString("old_fare"));
        mOldFareTextView.setPaintFlags(mOldFareTextView.getPaintFlags() | 0x10);
        mSeatDescriptionTextView.setText(bundle1.getString("change_text"));
        int i;
        if ("seatAdded".equals(bundle1.getString("change_type")))
        {
            i = 0x7f0200d6;
        } else
        {
            i = 0x7f0200d7;
        }
        mIcon.setImageResource(i);
        mBodyTextView.setText(bundle1.getString("body"));
        bundle.setView(view);
        bundle.setCanceledOnTouchOutside(false);
        bundle.setButton(-1, getResources().getString(0x7f0702f8), this);
        return bundle;
    }
}
