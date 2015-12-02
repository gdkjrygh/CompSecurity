// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.launch;

import com.ubercab.rider.realtime.model.Client;
import dal;
import edt;
import ide;

// Referenced classes of package com.ubercab.client.feature.launch:
//            LauncherActivity

final class a
    implements ide
{

    final LauncherActivity a;

    private void a(Client client)
    {
        client = client.getUuid();
        if (!client.equals(a.t.z()))
        {
            a.t.d(client);
        }
        a.startActivity(a.k.a());
        a.finish();
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }

    (LauncherActivity launcheractivity)
    {
        a = launcheractivity;
        super();
    }
}
