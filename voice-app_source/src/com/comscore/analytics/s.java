// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.CacheFlusher;

// Referenced classes of package com.comscore.analytics:
//            Core

class s
    implements Runnable
{

    final long a;
    final Core b;

    s(Core core, long l)
    {
        b = core;
        a = l;
        super();
    }

    public void run()
    {
        b.ag = a;
        if (b.d != null)
        {
            b.d.update();
        }
    }
}
