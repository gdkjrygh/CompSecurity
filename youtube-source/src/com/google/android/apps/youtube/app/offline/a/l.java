// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f

final class l
    implements Runnable
{

    final String a;
    final b b;
    final f c;

    l(f f1, String s, b b1)
    {
        c = f1;
        a = s;
        b = b1;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.datalib.model.gdata.Video video = c.j(a);
        if (video != null)
        {
            b.a(null, video);
            return;
        } else
        {
            b.a(null, null);
            return;
        }
    }
}
