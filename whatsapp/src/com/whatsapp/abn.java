// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.List;

// Referenced classes of package com.whatsapp:
//            aon, ContactInfo

class abn
    implements Runnable
{

    final aon a;
    final List b;

    abn(aon aon1, List list)
    {
        a = aon1;
        b = list;
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
