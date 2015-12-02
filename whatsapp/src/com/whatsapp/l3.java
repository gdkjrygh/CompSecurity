// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            ak6, GroupChatInfo

class l3
    implements Runnable
{

    final ArrayList a;
    final ak6 b;

    l3(ak6 ak6_1, ArrayList arraylist)
    {
        b = ak6_1;
        a = arraylist;
        super();
    }

    public void run()
    {
        if (!b.isCancelled())
        {
            GroupChatInfo.a(b.a, a);
        }
    }
}
