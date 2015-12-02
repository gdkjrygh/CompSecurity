// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.Filter;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            a19, ContactsFragment, atl

class i6 extends Filter
{

    final a19 a;

    private i6(a19 a19_1)
    {
        a = a19_1;
        super();
    }

    i6(a19 a19_1, atl atl)
    {
        this(a19_1);
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
        charsequence = ContactsFragment.a(a.c, charsequence);
        filterresults.values = charsequence;
        filterresults.count = charsequence.size();
        return filterresults;
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
        if (!ContactsFragment.b(a.c).isEmpty())
        {
            ContactsFragment.b(a.c, charsequence);
            ContactsFragment.h(a.c).clear();
            ContactsFragment.h(a.c).addAll((ArrayList)filterresults.values);
            if (ContactsFragment.h(a.c).size() == 0)
            {
                ContactsFragment.h(a.c).add(ContactsFragment.c());
            }
            ContactsFragment.h(a.c).add(ContactsFragment.e());
            ContactsFragment.h(a.c).add(ContactsFragment.a());
        }
        a.notifyDataSetChanged();
    }
}
