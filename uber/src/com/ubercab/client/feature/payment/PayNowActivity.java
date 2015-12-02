// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import com.ubercab.client.core.model.RtUnpaidBill;
import com.ubercab.client.core.ui.DividerWithText;
import com.ubercab.client.core.ui.PaymentTextView;
import com.ubercab.client.feature.payment.paytm.PaytmAddFundsActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czj;
import czq;
import dfe;
import dfp;
import dki;
import dkn;
import dmk;
import dml;
import dui;
import eos;
import eot;
import epp;
import esj;
import gkf;
import gmg;
import gpp;
import gsa;
import gzi;
import hkr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentActivity

public class PayNowActivity extends RiderActivity
{

    static final List h = (new gkf()).a("airtel_money").a("paytm").a();
    public chp i;
    public hkr j;
    public gmg k;
    public czq l;
    public dki m;
    Button mButtonPayNow;
    DividerWithText mDividerTripDate;
    PaymentTextView mPaymentTextView;
    ProgressBar mProgressBarBalance;
    TextView mTextViewBalance;
    TextView mTextViewDescription;
    TextView mTextViewFare;
    ViewGroup mViewGroupBalance;
    public dkn n;
    private int o;
    private Intent p;
    private List q;
    private PaymentProfile r;

    public PayNowActivity()
    {
    }

    public static Intent a(Context context, ArrayList arraylist, Intent intent)
    {
        context = new Intent(context, com/ubercab/client/feature/payment/PayNowActivity);
        context.putParcelableArrayListExtra("unpaid_bills", arraylist);
        context.putExtra("next_intent", intent);
        context.putExtra("next_intent_request_code", 2008);
        return context;
    }

    private void a(PaymentProfile paymentprofile)
    {
        mButtonPayNow.setEnabled(true);
        r = paymentprofile;
        Object obj = esj.a(this, paymentprofile.getCardType());
        mPaymentTextView.a(((android.graphics.drawable.Drawable) (obj)));
        obj = j.c();
        if (obj != null)
        {
            mPaymentTextView.setText(dui.a(this, paymentprofile, ((Client) (obj)).getPaymentProfiles(), true));
        }
        if (i())
        {
            mTextViewDescription.setVisibility(0);
            mViewGroupBalance.setVisibility(0);
            mProgressBarBalance.setVisibility(0);
            mTextViewBalance.setVisibility(4);
            if (r != null)
            {
                m.a(r.getUuid());
            }
            return;
        } else
        {
            mTextViewDescription.setVisibility(8);
            mViewGroupBalance.setVisibility(8);
            return;
        }
    }

    private void a(epp epp1)
    {
        epp1.a(this);
    }

    private void a(String s1, String s2)
    {
        b(getString(0x7f070064), null);
        n.k(s2, s1);
    }

    private epp b(dfp dfp)
    {
        return eos.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (p != null)
        {
            startActivityForResult(p, o);
        }
        finish();
    }

    private void g()
    {
        Object obj = j.c();
        if (obj != null)
        {
            obj = ((Client) (obj)).getLastSelectedPaymentProfile();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            a(((PaymentProfile) (obj)));
        }
    }

    private void h()
    {
        if (PaytmAddFundsActivity.a(r))
        {
            l l1 = l.U;
            i.a(l1);
            startActivity(PaytmAddFundsActivity.a(this, k, r.getUuid()));
        }
    }

    private boolean i()
    {
        return r.getTokenType() != null && h.contains(r.getTokenType());
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((epp)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030100);
        ButterKnife.inject(this);
        o = getIntent().getIntExtra("next_intent_request_code", 0);
        p = (Intent)getIntent().getParcelableExtra("next_intent");
        q = getIntent().getParcelableArrayListExtra("unpaid_bills");
        if (q.size() == 0)
        {
            f();
        }
        Object obj = (RtUnpaidBill)q.get(0);
        mTextViewFare.setText(((RtUnpaidBill) (obj)).getAmountString());
        obj = j.c();
        if (obj != null)
        {
            if (bundle != null)
            {
                bundle = ((Client) (obj)).findPaymentProfileByUuid(bundle.getString("payment_profile_uuid"));
                if (bundle != null)
                {
                    a(bundle);
                }
            }
            if (r == null && ((Client) (obj)).getLastSelectedPaymentProfile() != null)
            {
                g();
                return;
            }
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(l);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 1001 && j1 == -1)
        {
            intent = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
            Client client = j.c();
            if (client != null)
            {
                intent = client.findPaymentProfileByUuid(intent);
            } else
            {
                intent = null;
            }
            if (intent != null)
            {
                a(intent);
            }
        } else
        if (i1 == 1002 && j1 == -1)
        {
            f();
            return;
        }
    }

    public void onClickPayNow()
    {
        if (r == null)
        {
            return;
        }
        i.a(n.hz);
        String s1 = ((RtUnpaidBill)q.get(0)).getClientBillUuid();
        gsa gsa1 = gsa.a(this, r.getTokenType());
        com.ubercab.payment.model.PaymentProfile paymentprofile = dui.a(r);
        if (r.getTokenType() != null && r.getTokenType().equals("zaakpay"))
        {
            startActivityForResult((new gzi(this)).a(paymentprofile, s1), 1002);
            return;
        }
        if (r.getTokenType() != null && gsa1 != null && gsa1.r())
        {
            startActivityForResult(gsa1.a(paymentprofile, s1), 1002);
            return;
        } else
        {
            a(r.getUuid(), s1);
            return;
        }
    }

    public void onClickSelectPayment()
    {
        i.a(n.hA);
        Intent intent = new Intent(this, com/ubercab/client/feature/payment/PaymentActivity);
        intent.setAction("com.ubercab.SELECT_PAYMENT");
        startActivityForResult(intent, 1001);
    }

    public void onPayBillResponseEvent(dmk dmk1)
    {
        u();
        if (!dmk1.e())
        {
            h();
            a_(dmk1.a(this));
            return;
        } else
        {
            i.a(l.P);
            f();
            return;
        }
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml1)
    {
        mProgressBarBalance.setVisibility(8);
        break MISSING_BLOCK_LABEL_9;
        if (r != null && r.getUuid() != null && r.getUuid().equals(dml1.a()))
        {
            if (!dml1.i())
            {
                a_(getString(0x7f070042));
                return;
            }
            dml1 = (PaymentCheckBalanceResponse)dml1.g();
            String s1 = dml1.getDisplayAmount();
            mTextViewBalance.setText(s1);
            mTextViewBalance.setVisibility(0);
            if (q != null && !q.isEmpty())
            {
                dml1 = dml1.getAmount();
                Double double1 = Double.valueOf(Math.abs(Double.valueOf(((RtUnpaidBill)q.get(0)).getAmount()).doubleValue()));
                Object obj = j.c();
                if (obj != null && ((Client) (obj)).getPaymentProfiles() != null)
                {
                    obj = dui.a(this, r, ((Client) (obj)).getPaymentProfiles(), true);
                    if (dml1.doubleValue() >= 0.0D && dml1.doubleValue() < double1.doubleValue())
                    {
                        mTextViewDescription.setText(String.format(getString(0x7f07033d), new Object[] {
                            gpp.a(this, dml1.doubleValue()), gpp.a(this, double1.doubleValue() - dml1.doubleValue()), obj
                        }));
                        return;
                    }
                }
            }
        }
        return;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (r != null)
        {
            bundle.putString("payment_profile_uuid", r.getUuid());
        }
    }

    public final cic s()
    {
        return l.ip;
    }

}
