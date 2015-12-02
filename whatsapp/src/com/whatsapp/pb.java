// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            aon, ContactInfo

class pb
    implements Runnable
{

    final aon a;
    final ArrayList b;

    pb(aon aon1, ArrayList arraylist)
    {
        a = aon1;
        b = arraylist;
        super();
    }

    public void run()
    {
        if (!a.isCancelled())
        {
            ContactInfo.a(a.a, b);
        }
    }
}
