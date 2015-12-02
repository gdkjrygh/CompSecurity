// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            aon, ContactInfo

class lb
    implements Runnable
{

    final aon a;
    final ArrayList b;

    lb(aon aon1, ArrayList arraylist)
    {
        a = aon1;
        b = arraylist;
        super();
    }

    public void run()
    {
        if (!a.isCancelled())
        {
            ContactInfo.b(a.a, b);
        }
    }
}
