// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.paytm;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.AddFundsDefaultValues;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import com.ubercab.client.core.model.PaymentDepositRequestResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderAppConfig;
import com.ubercab.client.feature.promo.PromoFragment;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dar;
import dfp;
import djb;
import dki;
import dml;
import dmm;
import dpg;
import dqt;
import dtj;
import dtp;
import dug;
import dul;
import esy;
import esz;
import etq;
import etr;
import ets;
import hku;
import ica;
import icl;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment.paytm:
//            PaytmOtpActivity, PaytmAddFundsWebViewActivity

public class PaytmAddFundsFragment extends czb
{

    public chp c;
    public dqt d;
    public Application e;
    public hku f;
    public dki g;
    public dpg h;
    private icl i;
    private int j;
    private int k;
    private int l;
    private int m;
    Button mButtonDenomination1;
    Button mButtonDenomination2;
    Button mButtonDenomination3;
    Button mButtonSubmit;
    EditText mEditTextAddFunds;
    ProgressBar mProgressBarCurrentBalanceRequest;
    TextView mTextViewBalanceValue;
    TextView mTextViewCurrencyCodeAddFunds;
    TextView mTextViewMinimumBalanceValue;
    TextView mTextViewTitleAddFunds;
    ViewGroup mViewGroupDenominations;
    private String n;
    private boolean o;

    public PaytmAddFundsFragment()
    {
    }

    public static int a(PaytmAddFundsFragment paytmaddfundsfragment, int i1)
    {
        paytmaddfundsfragment.k = i1;
        return i1;
    }

    public static PaytmAddFundsFragment a(String s, int i1, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("default_value", i1);
        bundle.putBoolean("show_promo_option", flag);
        bundle.putString("uuid", s);
        s = new PaytmAddFundsFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a()
    {
        if (k == 0 || l == 0 || m == 0)
        {
            mViewGroupDenominations.setVisibility(8);
        } else
        {
            mButtonDenomination1.setText(getString(0x7f070043, new Object[] {
                "\u20A8", Integer.valueOf(k)
            }));
            mButtonDenomination2.setText(getString(0x7f070043, new Object[] {
                "\u20A8", Integer.valueOf(l)
            }));
            mButtonDenomination3.setText(getString(0x7f070043, new Object[] {
                "\u20A8", Integer.valueOf(m)
            }));
            mTextViewMinimumBalanceValue.setText((new StringBuilder("\u20A8")).append(k).toString());
        }
        mTextViewCurrencyCodeAddFunds.setText("\u20A8");
    }

    private void a(int i1)
    {
        int j1 = 10000;
        int k1 = dug.a(mEditTextAddFunds.getText().toString(), 0);
        if (k1 + i1 <= 10000)
        {
            j1 = k1 + i1;
        }
        mEditTextAddFunds.setText(String.valueOf(j1));
        mEditTextAddFunds.setSelection(mEditTextAddFunds.getText().length());
    }

    public static void a(PaytmAddFundsFragment paytmaddfundsfragment)
    {
        paytmaddfundsfragment.a();
    }

    private void a(ets ets1)
    {
        ets1.a(this);
    }

    public static int b(PaytmAddFundsFragment paytmaddfundsfragment, int i1)
    {
        paytmaddfundsfragment.l = i1;
        return i1;
    }

    private ets b(dfp dfp)
    {
        return esy.a().a(new djb(this)).a(dfp).a();
    }

    public static int c(PaytmAddFundsFragment paytmaddfundsfragment, int i1)
    {
        paytmaddfundsfragment.m = i1;
        return i1;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    final void a(int i1, int j1)
    {
        if (i1 == 1 && j1 == -1)
        {
            startActivityForResult(PaytmOtpActivity.a(e, n, true), 2);
        }
    }

    public final volatile void a(czj czj)
    {
        a((ets)czj);
    }

    public final cic f()
    {
        return l.jy;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 2)
        {
            if (j1 == -1)
            {
                c(getString(0x7f070047));
                if (o)
                {
                    c.a(l.hr);
                } else
                {
                    c.a(l.eq);
                }
                getActivity().setResult(-1);
                getActivity().finish();
            } else
            if (j1 == 1)
            {
                String s = intent.getStringExtra("error_message");
                intent = s;
                if (TextUtils.isEmpty(s))
                {
                    intent = getString(0x7f070046);
                }
                dtp.a(d(), -1, intent);
                if (o)
                {
                    c.a(l.hq);
                    return;
                } else
                {
                    c.a(l.ep);
                    return;
                }
            }
        }
    }

    public void onClickButtonSubmit()
    {
        int i1 = dug.a(mEditTextAddFunds.getText().toString(), 0);
        if (i1 != 0)
        {
            b(getString(0x7f070370));
            c.a(n.jD);
            g.a(n, i1, "INR");
            return;
        } else
        {
            c(getString(0x7f070045));
            return;
        }
    }

    public void onClickFirstValue()
    {
        c.a(n.jE);
        a(k);
    }

    public void onClickSecondValue()
    {
        c.a(n.jF);
        a(l);
    }

    public void onClickThirdValue()
    {
        c.a(n.jG);
        a(m);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        bundle = getArguments();
        if (bundle != null)
        {
            j = bundle.getInt("default_value");
            n = bundle.getString("uuid");
            g.a(n);
            o = bundle.getBoolean("show_promo_option");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f10000c, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030114, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131625657: 
            PromoFragment.d().show(getFragmentManager(), "promo");
            break;
        }
        return true;
    }

    public void onPause()
    {
        super.onPause();
        i.b();
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml1)
    {
        mProgressBarCurrentBalanceRequest.setVisibility(8);
        if (!dml1.i())
        {
            if (dml1.n() == 403)
            {
                dtj.a((RiderActivity)getActivity(), 1, getString(0x7f070391), getString(0x7f070390), getString(0x7f07038f), getString(0x7f07007b));
            }
            c(getString(0x7f070042));
        } else
        {
            dml1 = (PaymentCheckBalanceResponse)dml1.g();
            if (dml1 != null)
            {
                dml1 = dml1.getDisplayAmount();
                TextView textview = mTextViewBalanceValue;
                if (dml1 == null)
                {
                    dml1 = "";
                }
                textview.setText(dml1);
                return;
            }
        }
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
            startActivityForResult(PaytmAddFundsWebViewActivity.a(e, dmm1, s, ((String) (obj))), 2);
            return;
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (h.n())
        {
            return;
        }
        dar1 = dar1.a();
        if (dul.c(dar1))
        {
            dar1 = dar1.getAppConfig().getRiderConfig().getAddFundsDefaultValues();
            if (dar1 != null)
            {
                k = dar1.getDenomination1();
                l = dar1.getDenomination2();
                m = dar1.getDenomination3();
            }
        }
        a();
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(0x7f0e06b9).setVisible(o);
    }

    public void onResume()
    {
        super.onResume();
        i = f.a().c(new etq(this, (byte)0));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mButtonSubmit.setText(getString(0x7f07003a));
        bundle = mEditTextAddFunds;
        if (j != 0)
        {
            view = String.valueOf(j);
        } else
        {
            view = null;
        }
        bundle.setText(view);
        mTextViewTitleAddFunds.setText(getString(0x7f070044));
        mEditTextAddFunds.setFilters(new InputFilter[] {
            new etr()
        });
    }
}
