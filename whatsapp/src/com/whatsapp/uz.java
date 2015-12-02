// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            r3, Conversation, s

class uz
    implements r3
{

    final Conversation a;

    uz(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void a()
    {
        a.U.notifyDataSetChanged();
    }

    public void b()
    {
        if (Conversation.ad(a) > 0)
        {
            Conversation.a(a, Conversation.ad(a) + Conversation.l(a).size());
        }
        Conversation.l(a).clear();
        Conversation.u(a).clear();
        Conversation.a(a, true);
    }
}
