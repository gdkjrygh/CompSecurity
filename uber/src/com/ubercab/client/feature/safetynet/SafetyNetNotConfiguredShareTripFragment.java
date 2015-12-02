// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.content.res.Resources;
import android.database.Cursor;
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
import android.widget.ListView;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cev;
import cgh;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.SafetyNetContact;
import com.ubercab.client.core.model.SafetyNetContactBuilder;
import com.ubercab.client.core.ui.ChipEditText;
import com.ubercab.client.feature.safetynet.contactpicker.ContactPickerNoPermissionAdapter;
import com.ubercab.ui.TextView;
import cwz;
import cys;
import czb;
import czj;
import dfp;
import djb;
import doc;
import dse;
import dsi;
import dsl;
import duj;
import dun;
import fdw;
import fdx;
import fei;
import fel;
import fen;
import fes;
import fev;
import few;
import ffc;
import ffj;
import ffk;
import ffn;
import gke;
import gmg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l;

public class SafetyNetNotConfiguredShareTripFragment extends czb
    implements dse
{

    public chp c;
    public cev d;
    public gmg e;
    public cys f;
    public cgh g;
    public fei h;
    private int i;
    private boolean j;
    private Boolean k;
    private MenuItem l;
    private dsl m;
    View mContactPickerView;
    ChipEditText mEditTextInvitees;
    TextView mFooterView;
    ListView mListView;
    ProgressBar mProgressLoading;
    TextView mTextViewLimitReached;
    View mViewPermissionDenied;
    private fen n;
    private few o;

    public SafetyNetNotConfiguredShareTripFragment()
    {
    }

    static Boolean a(SafetyNetNotConfiguredShareTripFragment safetynetnotconfiguredsharetripfragment, Boolean boolean1)
    {
        safetynetnotconfiguredsharetripfragment.k = boolean1;
        return boolean1;
    }

    private void a()
    {
        gke gke1;
        List list;
        if (k != null && k.booleanValue())
        {
            o = new few(getActivity(), g, true);
            mEditTextInvitees.setAdapter(new few(getActivity(), g, false));
            gke1 = gke.a(n, o);
        } else
        {
            o = null;
            mEditTextInvitees.setAdapter(null);
            gke1 = gke.a(n, new ContactPickerNoPermissionAdapter(getActivity(), d));
        }
        list = Arrays.asList(new String[] {
            getString(0x7f0703bf).toUpperCase(), getString(0x7f0703c9).toUpperCase()
        });
        m = new dsl(getActivity(), gke1, list);
        m.c(getResources().getDimensionPixelSize(0x7f0800cd));
    }

    static void a(SafetyNetNotConfiguredShareTripFragment safetynetnotconfiguredsharetripfragment)
    {
        safetynetnotconfiguredsharetripfragment.a();
    }

    private void a(fel fel1)
    {
        fel1.a(this);
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            mFooterView.setText(fev.a(getActivity(), getString(0x7f0703c1), s));
            mFooterView.setMovementMethod(LinkMovementMethod.getInstance());
            mFooterView.setVisibility(0);
        }
    }

    private fel b(dfp dfp)
    {
        return fdw.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        String s = h.m();
        ArrayList arraylist = new ArrayList();
        String s1;
        Object obj;
        for (Iterator iterator = mEditTextInvitees.b().iterator(); iterator.hasNext(); arraylist.add((new SafetyNetContactBuilder()).setName(s1).setPhone(((String) (obj))).build()))
        {
            obj = (com.ubercab.client.core.ui.ChipEditText.Chip)iterator.next();
            s1 = ((com.ubercab.client.core.ui.ChipEditText.Chip) (obj)).b().getString("name");
            obj = duj.c(((com.ubercab.client.core.ui.ChipEditText.Chip) (obj)).b().getString("number"), s);
        }

        cwz.b(getActivity(), mEditTextInvitees);
        d.c(new ffn(arraylist));
    }

    static void b(SafetyNetNotConfiguredShareTripFragment safetynetnotconfiguredsharetripfragment)
    {
        safetynetnotconfiguredsharetripfragment.g();
    }

    private void g()
    {
        if (h.h() == null || k == null)
        {
            mContactPickerView.setVisibility(8);
            mProgressLoading.setVisibility(0);
            return;
        }
        i = 5;
        List list = h.h().b();
        if (!list.isEmpty())
        {
            n.a(list);
            if (o != null)
            {
                ArrayList arraylist = new ArrayList();
                for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(((SafetyNetContact)iterator.next()).getPhone())) { }
                o.b(arraylist);
            }
            i = i - list.size();
        }
        mEditTextInvitees.a(i);
        mListView.setAdapter(m);
        mContactPickerView.setVisibility(0);
        mProgressLoading.setVisibility(8);
        if (list.isEmpty() && !f.a("android.permission.READ_CONTACTS"))
        {
            mListView.setVisibility(8);
            mViewPermissionDenied.setVisibility(0);
        } else
        {
            mListView.setVisibility(0);
            mViewPermissionDenied.setVisibility(8);
        }
        j = true;
        h();
    }

    private void h()
    {
        int i1 = mEditTextInvitees.b().size();
        TextView textview = mTextViewLimitReached;
        if (i1 < i)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        textview.setVisibility(i1);
        getActivity().invalidateOptionsMenu();
        if (o != null)
        {
            o.notifyDataSetChanged();
        }
        n.notifyDataSetChanged();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fel)czj);
    }

    public final void a(Collection collection)
    {
        if (o != null)
        {
            o.c(collection);
        }
        h();
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100010, menu);
        l = menu.findItem(0x7f0e06bb);
        l.setTitle(getString(0x7f0703d8));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030168, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        mEditTextInvitees.a(null);
        ButterKnife.reset(this);
    }

    public void onItemClick(int i1)
    {
        Object obj = m.getItem(i1);
        if (!(obj instanceof SafetyNetContact)) goto _L2; else goto _L1
_L1:
        obj = ((SafetyNetContact)obj).getPhone();
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        obj = duj.c(((String) (obj)), "");
_L6:
        com.ubercab.client.core.ui.ChipEditText.Chip chip = mEditTextInvitees.b(((String) (obj)));
        if (chip != null)
        {
            mEditTextInvitees.a(chip);
        } else
        {
            mEditTextInvitees.a(((String) (obj)));
        }
        h();
        return;
_L2:
        if (obj instanceof Cursor)
        {
            obj = (Cursor)obj;
            obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
            continue; /* Loop/switch isn't completed */
        }
_L4:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06bb && !mEditTextInvitees.a())
        {
            b();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
label0:
        {
label1:
            {
                boolean flag2 = false;
                super.onPrepareOptionsMenu(menu);
                if (!j)
                {
                    break label0;
                }
                l.setVisible(true);
                if (mEditTextInvitees.d() == -1)
                {
                    l.setEnabled(false);
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
                menu = l;
                if (j1 <= 0)
                {
                    flag1 = flag2;
                    if (!flag)
                    {
                        break label1;
                    }
                }
                flag1 = flag2;
                if (j1 <= i1)
                {
                    flag1 = true;
                }
            }
            menu.setEnabled(flag1);
            return;
        }
        l.setVisible(false);
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f0703c0).toUpperCase());
        c.a(l.gj);
        if (k != null && f.a("android.permission.READ_CONTACTS") != k.booleanValue())
        {
            boolean flag;
            if (!k.booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = Boolean.valueOf(flag);
            j = false;
            a();
            g();
        }
    }

    public void onSafetyNetShareTripContactsUpdatedEvent(ffk ffk)
    {
        if (!j)
        {
            g();
        }
    }

    public void onSafetyNetShareTripUrlUpdatedEvent(ffj ffj1)
    {
        a(ffj1.a());
    }

    public void onSettingsClicked()
    {
        dun.a(getActivity());
    }

    public void onSettingsClickedEvent(ffc ffc)
    {
        dun.a(getActivity());
    }

    public void onStart()
    {
        super.onStart();
        g();
        a(h.i());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        n = new fen(getActivity(), g);
        mEditTextInvitees.a(new dsi(getActivity()));
        mEditTextInvitees.a(this);
        mListView.setFastScrollEnabled(true);
        view = d();
        if (f.a("android.permission.READ_CONTACTS") || view == null)
        {
            k = Boolean.TRUE;
            a();
            return;
        } else
        {
            f.a(view, new doc() {

                final SafetyNetNotConfiguredShareTripFragment a;

                public final void a(Map map, boolean flag)
                {
                    SafetyNetNotConfiguredShareTripFragment.a(a, Boolean.valueOf(flag));
                    SafetyNetNotConfiguredShareTripFragment.a(a);
                    SafetyNetNotConfiguredShareTripFragment.b(a);
                }

            
            {
                a = SafetyNetNotConfiguredShareTripFragment.this;
                super();
            }
            }, new String[] {
                "android.permission.READ_CONTACTS"
            });
            return;
        }
    }
}
