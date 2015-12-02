// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.notification.a1;
import de.greenrobot.event.g;

// Referenced classes of package com.whatsapp:
//            a9n, App, Conversation, uz

class a2 extends Handler
{

    final Conversation a;

    private a2(Conversation conversation)
    {
        a = conversation;
        super();
    }

    a2(Conversation conversation, uz uz)
    {
        this(conversation);
    }

    public void handleMessage(Message message)
    {
        if (!((a9n)g.a().a(com/whatsapp/a9n)).a())
        {
            App.a(false, false);
            if (Conversation.y(a))
            {
                a1.c().b();
            }
            Conversation.c(a, false);
            Conversation.j(a, true);
        }
    }
}
