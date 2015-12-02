// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            adw, MessageDetailsActivity, ConversationRow

class a17
    implements Runnable
{

    final c4 a;
    final adw b;

    a17(adw adw1, c4 c4_1)
    {
        b = adw1;
        a = c4_1;
        super();
    }

    public void run()
    {
        if (a != null && a.y.c.equals(MessageDetailsActivity.h(b.a).y.c) && a.y.b)
        {
            MessageDetailsActivity.c(b.a);
            com.whatsapp.MessageDetailsActivity.a(b.a).a();
        }
    }
}
