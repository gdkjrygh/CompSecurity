// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            Conversation

class afl extends Handler
{

    final Conversation a;

    afl(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            Conversation.ag(a);
        }
        a.aK.setTranscriptMode(0);
    }
}
