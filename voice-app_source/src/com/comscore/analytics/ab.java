// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.Date;

// Referenced classes of package com.comscore.analytics:
//            Core, SessionState

class ab
    implements Runnable
{

    final Core a;

    ab(Core core)
    {
        a = core;
        super();
    }

    public void run()
    {
        if (a.z())
        {
            return;
        }
        if (a.R < 0)
        {
            a.R = 0;
        }
        if (a.S < 0)
        {
            a.S = 0;
        }
        a.X = Date.unixTime();
        Core core = a;
        core.W = core.W + 1;
        if (a.M != SessionState.ACTIVE_USER)
        {
            a.n();
            return;
        } else
        {
            a.o();
            return;
        }
    }
}
