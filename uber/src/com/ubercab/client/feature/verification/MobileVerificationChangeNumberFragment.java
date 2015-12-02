// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.RiderAccount;
import com.ubercab.locale.phone.PhoneNumberView;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.ui.TextView;
import cwm;
import cwz;
import czb;
import czj;
import dal;
import dbf;
import dfp;
import djb;
import djx;
import dkn;
import dli;
import dnq;
import dri;
import dtp;
import gih;
import gii;
import giv;
import gjd;
import gjp;
import gmg;
import gpn;
import hkr;
import hrs;
import hsj;
import java.util.List;
import l;
import n;

public class MobileVerificationChangeNumberFragment extends czb
{

    private static final gpn k = new gpn(new hrs(0x7f07039f));
    public djx c;
    public chp d;
    public cev e;
    public hkr f;
    public gmg g;
    public dkn h;
    public dal i;
    public dri j;
    PhoneNumberView mPhoneNumberView;
    TextView mTextViewNotice;

    public MobileVerificationChangeNumberFragment()
    {
    }

    public static MobileVerificationChangeNumberFragment a(String s, String s1)
    {
        Bundle bundle = new Bundle();
        MobileVerificationChangeNumberFragment mobileverificationchangenumberfragment = new MobileVerificationChangeNumberFragment();
        bundle.putString("arg_mobile_number", s);
        bundle.putString("arg_mobile_country", s1);
        mobileverificationchangenumberfragment.setArguments(bundle);
        return mobileverificationchangenumberfragment;
    }

    private void a()
    {
        cwm.a(getActivity(), 0x7f070631);
    }

    private void a(giv giv1)
    {
        giv1.a(this);
    }

    private giv b(dfp dfp)
    {
        return gih.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((giv)czj);
    }

    public final cic f()
    {
        return l.je;
    }

    public void onClickButtonContinue()
    {
        Object obj = new hsj();
        ((hsj) (obj)).a(mPhoneNumberView, k);
        if (!((hsj) (obj)).a().isEmpty())
        {
            return;
        }
        b(getString(0x7f070296));
        if (g.a(dbf.ab))
        {
            j.a("com.uber.SMS_RECEIVER", gjd.a);
        }
        obj = mPhoneNumberView.h();
        String s = mPhoneNumberView.d();
        if (g.a(dbf.Y))
        {
            Object obj1 = f.c();
            if (obj1 != null)
            {
                String s1 = i.z();
                String s2 = ((Client) (obj1)).getFirstName();
                String s3 = ((Client) (obj1)).getLastName();
                obj1 = ((Client) (obj1)).getEmail();
                c.a(s1, s2, s3, ((String) (obj1)), s, ((String) (obj)));
            } else
            {
                e();
                a();
            }
        } else
        {
            h.j(((String) (obj)), s);
        }
        d.a(n.jz);
    }

    public void onClientUpdated(dli dli1)
    {
        if (g.a(dbf.Y))
        {
            return;
        }
        e();
        if (dli1.e())
        {
            e.c(new gjp());
            return;
        } else
        {
            String s = getString(0x7f0702f8);
            dtp.a(d(), 0, null, dli1.a(getActivity()), s);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030212, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        cwz.b(getActivity(), mPhoneNumberView);
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070657));
        cwz.a(getActivity(), mPhoneNumberView);
    }

    public void onUpdateAccountResponseEvent(dnq dnq1)
    {
        e();
        if (dnq1.i())
        {
            e.c(new gjp(((RiderAccount)dnq1.g()).getCurrentMobile(), ((RiderAccount)dnq1.g()).getMobileCountryIso2()));
            return;
        }
        if (dnq1.k())
        {
            if (dnq1.n() >= 500)
            {
                dnq1 = getString(0x7f070631);
            } else
            {
                dnq1 = getString(0x7f070221);
            }
            dtp.a(d(), 0, null, dnq1, getString(0x7f0702f8));
            return;
        } else
        {
            a();
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            view = bundle.getString("arg_mobile_number");
            bundle = bundle.getString("arg_mobile_country");
            mPhoneNumberView.a(view, bundle, true);
            if (TextUtils.isEmpty(view))
            {
                mTextViewNotice.setText(0x7f070655);
            }
        }
    }

}
