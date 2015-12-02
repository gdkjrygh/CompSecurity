// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.paypal.android.sdk.payments.PayPalAuthorization;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.ui.DividerWithText;
import com.ubercab.client.core.ui.MonthEditText;
import com.ubercab.client.core.ui.YearEditText;
import com.ubercab.client.core.vendor.alipay.model.AlipayCredentials;
import com.ubercab.client.feature.payment.alipay.AddAlipayActivity;
import com.ubercab.client.feature.payment.alipay.AlipayVerificationCodeReceiver;
import com.ubercab.client.feature.payment.legacy.CreditCardEditText;
import com.ubercab.client.feature.payment.legacy.SecurityCodeEditText;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.ui.Button;
import com.ubercab.ui.deprecated.view.ZipEditText;
import cwz;
import cys;
import czb;
import czj;
import dar;
import dbf;
import dce;
import dfp;
import djb;
import dkn;
import dlo;
import doc;
import dpg;
import dsp;
import dti;
import dts;
import duh;
import dul;
import dxg;
import eni;
import enk;
import enl;
import enm;
import enn;
import eoe;
import eof;
import epx;
import eqm;
import erl;
import erq;
import esi;
import esj;
import esv;
import gmg;
import goq;
import hkj;
import hku;
import hoc;
import hro;
import ica;
import icl;
import ico;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment:
//            AddPaymentActivity

public class AddPaymentFragment extends czb
    implements dsp, dti, epx, esi, esv, goq, hro
{

    private static final long p;
    public chp c;
    public Application d;
    public cev e;
    public eqm f;
    public hku g;
    public gmg h;
    public PayPalConfiguration i;
    public hkj j;
    public cys k;
    public dpg l;
    public dce m;
    Button mButtonAddPayment;
    CountryButton mButtonCountry;
    Button mButtonScanCard;
    SecurityCodeEditText mEditTextCreditCardCode;
    CreditCardEditText mEditTextCreditCardNumber;
    MonthEditText mEditTextExpirationMonth;
    YearEditText mEditTextExpirationYear;
    ZipEditText mEditTextZip;
    ImageButton mImageButtonAlipay;
    ImageButton mImageButtonGoogleWallet;
    ImageButton mImageButtonPayPal;
    DividerWithText mViewDivider;
    public dkn n;
    public hoc o;
    private boolean q;
    private boolean r;
    private String s;
    private icl t;
    private icl u;
    private icl v;

    public AddPaymentFragment()
    {
    }

    private static String a(Ping ping)
    {
        if (dul.a(ping) && ping.getApiResponse() != null)
        {
            ping = ping.getApiResponse().getData();
            if (ping != null && ping.containsKey("uuid"))
            {
                return String.valueOf(ping.get("uuid"));
            }
        }
        return null;
    }

    public static String a(AddPaymentFragment addpaymentfragment)
    {
        return addpaymentfragment.s;
    }

    private void a(View view, boolean flag)
    {
        if (flag)
        {
            if ((view = getView().findViewById(view.getNextFocusForwardId())) != null)
            {
                view.requestFocus();
                return;
            }
        }
    }

    private void a(PayPalAuthorization paypalauthorization)
    {
        b(getString(0x7f070051));
        paypalauthorization = paypalauthorization.a();
        String s1 = h();
        if (!l.e())
        {
            n.a(paypalauthorization, s1);
            return;
        } else
        {
            u = j.a(paypalauthorization, s1).a(ico.a()).a(new enm(this, (byte)0));
            return;
        }
    }

    private void a(AlipayCredentials alipaycredentials)
    {
        b(getString(0x7f07004f));
        n.b(alipaycredentials.getAccountId(), alipaycredentials.getMobile());
    }

    public static void a(AddPaymentFragment addpaymentfragment, String s1)
    {
        addpaymentfragment.d(s1);
    }

    private void a(enk enk1)
    {
        enk1.a(this);
    }

    private void a(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        b(getString(0x7f070050));
        if (l.e())
        {
            t = j.a(f.a(s1), f.a(s2), f.a(s3), f.a(s4), s5, s6, "personal").a(ico.a()).a(new enn(this, (byte)0));
            return;
        } else
        {
            n.a(f.a(s1), f.a(s2), f.a(s3), f.a(s4), s5, s6, "personal", false, r);
            return;
        }
    }

    static AddPaymentFragment c(boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_google_wallet", flag);
        AddPaymentFragment addpaymentfragment = new AddPaymentFragment();
        addpaymentfragment.setArguments(bundle);
        return addpaymentfragment;
    }

    private void d(String s1)
    {
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = Locale.getDefault().getCountry();
        }
        s = s2;
        mEditTextZip.a(s2);
        mButtonCountry.a(s2);
    }

    private enk g()
    {
        return eoe.a().a(new djb(this)).a((eni)((AddPaymentActivity)getActivity()).d()).a();
    }

    private String h()
    {
        return dxg.a(getActivity());
    }

    private boolean i()
    {
        boolean flag;
        if (mEditTextCreditCardNumber.B_() && mEditTextExpirationMonth.B_() && mEditTextExpirationYear.B_() && mEditTextCreditCardCode.B_() && mEditTextZip.B_())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mButtonAddPayment.setEnabled(flag);
        return flag;
    }

    protected final czj a(dfp dfp)
    {
        return g();
    }

    public final void a()
    {
        i();
    }

    public final void a(CreditCardEditText creditcardedittext, boolean flag, String s1)
    {
        r = false;
        mEditTextCreditCardCode.a(s1);
        i();
        while (creditcardedittext.getText().toString().replaceAll("\\s", "").length() != esj.d(s1) || "UnionPay".equals(s1) || "Laser".equals(s1) || "Maestro".equals(s1)) 
        {
            return;
        }
        a(((View) (mEditTextCreditCardNumber)), flag);
    }

    public final volatile void a(czj czj)
    {
        a((enk)czj);
    }

    public final void a(String s1)
    {
        d(s1);
    }

    public final void a(boolean flag)
    {
        boolean flag1 = true;
        i();
        MonthEditText monthedittext = mEditTextExpirationMonth;
        if (mEditTextExpirationMonth.length() > 1 && flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(((View) (monthedittext)), flag);
    }

    public final void b()
    {
        c.a(n.cl);
    }

    public final void b(boolean flag)
    {
        boolean flag1 = true;
        i();
        YearEditText yearedittext = mEditTextExpirationYear;
        if (mEditTextExpirationYear.length() > 1 && flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(yearedittext, flag);
    }

    public final void d(boolean flag)
    {
        i();
        a(mEditTextCreditCardCode, flag);
    }

    public final cic f()
    {
        return l.dW;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle != null)
        {
            d(bundle.getString("com.ubercab.client.feature.payment.COUNTRY_ISO2"));
            r = bundle.getBoolean("com.ubercab.client.feature.payment.USING_CARDIO");
        }
        d().b().a(getString(0x7f07003b));
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 700 && j1 == -1)
        {
            intent = (PayPalAuthorization)intent.getParcelableExtra("com.paypal.android.sdk.authorization");
            if (intent != null)
            {
                a(intent);
            }
        } else
        {
            if (i1 == 600 && j1 == -1)
            {
                a((AlipayCredentials)intent.getParcelableExtra("alipay_credentials"));
                return;
            }
            if (i1 == 900 && j1 == CardIOActivity.a)
            {
                intent = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
                mEditTextCreditCardNumber.setText(((CreditCard) (intent)).cardNumber);
                if (intent.isExpiryValid())
                {
                    mEditTextExpirationMonth.setText(String.format("%d", new Object[] {
                        Integer.valueOf(((CreditCard) (intent)).expiryMonth)
                    }));
                    mEditTextExpirationYear.setText(String.format("%d", new Object[] {
                        Integer.valueOf(((CreditCard) (intent)).expiryYear)
                    }).substring(2));
                }
                r = true;
                return;
            }
        }
    }

    public void onClickButtonAddPayment(Button button)
    {
        if (s == null)
        {
            Toast.makeText(getActivity(), getString(0x7f070631), 0).show();
            return;
        } else
        {
            String s1 = mEditTextCreditCardNumber.getText().toString();
            String s2 = mEditTextExpirationMonth.getText().toString();
            String s3 = mEditTextExpirationYear.getText().toString();
            String s4 = mEditTextCreditCardCode.getText().toString();
            String s5 = mEditTextZip.getText().toString();
            a(s1, s2, s3, s4, s, s5);
            cwz.b(d, button);
            return;
        }
    }

    public void onClickGoogleWallet()
    {
        e.c(new erq());
    }

    public void onClickImageButtonAlipay()
    {
        if (h.a(dbf.z))
        {
            o.a(com/ubercab/client/feature/payment/alipay/AlipayVerificationCodeReceiver, p);
        }
        startActivityForResult(new Intent(getActivity(), com/ubercab/client/feature/payment/alipay/AddAlipayActivity), 600);
    }

    public void onClickImageButtonPayPal()
    {
        c.a(l.dX);
        Intent intent = new Intent(getActivity(), com/paypal/android/sdk/payments/PayPalFuturePaymentActivity);
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", i);
        startActivityForResult(intent, 700);
    }

    public void onClickScanCard()
    {
        k.a(d(), new doc() {

            final AddPaymentFragment a;

            public final void a(Map map, boolean flag)
            {
                if (flag)
                {
                    a.startActivityForResult(dts.a(a.getActivity()), 900);
                    return;
                } else
                {
                    a.c(a.getResources().getString(0x7f07034e));
                    return;
                }
            }

            
            {
                a = AddPaymentFragment.this;
                super();
            }
        }, new String[] {
            "android.permission.CAMERA"
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            q = bundle.getBoolean("show_google_wallet");
        }
    }

    public void onCreatePaymentProfileResponseEvent(dlo dlo1)
    {
        e();
        if (dlo1.e())
        {
            dlo1 = a((Ping)dlo1.g());
            e.c(new erl(dlo1));
            return;
        } else
        {
            c(dlo1.a(getActivity()));
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03010e, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public boolean onEditorAction()
    {
        if (i())
        {
            onClickButtonAddPayment(mButtonAddPayment);
            return true;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
        v.b();
        if (t != null)
        {
            t.b();
        }
        if (u != null)
        {
            u.b();
        }
    }

    public void onPingEvent(dar dar1)
    {
        while (l.n() || s != null) 
        {
            return;
        }
        d(dar1.a().getClient().getMobileCountryIso2());
    }

    public void onResume()
    {
        super.onResume();
        v = g.d().c(new enl(this, (byte)0));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.ubercab.client.feature.payment.COUNTRY_ISO2", s);
        bundle.putBoolean("com.ubercab.client.feature.payment.USING_CARDIO", r);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mEditTextCreditCardNumber.a(this);
        mEditTextExpirationMonth.a(this);
        mEditTextCreditCardCode.a(this);
        mEditTextExpirationYear.a(this);
        mEditTextZip.a(this);
        boolean flag1;
        if (!duh.a(h, s))
        {
            boolean flag;
            if (dxg.a(s, m.a(), h))
            {
                mImageButtonPayPal.setContentDescription(getString(0x7f07033e));
                mImageButtonPayPal.setVisibility(0);
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (AddAlipayActivity.b(m.a()))
            {
                flag1 = flag;
                if (h.b(dbf.u))
                {
                    mImageButtonAlipay.setContentDescription(getString(0x7f070053));
                    mImageButtonAlipay.setVisibility(0);
                    flag1 = true;
                }
            }
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            mViewDivider.setVisibility(0);
        }
        if (h.a(dbf.D))
        {
            mButtonScanCard.setVisibility(8);
        }
        if (q)
        {
            mImageButtonGoogleWallet.setVisibility(0);
        }
        mButtonCountry.a(this);
    }

    static 
    {
        p = TimeUnit.MINUTES.toMillis(30L);
    }
}
