// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            App, asg

class u7
    implements Runnable
{

    final asg a;
    final c4 b;

    u7(asg asg, c4 c4)
    {
        a = asg;
        b = c4;
        super();
    }

    public void run()
    {
        App.n(b);
    }
}
