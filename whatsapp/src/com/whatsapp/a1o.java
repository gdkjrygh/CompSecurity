// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.contact.b;
import com.whatsapp.contact.j;

// Referenced classes of package com.whatsapp:
//            App, ContactsFragment, aua

class a1o
    implements Runnable
{

    final ContactsFragment a;
    final boolean b;

    a1o(ContactsFragment contactsfragment, boolean flag)
    {
        a = contactsfragment;
        b = flag;
        super();
    }

    public void run()
    {
        if (App.l >= 1)
        {
            ContactsFragment.f(a);
        }
        android.content.Context context = a.getActivity().getApplicationContext();
        Object obj;
        if (b)
        {
            obj = j.INTERACTIVE_FULL;
        } else
        {
            obj = j.INTERACTIVE_DELTA;
        }
        obj = com.whatsapp.contact.b.b(context, ((j) (obj)));
        if (App.l >= 1)
        {
            ContactsFragment.f(a);
        }
        ContactsFragment.k(a).post(new aua(this, ((com.whatsapp.contact.n) (obj))));
    }
}
