// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.z;

// Referenced classes of package com.whatsapp:
//            o4, App, Conversation

class w1
    implements Runnable
{

    final Conversation a;

    w1(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void run()
    {
        if (o4.D())
        {
            z.a(App.au, ag.IS_MONKEYRUNNER_RUNNING, Boolean.valueOf(true));
        }
    }
}
