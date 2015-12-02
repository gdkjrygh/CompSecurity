// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            hd, App, Conversation, s

class pl
    implements hd
{

    final Conversation a;
    final HashMap b;

    pl(Conversation conversation, HashMap hashmap)
    {
        a = conversation;
        b = hashmap;
        super();
    }

    public void a()
    {
        int i = App.am;
        if (Conversation.aj(a) && Conversation.ad(a) > 0)
        {
            int j = s.a(a.U);
            if (a.U.getCount() > j + 1)
            {
                c4 c4_1 = (c4)a.U.getItem(j + 1);
                Iterator iterator = b.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (((c4)iterator.next()).I < c4_1.I)
                    {
                        continue;
                    }
                    Conversation.a(a, 0);
                    if (i == 0)
                    {
                        break;
                    }
                } while (i == 0);
            }
        }
        Conversation.F(a);
    }
}
