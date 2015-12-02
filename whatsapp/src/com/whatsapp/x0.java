// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            ak6, GroupChatInfo

class x0
    implements Runnable
{

    final ak6 a;
    final ArrayList b;

    x0(ak6 ak6_1, ArrayList arraylist)
    {
        a = ak6_1;
        b = arraylist;
        super();
    }

    public void run()
    {
        if (!a.isCancelled())
        {
            GroupChatInfo.b(a.a, b);
        }
    }
}
