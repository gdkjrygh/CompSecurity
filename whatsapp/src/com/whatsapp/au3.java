// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            Conversation

class au3
    implements Comparator
{

    final Conversation a;

    au3(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public int a(c4 c4_1, c4 c4_2)
    {
        if (c4_1.I == c4_2.I)
        {
            return 0;
        }
        return c4_1.I >= c4_2.I ? 1 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((c4)obj, (c4)obj1);
    }
}
