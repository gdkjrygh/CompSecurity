// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.experiment.model.TreatmentGroup;
import com.ubercab.rider.realtime.response.CancellationInfo;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import dtf;
import dtp;
import java.util.ArrayList;
import java.util.List;

public class PoolCancelDialogFragment extends dtp
{

    public static final TreatmentGroup b = new TreatmentGroup() {

        public final String name()
        {
            return "treament_a";
        }

    };
    public static final TreatmentGroup c = new TreatmentGroup() {

        public final String name()
        {
            return "treament_b";
        }

    };
    Button mAcceptButton;
    TextView mBodyText;
    Button mCancelButton;
    TextView mFeeTitleText;
    TextView mNoFeeTitleText;

    public PoolCancelDialogFragment()
    {
    }

    public static void a(RiderActivity rideractivity, CancellationInfo cancellationinfo, String s)
    {
        if (cancellationinfo != null)
        {
            Bundle bundle = new Bundle();
            bundle.putString("accept_button", cancellationinfo.getAcceptButtonTitle());
            bundle.putString("cancel_button", cancellationinfo.getCancelButtonTitle());
            bundle.putString("title_text", cancellationinfo.getTitle());
            bundle.putStringArrayList("messages_text", new ArrayList(cancellationinfo.getMessages()));
            bundle.putBoolean("charge_fee", cancellationinfo.getChargeFee());
            bundle.putString("treatment_group", s);
            bundle.putInt("dialog.request_code", 2019);
            cancellationinfo = new PoolCancelDialogFragment();
            cancellationinfo.setArguments(bundle);
            cancellationinfo.show(rideractivity.getSupportFragmentManager(), cancellationinfo.getClass().getName());
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        byte byte0 = 8;
        AlertDialog alertdialog = dtf.a(getActivity());
        View view = LayoutInflater.from(getActivity()).inflate(0x7f030139, null, false);
        ButterKnife.inject(this, view);
        Bundle bundle1 = getArguments();
        boolean flag = bundle1.getBoolean("charge_fee");
        bundle = mFeeTitleText;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        bundle.setVisibility(i);
        bundle = mNoFeeTitleText;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        bundle.setVisibility(i);
        bundle = bundle1.getString("title_text");
        mFeeTitleText.setText(bundle);
        mNoFeeTitleText.setText(bundle);
        bundle = bundle1.getStringArrayList("messages_text");
        if (bundle != null && !bundle.isEmpty())
        {
            if (flag)
            {
                bundle = (String)bundle.get(0);
            } else
            if (b.name().equals(bundle1.getString("treatment_group")))
            {
                bundle = (String)bundle.get(0);
            } else
            {
                bundle = (String)bundle.get(1);
            }
            mBodyText.setText(bundle);
        }
        mAcceptButton.setText(bundle1.getString("accept_button"));
        mAcceptButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PoolCancelDialogFragment a;

            public final void onClick(View view1)
            {
                a.c(-1);
                a.dismiss();
            }

            
            {
                a = PoolCancelDialogFragment.this;
                super();
            }
        });
        mCancelButton.setText(bundle1.getString("cancel_button"));
        mCancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PoolCancelDialogFragment a;

            public final void onClick(View view1)
            {
                a.c(0);
                a.dismiss();
            }

            
            {
                a = PoolCancelDialogFragment.this;
                super();
            }
        });
        alertdialog.setView(view);
        alertdialog.setCanceledOnTouchOutside(false);
        return alertdialog;
    }

}
