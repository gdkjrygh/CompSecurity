// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import bju;
import bjw;
import bjy;
import bkm;
import butterknife.ButterKnife;
import cev;
import cgh;
import chp;
import cic;
import com.paypal.android.sdk.payments.PayPalAuthorization;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.PreloadData;
import com.ubercab.client.core.ui.DividerWithText;
import com.ubercab.client.core.ui.MonthEditText;
import com.ubercab.client.core.ui.YearEditText;
import com.ubercab.client.core.vendor.alipay.model.AlipayCredentials;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import com.ubercab.client.feature.payment.alipay.AddAlipayActivity;
import com.ubercab.client.feature.payment.alipay.AlipayVerificationCodeReceiver;
import com.ubercab.client.feature.payment.legacy.CreditCardEditText;
import com.ubercab.client.feature.payment.legacy.SecurityCodeEditText;
import com.ubercab.locale.country.CountryButton;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import com.ubercab.ui.deprecated.view.ZipEditText;
import cwz;
import cys;
import cyy;
import czb;
import czj;
import czk;
import dbf;
import dce;
import dfp;
import djb;
import dkn;
import dkr;
import doc;
import dod;
import dts;
import duh;
import dxg;
import eqm;
import esi;
import fky;
import fkz;
import flj;
import fln;
import fls;
import flz;
import fmn;
import fng;
import gmg;
import goq;
import hoc;
import hqu;
import hrh;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import java.net.URLDecoder;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData, ThirdPartyToken, SignupActivity, PromoBarFragment, 
//            LegalActivity, SignupPromoFragment

public class SignupPaymentFragment extends czb
    implements esi, fln, flz, goq
{

    private static final long p;
    public chp c;
    public eqm d;
    public cev e;
    public gmg f;
    public PayPalConfiguration g;
    public cys h;
    public cgh i;
    public dod j;
    public dce k;
    public cyy l;
    public dkn m;
    ImageButton mButtonAlipay;
    Button mButtonDone;
    ImageButton mButtonGoogleWallet;
    Button mButtonLegal;
    ImageButton mButtonPaypal;
    Button mButtonScanCard;
    CountryButton mCountryButton;
    SecurityCodeEditText mEditTextCardCode;
    CreditCardEditText mEditTextCardNumber;
    MonthEditText mEditTextMonth;
    YearEditText mEditTextYear;
    ZipEditText mEditTextZip;
    TextView mTextViewSkip;
    DividerWithText mViewDivider;
    ViewGroup mViewGroupTos;
    View mViewLineSkip;
    public dkr n;
    public hoc o;
    private boolean q;
    private boolean r;
    private SignupData s;
    private PromoBarFragment t;

    public SignupPaymentFragment()
    {
    }

    public static SignupPaymentFragment a(SignupData signupdata)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("signup_data", signupdata);
        signupdata = new SignupPaymentFragment();
        signupdata.setArguments(bundle);
        return signupdata;
    }

    private void a(fmn fmn1)
    {
        fmn1.a(this);
    }

    private void b()
    {
        b(getString(0x7f070435));
        String s1;
        String s2;
        String s3;
        ThirdPartyToken thirdpartytoken;
        long l1;
        if (s.h() != null)
        {
            s1 = s.h().a();
        } else
        {
            s1 = null;
        }
        thirdpartytoken = s.m();
        if (thirdpartytoken != null)
        {
            s2 = thirdpartytoken.e();
        } else
        {
            s2 = null;
        }
        if (thirdpartytoken != null)
        {
            s3 = thirdpartytoken.d();
        } else
        {
            s3 = null;
        }
        if (thirdpartytoken != null)
        {
            l1 = thirdpartytoken.b();
        } else
        {
            l1 = 0L;
        }
        n.a(s.a(), s.b(), s.c(), s.e(), s.f(), d.a(mEditTextCardNumber.getText().toString()), d.a(mEditTextCardCode.getText().toString()), d.a(mEditTextMonth.getText().toString()), d.a(mEditTextYear.getText().toString()), mEditTextZip.getText().toString(), mCountryButton.a(), "personal", s1, r, s.d(), s.j(), s2, s3, l1);
    }

    private void g()
    {
        b(getString(0x7f070435));
        String s1;
        String s2;
        String s3;
        ThirdPartyToken thirdpartytoken;
        long l1;
        if (s.h() != null)
        {
            s1 = s.h().a();
        } else
        {
            s1 = null;
        }
        thirdpartytoken = s.m();
        if (thirdpartytoken != null)
        {
            s2 = thirdpartytoken.e();
        } else
        {
            s2 = null;
        }
        if (thirdpartytoken != null)
        {
            s3 = thirdpartytoken.d();
        } else
        {
            s3 = null;
        }
        if (thirdpartytoken != null)
        {
            l1 = thirdpartytoken.b();
        } else
        {
            l1 = 0L;
        }
        n.c(s.a(), s.b(), s.c(), s.e(), s.f(), s1, s.d(), s.j(), s2, s3, l1);
    }

    private void h()
    {
        b(getString(0x7f070435));
        String s1;
        String s2;
        String s3;
        ThirdPartyToken thirdpartytoken;
        long l1;
        if (s.h() != null)
        {
            s1 = s.h().a();
        } else
        {
            s1 = null;
        }
        thirdpartytoken = s.m();
        if (thirdpartytoken != null)
        {
            s2 = thirdpartytoken.e();
        } else
        {
            s2 = null;
        }
        if (thirdpartytoken != null)
        {
            s3 = thirdpartytoken.d();
        } else
        {
            s3 = null;
        }
        if (thirdpartytoken != null)
        {
            l1 = thirdpartytoken.b();
        } else
        {
            l1 = 0L;
        }
        n.a(s.a(), s.b(), s.c(), s.e(), s.f(), s.i(), s1, s.d(), s.j(), s2, s3, l1, dxg.a(getActivity()));
    }

    private void i()
    {
        b(getString(0x7f070435));
        String s1;
        if (s.h() != null)
        {
            s1 = s.h().a();
        } else
        {
            s1 = null;
        }
        n.a(s.a(), s.b(), s.c(), s.e(), s.f(), s.k(), s.l(), s1, s.d());
    }

    private void j()
    {
        Intent intent = new Intent(getActivity(), com/ubercab/client/core/vendor/google/GoogleWalletActivity);
        intent.setAction("com.ubercab.ACTION_LOAD_MASKED_WALLET");
        startActivityForResult(intent, 300);
    }

    private String k()
    {
        Object obj;
        bjw bjw1 = (new bjy()).a(bju.d).c();
        PreloadData preloaddata;
        try
        {
            preloaddata = (PreloadData)bjw1.a(URLDecoder.decode(cyy.d()), com/ubercab/client/core/model/PreloadData);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return "";
        }
        obj = preloaddata;
        if (preloaddata != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = preloaddata;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = preloaddata;
        if (j.g() != null)
        {
            obj = (PreloadData)bjw1.a(URLDecoder.decode(j.g()), com/ubercab/client/core/model/PreloadData);
        }
        if (obj == null)
        {
            return "";
        }
        if (((PreloadData) (obj)).getPromoCode() == null)
        {
            return "";
        } else
        {
            return ((PreloadData) (obj)).getPromoCode();
        }
    }

    private fmn l()
    {
        return fky.a().a(new djb(this)).a((fls)((SignupActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return l();
    }

    public final void a()
    {
        Object obj = new flj(mEditTextCardNumber.getText().toString(), mEditTextCardCode.getText().toString(), mEditTextMonth.getText().toString(), mEditTextYear.getText().toString());
        obj = AnalyticsEvent.create("tap").setName(n.fV).setValue((new StringBuilder()).append(s.p()).append(":").append(((flj) (obj)).a()).toString());
        c.a(((AnalyticsEvent) (obj)));
    }

    public final void a(CreditCardEditText creditcardedittext, boolean flag, String s1)
    {
        r = false;
        if (mEditTextCardCode != null)
        {
            mEditTextCardCode.a(s1);
        }
    }

    public final void a(SignupData.PromoCode promocode)
    {
        if (promocode != null)
        {
            s.a(promocode);
        }
    }

    public final volatile void a(czj czj)
    {
        a((fmn)czj);
    }

    public final void a(String s1)
    {
        mEditTextZip.a(s1);
    }

    public final boolean a(int i1, int j1, Bundle bundle)
    {
        if (i1 == 100 && j1 == -1)
        {
            c.a(k.h);
            s = (SignupData)bundle.getParcelable("signup_data");
            t.a(s.h());
            return true;
        } else
        {
            return false;
        }
    }

    public final cic f()
    {
        return l.he;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 != 200) goto _L2; else goto _L1
_L1:
        if (j1 != -1) goto _L4; else goto _L3
_L3:
        intent = (PayPalAuthorization)intent.getParcelableExtra("com.paypal.android.sdk.authorization");
        if (intent == null) goto _L4; else goto _L5
_L5:
        s.h(intent.a());
        q = true;
        c.a(l.hk);
_L7:
        return;
_L4:
        c.a(l.hj);
        return;
_L2:
        if (i1 == 300 && j1 == -1)
        {
            g();
            return;
        }
        if (i1 == 500 && j1 == -1)
        {
            intent = (AlipayCredentials)intent.getParcelableExtra("alipay_credentials");
            s.j(intent.getAccountId());
            s.k(intent.getMobile());
            i();
            return;
        }
        if (i1 == 400 && j1 == CardIOActivity.a)
        {
            intent = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
            mEditTextCardNumber.setText(((CreditCard) (intent)).cardNumber);
            if (intent.isExpiryValid())
            {
                mEditTextMonth.setText(String.format("%d", new Object[] {
                    Integer.valueOf(((CreditCard) (intent)).expiryMonth)
                }));
                mEditTextYear.setText(String.format("%d", new Object[] {
                    Integer.valueOf(((CreditCard) (intent)).expiryYear)
                }).substring(2));
            }
            r = true;
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onClickAlipay()
    {
        c.a(n.gm);
        if (f.a(dbf.aF))
        {
            o.a(com/ubercab/client/feature/payment/alipay/AlipayVerificationCodeReceiver, p);
        }
        startActivityForResult(new Intent(getActivity(), com/ubercab/client/feature/payment/alipay/AddAlipayActivity), 500);
    }

    public void onClickDone()
    {
        c.a(n.gi);
        hrh hrh1 = new hrh();
        hrh1.a(mEditTextCardNumber, getString(0x7f070284));
        hrh1.a(mEditTextMonth, getString(0x7f070283));
        hrh1.a(mEditTextYear, getString(0x7f070285));
        hrh1.a(mEditTextCardCode, getString(0x7f070282));
        hrh1.a(mEditTextZip, getString(0x7f070286));
        if (!hrh1.a())
        {
            return;
        } else
        {
            b();
            return;
        }
    }

    public void onClickFlag()
    {
        c.a(n.gn);
    }

    public void onClickGoogleWallet()
    {
        c.a(n.gq);
        j();
    }

    public void onClickLegal()
    {
        c.a(n.gr);
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/signup/LegalActivity));
    }

    public void onClickPayPal()
    {
        c.a(n.go);
        Intent intent = new Intent(getActivity(), com/paypal/android/sdk/payments/PayPalFuturePaymentActivity);
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", g);
        startActivityForResult(intent, 200);
    }

    public void onClickScanCard()
    {
        c.a(n.gp);
        h.a(d(), new doc() {

            final SignupPaymentFragment a;

            public final void a(Map map, boolean flag)
            {
                if (flag)
                {
                    a.c.a(l.ai);
                    a.startActivityForResult(dts.a(a.getActivity()), 400);
                    return;
                } else
                {
                    a.c(a.getResources().getString(0x7f07034e));
                    return;
                }
            }

            
            {
                a = SignupPaymentFragment.this;
                super();
            }
        }, new String[] {
            "android.permission.CAMERA"
        });
    }

    public void onClickSkip()
    {
        e.c(new fng(s));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle != null)
        {
            s = (SignupData)bundle.getParcelable("signup_data");
            r = bundle.getBoolean("using_cardio");
            return;
        } else
        {
            s = (SignupData)getArguments().getParcelable("signup_data");
            return;
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100016, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030188, viewgroup, false);
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
        if (menuitem.getItemId() == 0x7f0e06b9)
        {
            cwz.a(getActivity());
            c.a(n.gs);
            SignupPromoFragment.a(s, false).show(getFragmentManager(), com/ubercab/client/feature/signup/SignupPromoFragment.getName());
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070328));
    }

    public void onRiderPersistentConnectionManagerReadyEvent(czk czk)
    {
        if (q)
        {
            q = false;
            h();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("signup_data", s);
        bundle.putBoolean("using_cardio", r);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        boolean flag1 = false;
        super.onViewCreated(view, bundle);
        mButtonDone.setText(getString(0x7f070396));
        mEditTextZip.setHint(getString(0x7f070680));
        mEditTextCardNumber.addTextChangedListener(new hqu(mEditTextCardNumber));
        mEditTextMonth.addTextChangedListener(new hqu(mEditTextMonth));
        mEditTextYear.addTextChangedListener(new hqu(mEditTextYear));
        mEditTextCardCode.addTextChangedListener(new hqu(mEditTextCardCode));
        mEditTextZip.addTextChangedListener(new hqu(mEditTextZip));
        mButtonLegal.setPaintFlags(mButtonLegal.getPaintFlags() | 8);
        view = s.c();
        mCountryButton.a(view);
        mEditTextZip.a(view);
        mEditTextCardNumber.a(this);
        mCountryButton.a(this);
        boolean flag;
        if (!duh.b(f, view))
        {
            int i1;
            if (dxg.a(view, k.a(), f))
            {
                mButtonPaypal.setContentDescription(getString(0x7f07033e));
                mButtonPaypal.setVisibility(0);
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (GoogleWalletActivity.a(getActivity(), k.a()))
            {
                mButtonGoogleWallet.setContentDescription(getString(0x7f070261));
                mButtonGoogleWallet.setVisibility(0);
                i1 = 1;
            }
            flag = i1;
            if (AddAlipayActivity.b(k.a()))
            {
                flag = i1;
                if (f.b(dbf.u))
                {
                    mButtonAlipay.setContentDescription(getString(0x7f070053));
                    mButtonAlipay.setVisibility(0);
                    flag = true;
                }
            }
        } else
        {
            flag = false;
        }
        if (!f.b(dbf.V))
        {
            mViewGroupTos.setVisibility(8);
            mTextViewSkip.setVisibility(0);
            mViewLineSkip.setVisibility(0);
        }
        view = mViewDivider;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 4;
        }
        view.setVisibility(i1);
        if (f.a(dbf.D))
        {
            mButtonScanCard.setVisibility(8);
        }
        t = (PromoBarFragment)getChildFragmentManager().findFragmentById(0x7f0e04b4);
        t.a(this);
        if (!f.a(dbf.az))
        {
            t.a(s.h());
            t.a();
            return;
        }
        view = k();
        if (TextUtils.isEmpty(view))
        {
            t.a(s.h());
            t.a();
            return;
        } else
        {
            t.a(SignupData.PromoCode.a(view, null));
            t.a(view);
            return;
        }
    }

    static 
    {
        p = TimeUnit.MINUTES.toMillis(30L);
    }
}
