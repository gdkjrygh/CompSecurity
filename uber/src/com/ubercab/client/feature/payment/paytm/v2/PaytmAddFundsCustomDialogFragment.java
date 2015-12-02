// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm.v2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import chp;
import cic;
import cif;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import cyz;
import czj;
import dfp;
import diw;
import dug;
import euo;
import eup;
import euu;
import gpp;
import l;
import n;

public class PaytmAddFundsCustomDialogFragment extends cyz
{

    public chp a;
    private double b;
    private double c;
    private double d;
    private double g;
    private int h;
    EditText mEditTextAmount;
    TextView mTextViewBonus;

    public PaytmAddFundsCustomDialogFragment()
    {
    }

    public static double a(Bundle bundle)
    {
        return bundle.getDouble("amount_result");
    }

    public static void a(RiderActivity rideractivity)
    {
        Bundle bundle = b(1);
        bundle.putInt("mode", 1);
        bundle.putDouble("amount_suggested", 200D);
        a(rideractivity, bundle);
    }

    public static void a(RiderActivity rideractivity, double d1, double d2)
    {
        Bundle bundle = b(1);
        bundle.putInt("mode", 0);
        bundle.putDouble("amount_for_bonus", d1);
        bundle.putDouble("amount_bonus", d2);
        a(rideractivity, bundle);
    }

    private static void a(RiderActivity rideractivity, Bundle bundle)
    {
        PaytmAddFundsCustomDialogFragment paytmaddfundscustomdialogfragment = new PaytmAddFundsCustomDialogFragment();
        paytmaddfundscustomdialogfragment.setArguments(bundle);
        paytmaddfundscustomdialogfragment.show(rideractivity.getSupportFragmentManager(), paytmaddfundscustomdialogfragment.getClass().getName());
    }

    private void a(euu euu1)
    {
        euu1.a(this);
    }

    private euu b(dfp dfp)
    {
        return euo.a().a(new diw(this)).a(dfp).a();
    }

    public static void b(RiderActivity rideractivity, double d1, double d2)
    {
        Bundle bundle = b(1);
        bundle.putInt("mode", 2);
        bundle.putDouble("amount_minimum", d1);
        bundle.putDouble("amount_suggested", d2);
        a(rideractivity, bundle);
    }

    private void d()
    {
        switch (h)
        {
        default:
            return;

        case 2: // '\002'
            String s = gpp.a(getActivity(), g);
            mTextViewBonus.setText(getString(0x7f070340, new Object[] {
                s
            }));
            return;

        case 1: // '\001'
            if (b > 0.0D)
            {
                String s1 = gpp.a(getActivity(), b);
                mTextViewBonus.setText(getString(0x7f070344, new Object[] {
                    s1
                }));
                return;
            } else
            {
                mTextViewBonus.setVisibility(8);
                return;
            }

        case 0: // '\0'
            break;
        }
        if (d > 0.0D)
        {
            String s2 = gpp.a(getActivity(), d);
            double d1 = dug.a(mEditTextAmount.getText().toString());
            if (d1 >= c)
            {
                mTextViewBonus.setText(getString(0x7f070342, new Object[] {
                    s2
                }));
                return;
            } else
            {
                String s4 = gpp.a(getActivity(), c - d1);
                mTextViewBonus.setText(getString(0x7f070343, new Object[] {
                    s4, s2
                }));
                return;
            }
        } else
        {
            String s3 = gpp.a(getActivity(), c);
            mTextViewBonus.setText(getString(0x7f070344, new Object[] {
                s3
            }));
            return;
        }
    }

    private cif e()
    {
        switch (h)
        {
        default:
            return null;

        case 2: // '\002'
            return n.r;

        case 1: // '\001'
            return n.cG;

        case 0: // '\0'
            return n.gx;
        }
    }

    private cif f()
    {
        switch (h)
        {
        default:
            return null;

        case 2: // '\002'
            return n.q;

        case 1: // '\001'
            return n.cF;

        case 0: // '\0'
            return n.gw;
        }
    }

    public final cic a()
    {
        switch (h)
        {
        default:
            return cyz.e;

        case 2: // '\002'
            return l.R;

        case 1: // '\001'
            return l.eo;

        case 0: // '\0'
            return l.hp;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((euu)czj);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        a.a(f());
    }

    public void onClickButtonAddFunds()
    {
        double d1 = dug.a(mEditTextAmount.getText().toString());
        if (d1 == 0.0D)
        {
            mEditTextAmount.setError(getString(0x7f07039f));
            return;
        }
        if (b > 0.0D && d1 < b)
        {
            String s = gpp.a(getActivity(), b);
            mEditTextAmount.setError(getString(0x7f070341, new Object[] {
                s
            }));
            return;
        } else
        {
            a.a(AnalyticsEvent.create("tap").setName(e()).setValue(Double.valueOf(d1)));
            mEditTextAmount.setError(null);
            getArguments().putDouble("amount_result", d1);
            c(-1);
            dismiss();
            return;
        }
    }

    public void onClickButtonCancel()
    {
        a.a(f());
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        h = getArguments().getInt("mode");
        b = bundle.getDouble("amount_minimum");
        c = bundle.getDouble("amount_for_bonus");
        d = bundle.getDouble("amount_bonus");
        g = bundle.getDouble("amount_suggested");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030131, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onTextChangedAmount()
    {
        d();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getDialog();
        if (view != null)
        {
            view.requestWindowFeature(1);
        }
        d();
        if (g > 0.0D)
        {
            mEditTextAmount.setText(String.valueOf(Double.valueOf(g).intValue()));
        }
    }
}
