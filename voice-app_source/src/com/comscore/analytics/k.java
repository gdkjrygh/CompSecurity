// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.Constants;

// Referenced classes of package com.comscore.analytics:
//            Core

class k
    implements Runnable
{

    final boolean a;
    final Core b;

    k(Core core, boolean flag)
    {
        b = core;
        a = flag;
        super();
    }

    public void run()
    {
        Constants.DEBUG = a;
    }
}
