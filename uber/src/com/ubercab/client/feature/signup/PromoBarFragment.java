// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import czb;
import czj;
import dbf;
import dfp;
import djb;
import dkn;
import dnw;
import dpg;
import fdp;
import fkm;
import fkn;
import fln;
import flo;
import flp;
import gmg;
import hkp;
import ica;
import icl;
import ico;
import l;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupPromoView

public class PromoBarFragment extends czb
{

    public chp c;
    public cev d;
    public gmg e;
    public dpg f;
    public dkn g;
    public hkp h;
    private boolean i;
    private fln j;
    private String k;
    private icl l;
    SignupPromoView mSignupPromoView;

    public PromoBarFragment()
    {
    }

    public static void a(PromoBarFragment promobarfragment)
    {
        promobarfragment.b();
    }

    public static void a(PromoBarFragment promobarfragment, SignupData.PromoCode promocode)
    {
        promobarfragment.b(promocode);
    }

    private void a(flo flo1)
    {
        flo1.a(this);
    }

    private void a(l l1, String s)
    {
        l1 = AnalyticsEvent.create("impression").setName(l1).setValue(s);
        c.a(l1);
    }

    private flo b(dfp dfp)
    {
        return fkm.a().a(new djb(this)).a(dfp).a();
    }

    public static String b(PromoBarFragment promobarfragment)
    {
        return promobarfragment.k;
    }

    private void b()
    {
        if (mSignupPromoView.a() != null)
        {
            mSignupPromoView.setVisibility(0);
        }
        a(l.fE, "failure");
    }

    private void b(SignupData.PromoCode promocode)
    {
        a(promocode);
        if (j != null)
        {
            j.a(promocode);
            a(l.fE, "success");
        }
    }

    private void g()
    {
        if (getParentFragment() != null)
        {
            getParentFragment().getChildFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        if (e.a(dbf.aP, "readpromocode"))
        {
            k = fdp.a(getActivity());
            if (!TextUtils.isEmpty(k))
            {
                mSignupPromoView.setVisibility(8);
                if (f.w())
                {
                    l = h.c(k).a(ico.a()).b(new flp(this, (byte)0));
                } else
                {
                    g.e(k);
                }
                i = true;
                a(l.fE, "attempt");
            }
        }
    }

    public final void a(SignupData.PromoCode promocode)
    {
        if (mSignupPromoView != null)
        {
            mSignupPromoView.a(promocode);
        }
    }

    public final volatile void a(czj czj)
    {
        a((flo)czj);
    }

    public final void a(fln fln1)
    {
        j = fln1;
    }

    final void a(String s)
    {
        k = s;
        mSignupPromoView.setVisibility(8);
        g.e(s);
        i = true;
        a(l.fE, "attempt");
    }

    public final cic f()
    {
        return czb.a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03021c, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
        g();
    }

    public void onPause()
    {
        super.onPause();
        if (l != null)
        {
            l.b();
        }
    }

    public void onValidatePromoResponseEvent(dnw dnw1)
    {
        if (!i)
        {
            return;
        }
        i = false;
        if (dnw1.e())
        {
            dnw1 = ((Ping)dnw1.g()).getApiResponse();
            b(SignupData.PromoCode.a(k, dnw1.getData()));
            return;
        } else
        {
            b();
            return;
        }
    }
}
