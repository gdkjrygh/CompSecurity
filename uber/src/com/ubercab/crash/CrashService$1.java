// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash;

import com.ubercab.crash.model.Crash;
import gkx;
import gky;
import gkz;

// Referenced classes of package com.ubercab.crash:
//            CrashService

final class a
    implements gkz
{

    final CrashService a;

    public final void a()
    {
        a.stopSelf();
    }

    public final void a(Crash crash)
    {
        CrashService.a(a).a().c(crash.getCrashId());
        a.stopSelf();
    }

    (CrashService crashservice)
    {
        a = crashservice;
        super();
    }
}
