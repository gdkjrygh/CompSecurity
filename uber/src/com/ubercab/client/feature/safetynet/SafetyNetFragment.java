// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.SafetyNetContact;
import com.ubercab.ui.Button;
import czb;
import czj;
import dfp;
import djb;
import dsl;
import fdu;
import fdv;
import feg;
import fei;
import ffd;
import ffg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetContactsAdapter

public class SafetyNetFragment extends czb
{

    public cev c;
    public fei d;
    private boolean e;
    private boolean f;
    private FrameLayout g;
    private dsl h;
    private SafetyNetContactsAdapter i;
    View mListContainer;
    ListView mListView;
    ProgressBar mProgressLoading;

    public SafetyNetFragment()
    {
    }

    static SafetyNetFragment a()
    {
        return new SafetyNetFragment();
    }

    private void a(feg feg1)
    {
        feg1.a(this);
    }

    private feg b(dfp dfp)
    {
        return fdu.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        if (d.f() == null)
        {
            f = false;
            mListContainer.setVisibility(8);
            mProgressLoading.setVisibility(0);
        } else
        {
            i.a(d.f());
            mListView.addFooterView(g);
            mListView.setAdapter(h);
            mListView.removeFooterView(g);
            mListContainer.setVisibility(0);
            mProgressLoading.setVisibility(8);
            f = true;
        }
        g();
    }

    private void g()
    {
        h();
        if (f)
        {
            if (!i.a() || e && d.c())
            {
                i();
            } else
            {
                j();
            }
            i.a(e);
        }
        getActivity().invalidateOptionsMenu();
    }

    private void h()
    {
        boolean flag;
        if (i.a())
        {
            flag = e;
        } else
        {
            flag = false;
        }
        e = flag;
    }

    private void i()
    {
        if (mListView.getFooterViewsCount() == 0)
        {
            mListView.addFooterView(g);
        }
    }

    private void j()
    {
        if (mListView.getFooterViewsCount() != 0)
        {
            mListView.removeFooterView(g);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((feg)czj);
    }

    public final cic f()
    {
        return l.gh;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100011, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f030169, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        g = (FrameLayout)layoutinflater.inflate(0x7f03016b, mListView, false);
        ((Button)g.findViewById(0x7f0e0443)).setOnClickListener(new android.view.View.OnClickListener() {

            final SafetyNetFragment a;

            public final void onClick(View view)
            {
                view = new ArrayList();
                for (Iterator iterator = a.d.f().iterator(); iterator.hasNext(); view.add(((SafetyNetContact)iterator.next()).getPhone())) { }
                a.c.c(new ffd(a.d.d(), view));
            }

            
            {
                a = SafetyNetFragment.this;
                super();
            }
        });
        return viewgroup;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        if (0x7f0e06bc == menuitem.getItemId())
        {
            if (!e)
            {
                flag = true;
            }
            e = flag;
            g();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        menu = menu.findItem(0x7f0e06bc);
        if (f && i.a())
        {
            int k;
            if (e)
            {
                k = 0x7f0701e4;
            } else
            {
                k = 0x7f0701f4;
            }
            menu.setTitle(getString(k));
            menu.setVisible(true);
            return;
        } else
        {
            menu.setVisible(false);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        String s = getString(0x7f0703c5).toUpperCase();
        d().b().a(s);
        b();
    }

    public void onSafetyNetContactsUpdatedEvent(ffg ffg)
    {
        if (!f)
        {
            b();
        }
        i.a(d.f());
        g();
    }

    public void onStart()
    {
        super.onStart();
        e = false;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = new ArrayList();
        bundle = new ArrayList();
        view.add(getString(0x7f0703c5));
        i = new SafetyNetContactsAdapter(d(), c);
        i.a(getString(0x7f0703bc));
        bundle.add(i);
        h = new dsl(getActivity(), bundle, view);
    }
}
