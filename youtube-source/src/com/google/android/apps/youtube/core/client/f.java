// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import java.util.Collections;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            e, AdsClient

final class f
    implements Runnable
{

    final PlayerResponse a;
    final String b;
    final b c;
    final e d;

    f(e e1, PlayerResponse playerresponse, String s, b b1)
    {
        d = e1;
        a = playerresponse;
        b = s;
        c = b1;
        super();
    }

    public final void run()
    {
        String s = a.getVideoId();
        java.util.List list = e.a(d).a(a, b);
        if (list == null)
        {
            try
            {
                c.a(s, null);
                return;
            }
            catch (AdsClient.VmapException vmapexception)
            {
                c.a(s, vmapexception);
                return;
            }
            catch (AdsClient.VastException vastexception)
            {
                c.a(s, vastexception);
            }
            break MISSING_BLOCK_LABEL_96;
        }
        c.a(s, d.a(list, b, Collections.emptyMap()));
        return;
    }
}
