// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.payment.alipay.AlipayVerificationCodeReceiver;
import com.ubercab.locale.name.NameInput;
import com.ubercab.locale.phone.PhoneNumberView;
import com.ubercab.ui.AutoCompleteFloatingLabelEditText;
import com.ubercab.ui.FloatingLabelEditText;
import cwz;
import czb;
import czj;
import dbf;
import dce;
import dfp;
import djb;
import dkr;
import dnv;
import dtp;
import dup;
import fle;
import flf;
import fln;
import flz;
import fmw;
import gkf;
import gmg;
import gow;
import goz;
import gpn;
import gpp;
import hoc;
import hrs;
import hrw;
import hrx;
import hsa;
import hse;
import hsj;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData, ThirdPartyToken, PromoBarFragment, SignupPromoFragment

public class SignupWithAlipayFragment extends czb
    implements flz
{

    private static final long j;
    private static final gpn k = new gpn(new hrs(0x7f07039f));
    public chp c;
    public cev d;
    public gmg e;
    public dce f;
    public dkr g;
    public hoc h;
    PromoBarFragment i;
    private SignupData l;
    private dup m;
    Button mButtonNext;
    AutoCompleteFloatingLabelEditText mEditTextEmail;
    FloatingLabelEditText mEditTextPassword;
    NameInput mNameView;
    PhoneNumberView mPhoneNumberView;

    public SignupWithAlipayFragment()
    {
    }

    static RiderActivity a(SignupWithAlipayFragment signupwithalipayfragment)
    {
        return signupwithalipayfragment.d();
    }

    public static SignupWithAlipayFragment a(SignupData signupdata)
    {
        Bundle bundle = new Bundle();
        SignupWithAlipayFragment signupwithalipayfragment = new SignupWithAlipayFragment();
        bundle.putParcelable("signup_data", signupdata);
        signupwithalipayfragment.setArguments(bundle);
        return signupwithalipayfragment;
    }

    private void a(ThirdPartyToken thirdpartytoken)
    {
        b(getString(0x7f070435));
        String s;
        if (l.h() != null)
        {
            s = l.h().a();
        } else
        {
            s = null;
        }
        g.a(l.a(), l.b(), l.c(), l.e(), l.f(), s, l.d(), thirdpartytoken.e(), thirdpartytoken.d(), thirdpartytoken.b());
    }

    private void a(fmw fmw1)
    {
        fmw1.a(this);
    }

    static RiderActivity b(SignupWithAlipayFragment signupwithalipayfragment)
    {
        return signupwithalipayfragment.d();
    }

    private fmw b(dfp dfp)
    {
        return fle.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        cwz.b(getActivity(), mEditTextEmail);
        mEditTextEmail.a(null);
        mPhoneNumberView.a(null);
        mEditTextPassword.a(null);
        String s = mEditTextEmail.i().toString();
        String s1 = mPhoneNumberView.g();
        String s2 = mPhoneNumberView.d();
        String s3 = mEditTextPassword.i().toString();
        b(getString(0x7f070667));
        g.a(s, s1, s2, s3);
    }

    static SignupData c(SignupWithAlipayFragment signupwithalipayfragment)
    {
        return signupwithalipayfragment.l;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fV).setValue(l.p());
        c.a(analyticsevent);
    }

    public final volatile void a(czj czj)
    {
        a((fmw)czj);
    }

    public final boolean a(int i1, int j1, Bundle bundle)
    {
        if (i1 == 100 && j1 == -1)
        {
            c.a(k.c);
            l = (SignupData)bundle.getParcelable("signup_data");
            if (l != null)
            {
                i.a(l.h());
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final cic f()
    {
        return l.hD;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle != null && bundle.containsKey("signup_data"))
        {
            l = (SignupData)bundle.getParcelable("signup_data");
        } else
        {
            l = (SignupData)getArguments().getParcelable("signup_data");
        }
        if (l == null)
        {
            l = SignupData.n();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100016, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f030190, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        if (!e.a(dbf.av))
        {
            layoutinflater = (new gkf()).a(new Pair("email", mEditTextEmail)).a(new Pair("password", mEditTextPassword)).a(new Pair("mobile", mPhoneNumberView)).a(new Pair("error", new hse() {

                final SignupWithAlipayFragment a;

                private void a(hrs hrs1)
                {
                    if (hrs1 == null)
                    {
                        return;
                    } else
                    {
                        dtp.a(SignupWithAlipayFragment.a(a), 0, hrs1.a(a.getResources()).toString());
                        return;
                    }
                }

                public final volatile void a(Object obj)
                {
                    a((hrs)obj);
                }

            
            {
                a = SignupWithAlipayFragment.this;
                super();
            }
            })).a();
        } else
        {
            layoutinflater = (new gkf()).a(new Pair("password", mEditTextPassword)).a(new Pair("mobile", mPhoneNumberView)).a(new Pair("error", new hse() {

                final SignupWithAlipayFragment a;

                private void a(hrs hrs1)
                {
                    if (hrs1 == null)
                    {
                        return;
                    } else
                    {
                        dtp.a(SignupWithAlipayFragment.b(a), 0, hrs1.a(a.getResources()).toString());
                        return;
                    }
                }

                public final volatile void a(Object obj)
                {
                    a((hrs)obj);
                }

            
            {
                a = SignupWithAlipayFragment.this;
                super();
            }
            })).a();
            mEditTextEmail.c(getString(0x7f070203));
            mEditTextEmail.e(getString(0x7f070203));
        }
        m = new dup(layoutinflater);
        return viewgroup;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onNextClicked()
    {
        Object obj = AnalyticsEvent.create("tap").setName(n.ge).setValue("alipay");
        c.a(((AnalyticsEvent) (obj)));
        obj = new hrs(0x7f07039f);
        if (!e.a(dbf.av))
        {
            obj = (new hsj()).a(mNameView, new goz(((hrs) (obj)), ((hrs) (obj)))).a(mEditTextEmail, new hrx(obj, new hrs(0x7f070287))).a(mPhoneNumberView, k).a(mEditTextPassword, new hsa(obj));
        } else
        {
            obj = (new hsj()).a(mNameView, new goz(((hrs) (obj)), ((hrs) (obj)))).a(mEditTextEmail, new hrw(new hrs(0x7f070287))).a(mPhoneNumberView, k).a(mEditTextPassword, new hsa(obj));
        }
        if (((hsj) (obj)).a().isEmpty())
        {
            b();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06b9)
        {
            c.a(n.fU);
            SignupPromoFragment.a(l, false).show(getFragmentManager(), com/ubercab/client/feature/signup/SignupPromoFragment.getName());
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f0701b7));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("signup_data", l);
    }

    public void onStart()
    {
        super.onStart();
        if (e.a(dbf.aF))
        {
            h.a(com/ubercab/client/feature/payment/alipay/AlipayVerificationCodeReceiver, j);
        }
    }

    public void onValidateAccountResponseEvent(dnv dnv1)
    {
        e();
        if (dnv1 != null && dnv1.i())
        {
            dnv1 = SignupData.PromoCode.a(dnv1.b());
            l.e(mNameView.c()).f(mNameView.d()).a(mEditTextEmail.i().toString()).b(mPhoneNumberView.g()).c(mPhoneNumberView.d()).a(dnv1).d(mEditTextPassword.i().toString());
            dnv1 = l.m();
            if (dnv1 != null)
            {
                a(dnv1);
            }
        } else
        {
            dnv1 = dnv1.a();
            if (dnv1 != null)
            {
                m.a(dnv1);
                m.a();
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mPhoneNumberView.a(l.b(), l.c());
        int i1;
        if (!e.a(dbf.av))
        {
            mEditTextEmail.d(l.a());
        } else
        {
            view = AnalyticsEvent.create("impression").setName(l.hH).setValue("alipay");
            c.a(view);
        }
        view = mNameView;
        if ("CHINA".equals(f.a()) && gpp.a(Locale.getDefault()))
        {
            i1 = gow.b;
        } else
        {
            i1 = gow.a;
        }
        view.a(i1);
        mPhoneNumberView.setNextFocusForwardId(mNameView.getId());
        i = (PromoBarFragment)getChildFragmentManager().findFragmentById(0x7f0e04b4);
        i.a(new fln() {

            final SignupWithAlipayFragment a;

            public final void a(SignupData.PromoCode promocode)
            {
                if (promocode != null)
                {
                    SignupWithAlipayFragment.c(a).a(promocode);
                }
            }

            
            {
                a = SignupWithAlipayFragment.this;
                super();
            }
        });
        i.a(l.h());
        i.a();
    }

    static 
    {
        j = TimeUnit.MINUTES.toMillis(30L);
    }
}
