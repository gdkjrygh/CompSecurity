// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.promo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.RiderBalance;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dal;
import dbf;
import dfp;
import djb;
import djw;
import dlw;
import dpg;
import evc;
import evd;
import evh;
import evi;
import gmg;
import hku;
import ica;
import icl;
import l;

// Referenced classes of package com.ubercab.client.feature.payment.promo:
//            TripBalancesAdapter, RealtimeTripBalancesAdapter

public class TripBalancesFragment extends czb
{

    public djw c;
    public cev d;
    public hku e;
    public gmg f;
    public dpg g;
    public dal h;
    public RealtimeTripBalancesAdapter i;
    TripBalancesAdapter j;
    private icl k;
    ListView mListViewBalances;
    TextView mTextViewFooter;

    public TripBalancesFragment()
    {
    }

    public static TripBalancesFragment a()
    {
        return new TripBalancesFragment();
    }

    public static void a(TripBalancesFragment tripbalancesfragment)
    {
        tripbalancesfragment.b();
    }

    private void a(evi evi1)
    {
        evi1.a(this);
    }

    private evi b(dfp dfp)
    {
        return evc.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        boolean flag = g.n();
        if (flag && i != mListViewBalances.getAdapter())
        {
            mListViewBalances.setAdapter(i);
        } else
        if (!flag && j != mListViewBalances.getAdapter())
        {
            mListViewBalances.setAdapter(j);
            return;
        }
    }

    private boolean g()
    {
        return f.a(dbf.aE);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((evi)czj);
    }

    public final cic f()
    {
        return l.ee;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        d().b().a(getString(0x7f07033c).toUpperCase());
    }

    public void onClientEvent(ClientEvent clientevent)
    {
        while (g.n() || g()) 
        {
            return;
        }
        b();
        j.a(clientevent.getClient().getTripBalances());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030125, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        mTextViewFooter.setText(getString(0x7f07033b));
        j = new TripBalancesAdapter(getActivity());
        i = new RealtimeTripBalancesAdapter(getActivity());
        b();
        if (!g.n() && g())
        {
            c.b(h.z());
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onGetCreditBalanceResponseEvent(dlw dlw1)
    {
        if (!dlw1.i())
        {
            d().a_(getString(0x7f0703a9));
        } else
        {
            dlw1 = (RiderBalance)dlw1.g();
            if (dlw1 != null)
            {
                b();
                j.a(dlw1.getTripCreditBalanceStrings());
                return;
            }
        }
    }

    public void onPause()
    {
        super.onPause();
        k.b();
    }

    public void onResume()
    {
        super.onResume();
        k = e.d().c(new evh(this, (byte)0));
    }
}
