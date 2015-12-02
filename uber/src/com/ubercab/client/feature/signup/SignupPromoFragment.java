// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import cwz;
import cyz;
import czj;
import dfp;
import diw;
import dkn;
import dnw;
import dpg;
import dtp;
import flc;
import fld;
import fmr;
import fms;
import hkp;
import ica;
import icl;
import ico;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData

public class SignupPromoFragment extends cyz
{

    public chp a;
    public dpg b;
    public dkn c;
    public hkp d;
    private boolean g;
    private l h;
    private n i;
    private n j;
    private AnalyticsEvent k;
    private SignupData l;
    private icl m;
    Button mButtonAddPromo;
    public EditText mEditTextPromo;
    ProgressBar mProgressBarLoading;
    View mViewContent;

    public SignupPromoFragment()
    {
        h = l.fC;
    }

    private static AnalyticsEvent a(String s)
    {
        return AnalyticsEvent.create("impression").setName(l.fD).setValue(s);
    }

    public static SignupPromoFragment a(SignupData signupdata, boolean flag)
    {
        Bundle bundle = b(100);
        bundle.putParcelable("signup_data", signupdata);
        bundle.putBoolean("is_paytm_or_cc", flag);
        signupdata = new SignupPromoFragment();
        signupdata.setArguments(bundle);
        return signupdata;
    }

    private void a(SignupData.PromoCode promocode)
    {
        a.a(k);
        l.a(promocode);
        cwz.b(getActivity(), mEditTextPromo);
        getArguments().putParcelable("signup_data", l);
        c(-1);
        dismiss();
    }

    public static void a(SignupPromoFragment signuppromofragment)
    {
        signuppromofragment.e();
    }

    public static void a(SignupPromoFragment signuppromofragment, SignupData.PromoCode promocode)
    {
        signuppromofragment.a(promocode);
    }

    public static void a(SignupPromoFragment signuppromofragment, String s)
    {
        signuppromofragment.b(s);
    }

    private void a(fmr fmr1)
    {
        fmr1.a(this);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            mProgressBarLoading.setVisibility(0);
            mViewContent.setVisibility(4);
            return;
        } else
        {
            mProgressBarLoading.setVisibility(8);
            mViewContent.setVisibility(0);
            return;
        }
    }

    private fmr b(dfp dfp)
    {
        return flc.a().a(new diw(this)).a(dfp).a();
    }

    private void b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            mEditTextPromo.postDelayed(new Runnable(s) {

                final String a;
                final SignupPromoFragment b;

                public final void run()
                {
                    if (b.isAdded())
                    {
                        b.mEditTextPromo.setError(a);
                    }
                }

            
            {
                b = SignupPromoFragment.this;
                a = s;
                super();
            }
            }, getResources().getInteger(0x10e0000));
        }
        a.a(a("rejected"));
    }

    private void d()
    {
        a.a(i);
        a(true);
        mEditTextPromo.setError(null);
        String s = mEditTextPromo.getText().toString();
        if (b.w())
        {
            m = d.c(s).a(ico.a()).a(new fms(this, (byte)0));
            return;
        } else
        {
            c.e(s);
            return;
        }
    }

    private void e()
    {
        String s = getString(0x7f070436);
        dtp.a((RiderActivity)getActivity(), 0, s);
    }

    public final cic a()
    {
        return h;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fmr)czj);
    }

    public int getTheme()
    {
        return 0x7f09017b;
    }

    public void onAddPromoClicked()
    {
        d();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.a(j);
        super.onCancel(dialoginterface);
    }

    public void onCancelClicked()
    {
        a.a(j);
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            l = (SignupData)bundle.getParcelable("signup_data");
            g = bundle.getBoolean("is_paytm_or_cc");
        } else
        {
            l = (SignupData)getArguments().getParcelable("signup_data");
            g = getArguments().getBoolean("is_paytm_or_cc");
        }
        if (g)
        {
            h = l.hu;
            j = n.gF;
            i = n.gE;
            k = AnalyticsEvent.create("impression").setName(l.hv);
            return;
        } else
        {
            h = l.fC;
            j = n.dK;
            i = n.dL;
            k = a("accepted");
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03018d, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        cwz.a(getActivity());
    }

    public boolean onEditorActionPromo()
    {
        d();
        return true;
    }

    public void onPause()
    {
        super.onPause();
        cwz.b(getActivity(), mEditTextPromo);
        if (m != null)
        {
            m.b();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("signup_data", l);
        bundle.putBoolean("is_paytm_or_cc", g);
    }

    public void onTextChangedPromo(CharSequence charsequence)
    {
        charsequence = mButtonAddPromo;
        boolean flag;
        if (!TextUtils.isEmpty(mEditTextPromo.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        charsequence.setEnabled(flag);
    }

    public void onValidatePromoResponseEvent(dnw dnw1)
    {
        if (!dnw1.e())
        {
            a(false);
            if (dnw1.h() != null)
            {
                e();
                return;
            } else
            {
                b(dnw1.f());
                return;
            }
        } else
        {
            dnw1 = ((Ping)dnw1.g()).getApiResponse();
            a(SignupData.PromoCode.a(mEditTextPromo.getText().toString(), dnw1.getData()));
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mButtonAddPromo.setText(getString(0x7f07004e));
        mEditTextPromo.setHint(getString(0x7f07021a));
        cwz.a(getActivity());
        view = mButtonAddPromo;
        boolean flag;
        if (!TextUtils.isEmpty(mEditTextPromo.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
    }
}
