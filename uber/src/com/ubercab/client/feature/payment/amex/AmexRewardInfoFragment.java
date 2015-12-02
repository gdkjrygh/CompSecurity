// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.amex;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dfp;
import djb;
import dkn;
import dmy;
import eqy;
import erd;
import ere;

public class AmexRewardInfoFragment extends czb
{

    public dkn c;
    private String d;
    private boolean e;
    private String f;
    Button mButtonEnrollMe;
    TextView mTextViewNotRightNow;
    TextView mTextViewRewardInfo;
    TextView mTextViewRewardLink;
    TextView mTextViewRewardRestrictions;

    public AmexRewardInfoFragment()
    {
    }

    public static AmexRewardInfoFragment a(String s, String s1, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("payment_profile_id", s);
        bundle.putString("card_number", s1);
        bundle.putBoolean("is_earn_only", flag);
        s = new AmexRewardInfoFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(eqy eqy1)
    {
        eqy1.a(this);
    }

    private eqy b(dfp dfp)
    {
        return erd.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eqy)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = d().b();
        bundle.b(true);
        bundle.a(getString(0x7f070255).toUpperCase());
    }

    public void onClickEnrollMe()
    {
        c.a(f, Boolean.valueOf(true), null);
    }

    public void onClickNotRightNow()
    {
        c.a(f, Boolean.valueOf(false), null);
        getActivity().finish();
    }

    public void onClickTerms()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f0706ab))));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            f = bundle.getString("payment_profile_id");
            d = bundle.getString("card_number");
            e = bundle.getBoolean("is_earn_only");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030110, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onRewardsEnrollmentUpdateResponse(dmy dmy1)
    {
        if (dmy1.e())
        {
            c(getString(0x7f070218, new Object[] {
                d
            }));
            getActivity().finish();
            return;
        } else
        {
            c(getString(0x7f070217));
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = mTextViewRewardInfo;
        if (e)
        {
            view = getString(0x7f070213, new Object[] {
                d
            });
        } else
        {
            view = getString(0x7f070214, new Object[] {
                d
            });
        }
        bundle.setText(view);
        mTextViewRewardRestrictions.setText(getString(0x7f0703a8));
        mTextViewRewardLink.setText(getString(0x7f0706ac));
        mButtonEnrollMe.setText(getString(0x7f07020e));
        mTextViewNotRightNow.setText(getString(0x7f0702d9));
    }
}
