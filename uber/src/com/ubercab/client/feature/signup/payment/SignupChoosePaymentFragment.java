// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.payment;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.signup.LegalActivity;
import com.ubercab.client.feature.signup.PromoBarFragment;
import com.ubercab.client.feature.signup.SignupData;
import com.ubercab.client.feature.signup.SignupPromoFragment;
import czb;
import czj;
import dbf;
import dce;
import dfp;
import djb;
import doa;
import dsl;
import duh;
import fln;
import flz;
import fne;
import fni;
import fnj;
import fnk;
import gjv;
import gjw;
import gka;
import gke;
import gki;
import gkk;
import gmg;
import gsa;
import gxz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.signup.payment:
//            PaymentTypeAdapter, ExpandablePaymentTypeAdapter, CashPaymentTypeAdapter

public class SignupChoosePaymentFragment extends czb
    implements fln, flz
{

    public chp c;
    public cev d;
    public gmg e;
    public dce f;
    public doa g;
    private PromoBarFragment h;
    private SignupData i;
    private List j;
    ListView mListViewPayments;

    public SignupChoosePaymentFragment()
    {
    }

    public static SignupChoosePaymentFragment a(SignupData signupdata)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("signup_data", signupdata);
        signupdata = new SignupChoosePaymentFragment();
        signupdata.setArguments(bundle);
        return signupdata;
    }

    private void a(fnk fnk1)
    {
        fnk1.a(this);
    }

    private fnk b(dfp dfp)
    {
        return fni.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        View view = LayoutInflater.from(getActivity()).inflate(0x7f030191, mListViewPayments, false);
        mListViewPayments.addHeaderView(view, null, false);
        j = i();
        mListViewPayments.setAdapter(new PaymentTypeAdapter(getActivity(), j));
    }

    private void g()
    {
        View view = LayoutInflater.from(getActivity()).inflate(0x7f030191, mListViewPayments, false);
        mListViewPayments.addHeaderView(view, null, false);
        mListViewPayments.setAdapter(new ExpandablePaymentTypeAdapter(getActivity(), i()));
    }

    private void h()
    {
        j = gkk.a(gki.a(i(), new gka() {

            final SignupChoosePaymentFragment a;

            private static boolean a(gsa gsa1)
            {
                return !(gsa1 instanceof gxz);
            }

            public final boolean apply(Object obj2)
            {
                return a((gsa)obj2);
            }

            
            {
                a = SignupChoosePaymentFragment.this;
                super();
            }
        }));
        Object obj = new PaymentTypeAdapter(getActivity(), new ArrayList(j));
        j.add(new gxz(getActivity()));
        obj = gke.a(obj, new CashPaymentTypeAdapter(getActivity(), Collections.singletonList(new gxz(getActivity())), e));
        Object obj1 = getString(0x7f0701de);
        String s = getString(0x7f070309);
        obj1 = Arrays.asList(new String[] {
            ((String) (obj1)).toUpperCase(), s.toUpperCase()
        });
        obj = new dsl(getActivity(), ((List) (obj)), ((List) (obj1)));
        ((dsl) (obj)).c(getResources().getDimensionPixelSize(0x7f0800cd));
        mListViewPayments.setFastScrollEnabled(true);
        mListViewPayments.setDivider(null);
        mListViewPayments.setDividerHeight(0);
        mListViewPayments.setAdapter(((android.widget.ListAdapter) (obj)));
    }

    private List i()
    {
        return g.a(getActivity(), f.a(), i.c());
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        c.a(n.fV);
    }

    public final void a(com.ubercab.client.feature.signup.SignupData.PromoCode promocode)
    {
        if (promocode != null)
        {
            i.a(promocode);
        }
    }

    public final volatile void a(czj czj)
    {
        a((fnk)czj);
    }

    public final boolean a(int i1, int j1, Bundle bundle)
    {
        if (i1 == 100 && j1 == -1)
        {
            c.a(k.h);
            i = (SignupData)bundle.getParcelable("signup_data");
            h.a(i.h());
            return true;
        } else
        {
            return false;
        }
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClickLegal()
    {
        c.a(n.gr);
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/signup/LegalActivity));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        bundle = getArguments();
        if (bundle != null)
        {
            i = (SignupData)bundle.getParcelable("signup_data");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100017, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030189, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        android.support.v4.app.Fragment fragment = getChildFragmentManager().findFragmentById(0x7f0e04b4);
        if (fragment != null)
        {
            getChildFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
        }
    }

    public void onListItemClickPayments(int i1)
    {
        if (duh.a(e, i()))
        {
            ExpandablePaymentTypeAdapter expandablepaymenttypeadapter = (ExpandablePaymentTypeAdapter)((HeaderViewListAdapter)mListViewPayments.getAdapter()).getWrappedAdapter();
            if (expandablepaymenttypeadapter.a(i1 - mListViewPayments.getHeaderViewsCount()))
            {
                expandablepaymenttypeadapter.a();
                return;
            }
        }
        gsa gsa1 = (gsa)mListViewPayments.getItemAtPosition(i1);
        c.a(AnalyticsEvent.create("tap").setName(n.fW).setValue(gsa1.a()));
        d.c(new fne(gsa1, i));
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131625657 2131625657: default 24
    //                   2131625657 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        c.a(n.gs);
        SignupPromoFragment.a(i, false).show(getFragmentManager(), com/ubercab/client/feature/signup/SignupPromoFragment.getName());
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onResume()
    {
        super.onResume();
        getActivity().setTitle(0x7f070328);
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.gZ);
        if (j != null)
        {
            analyticsevent.setValue(gjw.a(":").a(gki.a(j, new gjv() {

                final SignupChoosePaymentFragment a;

                private static String a(gsa gsa1)
                {
                    return gsa1.a();
                }

                public final Object apply(Object obj)
                {
                    return a((gsa)obj);
                }

            
            {
                a = SignupChoosePaymentFragment.this;
                super();
            }
            })));
        }
        c.a(analyticsevent);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (e.a(dbf.aW) && e.a(dbf.m))
        {
            h();
        } else
        if (duh.a(e, i()))
        {
            g();
        } else
        {
            b();
        }
        h = (PromoBarFragment)getChildFragmentManager().findFragmentById(0x7f0e04b4);
        h.a(this);
        h.a(i.h());
        h.a();
    }
}
