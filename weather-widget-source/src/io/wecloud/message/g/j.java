// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import java.util.TimerTask;

// Referenced classes of package io.wecloud.message.g:
//            e

class j extends TimerTask
{

    final e a;

    j(e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        a.d = 0;
        a.a();
    }
}
