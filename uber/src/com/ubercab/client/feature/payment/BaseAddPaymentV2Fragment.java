// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.signup.LegalActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import cwz;
import czb;
import czj;
import dce;
import dfp;
import djb;
import doa;
import enr;
import ens;
import eog;
import eoh;
import gjy;
import gka;
import gki;
import gmg;
import gsa;
import hkr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentTypeV2Adapter

public abstract class BaseAddPaymentV2Fragment extends czb
{

    public chp c;
    public cev d;
    public hkr e;
    public gmg f;
    public doa g;
    public dce h;
    private PaymentTypeV2Adapter i;
    private PromoViewFooter j;
    Button mButtonLegal;
    Button mButtonSkip;
    ListView mListViewPaymentTypes;
    TextView mTextViewHeader;
    ViewGroup mViewGroupLegal;

    public BaseAddPaymentV2Fragment()
    {
    }

    private void a(enr enr1)
    {
        enr1.a(this);
    }

    private enr b(dfp dfp)
    {
        return eog.a().a(new ens()).a(dfp).a(new djb(this)).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((enr)czj);
    }

    public abstract void a(gsa gsa1);

    public final void a(String s, String s1, String s2)
    {
        if (j != null)
        {
            j.a(s, s1, s2);
        }
    }

    public abstract boolean a(gmg gmg);

    public final cic f()
    {
        return RiderActivity.a;
    }

    public abstract boolean g();

    public abstract boolean h();

    public abstract List i();

    public void j()
    {
    }

    public final void k()
    {
        c.a(n.cz);
    }

    public final void l()
    {
        c.a(l.ek);
    }

    public n m()
    {
        return null;
    }

    public final cev n()
    {
        return d;
    }

    public final doa o()
    {
        return g;
    }

    protected void onClickLegalInfo()
    {
        if (m() != null)
        {
            c.a(m());
        }
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/signup/LegalActivity));
    }

    protected void onClickPaymentTypeListItem(int i1)
    {
        int j1 = mListViewPaymentTypes.getHeaderViewsCount();
        if (i1 < j1)
        {
            return;
        }
        if (g() && i1 == j1 + i.getCount())
        {
            j();
            return;
        } else
        {
            gsa gsa1 = (gsa)mListViewPaymentTypes.getItemAtPosition(i1);
            c.a(AnalyticsEvent.create("tap").setName(n.cA).setValue(gsa1.a()));
            a(gsa1);
            return;
        }
    }

    public void onClickSkipButton()
    {
        c.a(n.cB);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030070, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        viewgroup = (TextView)LayoutInflater.from(getActivity()).inflate(0x7f03012a, null, false);
        viewgroup.setText(0x7f07032e);
        mListViewPaymentTypes.addHeaderView(viewgroup);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onResume()
    {
        super.onResume();
        getActivity().setTitle(0x7f070330);
        cwz.a(getActivity());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        bundle = i();
        if (gki.d(bundle, new gka() {

        final BaseAddPaymentV2Fragment a;

        private static boolean a(gsa gsa1)
        {
            return "cash".equals(gsa1.a());
        }

        public final boolean apply(Object obj)
        {
            return a((gsa)obj);
        }

            
            {
                a = BaseAddPaymentV2Fragment.this;
                super();
            }
    }).b())
        {
            mTextViewHeader.setText(0x7f07032d);
        } else
        {
            mTextViewHeader.setText(0x7f07032c);
        }
        i = new PaymentTypeV2Adapter(getContext(), bundle);
        mListViewPaymentTypes.setAdapter(i);
        if (a(f))
        {
            mButtonSkip.setVisibility(0);
        }
        if (g())
        {
            j = new PromoViewFooter(getActivity());
            j.a();
            mListViewPaymentTypes.addFooterView(j);
        }
        if (h())
        {
            mButtonLegal.setPaintFlags(mButtonLegal.getPaintFlags() | 8);
            mViewGroupLegal.setVisibility(0);
        }
        view = new ArrayList();
        for (bundle = bundle.iterator(); bundle.hasNext(); view.add(((gsa)bundle.next()).a())) { }
        c.a(AnalyticsEvent.create("impression").setName(l.ej).setValue(TextUtils.join(":", view)));
    }

    public final String p()
    {
        return h.a();
    }

    private class PromoViewFooter extends RelativeLayout
    {

        public cgh a;
        final BaseAddPaymentV2Fragment b;
        private final chc c = new gel(getResources(), 0x7f0d0089);
        ImageView imageViewIcon;
        TextView textViewDescription;
        TextView textViewTitleNoPromo;
        TextView textViewTitlePromo;

        private void b()
        {
            inflate(getContext(), 0x7f030129, this);
            ButterKnife.inject(this);
            if (!isInEditMode())
            {
                ((RiderApplication)getContext().getApplicationContext()).b().a(this);
            }
        }

        public final void a()
        {
            imageViewIcon.setImageDrawable(getResources().getDrawable(0x7f02018a));
            textViewTitleNoPromo.setText(0x7f07021a);
            textViewTitlePromo.setText(null);
            textViewDescription.setText(null);
            textViewTitleNoPromo.setVisibility(0);
            textViewTitlePromo.setVisibility(8);
            textViewDescription.setVisibility(8);
        }

        public final void a(String s, String s1, String s2)
        {
            a.a(s).a().a(c).a(imageViewIcon);
            textViewTitleNoPromo.setText(null);
            textViewTitlePromo.setText(s1);
            textViewDescription.setText(s2);
            textViewTitleNoPromo.setVisibility(8);
            textViewTitlePromo.setVisibility(0);
            textViewDescription.setVisibility(0);
        }

        public PromoViewFooter(Context context)
        {
            b = BaseAddPaymentV2Fragment.this;
            super(context);
            b();
        }
    }

}
