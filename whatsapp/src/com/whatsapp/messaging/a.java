// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;


// Referenced classes of package com.whatsapp.messaging:
//            MessageService

class a
    implements Runnable
{

    final MessageService._cls1 a;

    a(MessageService._cls1 _pcls1)
    {
        a = _pcls1;
        super();
    }

    public void run()
    {
        MessageService.c(a.a, true);
    }
}
