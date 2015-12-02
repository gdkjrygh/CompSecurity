// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.ListIterator;

// Referenced classes of package com.whatsapp:
//            App, CallsFragment, yj, og, 
//            e7, a9b

class en extends Filter
{

    final CallsFragment a;

    private en(CallsFragment callsfragment)
    {
        a = callsfragment;
        super();
    }

    en(CallsFragment callsfragment, a9b a9b)
    {
        this(callsfragment);
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        android.widget.Filter.FilterResults filterresults;
        int i;
        i = App.am;
        filterresults = new android.widget.Filter.FilterResults();
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        synchronized (CallsFragment.g(a))
        {
            arraylist = new ArrayList(CallsFragment.g(a));
        }
        charsequence = charsequence.toString().toLowerCase();
        obj = arraylist.listIterator();
        do
        {
            if (!((ListIterator) (obj)).hasNext())
            {
                break;
            }
            if (!((yj)((ListIterator) (obj)).next()).e().d(charsequence))
            {
                ((ListIterator) (obj)).remove();
            }
        } while (i == 0);
        if (i == 0) goto _L3; else goto _L2
_L2:
        charsequence = CallsFragment.g(a);
_L5:
        filterresults.values = charsequence;
        filterresults.count = charsequence.size();
        return filterresults;
        charsequence;
        obj;
        JVM INSTR monitorexit ;
        throw charsequence;
_L3:
        charsequence = arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
        if (a.getView() != null)
        {
            CallsFragment.d(a);
        }
        CallsFragment.a(a, (ArrayList)filterresults.values);
        if (CallsFragment.b(a) == null)
        {
            CallsFragment.a(a, CallsFragment.g(a));
        }
        CallsFragment.a(a, charsequence);
        CallsFragment.f(a).notifyDataSetChanged();
    }
}
