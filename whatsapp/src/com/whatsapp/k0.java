// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.Filter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.ListIterator;

// Referenced classes of package com.whatsapp:
//            App, u5, og, xe, 
//            ConversationsFragment, r1

class k0 extends Filter
{

    final xe a;

    private k0(xe xe1)
    {
        a = xe1;
        super();
    }

    k0(xe xe1, r1 r1)
    {
        this(xe1);
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        android.widget.Filter.FilterResults filterresults;
        int i;
        i = App.am;
        filterresults = new android.widget.Filter.FilterResults();
        if (charsequence.length() <= 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = u5.d();
        charsequence = charsequence.toString().toLowerCase();
        ListIterator listiterator = arraylist.listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            og og1 = u5.d((String)listiterator.next());
            if (og1.z == null && !og1.k() && !og1.d() || og1.k() && og1.p() || !og1.d(charsequence))
            {
                listiterator.remove();
            }
        } while (i == 0);
        if (i == 0) goto _L3; else goto _L2
_L2:
        charsequence = a.b.h();
_L5:
        filterresults.values = charsequence;
        filterresults.count = charsequence.size();
        return filterresults;
_L3:
        charsequence = arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
label0:
        {
            int i = App.am;
            View view = a.b.getView();
            if (view == null)
            {
                break label0;
            }
            if (filterresults.count == 0)
            {
                if (charsequence.length() > 0)
                {
                    View view1 = view.findViewById(0x7f0b0196);
                    view1.setVisibility(0);
                    ConversationsFragment.h(a.b).setEmptyView(view1);
                    view.findViewById(0x7f0b019a).setVisibility(8);
                    view.findViewById(0x7f0b0199).setVisibility(8);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                view.findViewById(0x7f0b0196).setVisibility(8);
                ConversationsFragment.i(a.b);
                if (i == 0)
                {
                    break label0;
                }
            }
            view.findViewById(0x7f0b0196).setVisibility(8);
        }
        ConversationsFragment.a(a.b, (ArrayList)filterresults.values);
        if (ConversationsFragment.a(a.b) == null)
        {
            ConversationsFragment.a(a.b, a.b.h());
        }
        xe.a(a, charsequence.toString());
        a.notifyDataSetChanged();
    }
}
