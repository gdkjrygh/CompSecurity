// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.launch;

import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.response.BootstrapRider;
import idi;

// Referenced classes of package com.ubercab.client.feature.launch:
//            LauncherActivity

final class a
    implements idi
{

    final LauncherActivity a;

    private static Client a(BootstrapRider bootstraprider)
    {
        return bootstraprider.getClient();
    }

    public final volatile Object a(Object obj)
    {
        return a((BootstrapRider)obj);
    }

    (LauncherActivity launcheractivity)
    {
        a = launcheractivity;
        super();
    }
}
