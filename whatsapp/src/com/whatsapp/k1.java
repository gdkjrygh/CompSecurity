// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            og, alc, App, MultipleContactsSelector, 
//            cm

class k1 extends Filter
{

    final alc a;

    private k1(alc alc1)
    {
        a = alc1;
        super();
    }

    k1(alc alc1, cm cm)
    {
        this(alc1);
    }

    public CharSequence convertResultToString(Object obj)
    {
        if (obj != null && (obj instanceof og))
        {
            return ((og)obj).a(a.a);
        } else
        {
            return super.convertResultToString(obj);
        }
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        int i = App.am;
        android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
        if (charsequence != null && charsequence.length() > 0)
        {
            ArrayList arraylist = new ArrayList();
            charsequence = charsequence.toString().toLowerCase();
            Iterator iterator = MultipleContactsSelector.b(a.a).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                og og1 = (og)iterator.next();
                String s = og1.a(a.a).toLowerCase();
                if ((s.startsWith(charsequence) || s.contains((new StringBuilder()).append(" ").append(charsequence).toString())) && !MultipleContactsSelector.a(a.a, og1.a))
                {
                    arraylist.add(og1);
                }
            } while (i == 0);
            filterresults.values = arraylist;
            filterresults.count = arraylist.size();
        }
        return filterresults;
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
        alc.a(a, (ArrayList)filterresults.values);
        a.notifyDataSetChanged();
    }
}
