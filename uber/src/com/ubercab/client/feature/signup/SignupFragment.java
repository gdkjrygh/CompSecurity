// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBar;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.vendor.alipay.AlipayAuthorizationActivity;
import com.ubercab.client.core.vendor.alipay.model.AlipayAuthResult;
import com.ubercab.client.core.vendor.facebook.FacebookAuthorizationActivity;
import com.ubercab.client.feature.signin.SignInWithAlipayActivity;
import com.ubercab.locale.name.NameInput;
import com.ubercab.locale.phone.PhoneNumberView;
import com.ubercab.ui.AutoCompleteFloatingLabelEditText;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import com.ubercab.ui.FloatingLabelElement;
import cwz;
import czb;
import czj;
import dbf;
import dbo;
import dce;
import dfp;
import djb;
import dkn;
import dkr;
import dnm;
import dnv;
import dny;
import dpg;
import dtp;
import duj;
import dul;
import dup;
import fke;
import fkq;
import fkr;
import flk;
import fll;
import flm;
import fls;
import flz;
import fma;
import fmb;
import fmc;
import fmh;
import fna;
import fnc;
import fnd;
import fnh;
import gjw;
import gkf;
import gmg;
import gmk;
import gow;
import goz;
import gpm;
import gpn;
import gpp;
import hkp;
import hpb;
import hrs;
import hrw;
import hrx;
import hsa;
import hse;
import hsj;
import ica;
import icl;
import ico;
import iu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import k;
import l;
import n;
import rt;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData, PhoneNumber, SignupGoogleActivity, ThirdPartyToken, 
//            LegalActivity

public class SignupFragment extends czb
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, flz
{

    private static final gpn m = new gpn(new hrs(0x7f07039f));
    public chp c;
    public iu d;
    public cev e;
    public gmg f;
    public dpg g;
    public dce h;
    public dkn i;
    public dkr j;
    public fmh k;
    public hkp l;
    Button mButtonLegal;
    android.widget.Button mButtonNext;
    AutoCompleteFloatingLabelEditText mEditTextEmail;
    AutoCompleteFloatingLabelEditText mEditTextEmailOptional;
    FloatingLabelEditText mEditTextPassword;
    FrameLayout mFrameLayout;
    NameInput mNameView;
    PhoneNumberView mPhoneNumberView;
    ProgressBar mProgressBarLoading;
    ScrollView mScrollViewContent;
    public ImageButton mSignupButtonAlipay;
    ImageButton mSignupButtonBaidu;
    public ImageButton mSignupButtonFacebook;
    public ImageButton mSignupButtonGooglePlus;
    public ViewGroup mViewGroupThirdPartySignIn;
    public ViewGroup mViewGroupThirdPartySignInChina;
    public ViewGroup mViewGroupThirdPartySignInGeneral;
    ViewGroup mViewGroupTos;
    private final gmk n = new fmc(this, (byte)0);
    private final Queue o = new LinkedList();
    private icl p;
    private boolean q;
    private PhoneNumber r;
    private dup s;
    private SignupData t;

    public SignupFragment()
    {
    }

    private SignupData a(dnv dnv1)
    {
        SignupData.PromoCode promocode = null;
        if (dnv1 != null)
        {
            promocode = SignupData.PromoCode.a(dnv1.b());
        }
        if (!f.a(dbf.au))
        {
            return t.b(mPhoneNumberView.g()).c(mPhoneNumberView.d()).a(promocode).e(mNameView.c()).f(mNameView.d()).a(mEditTextEmail.i().toString()).d(mEditTextPassword.i().toString());
        } else
        {
            return t.b(mPhoneNumberView.g()).c(mPhoneNumberView.d()).a(promocode).e(mNameView.c()).f(mNameView.d()).a(mEditTextEmailOptional.i().toString()).d(mEditTextPassword.i().toString());
        }
    }

    static void a(SignupFragment signupfragment)
    {
        signupfragment.g();
    }

    private void a(flk flk1)
    {
        Object obj = flk1.a();
        if (obj != null)
        {
            if (((fll) (obj)).c())
            {
                c.a(k.e);
            }
            if (((fll) (obj)).d())
            {
                c.a(k.f);
            }
            if (mNameView.c().isEmpty())
            {
                mNameView.a(((fll) (obj)).a());
                mNameView.b(((fll) (obj)).b());
            }
            if (flk1.f())
            {
                c.a(k.d);
            }
        }
        obj = new ArrayAdapter(getActivity(), 0x109000a, new ArrayList(flk1.e()));
        if (!f.a(dbf.au))
        {
            mEditTextEmail.a(((android.widget.ListAdapter) (obj)));
            if (TextUtils.isEmpty(mEditTextEmail.i()))
            {
                mEditTextEmail.d(flk1.b());
            }
        } else
        {
            mEditTextEmailOptional.a(((android.widget.ListAdapter) (obj)));
        }
        if (flk1.g())
        {
            c.a(k.g);
        }
        if (!TextUtils.isEmpty(mPhoneNumberView.g())) goto _L2; else goto _L1
_L1:
        r = flk1.c();
        if (r == null) goto _L4; else goto _L3
_L3:
        mPhoneNumberView.a(r.a(), r.b());
_L2:
        if (f.a(dbf.Q))
        {
            flk1 = f.b(dbf.Q, "include_identifiers");
            if (!TextUtils.isEmpty(flk1))
            {
                a(((String) (flk1)), ((FloatingLabelElement) (mEditTextEmail)), ((FloatingLabelElement) (mEditTextPassword)), (FloatingLabelElement)mNameView.findViewById(0x7f0e06a0), (FloatingLabelElement)mNameView.findViewById(0x7f0e06a1), (FloatingLabelElement)mPhoneNumberView.findViewById(0x7f0e018d));
            }
        }
        mProgressBarLoading.setVisibility(8);
        mScrollViewContent.setVisibility(0);
        return;
_L4:
        flk1 = ((TelephonyManager)getActivity().getSystemService("phone")).getSimCountryIso();
        if (!TextUtils.isEmpty(flk1))
        {
            mPhoneNumberView.a(null, flk1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void a(fmb fmb1)
    {
        fmb1.a(this);
    }

    private void a(String s1)
    {
        Intent intent = new Intent(getActivity(), com/ubercab/client/feature/signup/SignupGoogleActivity);
        intent.putExtra("com.ubercab.ACCOUNT_NAME", s1);
        startActivityForResult(intent, 600);
    }

    private void a(String s1, FloatingLabelElement floatinglabelelement, FloatingLabelElement floatinglabelelement1, FloatingLabelElement floatinglabelelement2, FloatingLabelElement floatinglabelelement3, FloatingLabelElement floatinglabelelement4)
    {
        k.a();
        s1 = new HashSet(Arrays.asList(s1.split(",")));
        if (s1.contains("email"))
        {
            k.a(floatinglabelelement);
        }
        if (s1.contains("password"))
        {
            k.a(floatinglabelelement1);
        }
        if (s1.contains("first_name"))
        {
            k.a(floatinglabelelement2);
        }
        if (s1.contains("last_name"))
        {
            k.a(floatinglabelelement3);
        }
        if (s1.contains("phone"))
        {
            k.a(floatinglabelelement4);
        }
    }

    static RiderActivity b(SignupFragment signupfragment)
    {
        return signupfragment.d();
    }

    public static SignupFragment b()
    {
        return new SignupFragment();
    }

    static RiderActivity c(SignupFragment signupfragment)
    {
        return signupfragment.d();
    }

    static void d(SignupFragment signupfragment)
    {
        signupfragment.j();
    }

    public static SignupData e(SignupFragment signupfragment)
    {
        return signupfragment.t;
    }

    public static boolean f(SignupFragment signupfragment)
    {
        return signupfragment.q();
    }

    private void g()
    {
        if (r == null || r.a() == null)
        {
            return;
        }
        if (duj.c(r.a(), r.b()).startsWith(duj.c(mPhoneNumberView.g(), mPhoneNumberView.d())))
        {
            mPhoneNumberView.a(null);
            return;
        } else
        {
            c.a(l.hA);
            mPhoneNumberView.a(getString(0x7f070433));
            return;
        }
    }

    private void h()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.gl);
        if (getString(0x7f070433).equals(mPhoneNumberView.f()))
        {
            analyticsevent.setValue("sign_up_phone_mismatch");
        }
        c.a(analyticsevent);
    }

    private void i()
    {
        startActivityForResult(new Intent(getActivity(), com/ubercab/client/core/vendor/alipay/AlipayAuthorizationActivity), 400);
    }

    private void j()
    {
        if (!k())
        {
            return;
        } else
        {
            l();
            return;
        }
    }

    private boolean k()
    {
        hrs hrs1 = new hrs(0x7f07039f);
        hsj hsj1;
        if (!f.a(dbf.au))
        {
            hsj1 = (new hsj()).a(mNameView, new goz(hrs1, hrs1)).a(mEditTextEmail, new hrx(hrs1, new hrs(0x7f070287))).a(mPhoneNumberView, m);
        } else
        {
            hsj1 = (new hsj()).a(mNameView, new goz(hrs1, hrs1)).a(mPhoneNumberView, m).a(mEditTextEmailOptional, new hrw(new hrs(0x7f070287)));
        }
        if (!m())
        {
            hsj1.a(mEditTextPassword, new hsa(hrs1));
        }
        return hsj1.a().isEmpty();
    }

    private void l()
    {
        String s1;
        String s2;
        String s3;
        String s4;
        if (!f.a(dbf.au))
        {
            cwz.b(getActivity(), mEditTextEmail);
            mEditTextEmail.a(null);
        } else
        {
            cwz.b(getActivity(), mEditTextEmailOptional);
            mEditTextEmailOptional.a(null);
        }
        mPhoneNumberView.a(null);
        mEditTextPassword.a(null);
        if (!f.a(dbf.au))
        {
            s1 = mEditTextEmail.i().toString();
        } else
        {
            s1 = mEditTextEmailOptional.i().toString();
        }
        s2 = mPhoneNumberView.g();
        s3 = mPhoneNumberView.d();
        s4 = mEditTextPassword.i().toString();
        b(getString(0x7f070667));
        j.a(s1, s2, s3, s4);
    }

    private boolean m()
    {
        return q;
    }

    private void n()
    {
        q = true;
        startActivityForResult(new Intent(getActivity(), com/ubercab/client/core/vendor/facebook/FacebookAuthorizationActivity), 500);
    }

    private void o()
    {
        Account aaccount[] = AccountManager.get(getActivity()).getAccountsByType("com.google");
        if (aaccount.length == 1)
        {
            a(aaccount[0].name);
            return;
        } else
        {
            startActivityForResult(rt.a(new String[] {
                "com.google"
            }), 700);
            return;
        }
    }

    private SignupData p()
    {
        return a(((dnv) (null)));
    }

    private boolean q()
    {
        return d.a();
    }

    private void r()
    {
        if ("CHINA".equals(h.a()))
        {
            mViewGroupThirdPartySignIn.setVisibility(8);
        } else
        {
            mViewGroupThirdPartySignIn.setVisibility(0);
            mViewGroupThirdPartySignInGeneral.setVisibility(0);
            mViewGroupThirdPartySignInChina.setVisibility(8);
        }
        f.a(n);
    }

    private fmb s()
    {
        return fkq.a().a(new djb(this)).a((fls)((RiderActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return s();
    }

    public final void a()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fV).setValue(t.p());
        c.a(analyticsevent);
    }

    public final volatile void a(czj czj)
    {
        a((fmb)czj);
    }

    public final cic f()
    {
        return l.ha;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 != 700 || j1 != -1) goto _L2; else goto _L1
_L1:
        a(intent.getStringExtra("authAccount"));
_L10:
        if (i1 == 600)
        {
            if (j1 == -1)
            {
                Object obj = (SignupData)intent.getParcelableExtra("com.ubercab.SIGNUP_DATA");
                ThirdPartyToken thirdpartytoken;
                if (!((SignupData) (obj)).o() || f.a(dbf.V))
                {
                    o.add(new fnd(((SignupData) (obj))));
                } else
                {
                    o.add(new fnh(((SignupData) (obj))));
                }
            } else
            if (j1 == 1)
            {
                o.add(new fnc());
            }
        }
        if (i1 != 400 || j1 != -1) goto _L4; else goto _L3
_L3:
        intent = (AlipayAuthResult)intent.getParcelableExtra("alipay_auth_result");
        if (intent != null && "9000".equals(intent.getResultStatus()))
        {
            intent = ThirdPartyToken.a("alipay", null, 60000L, null, intent.getAuthCode());
            if (intent.f())
            {
                startActivityForResult(SignInWithAlipayActivity.a(getActivity(), intent), 401);
            }
        }
_L6:
        return;
_L2:
        if (i1 == 500 && j1 == -1)
        {
            obj = intent.getStringExtra("token");
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(getString(0x7f070434));
                thirdpartytoken = ThirdPartyToken.a("facebook", ((String) (obj)), intent.getLongExtra("tokenExpiry", 0L));
                t = p();
                t.a(thirdpartytoken);
                if (g.d())
                {
                    p = l.b("facebook", ((String) (obj))).a(ico.a()).a(new fma(this, (byte)0));
                } else
                {
                    i.g(thirdpartytoken.e(), thirdpartytoken.d());
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (i1 != 401) goto _L6; else goto _L5
_L5:
        if (j1 == 1001)
        {
            o.add(new fke());
            return;
        }
        if (j1 != -1) goto _L6; else goto _L7
_L7:
        intent = (SignupData)intent.getParcelableExtra("com.ubercab.SIGNUP_DATA");
        if (intent == null) goto _L6; else goto _L8
_L8:
        o.add(new fna(intent));
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onAlipaySignupClicked()
    {
        c.a(n.fT);
        i();
    }

    public void onClickLegal()
    {
        c.a(n.gr);
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/signup/LegalActivity));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        t = SignupData.n();
        if (bundle != null)
        {
            q = bundle.getBoolean("is_third_party");
            r = (PhoneNumber)bundle.getParcelable("top_phone");
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new flm(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f03018e, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        if (!f.a(dbf.au))
        {
            layoutinflater = (new gkf()).a(new Pair("email", mEditTextEmail)).a(new Pair("password", mEditTextPassword)).a(new Pair("mobile", mPhoneNumberView)).a(new Pair("error", new hse() {

                final SignupFragment a;

                private void a(hrs hrs1)
                {
                    if (hrs1 == null)
                    {
                        return;
                    } else
                    {
                        dtp.a(SignupFragment.b(a), 0, hrs1.a(a.getResources()).toString());
                        return;
                    }
                }

                public final volatile void a(Object obj)
                {
                    a((hrs)obj);
                }

            
            {
                a = SignupFragment.this;
                super();
            }
            })).a();
        } else
        {
            layoutinflater = (new gkf()).a(new Pair("password", mEditTextPassword)).a(new Pair("mobile", mPhoneNumberView)).a(new Pair("error", new hse() {

                final SignupFragment a;

                private void a(hrs hrs1)
                {
                    if (hrs1 == null)
                    {
                        return;
                    } else
                    {
                        dtp.a(SignupFragment.c(a), 0, hrs1.a(a.getResources()).toString());
                        return;
                    }
                }

                public final volatile void a(Object obj)
                {
                    a((hrs)obj);
                }

            
            {
                a = SignupFragment.this;
                super();
            }
            })).a();
        }
        s = new dup(layoutinflater);
        mEditTextPassword.a(new android.widget.TextView.OnEditorActionListener() {

            final SignupFragment a;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                a.c.a(n.ge);
                SignupFragment.d(a);
                return true;
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        return viewgroup;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
        f.b(n);
    }

    public void onFacebookSignupClicked()
    {
        c.a(n.gf);
        n();
    }

    public void onFlagClicked()
    {
        c.a(n.fX);
    }

    public void onGoogleSignupClicked()
    {
        c.a(n.gg);
        o();
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a((flk)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onNextClicked()
    {
        h();
        j();
    }

    public void onPause()
    {
        super.onPause();
        if (p != null)
        {
            p.b();
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070396));
        for (; !o.isEmpty(); e.c(o.remove())) { }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_third_party", q);
        bundle.putParcelable("top_phone", r);
    }

    public void onThirdPartyAuthResponseEvent(dnm dnm1)
    {
        if (dnm1.e())
        {
            dnm1 = (Ping)dnm1.g();
            if (dul.a(dnm1) || dnm1.getThirdPartyConnected())
            {
                e.c(new fke());
                return;
            }
            dnm1 = dnm1.getSignupFieldsRequired();
            t.e((String)dnm1.get("firstName")).f((String)dnm1.get("lastName")).a((String)dnm1.get("email"));
        }
        e.c(new dny(t));
        e();
    }

    public void onValidateAccountResponseEvent(dnv dnv1)
    {
        e();
        if (dnv1.i())
        {
            e.c(new fnh(a(dnv1)));
            return;
        }
        Object obj = dnv1.a();
        if (obj == null)
        {
            obj = dnv1.l();
            dnv1 = ((dnv) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                dnv1 = getString(0x7f0702a5);
            }
            dtp.a(d(), 0, dnv1);
            return;
        }
        if (((Map) (obj)).containsKey("username") && !((Map) (obj)).containsKey("email"))
        {
            ((Map) (obj)).put("email", ((Map) (obj)).get("username"));
        }
        dnv1 = AnalyticsEvent.create("impression").setName(l.ha);
        dnv1.setValue(gjw.a(",").a(((Map) (obj)).keySet()));
        c.a(dnv1);
        s.a(((Map) (obj)));
        s.a();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = mNameView;
        int i1;
        if ("CHINA".equals(h.a()) && gpp.a(Locale.getDefault()))
        {
            i1 = gow.b;
        } else
        {
            i1 = gow.a;
        }
        view.a(i1);
        mButtonLegal.setPaintFlags(mButtonLegal.getPaintFlags() | 8);
        mPhoneNumberView.setNextFocusForwardId(mNameView.getId());
        if (f.a(dbf.cO))
        {
            mPhoneNumberView.a(new gpm() {

                final SignupFragment a;

                public final void a(String s1)
                {
                    SignupFragment.a(a);
                }

                public final void a(boolean flag)
                {
                }

                public final boolean a(int j1)
                {
                    return false;
                }

                public final void g_()
                {
                    SignupFragment.a(a);
                }

            
            {
                a = SignupFragment.this;
                super();
            }
            });
        }
        mEditTextPassword.a(new hpb() {

            final SignupFragment a;

            public final void beforeTextChanged(CharSequence charsequence, int j1, int k1, int l1)
            {
                if (j1 == 0 && l1 > 0)
                {
                    a.mScrollViewContent.scrollTo(0, a.mScrollViewContent.getBottom());
                }
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        if (f.b(dbf.V))
        {
            mViewGroupTos.setVisibility(8);
        }
        if (f.a(dbf.V, dbo.b))
        {
            mButtonNext.setText(0x7f070396);
        }
        if (!f.a(dbf.au))
        {
            mEditTextEmail.setVisibility(0);
            mEditTextEmailOptional.setVisibility(8);
        } else
        {
            c.a(l.hH);
            mEditTextEmail.setVisibility(8);
            mEditTextEmailOptional.setVisibility(0);
        }
        r();
        if (!isVisible())
        {
            getLoaderManager().initLoader(1, null, this);
            return;
        } else
        {
            mFrameLayout.setLayoutTransition(null);
            mProgressBarLoading.setVisibility(8);
            mScrollViewContent.setVisibility(0);
            return;
        }
    }

}
