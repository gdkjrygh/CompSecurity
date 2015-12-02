// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet.contactpicker;

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
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import cgh;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.ui.ChipEditText;
import com.ubercab.ui.TextView;
import cwz;
import cys;
import czb;
import czj;
import dab;
import dfp;
import djb;
import doc;
import dse;
import dsi;
import dsl;
import dun;
import few;
import fex;
import fez;
import ffa;
import ffb;
import gke;
import gmg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ContactPickerFragment extends czb
    implements dse
{

    public cev c;
    public gmg d;
    public cys e;
    public cgh f;
    private boolean g;
    private boolean h;
    private int i;
    private List j;
    private MenuItem k;
    private dsi l;
    private dsl m;
    ChipEditText mEditTextInvitees;
    ListView mListView;
    TextView mTextViewLimitReached;
    View mViewPermissionDenied;
    private few n;

    public ContactPickerFragment()
    {
        i = 5;
        j = new ArrayList();
    }

    public static ContactPickerFragment a(int i1, ArrayList arraylist)
    {
        ContactPickerFragment contactpickerfragment = new ContactPickerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("max_chips", i1);
        bundle.putStringArrayList("selected_clients", arraylist);
        contactpickerfragment.setArguments(bundle);
        return contactpickerfragment;
    }

    private void a()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        Object obj;
        for (Iterator iterator = mEditTextInvitees.b().iterator(); iterator.hasNext(); arraylist.add((new dab()).a(s).c(((String) (obj))).a()))
        {
            obj = (com.ubercab.client.core.ui.ChipEditText.Chip)iterator.next();
            s = ((com.ubercab.client.core.ui.ChipEditText.Chip) (obj)).b().getString("name");
            obj = ((com.ubercab.client.core.ui.ChipEditText.Chip) (obj)).b().getString("number");
        }

        cwz.b(getActivity(), mEditTextInvitees);
        c.c(new ffb(arraylist));
    }

    static void a(ContactPickerFragment contactpickerfragment, boolean flag)
    {
        contactpickerfragment.a(flag);
    }

    private void a(fex fex1)
    {
        fex1.a(this);
    }

    private void a(boolean flag)
    {
        byte byte0 = 8;
        if (h && g == flag)
        {
            return;
        }
        h = true;
        g = flag;
        Object obj;
        int i1;
        if (flag)
        {
            n = new few(getActivity(), f, true);
            n.b(j);
            mEditTextInvitees.setAdapter(new few(getActivity(), f, false));
            gke gke1 = gke.a(n);
            gke gke2 = gke.a(getString(0x7f0700b0));
            m = new dsl(getActivity(), gke1, gke2);
            m.c(getResources().getDimensionPixelSize(0x7f0800cd));
        } else
        {
            n = null;
            m = null;
            mEditTextInvitees.setAdapter(null);
        }
        mListView.setAdapter(m);
        obj = mListView;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((ListView) (obj)).setVisibility(i1);
        obj = mViewPermissionDenied;
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        b();
    }

    private fex b(dfp dfp)
    {
        return fez.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
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
        if (n != null)
        {
            n.notifyDataSetChanged();
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fex)czj);
    }

    public final void a(Collection collection)
    {
        if (n != null)
        {
            n.c(collection);
        }
        b();
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

    public void onClickSettings()
    {
        dun.a(getActivity());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            i = bundle.getInt("max_chips", 5);
            j = bundle.getStringArrayList("selected_clients");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100010, menu);
        k = menu.findItem(0x7f0e06bb);
        k.setTitle(getString(0x7f07003a));
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
        Object obj = (Cursor)m.getItem(i1);
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
        com.ubercab.client.core.ui.ChipEditText.Chip chip = mEditTextInvitees.b(((String) (obj)));
        if (chip != null)
        {
            mEditTextInvitees.a(chip);
        } else
        {
            mEditTextInvitees.a(((String) (obj)));
        }
        b();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06bb && !mEditTextInvitees.a())
        {
            a();
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
            boolean flag2 = false;
            super.onPrepareOptionsMenu(menu);
            if (mEditTextInvitees.d() == -1)
            {
                k.setEnabled(false);
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
            menu = k;
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
        d().b().a(getString(0x7f0703b4).toUpperCase());
        if (h)
        {
            a(e.a("android.permission.READ_CONTACTS"));
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        l = new dsi(getActivity());
        mEditTextInvitees.a(l);
        mEditTextInvitees.a(i);
        mEditTextInvitees.a(this);
        mListView.setFastScrollEnabled(true);
        view = d();
        if (e.a("android.permission.READ_CONTACTS") || view == null)
        {
            a(true);
            return;
        } else
        {
            e.a(view, new doc() {

                final ContactPickerFragment a;

                public final void a(Map map, boolean flag)
                {
                    ContactPickerFragment.a(a, flag);
                }

            
            {
                a = ContactPickerFragment.this;
                super();
            }
            }, new String[] {
                "android.permission.READ_CONTACTS"
            });
            return;
        }
    }
}
