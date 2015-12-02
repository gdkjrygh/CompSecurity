// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.core.model.SafetyNetContact;
import com.ubercab.client.core.model.SafetyNetContactBuilder;
import com.ubercab.ui.Button;
import cwm;
import czb;
import czj;
import dfp;
import djb;
import dsl;
import duj;
import fds;
import fdt;
import fee;
import fei;
import fes;
import fev;
import ffb;
import ffd;
import ffg;
import ffj;
import ffk;
import ffn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetContactsAdapter

public class SafetyNetConfiguredShareTripFragment extends czb
{

    public cev c;
    public fei d;
    private boolean e;
    private FrameLayout f;
    private dsl g;
    private SafetyNetContactsAdapter h;
    private SafetyNetContactsAdapter i;
    private Set j;
    private Set k;
    View mListContainer;
    TextView mListContainerFooter;
    ListView mListView;
    ProgressBar mProgressLoading;

    public SafetyNetConfiguredShareTripFragment()
    {
        j = new HashSet();
        k = new HashSet();
    }

    static SafetyNetConfiguredShareTripFragment a()
    {
        return new SafetyNetConfiguredShareTripFragment();
    }

    static Set a(SafetyNetConfiguredShareTripFragment safetynetconfiguredsharetripfragment)
    {
        return safetynetconfiguredsharetripfragment.k;
    }

    private void a(fee fee1)
    {
        fee1.a(this);
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            mListContainerFooter.setText(fev.a(getActivity(), getString(0x7f0703c1), s));
            mListContainerFooter.setMovementMethod(LinkMovementMethod.getInstance());
            mListContainerFooter.setVisibility(0);
        }
    }

    static SafetyNetContactsAdapter b(SafetyNetConfiguredShareTripFragment safetynetconfiguredsharetripfragment)
    {
        return safetynetconfiguredsharetripfragment.h;
    }

    private fee b(dfp dfp)
    {
        return fds.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        List list = d.f();
        fes fes1 = d.h();
        if (list == null || fes1 == null)
        {
            e = false;
            mProgressLoading.setVisibility(0);
            mListContainer.setVisibility(8);
        } else
        {
            i.a(list);
            if (fes1.d())
            {
                if (k.isEmpty())
                {
                    k = new HashSet(list);
                }
                i.c(new ArrayList(k));
            } else
            {
                i.c(fes1.a());
                i.d(fes1.a());
                h.a(fes1.b());
                h.c(fes1.b());
                h.d(fes1.b());
                h.b(new ArrayList(j));
                h.c(new ArrayList(k));
            }
            mListView.addFooterView(f);
            mListView.setAdapter(g);
            mListView.removeFooterView(f);
            mListContainer.setVisibility(0);
            mProgressLoading.setVisibility(8);
            e = true;
        }
        g();
    }

    private void g()
    {
        if (e)
        {
            if (h.c().size() < 5)
            {
                h();
            } else
            {
                i();
            }
        }
        getActivity().invalidateOptionsMenu();
    }

    private void h()
    {
        if (mListView.getFooterViewsCount() == 0)
        {
            mListView.addFooterView(f);
        }
    }

    private void i()
    {
        if (mListView.getFooterViewsCount() != 0)
        {
            mListView.removeFooterView(f);
        }
    }

    private List j()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(i.c());
        arraylist.addAll(h.c());
        return arraylist;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fee)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle != null)
        {
            ArrayList arraylist = bundle.getParcelableArrayList("pending_contacts");
            bundle = bundle.getParcelableArrayList("selected_contacts");
            j = new HashSet(arraylist);
            k = new HashSet(bundle);
        }
        setHasOptionsMenu(true);
    }

    public void onContactsAddedEvent(ffb ffb1)
    {
        String s = d.m();
        ffb1 = ffb1.a();
        if (ffb1 != null)
        {
            Object obj;
            for (ffb1 = ffb1.iterator(); ffb1.hasNext(); k.add(obj))
            {
                obj = (Contact)ffb1.next();
                String s1 = duj.c(((Contact) (obj)).b(), s);
                obj = (new SafetyNetContactBuilder()).setName(((Contact) (obj)).a()).setPhone(s1).build();
                j.add(obj);
            }

            if (e)
            {
                h.b(new ArrayList(j));
                h.c(new ArrayList(k));
            }
        }
        g();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100012, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f030169, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        f = (FrameLayout)layoutinflater.inflate(0x7f03016b, mListView, false);
        layoutinflater = (Button)f.findViewById(0x7f0e0443);
        layoutinflater.setText(getString(0x7f0703b4).toUpperCase());
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            final SafetyNetConfiguredShareTripFragment a;

            public final void onClick(View view)
            {
                view = new ArrayList();
                for (Iterator iterator = SafetyNetConfiguredShareTripFragment.a(a).iterator(); iterator.hasNext(); view.add(((SafetyNetContact)iterator.next()).getPhone())) { }
                a.c.c(new ffd(5 - SafetyNetConfiguredShareTripFragment.b(a).c().size(), view));
            }

            
            {
                a = SafetyNetConfiguredShareTripFragment.this;
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

    public void onItemClicked(int l)
    {
        int i1 = g.a(l);
        Object obj;
        if (i1 >= 0)
        {
            if ((obj = g.getItem(l)) instanceof SafetyNetContact)
            {
                obj = (SafetyNetContact)obj;
                switch (i1)
                {
                default:
                    return;

                case 0: // '\0'
                    if (i.b(((SafetyNetContact) (obj))))
                    {
                        k.remove(obj);
                    } else
                    {
                        k.add(obj);
                    }
                    i.a(((SafetyNetContact) (obj)));
                    g();
                    return;

                case 1: // '\001'
                    break;
                }
                if (!h.b(((SafetyNetContact) (obj))))
                {
                    if (h.c().size() < 5)
                    {
                        k.add(obj);
                        h.a(((SafetyNetContact) (obj)));
                    } else
                    {
                        cwm.a(getActivity(), 0x7f0703b7);
                    }
                } else
                {
                    k.remove(obj);
                    h.a(((SafetyNetContact) (obj)));
                }
                g();
                return;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (0x7f0e06bd == menuitem.getItemId())
        {
            c.c(new ffn(j()));
            return true;
        } else
        {
            return false;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        boolean flag = false;
        super.onPrepareOptionsMenu(menu);
        menu = menu.findItem(0x7f0e06bd);
        if (e)
        {
            if (d.e() < j().size())
            {
                flag = true;
            }
            menu.setEnabled(flag);
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
        d().b().a(getString(0x7f0703c0).toUpperCase());
        b();
        a(d.i());
    }

    public void onSafetyNetContactsUpdatedEvent(ffg ffg)
    {
        if (!e)
        {
            b();
        }
    }

    public void onSafetyNetShareTripContactsUpdatedEvent(ffk ffk)
    {
        if (!e)
        {
            b();
        }
    }

    public void onSafetyNetShareTripUrlUpdatedEvent(ffj ffj1)
    {
        a(ffj1.a());
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("pending_contacts", new ArrayList(j));
        bundle.putParcelableArrayList("selected_contacts", new ArrayList(k));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = new ArrayList();
        bundle = new ArrayList();
        i = new SafetyNetContactsAdapter(d(), c);
        i.a(getString(0x7f0703bc));
        i.b();
        h = new SafetyNetContactsAdapter(d(), c);
        h.a(getString(0x7f0703bd));
        h.b();
        view.add(getString(0x7f0703c5).toUpperCase());
        view.add(getString(0x7f0703c4).toUpperCase());
        bundle.add(i);
        bundle.add(h);
        g = new dsl(getActivity(), bundle, view);
    }
}
