// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            a19, og, App, ContactsFragment

class xx
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final ContactsFragment a;
    final ListView b;

    xx(ContactsFragment contactsfragment, ListView listview)
    {
        a = contactsfragment;
        b = listview;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (a19)b.getAdapter();
        if (!a19.a(adapterview, i) && !a19.c(adapterview, i) && !a19.b(adapterview, i))
        {
            adapterview = adapterview.a(i);
            if (((og) (adapterview)).t)
            {
                if (App.C(((og) (adapterview)).a))
                {
                    return false;
                }
                ContactsFragment.a(a, new HashMap());
                ContactsFragment.c(a).put(((og) (adapterview)).a, adapterview);
                a.h();
                ContactsFragment.i(a);
            }
        }
        return true;
    }
}
