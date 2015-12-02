// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.paytm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.signup.LegalActivity;
import com.ubercab.client.feature.signup.PromoBarFragment;
import com.ubercab.client.feature.signup.SignupData;
import com.ubercab.client.feature.signup.SignupPromoFragment;
import com.ubercab.client.feature.signup.ThirdPartyToken;
import czb;
import czj;
import dcg;
import dfp;
import djb;
import dkn;
import dkr;
import fln;
import flz;
import fnb;
import fns;
import fnt;
import foa;
import k;
import l;
import n;

public class SignupPaytmOrCcFragment extends czb
    implements fln, flz
{

    public chp c;
    public cev d;
    public dkn e;
    public dkr f;
    private SignupData g;
    private PromoBarFragment h;
    private boolean i;
    ViewGroup mViewGroupIntlCc;

    public SignupPaytmOrCcFragment()
    {
    }

    public static SignupPaytmOrCcFragment a(SignupData signupdata, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("signup_data", signupdata);
        bundle.putBoolean("hide_intl_cc", flag);
        signupdata = new SignupPaytmOrCcFragment();
        signupdata.setArguments(bundle);
        return signupdata;
    }

    private void a(foa foa1)
    {
        foa1.a(this);
    }

    public static boolean a(String s)
    {
        return s != null && s.equalsIgnoreCase(dcg.c.a());
    }

    private foa b(dfp dfp)
    {
        return fns.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        b(getString(0x7f070435));
        String s;
        String s1;
        String s2;
        ThirdPartyToken thirdpartytoken;
        long l1;
        if (g.h() != null)
        {
            s = g.h().a();
        } else
        {
            s = null;
        }
        thirdpartytoken = g.m();
        if (thirdpartytoken != null)
        {
            s1 = thirdpartytoken.e();
        } else
        {
            s1 = null;
        }
        if (thirdpartytoken != null)
        {
            s2 = thirdpartytoken.d();
        } else
        {
            s2 = null;
        }
        if (thirdpartytoken != null)
        {
            l1 = thirdpartytoken.b();
        } else
        {
            l1 = 0L;
        }
        f.d(g.a(), g.b(), g.c(), g.e(), g.f(), s, g.d(), g.j(), s1, s2, l1);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        c.a(n.gC);
    }

    public final void a(com.ubercab.client.feature.signup.SignupData.PromoCode promocode)
    {
        if (promocode != null)
        {
            g.a(promocode);
        }
    }

    public final volatile void a(czj czj)
    {
        a((foa)czj);
    }

    public final boolean a(int j, int i1, Bundle bundle)
    {
        if (j == 100 && i1 == -1)
        {
            c.a(k.h);
            g = (SignupData)bundle.getParcelable("signup_data");
            h.a(g.h());
            c(getString(0x7f070381));
            return true;
        } else
        {
            return false;
        }
    }

    public final cic f()
    {
        if (i)
        {
            return l.hl;
        } else
        {
            return l.ht;
        }
    }

    public void onClickIntlCreditCard()
    {
        c.a(n.gA);
        d.c(new fnb(g));
    }

    public void onClickLegal()
    {
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/signup/LegalActivity));
    }

    public void onClickPaytm()
    {
        c.a(n.gB);
        b();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle != null)
        {
            g = (SignupData)bundle.getParcelable("signup_data");
        } else
        {
            g = (SignupData)getArguments().getParcelable("signup_data");
        }
        i = getArguments().getBoolean("hide_intl_cc");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100016, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03018a, viewgroup, false);
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
            c.a(n.gD);
            SignupPromoFragment.a(g, true).show(getFragmentManager(), com/ubercab/client/feature/signup/SignupPromoFragment.getName());
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

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("signup_data", g);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        h = (PromoBarFragment)getChildFragmentManager().findFragmentById(0x7f0e04b4);
        h.a(this);
        h.a(g.h());
        h.a();
        if (i)
        {
            mViewGroupIntlCc.setVisibility(8);
        }
    }
}
