// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.settings;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import com.ubercab.ui.TextView;
import cwz;
import cyz;
import czj;
import dfp;
import diw;
import djx;
import dnx;
import fgu;
import fgv;
import fhf;
import fhh;
import hpb;
import l;
import n;

public class VerifyPasswordDialogFragment extends cyz
{

    public djx a;
    public chp b;
    public cev c;
    Button mButtonSubmit;
    FloatingLabelEditText mEditTextPassword;
    ProgressBar mProgressBarLoading;
    TextView mTextViewForgotPassword;
    ViewGroup mViewGroupContent;

    public VerifyPasswordDialogFragment()
    {
    }

    static void a(RiderActivity rideractivity, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("arg_account_type", s);
        s = new VerifyPasswordDialogFragment();
        s.setArguments(bundle);
        s.show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/settings/VerifyPasswordDialogFragment.getName());
    }

    private void a(fhf fhf1)
    {
        fhf1.a(this);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            mProgressBarLoading.setVisibility(0);
            mViewGroupContent.setVisibility(4);
            return;
        } else
        {
            mViewGroupContent.setVisibility(0);
            mProgressBarLoading.setVisibility(4);
            return;
        }
    }

    private fhf b(dfp dfp)
    {
        return fgu.a().a(new diw(this)).a(dfp).a();
    }

    private void d()
    {
        cwz.a(getActivity(), mEditTextPassword);
    }

    private void e()
    {
        cwz.b(getActivity(), mEditTextPassword);
    }

    public final cic a()
    {
        return l.fx;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fhf)czj);
    }

    public void onClickApply()
    {
        a(true);
        a.b(mEditTextPassword.i().toString());
    }

    public void onClickCancel()
    {
        e();
        dismiss();
    }

    public void onClickForgotPassword()
    {
        String s = getArguments().getString("arg_account_type");
        if ("facebook".equals(s) || "google".equals(s))
        {
            b.a(n.dF);
        } else
        {
            b.a(n.dG);
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f070777))));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f09017b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030216, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        getDialog().setCanceledOnTouchOutside(false);
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
        e();
        dismiss();
    }

    public void onResume()
    {
        super.onResume();
        d();
        mEditTextPassword.requestFocus();
    }

    public void onVerifyPasswordResponseEvent(dnx dnx1)
    {
        a(false);
        if (dnx1.i())
        {
            e();
            dismiss();
            c.c(new fhh());
            return;
        }
        int i;
        if (dnx1.n() == 401)
        {
            i = 0x7f07021e;
        } else
        {
            i = 0x7f070225;
        }
        dnx1 = getString(i);
        mEditTextPassword.a(dnx1);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        view = mButtonSubmit;
        boolean flag;
        if (!TextUtils.isEmpty(mEditTextPassword.i()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
        mEditTextPassword.a(new hpb() {

            final VerifyPasswordDialogFragment a;

            public final void afterTextChanged(Editable editable)
            {
                editable = a.mButtonSubmit;
                boolean flag1;
                if (!TextUtils.isEmpty(a.mEditTextPassword.i()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                editable.setEnabled(flag1);
            }

            
            {
                a = VerifyPasswordDialogFragment.this;
                super();
            }
        });
        view = getArguments().getString("arg_account_type");
        if ("facebook".equals(view) || "google".equals(view))
        {
            mTextViewForgotPassword.setText(getString(0x7f07024c));
        }
    }
}
