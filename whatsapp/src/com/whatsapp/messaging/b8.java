// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Message;

// Referenced classes of package com.whatsapp.messaging:
//            MessageService

class b8
    implements android.os.Handler.Callback
{

    final MessageService a;

    b8(MessageService messageservice)
    {
        a = messageservice;
        super();
    }

    public boolean handleMessage(Message message)
    {
        MessageService.a(a, message.arg1);
        MessageService messageservice = a;
        boolean flag;
        if (message.arg2 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MessageService.b(messageservice, flag);
        return true;
    }
}
