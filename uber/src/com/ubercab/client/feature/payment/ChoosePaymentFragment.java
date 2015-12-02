// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.signup.payment.ExpandablePaymentTypeAdapter;
import com.ubercab.client.feature.signup.payment.PaymentTypeAdapter;
import com.ubercab.payment.model.PaymentAddOptions;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.rider.realtime.model.Client;
import czb;
import czj;
import dce;
import dfp;
import djb;
import doa;
import dpg;
import duh;
import duo;
import enw;
import enx;
import eny;
import eoi;
import eoj;
import gmg;
import gsa;
import hkm;
import hkr;
import ica;
import java.util.List;
import l;
import n;

public class ChoosePaymentFragment extends czb
{

    public chp c;
    public hkr d;
    public gmg e;
    public dpg f;
    public dce g;
    public doa h;
    public hkm i;
    ListView mListViewPayments;

    public ChoosePaymentFragment()
    {
    }

    public static ChoosePaymentFragment a()
    {
        return new ChoosePaymentFragment();
    }

    private void a(enx enx1)
    {
        enx1.a(this);
    }

    private enw b()
    {
        return (enw)getActivity();
    }

    private enx b(dfp dfp)
    {
        return eoi.a().a(new eny()).a(dfp).a(new djb(this)).a();
    }

    private List g()
    {
        Client client = d.c();
        if (client != null)
        {
            return h.a(getActivity(), g.a(), client);
        } else
        {
            return null;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((enx)czj);
    }

    public final cic f()
    {
        return l.dM;
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        super.onActivityResult(j, k, intent);
        if (j == 1 && k == -1)
        {
            if (f.n())
            {
                i.a().b(duo.a());
            }
            getActivity().finish();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030112, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onListItemClickPayments(int j)
    {
        gsa gsa1;
        PaymentUserInfo paymentuserinfo;
        Object obj;
        String s;
        boolean flag;
        flag = false;
        if (duh.a(e, g()))
        {
            ExpandablePaymentTypeAdapter expandablepaymenttypeadapter = (ExpandablePaymentTypeAdapter)((HeaderViewListAdapter)mListViewPayments.getAdapter()).getWrappedAdapter();
            if (expandablepaymenttypeadapter.a(j - mListViewPayments.getHeaderViewsCount()))
            {
                expandablepaymenttypeadapter.a();
                c.a(n.B);
                return;
            }
        }
        gsa1 = (gsa)mListViewPayments.getItemAtPosition(j);
        c.a(AnalyticsEvent.create("tap").setName(n.C).setValue(gsa1.a()));
        paymentuserinfo = PaymentUserInfo.create();
        obj = d.c();
        if (obj != null)
        {
            paymentuserinfo.setEmail(((Client) (obj)).getEmail()).setFirstName(((Client) (obj)).getFirstName()).setLastName(((Client) (obj)).getLastName()).setMobile(((Client) (obj)).getMobileDigits()).setMobileCountryIso2(((Client) (obj)).getMobileCountryIso2());
        }
        obj = PaymentAddOptions.create().setCardScanFirst(false);
        s = gsa1.a();
        s.hashCode();
        JVM INSTR lookupswitch 3: default 228
    //                   -1414960566: 302
    //                   -920235116: 269
    //                   106444065: 286;
           goto _L1 _L2 _L3 _L4
_L1:
        j = -1;
_L6:
        switch (j)
        {
        default:
            startActivityForResult(gsa1.a(paymentuserinfo, ((PaymentAddOptions) (obj))), 1);
            return;

        case 0: // '\0'
            if (duh.a(e))
            {
                startActivityForResult(gsa1.a(paymentuserinfo, ((PaymentAddOptions) (obj))), 1);
                return;
            } else
            {
                b().a(gsa1);
                return;
            }

        case 1: // '\001'
        case 2: // '\002'
            b().a(gsa1);
            return;
        }
_L3:
        if (!s.equals("braintree")) goto _L1; else goto _L5
_L5:
        j = ((flag) ? 1 : 0);
          goto _L6
_L4:
        if (!s.equals("paytm")) goto _L1; else goto _L7
_L7:
        j = 1;
          goto _L6
_L2:
        if (!s.equals("alipay")) goto _L1; else goto _L8
_L8:
        j = 2;
          goto _L6
    }

    public void onResume()
    {
        super.onResume();
        getActivity().setTitle(0x7f070328);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
label0:
        {
            super.onViewCreated(view, bundle);
            view = LayoutInflater.from(getActivity()).inflate(0x7f030191, mListViewPayments, false);
            mListViewPayments.addHeaderView(view, null, false);
            if (d.c() != null)
            {
                view = g();
                if (!duh.a(e, view))
                {
                    break label0;
                }
                mListViewPayments.setAdapter(new ExpandablePaymentTypeAdapter(getActivity(), view));
            }
            return;
        }
        mListViewPayments.setAdapter(new PaymentTypeAdapter(getActivity(), view));
    }
}
