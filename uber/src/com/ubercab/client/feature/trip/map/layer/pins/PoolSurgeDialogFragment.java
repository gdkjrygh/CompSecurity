// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pins;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cic;
import com.ubercab.client.core.model.UpfrontFareDetail;
import com.ubercab.rider.realtime.model.FareDetailMetadata;
import com.ubercab.ui.TextView;
import cyz;
import czb;
import czj;
import dfp;
import diw;
import dtf;
import gbl;
import gbm;
import gbq;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.trip.map.layer.pins:
//            PoolSurgeBarView

public class PoolSurgeDialogFragment extends cyz
{

    LinearLayout mLinearLayoutBarContainer;
    TextView mTextViewFooter;
    TextView mTextViewSubtitle;
    TextView mTextViewTitle;

    public PoolSurgeDialogFragment()
    {
    }

    public static PoolSurgeDialogFragment a(UpfrontFareDetail upfrontfaredetail)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("upfront_fare_detail", upfrontfaredetail);
        upfrontfaredetail = new PoolSurgeDialogFragment();
        upfrontfaredetail.setArguments(bundle);
        return upfrontfaredetail;
    }

    private void a(gbq gbq1)
    {
        gbq1.a(this);
    }

    private gbq b(dfp dfp)
    {
        return gbl.a().a(new diw(this)).a(dfp).a();
    }

    public final cic a()
    {
        return czb.a;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gbq)czj);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = dtf.a(getActivity());
        android.view.View view = LayoutInflater.from(getActivity()).inflate(0x7f03013b, null, false);
        ButterKnife.inject(this, view);
        Object obj = (UpfrontFareDetail)getArguments().getParcelable("upfront_fare_detail");
        if (obj != null)
        {
            mTextViewFooter.setText(((UpfrontFareDetail) (obj)).getFooter());
            mTextViewSubtitle.setText(((UpfrontFareDetail) (obj)).getSubtitle());
            mTextViewTitle.setText(((UpfrontFareDetail) (obj)).getTitle());
            int i = ((UpfrontFareDetail) (obj)).getFares().size();
            float f = ((FareDetailMetadata)((UpfrontFareDetail) (obj)).getFares().get(i - 1)).getFare();
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            i = getResources().getDimensionPixelOffset(0x7f0802db);
            PoolSurgeBarView poolsurgebarview;
            for (obj = ((UpfrontFareDetail) (obj)).getFares().iterator(); ((Iterator) (obj)).hasNext(); mLinearLayoutBarContainer.addView(poolsurgebarview, layoutparams))
            {
                FareDetailMetadata faredetailmetadata = (FareDetailMetadata)((Iterator) (obj)).next();
                poolsurgebarview = new PoolSurgeBarView(getActivity());
                poolsurgebarview.a(faredetailmetadata, i, f);
            }

        }
        bundle.setView(view);
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }
}
