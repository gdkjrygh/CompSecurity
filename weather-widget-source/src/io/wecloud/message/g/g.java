// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import java.util.TimerTask;

// Referenced classes of package io.wecloud.message.g:
//            f, e

class g extends TimerTask
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public void run()
    {
        f.a(a).a();
    }
}
