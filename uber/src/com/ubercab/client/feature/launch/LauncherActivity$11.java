// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.launch;

import edt;
import ide;

// Referenced classes of package com.ubercab.client.feature.launch:
//            LauncherActivity

final class a
    implements ide
{

    final LauncherActivity a;

    private void a()
    {
        a.startActivity(a.k.a());
        a.finish();
    }

    public final void call(Object obj)
    {
        a();
    }

    (LauncherActivity launcheractivity)
    {
        a = launcheractivity;
        super();
    }
}
