// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.contacts;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.ui.ChipEditText;
import com.ubercab.ui.TextView;
import cwz;
import czb;
import dad;
import dae;
import dah;
import dse;
import dsi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.ubercab.client.core.contacts:
//            Contact

public abstract class SelectContactsFragment extends czb
    implements android.widget.AdapterView.OnItemClickListener, dae, dse
{

    public MenuItem c;
    public dad d;
    public dsi e;
    private String f;
    private long g;
    private int h;
    private int i;
    public ChipEditText mInviteesEditText;
    public LinearLayout mLinearLayoutContainer;
    public ListView mListViewContacts;
    protected TextView mTextViewEmptyMessage;
    public TextView mTextViewHeader;

    public SelectContactsFragment()
    {
    }

    public static void a(SelectContactsFragment selectcontactsfragment, String s)
    {
        selectcontactsfragment.a(s);
    }

    private void a(String s)
    {
        if (f != null && f.equals(s))
        {
            return;
        }
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = s;
        }
        f = s1;
        d.getFilter().filter(s);
    }

    public abstract dad a(Context context);

    public final void a()
    {
        if (!isAdded())
        {
            return;
        } else
        {
            mTextViewEmptyMessage.setText(getString(0x7f07040a));
            int j = d.a(g);
            int k = h;
            mListViewContacts.setSelectionFromTop(j - k, -i);
            g = 0L;
            h = 0;
            i = 0;
            return;
        }
    }

    public final void a(Collection collection)
    {
        HashSet hashset = new HashSet();
        for (collection = collection.iterator(); collection.hasNext(); hashset.add(((com.ubercab.client.core.ui.ChipEditText.Chip)collection.next()).c())) { }
        d.a(hashset);
        getActivity().invalidateOptionsMenu();
    }

    public void b()
    {
        ArrayList arraylist = new ArrayList();
        com.ubercab.client.core.ui.ChipEditText.Chip chip;
        for (Iterator iterator = mInviteesEditText.b().iterator(); iterator.hasNext(); arraylist.add(e.a(chip)))
        {
            chip = (com.ubercab.client.core.ui.ChipEditText.Chip)iterator.next();
        }

        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("com.ubercab.CONTACTS", arraylist);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        d().b().a(getString(0x7f070409).toUpperCase());
        cwz.b(getActivity(), mInviteesEditText);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100014, menu);
        c = menu.findItem(0x7f0e06c3);
        c.setEnabled(false);
        c.setTitle(getString(0x7f0703d8));
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030179, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        setHasOptionsMenu(true);
        d = a(getActivity());
        viewgroup = getArguments();
        if (viewgroup != null)
        {
            d.a(viewgroup.getStringArrayList("com.ubercab.EXCLUDE_IDS"));
        }
        d.a(this);
        mListViewContacts.setAdapter(d);
        mListViewContacts.setOnItemClickListener(this);
        mListViewContacts.setEmptyView(mTextViewEmptyMessage);
        mInviteesEditText.a(30);
        mInviteesEditText.addTextChangedListener(new dah(this, (byte)0));
        e = new dsi(getActivity());
        mInviteesEditText.a(e);
        mInviteesEditText.a(this);
        mListViewContacts.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final SelectContactsFragment a;

            public final void onScroll(AbsListView abslistview, int j, int k, int l)
            {
            }

            public final void onScrollStateChanged(AbsListView abslistview, int j)
            {
                if (j == 1)
                {
                    cwz.b(a.getActivity(), a.mInviteesEditText);
                }
            }

            
            {
                a = SelectContactsFragment.this;
                super();
            }
        });
        a(((String) (null)));
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
        if (d != null)
        {
            d.a(null);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        adapterview = (Cursor)d.getItem(j);
        adapterview = d.a(adapterview);
        com.ubercab.client.core.ui.ChipEditText.Chip chip = mInviteesEditText.b(adapterview);
        if (chip == null)
        {
            mInviteesEditText.a(adapterview);
        } else
        {
            mInviteesEditText.a(chip);
        }
        getActivity().invalidateOptionsMenu();
        g = l;
        h = j - mListViewContacts.getFirstVisiblePosition();
        j = mListViewContacts.getDividerHeight();
        i = view.getTop() % (view.getHeight() + j);
        if (i > 0)
        {
            i = j + (view.getHeight() - i);
            return;
        } else
        {
            i = -i;
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0e06c3)
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
        boolean flag1 = false;
        super.onPrepareOptionsMenu(menu);
        boolean flag;
        if (!mInviteesEditText.b().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu = c;
        if (flag || Contact.a(mInviteesEditText.c()))
        {
            flag1 = true;
        }
        menu.setEnabled(flag1);
    }
}
