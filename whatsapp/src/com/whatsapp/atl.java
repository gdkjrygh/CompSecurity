// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ft, ContactsFragment, App

class atl extends bv
{

    final ContactsFragment b;

    atl(ContactsFragment contactsfragment)
    {
        b = contactsfragment;
        super();
    }

    public void a(View view)
    {
        ft.a(o.TELL_A_FRIEND, l.EMPTY_CONTACTS);
        App.c(b.getActivity());
    }
}
