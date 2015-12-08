// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.backend.logic.a;
import com.google.android.apps.ytremote.model.CloudScreen;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            t

final class z
    implements Runnable
{

    final b a;
    final t b;

    z(t t1, b b1)
    {
        b = t1;
        a = b1;
        super();
    }

    public final void run()
    {
        Pair pair = com.google.android.apps.youtube.app.remote.t.b(b);
        if (pair == com.google.android.apps.youtube.app.remote.t.a())
        {
            a.a(null, new Exception("Authentication failed."));
        } else
        {
            List list = t.c(b).a((String)pair.first, (String)pair.second);
            if (list.isEmpty() && !((String)pair.first).equals("SIGNED_OUT_USER"))
            {
                CloudScreen cloudscreen;
                for (Iterator iterator = t.c(b).a("SIGNED_OUT_USER", "").iterator(); iterator.hasNext(); t.c(b).a((String)pair.first, (String)pair.second, cloudscreen))
                {
                    cloudscreen = (CloudScreen)iterator.next();
                }

            }
            if (a != null)
            {
                a.a(null, list);
                return;
            }
        }
    }
}
