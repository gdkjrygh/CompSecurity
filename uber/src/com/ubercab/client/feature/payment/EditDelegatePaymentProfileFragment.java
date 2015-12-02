// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dar;
import dfp;
import djb;
import dpg;
import dul;
import eom;
import eon;
import epf;
import epg;
import eri;
import hkr;
import hku;
import ica;
import icl;

public class EditDelegatePaymentProfileFragment extends czb
{

    public cev c;
    public hkr d;
    public hku e;
    public dpg f;
    public String g;
    private icl h;
    TextView mTextViewNoEditMessage;
    TextView mTextViewPaymentProfileName;

    public EditDelegatePaymentProfileFragment()
    {
    }

    public static EditDelegatePaymentProfileFragment a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("payment_profile_id", s);
        s = new EditDelegatePaymentProfileFragment();
        s.setArguments(bundle);
        return s;
    }

    private void a(epg epg1)
    {
        epg1.a(this);
    }

    private epg b(dfp dfp)
    {
        return eom.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((epg)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            g = bundle.getString("payment_profile_id");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030108, viewgroup, false);
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
        h.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (!f.n())
        {
            dar1 = dar1.a();
            if (!dul.k(dar1))
            {
                c.c(new eri());
                return;
            }
            if (dar1.getClient().findPaymentProfileByUuid(g) == null)
            {
                c.c(new eri());
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        h = e.d().c(new epf(this, (byte)0));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        view = d.c();
        if (view != null)
        {
            view = view.findPaymentProfileByUuid(g);
        } else
        {
            view = null;
        }
        if (view != null)
        {
            mTextViewPaymentProfileName.setText(view.getAccountName());
        }
        mTextViewNoEditMessage.setText(getString(0x7f0701ce));
        view = d().b();
        view.a(getString(0x7f070328));
        view.d(false);
        view.c(true);
        view.b(true);
        view.a(true);
    }
}
