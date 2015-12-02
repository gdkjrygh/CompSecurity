// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            ng, afo, ListChatInfo

class ro
    implements Runnable
{

    final ng a;
    final ArrayList b;

    ro(ng ng1, ArrayList arraylist)
    {
        a = ng1;
        b = arraylist;
        super();
    }

    public void run()
    {
        if (!a.a.isCancelled())
        {
            ListChatInfo.a(a.a.a, b);
        }
    }
}
