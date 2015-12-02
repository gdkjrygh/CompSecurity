// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, k, og, tm, 
//            ContactsFragment, a19, atl

class al extends AsyncTask
{

    final ContactsFragment a;

    private al(ContactsFragment contactsfragment)
    {
        a = contactsfragment;
        super();
    }

    al(ContactsFragment contactsfragment, atl atl)
    {
        this(contactsfragment);
    }

    protected ArrayList a(Void avoid[])
    {
        int i = App.am;
        avoid = new ArrayList();
        App.az.b(avoid);
        HashSet hashset = new HashSet(avoid.size(), 1.0F);
        Iterator iterator = avoid.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hashset.add(((og)iterator.next()).n);
        } while (i == 0);
        App.az.a(avoid, hashset);
        Collections.sort(avoid, new tm(this, a.getActivity().getApplicationContext()));
        return avoid;
    }

    protected void a(ArrayList arraylist)
    {
label0:
        {
            ContactsFragment.b(a).clear();
            ContactsFragment.b(a).addAll(arraylist);
            ContactsFragment.h(a).clear();
            if (arraylist.isEmpty())
            {
                break label0;
            }
            if (TextUtils.isEmpty(ContactsFragment.d(a)))
            {
                ContactsFragment.h(a).addAll(arraylist);
                if (ContactsFragment.h(a).size() == 0)
                {
                    ContactsFragment.h(a).add(ContactsFragment.c());
                }
                ContactsFragment.h(a).add(ContactsFragment.e());
                ContactsFragment.h(a).add(ContactsFragment.a());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.a(ContactsFragment.d(a));
        }
        a.getView().findViewById(0x7f0b0138).setVisibility(8);
        arraylist = a.getView().findViewById(0x7f0b0137);
        arraylist.setVisibility(8);
        a.getListView().setEmptyView(arraylist);
        ContactsFragment.j(a).notifyDataSetChanged();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }
}
