// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import cwz;
import czb;
import czj;
import dfp;
import djb;
import dkn;
import dpg;
import fav;
import fax;
import fay;
import hkp;
import hpb;
import l;
import n;

public abstract class BasePromoFragment extends czb
{

    public chp c;
    public cev d;
    public dpg e;
    public dkn f;
    public hkp g;
    Button mButtonApply;
    FloatingLabelEditText mEditTextCode;
    ProgressBar mProgressBarLoading;
    ViewGroup mViewGroupContainer;

    public BasePromoFragment()
    {
    }

    private void a()
    {
        cwz.a(getActivity(), mEditTextCode);
    }

    private void a(fav fav1)
    {
        fav1.a(this);
    }

    static boolean a(CharSequence charsequence)
    {
        return b(charsequence);
    }

    private fav b(dfp dfp)
    {
        return fax.a().a(dfp).a(new djb(this)).a();
    }

    private static boolean b(CharSequence charsequence)
    {
        return !TextUtils.isEmpty(charsequence);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public void a(int k, int i1)
    {
    }

    public final volatile void a(czj czj)
    {
        a((fav)czj);
    }

    public final void a(String s)
    {
        (new android.app.AlertDialog.Builder(getActivity())).setMessage(s).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final BasePromoFragment a;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                dialoginterface.dismiss();
            }

            
            {
                a = BasePromoFragment.this;
                super();
            }
        }).show();
    }

    public abstract void a(String s, boolean flag);

    public final void a(boolean flag)
    {
        if (flag)
        {
            mProgressBarLoading.setVisibility(0);
            mViewGroupContainer.setVisibility(4);
            return;
        } else
        {
            mViewGroupContainer.setVisibility(0);
            mProgressBarLoading.setVisibility(4);
            return;
        }
    }

    public abstract String b();

    public final void b(boolean flag)
    {
        String s = mEditTextCode.i().toString();
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            mEditTextCode.a(null);
            a(s, flag);
            return;
        }
    }

    public final cic f()
    {
        return RiderActivity.a;
    }

    public final void g()
    {
        cwz.b(getActivity(), mEditTextCode);
    }

    public final void h()
    {
        mEditTextCode.a(null);
        mEditTextCode.d(null);
    }

    public final String i()
    {
        return mEditTextCode.i().toString();
    }

    public final chp j()
    {
        return c;
    }

    public void onClickApply()
    {
        c.a(n.cQ);
        b(false);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030072, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        mEditTextCode.a(new android.widget.TextView.OnEditorActionListener() {

            final BasePromoFragment a;

            public final boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
            {
                a.b(false);
                return true;
            }

            
            {
                a = BasePromoFragment.this;
                super();
            }
        });
        mEditTextCode.a(new hpb() {

            final BasePromoFragment a;

            public final void onTextChanged(CharSequence charsequence, int k, int i1, int j1)
            {
                a.mButtonApply.setEnabled(BasePromoFragment.a(charsequence.toString()));
            }

            
            {
                a = BasePromoFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        g();
    }

    public void onResume()
    {
        super.onResume();
        a();
        mEditTextCode.requestFocus();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        mButtonApply.setEnabled(b(mEditTextCode.i()));
        c.a(AnalyticsEvent.create("impression").setName(l.ev).setValue(b()));
    }
}
