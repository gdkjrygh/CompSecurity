// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.mapbar.android.location:
//            q, p

static final class <init> extends Handler
{

    public final void handleMessage(Message message)
    {
        p p1 = (p)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            q.a(p1.a, p1.b[0]);
            return;

        case 2: // '\002'
            message = p1.a;
            message = ((Message) (p1.b));
            q.b();
            return;

        case 3: // '\003'
            message = p1.a;
            break;
        }
        q.c();
    }

    ()
    {
        this((byte)0);
    }

    private <init>(byte byte0)
    {
    }
}
