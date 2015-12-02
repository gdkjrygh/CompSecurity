// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            a19, ContactsFragment, og

class at1 extends bv
{

    final og b;
    final a19 c;

    at1(a19 a19_1, og og)
    {
        c = a19_1;
        b = og;
        super();
    }

    public void a(View view)
    {
        ContactsFragment.a(c.c, b);
    }
}
