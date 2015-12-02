// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.locale.phone.PhoneNumberView;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import cwz;
import cyi;
import czb;
import czj;
import dbf;
import dbo;
import dfp;
import djb;
import dkr;
import dnv;
import dtp;
import dup;
import fkw;
import fkx;
import flz;
import fml;
import fnh;
import gkf;
import gmg;
import gpm;
import hrs;
import hse;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData, LegalActivity

public class SignupMissingInfoFragment extends czb
    implements flz, gpm
{

    public chp c;
    public cev d;
    public gmg e;
    public dkr f;
    public cyi g;
    private SignupData h;
    private dup i;
    private boolean j;
    Button mButtonLegal;
    Button mButtonNext;
    EditText mEditTextFirstName;
    EditText mEditTextLastName;
    PhoneNumberView mPhoneNumberView;
    ViewGroup mViewGroupTos;

    public SignupMissingInfoFragment()
    {
    }

    static RiderActivity a(SignupMissingInfoFragment signupmissinginfofragment)
    {
        return signupmissinginfofragment.d();
    }

    public static SignupMissingInfoFragment a(SignupData signupdata)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("signup_data", signupdata);
        signupdata = new SignupMissingInfoFragment();
        signupdata.setArguments(bundle);
        return signupdata;
    }

    private void a(fml fml1)
    {
        fml1.a(this);
    }

    private fml b(dfp dfp)
    {
        return fkw.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        cwz.b(getActivity(), mEditTextFirstName);
        String s = mPhoneNumberView.g();
        String s1 = mPhoneNumberView.d();
        b(getString(0x7f070667));
        f.a(h.a(), s, s1, "thisisnotarealpassword1234567$");
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fV).setValue(h.p());
        c.a(analyticsevent);
    }

    public final volatile void a(czj czj)
    {
        a((fml)czj);
    }

    public final void a(String s)
    {
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a(int k)
    {
        if (k == 6)
        {
            b();
            return true;
        } else
        {
            return false;
        }
    }

    public final cic f()
    {
        return l.hg;
    }

    public final void g_()
    {
    }

    public void onClickLegal()
    {
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/signup/LegalActivity));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        h = (SignupData)getArguments().getParcelable("signup_data");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030187, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        i = new dup((new gkf()).a(new Pair("mobile", mPhoneNumberView)).a(new Pair("error", new hse() {

            final SignupMissingInfoFragment a;

            private void a(hrs hrs1)
            {
                if (hrs1 == null)
                {
                    return;
                } else
                {
                    dtp.a(SignupMissingInfoFragment.a(a), 0, hrs1.a(a.getResources()).toString());
                    return;
                }
            }

            public final volatile void a(Object obj)
            {
                a((hrs)obj);
            }

            
            {
                a = SignupMissingInfoFragment.this;
                super();
            }
        })).a());
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onNextClicked()
    {
        b();
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = d().b();
        int k;
        if (j)
        {
            k = 0x7f070666;
        } else
        {
            k = 0x7f0701b7;
        }
        actionbar.a(getString(k));
    }

    public void onValidateAccountResponseEvent(dnv dnv1)
    {
        e();
        if (dnv1.i())
        {
            h.e(mEditTextFirstName.getText().toString());
            h.f(mEditTextLastName.getText().toString());
            h.b(mPhoneNumberView.g());
            h.c(mPhoneNumberView.d());
            d.c(new fnh(h));
        } else
        {
            dnv1 = dnv1.a();
            if (dnv1 != null)
            {
                i.a(dnv1);
                i.a();
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (e.a(dbf.V, dbo.b))
        {
            mButtonNext.setText(0x7f0701e4);
        } else
        {
            mButtonNext.setText(0x7f0702cc);
        }
        mButtonLegal.setPaintFlags(mButtonLegal.getPaintFlags() | 8);
        if (e.b(dbf.V))
        {
            mViewGroupTos.setVisibility(8);
        }
        mPhoneNumberView.a(this);
        if (bundle == null)
        {
            mEditTextFirstName.setText(h.e());
            mEditTextLastName.setText(h.f());
            mPhoneNumberView.a(h.b(), h.c());
            boolean flag;
            if (!TextUtils.isEmpty(mEditTextFirstName.getText()) && !TextUtils.isEmpty(mEditTextLastName.getText()) && !TextUtils.isEmpty(mPhoneNumberView.g()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = flag;
        }
    }
}
