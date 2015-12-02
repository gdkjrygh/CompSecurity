// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.estimate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cic;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import cyz;
import czj;
import dfp;
import diw;
import eas;
import eat;
import eba;

public class RewardPointsFareEstimateFragment extends cyz
{

    Button mButtonOk;
    TextView mTextViewExplanation;
    TextView mTextViewFare;
    TextView mTextViewMembershipRewards;
    TextView mTextViewMessage;
    TextView mTextViewTitle;

    public RewardPointsFareEstimateFragment()
    {
    }

    public static RewardPointsFareEstimateFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fare_estimate_points_range", s);
        s = new RewardPointsFareEstimateFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(eba eba1)
    {
        eba1.a(this);
    }

    private eba b(dfp dfp)
    {
        return eas.a().a(new diw(this)).a(dfp).a();
    }

    public final cic a()
    {
        return cyz.e;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eba)czj);
    }

    public void onClickButtonOk()
    {
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0);
        setCancelable(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030064, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getArguments();
        if (view != null)
        {
            mTextViewFare.setText(view.getString("fare_estimate_points_range"));
        }
        mTextViewTitle.setText(getString(0x7f07022e));
        mTextViewMembershipRewards.setText(getString(0x7f0702b1));
        mTextViewExplanation.setText(getString(0x7f070233));
        mTextViewMessage.setText(getString(0x7f070230));
        mButtonOk.setText(getString(0x7f0702f8));
    }
}
