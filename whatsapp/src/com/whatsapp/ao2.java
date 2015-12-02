// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            Conversation, App

class ao2 extends Handler
{

    final Conversation a;

    ao2(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void handleMessage(Message message)
    {
label0:
        {
            if (message.what == 0)
            {
                Conversation.Z(a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Conversation.z(a);
        }
    }
}
