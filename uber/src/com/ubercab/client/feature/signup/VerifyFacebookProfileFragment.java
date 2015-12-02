// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
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
import com.ubercab.ui.AutoCompleteFloatingLabelEditText;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import cwz;
import czb;
import czj;
import dbf;
import dbo;
import dfp;
import djb;
import dkr;
import dnv;
import dtp;
import flg;
import flh;
import flz;
import fmy;
import fnh;
import gmg;
import gpm;
import gpn;
import hrs;
import hrx;
import hsa;
import hsj;
import java.util.List;
import java.util.Map;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData, LegalActivity

public class VerifyFacebookProfileFragment extends czb
    implements flz, gpm
{

    private static final gpn g = new gpn(new hrs(0x7f07039f));
    private static final hsa h = new hsa(new hrs(0x7f07039f));
    public chp c;
    public cev d;
    public gmg e;
    public dkr f;
    private SignupData i;
    Button mButtonLegal;
    Button mButtonNext;
    AutoCompleteFloatingLabelEditText mEditTextEmail;
    FloatingLabelEditText mEditTextFirstName;
    FloatingLabelEditText mEditTextLastName;
    PhoneNumberView mPhoneNumberView;
    ViewGroup mViewGroupTos;

    public VerifyFacebookProfileFragment()
    {
    }

    public static VerifyFacebookProfileFragment a(SignupData signupdata)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("signup_data", signupdata);
        signupdata = new VerifyFacebookProfileFragment();
        signupdata.setArguments(bundle);
        return signupdata;
    }

    private void a(fmy fmy1)
    {
        fmy1.a(this);
    }

    private fmy b(dfp dfp)
    {
        return flg.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        if (!(new hsj()).a(mEditTextEmail, new hrx(new hrs(0x7f07039f), new hrs(0x7f070287))).a(mEditTextFirstName, h).a(mEditTextLastName, h).a(mPhoneNumberView, g).a().isEmpty())
        {
            return;
        } else
        {
            cwz.b(getActivity(), mEditTextEmail);
            String s = mEditTextEmail.i().toString();
            String s1 = mPhoneNumberView.g();
            String s2 = mPhoneNumberView.d();
            b(getString(0x7f070667));
            f.a(s, s1, s2, "thisisnotarealpassword1234567$");
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fV).setValue(i.p());
        c.a(analyticsevent);
    }

    public final volatile void a(czj czj)
    {
        a((fmy)czj);
    }

    public final void a(String s)
    {
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a(int j)
    {
        if (j == 6)
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
        return l.hF;
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
        i = (SignupData)getArguments().getParcelable("signup_data");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03018f, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
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
        d().b().a(getString(0x7f070666));
    }

    public void onValidateAccountResponseEvent(dnv dnv1)
    {
        e();
        if (dnv1.i())
        {
            i.e(mEditTextFirstName.i().toString());
            i.f(mEditTextLastName.i().toString());
            i.a(mEditTextEmail.i().toString());
            i.b(mPhoneNumberView.g());
            i.c(mPhoneNumberView.d());
            d.c(new fnh(i));
        } else
        {
            dnv1 = dnv1.a();
            if (dnv1 != null)
            {
                if (dnv1.containsKey("mobile"))
                {
                    mPhoneNumberView.a(new hrs((CharSequence)dnv1.get("mobile")));
                }
                if (dnv1.containsKey("username") && dnv1.containsKey("email"))
                {
                    dtp.a(d(), 0, getString(0x7f070036));
                    return;
                }
                if (dnv1.containsKey("error"))
                {
                    dtp.a(d(), 0, (String)dnv1.get("error"));
                    return;
                }
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
            mEditTextFirstName.d(i.e());
            mEditTextLastName.d(i.f());
            mEditTextEmail.d(i.a());
            mPhoneNumberView.a(i.b(), i.c());
        }
    }

}
