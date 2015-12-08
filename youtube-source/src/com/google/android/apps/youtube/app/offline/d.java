// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.support.v4.app.al;
import com.google.android.apps.youtube.common.a.b;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            c

final class d
    implements b
{

    final String a;
    final c b;

    d(c c1, String s)
    {
        b = c1;
        a = s;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        c.a(b).add(a);
        obj1 = c.a(b, a);
        ((al) (obj1)).a(c.a(b, ((Bitmap) (obj))));
        com.google.android.apps.youtube.app.offline.c.b(b).notify(a, 1003, ((al) (obj1)).a());
    }
}
