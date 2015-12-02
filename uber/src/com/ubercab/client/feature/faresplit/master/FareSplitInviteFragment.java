// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.faresplit.master;

import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import cgh;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.ui.ChipEditText;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.RecentFareSplitter;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.ui.TextView;
import cwz;
import cys;
import czb;
import czj;
import dar;
import dfp;
import djb;
import dkn;
import dlt;
import doc;
import dpg;
import dre;
import dse;
import dsl;
import duj;
import ebl;
import ebm;
import ebp;
import ebq;
import ebu;
import ebv;
import ebw;
import ebx;
import ebz;
import eci;
import gmg;
import hkm;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FareSplitInviteFragment extends czb
    implements android.widget.AdapterView.OnItemClickListener, dse
{

    public cev c;
    public hkr d;
    public hku e;
    public gmg f;
    public cys g;
    public cgh h;
    public dpg i;
    public dkn j;
    public hkm k;
    private ebp l;
    private ebq m;
    public ChipEditText mEditTextInvitees;
    ListView mListView;
    public TextView mTextViewFeeNotice;
    TextView mTextViewLimitReached;
    private ebz n;
    private MenuItem o;
    private dsl p;
    private icl q;
    private icl r;

    public FareSplitInviteFragment()
    {
    }

    private void a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mEditTextInvitees.b().iterator(); iterator.hasNext(); arraylist.add(((com.ubercab.client.core.ui.ChipEditText.Chip)iterator.next()).b().getString("number"))) { }
        cwz.b(getActivity(), mEditTextInvitees);
        a(((List) (arraylist)));
    }

    static void a(FareSplitInviteFragment faresplitinvitefragment)
    {
        faresplitinvitefragment.b();
    }

    public static void a(FareSplitInviteFragment faresplitinvitefragment, City city, FareSplit faresplit, Trip trip)
    {
        faresplitinvitefragment.a(city, faresplit, trip);
    }

    private void a(City city, FareSplit faresplit, Trip trip)
    {
        byte byte0 = 0;
        boolean flag = true;
        if (mEditTextInvitees == null)
        {
            return;
        }
        int i1;
        if (faresplit != null)
        {
            faresplit = faresplit.getClients();
            int j1;
            if (faresplit == null || faresplit.isEmpty())
            {
                i1 = 1;
            } else
            {
                i1 = faresplit.size();
            }
        } else
        {
            i1 = 1;
        }
        j1 = dre.a(city, trip);
        mEditTextInvitees.a(j1 - i1);
        if (i1 + (mEditTextInvitees.b().size() + 1) <= j1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        city = mTextViewLimitReached;
        if (i1 != 0)
        {
            byte0 = 8;
        }
        city.setVisibility(byte0);
        getActivity().invalidateOptionsMenu();
    }

    private void a(ebw ebw1)
    {
        ebw1.a(this);
    }

    private void a(List list)
    {
        b(getString(0x7f07028b));
        if (!i.k())
        {
            j.a(list);
            return;
        } else
        {
            r = k.a(list).a(ico.a()).a(new ebx(this, (byte)0));
            return;
        }
    }

    public static ebq b(FareSplitInviteFragment faresplitinvitefragment)
    {
        return faresplitinvitefragment.m;
    }

    private ebw b(dfp dfp)
    {
        return ebl.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        g();
        l = new ebp(getActivity(), h);
        n = new ebz(getActivity(), h);
        mEditTextInvitees.setHint(getString(0x7f07023e));
        mEditTextInvitees.a(l);
        mEditTextInvitees.a(this);
        ArrayList arraylist = new ArrayList();
        arraylist.add(n);
        arraylist.add(m);
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(getString(0x7f070395));
        arraylist1.add(getString(0x7f0700b0));
        p = new dsl(getActivity(), arraylist, arraylist1);
        p.c(getResources().getDimensionPixelSize(0x7f0800cd));
        mListView.setFastScrollEnabled(true);
        mListView.setDivider(null);
        mListView.setDividerHeight(0);
        mListView.setAdapter(p);
        mListView.setOnItemClickListener(this);
    }

    public static ebz c(FareSplitInviteFragment faresplitinvitefragment)
    {
        return faresplitinvitefragment.n;
    }

    public static ebp d(FareSplitInviteFragment faresplitinvitefragment)
    {
        return faresplitinvitefragment.l;
    }

    private void g()
    {
        if (m != null)
        {
            m.a();
        } else
        {
            m = new ebq(getActivity(), h, 1);
        }
        if (mEditTextInvitees.getAdapter() != null)
        {
            ((ebq)mEditTextInvitees.getAdapter()).a();
            return;
        } else
        {
            mEditTextInvitees.setAdapter(new ebq(getActivity(), h, 0));
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ebw)czj);
    }

    public final void a(Collection collection)
    {
        if (n != null)
        {
            n.a(collection);
        }
        if (m != null)
        {
            m.a(collection);
        }
        collection = d.e();
        if (collection == null)
        {
            collection = null;
        } else
        {
            collection = collection.getFareSplit();
        }
        a(d.b(), ((FareSplit) (collection)), d.f());
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100002, menu);
        o = menu.findItem(0x7f0e06ae);
        o.setTitle(getString(0x7f0703d8));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030069, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onFareSplitInviteResponse(dlt dlt1)
    {
        e();
        if (!dlt1.e())
        {
            return;
        } else
        {
            mEditTextInvitees.setText("");
            c.c(new eci());
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = ((AdapterView) (p.getItem(i1)));
        if (!(adapterview instanceof RecentFareSplitter)) goto _L2; else goto _L1
_L1:
        view = (RecentFareSplitter)adapterview;
        adapterview = view.getMobileDigits();
        view = view.getMobileCountryIso2();
        if (TextUtils.isEmpty(adapterview) || TextUtils.isEmpty(view)) goto _L4; else goto _L3
_L3:
        adapterview = duj.c(adapterview, view);
_L6:
        view = mEditTextInvitees.b(adapterview);
        if (view != null)
        {
            mEditTextInvitees.a(view);
            return;
        } else
        {
            mEditTextInvitees.a(adapterview);
            return;
        }
_L2:
        if (adapterview instanceof Cursor)
        {
            adapterview = (Cursor)adapterview;
            adapterview = adapterview.getString(adapterview.getColumnIndex("data1"));
            continue; /* Loop/switch isn't completed */
        }
_L4:
        adapterview = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06ae && !mEditTextInvitees.a())
        {
            a();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
        q.b();
        if (r != null)
        {
            r.b();
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!i.n())
        {
            dar1 = dar1.a();
            Client client = dar1.getClient();
            com.ubercab.client.core.model.FareSplit faresplit = dar1.getFareSplit();
            if (client != null && faresplit != null)
            {
                mTextViewFeeNotice.setText(client.getFareSplitFeeString());
                if (m != null)
                {
                    m.a(faresplit);
                }
                if (n != null)
                {
                    n.a(client, faresplit);
                }
                if (l != null)
                {
                    l.a(client);
                }
                a(dar1.getCity(), faresplit, dar1.getTrip());
                return;
            }
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
label0:
        {
            boolean flag2 = false;
            super.onPrepareOptionsMenu(menu);
            if (mEditTextInvitees == null || mEditTextInvitees.d() == -1)
            {
                o.setEnabled(false);
                return;
            }
            boolean flag;
            int i1;
            int j1;
            boolean flag1;
            if (!TextUtils.isEmpty(mEditTextInvitees.c()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i1 = mEditTextInvitees.d();
            j1 = mEditTextInvitees.b().size();
            menu = o;
            if (j1 <= 0)
            {
                flag1 = flag2;
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = flag2;
            if (j1 <= i1)
            {
                flag1 = true;
            }
        }
        menu.setEnabled(flag1);
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070442));
        q = ica.a(e.b(), e.d(), e.f(), e.g(), e.h(), new ebv((byte)0)).a(ico.a()).c(new ebu(this, (byte)0));
        g();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = d();
        if (view == null || g.a("android.permission.READ_CONTACTS"))
        {
            b();
            return;
        } else
        {
            g.a(view, new doc() {

                final FareSplitInviteFragment a;

                public final void a(Map map, boolean flag)
                {
                    FareSplitInviteFragment.a(a);
                }

            
            {
                a = FareSplitInviteFragment.this;
                super();
            }
            }, new String[] {
                "android.permission.READ_CONTACTS"
            });
            return;
        }
    }
}
