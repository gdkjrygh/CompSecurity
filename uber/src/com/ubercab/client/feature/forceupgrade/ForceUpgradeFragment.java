// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.forceupgrade;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cic;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dfp;
import djb;
import dun;
import ect;
import ecu;
import ecw;

public class ForceUpgradeFragment extends czb
{

    private String c;
    Button mButtonUpdate;
    TextView mTextViewSubtitle;
    TextView mTextViewTitle;

    public ForceUpgradeFragment()
    {
    }

    public static ForceUpgradeFragment a(String s)
    {
        ForceUpgradeFragment forceupgradefragment = new ForceUpgradeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("forceUpgradeUrl", s);
        forceupgradefragment.setArguments(bundle);
        return forceupgradefragment;
    }

    private void a(ecw ecw1)
    {
        ecw1.a(this);
    }

    private ecw b(dfp dfp)
    {
        return ect.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ecw)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClickButtonUpdate()
    {
        Intent intent;
        if (c != null)
        {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(c));
        } else
        {
            intent = null;
        }
        dun.a(getActivity(), intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(false);
        if (bundle != null)
        {
            c = bundle.getString("forceUpgradeUrl");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03006d, viewgroup, false);
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
        mTextViewTitle.setText(getString(0x7f07024a));
        mTextViewSubtitle.setText(getString(0x7f070249));
        mButtonUpdate.setText(getString(0x7f07063a));
    }
}
