// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm.v2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import cev;
import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import com.ubercab.client.core.model.PaymentDepositRequestResponse;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import dki;
import dml;
import dmm;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.ubercab.client.feature.payment.paytm.v2:
//            PaytmAddFundsCustomDialogFragment

public abstract class PaytmAddFundsFragmentBase extends czb
{

    public String g;
    public final Queue h = new LinkedList();
    public cev i;
    public dki j;
    public Button mButtonSuggested;
    ProgressBar mProgressBarLoading;
    TextView mTextViewBalance;
    public TextView mTextViewDescription;
    ViewGroup mViewGroupContent;

    public PaytmAddFundsFragmentBase()
    {
    }

    public abstract Intent a(Context context, String s, String s1, String s2);

    public abstract void a();

    public void a(double d)
    {
        if (d != 0.0D)
        {
            b(getString(0x7f070370));
            j.a(g, Double.valueOf(d).intValue(), "INR");
            return;
        } else
        {
            c(getString(0x7f070045));
            return;
        }
    }

    public void a(int k, int l, Bundle bundle)
    {
        if (k == 1 && l == -1)
        {
            a(PaytmAddFundsCustomDialogFragment.a(bundle));
        }
    }

    public abstract void a(int k, String s);

    public final void b()
    {
        mViewGroupContent.setVisibility(0);
        mProgressBarLoading.setVisibility(8);
    }

    public void onActivityResult(int k, int l, Intent intent)
    {
        super.onActivityResult(k, l, intent);
        if (k == 2)
        {
            if (intent != null)
            {
                intent = intent.getStringExtra("error_message");
            } else
            {
                intent = null;
            }
            a(l, intent);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        g = getArguments().getString("uuid");
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml1)
    {
        if (!dml1.i())
        {
            Toast.makeText(getActivity(), dml1.l(), 0).show();
            getActivity().finish();
            return;
        }
        if (mTextViewBalance != null)
        {
            dml1 = ((PaymentCheckBalanceResponse)dml1.g()).getDisplayAmount();
            mTextViewBalance.setText(dml1);
        }
        mViewGroupContent.setVisibility(0);
        mProgressBarLoading.setVisibility(8);
    }

    public void onPaymentDepositRequestResponseEvent(dmm dmm1)
    {
        e();
        if (!dmm1.i())
        {
            c(getString(0x7f070371));
            return;
        } else
        {
            Object obj = (PaymentDepositRequestResponse)dmm1.g();
            dmm1 = getString(0x7f070048);
            String s = ((PaymentDepositRequestResponse) (obj)).getUrl();
            obj = ((PaymentDepositRequestResponse) (obj)).getData();
            startActivityForResult(a(getActivity(), dmm1, s, ((String) (obj))), 2);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        for (; !h.isEmpty(); i.c(h.remove())) { }
    }
}
