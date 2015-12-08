// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            c, a, e

final class f
    implements b
{

    final c a;

    private f(c c1)
    {
        a = c1;
        super();
    }

    f(c c1, byte byte0)
    {
        this(c1);
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (GDataRequest)obj;
        L.a((new StringBuilder("Couldn't retrieve video info from [uri=")).append(((GDataRequest) (obj)).a).append("]").toString(), exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Video)obj1;
        obj1 = a;
        ba ba1 = c.a(a).buildUpon();
        boolean flag;
        if (((Video) (obj)).privacy == com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PUBLIC)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(((c) (obj1)), ba1.c(flag).e(((Video) (obj)).ownerDisplayName).s(((Video) (obj)).ownerUri).d());
        com.google.android.apps.youtube.core.player.overlay.c.b(a).setAdTitle(com.google.android.apps.youtube.core.player.overlay.c.b(a, c.a(a)));
        if (c.a(a).getAdOwnerUri() != null && c.a(a).adInfoCards == null)
        {
            c.a(a, d.a(new com.google.android.apps.youtube.core.player.overlay.e(a, (byte)0)));
            com.google.android.apps.youtube.core.player.overlay.c.e(a).a(c.a(a).getAdOwnerUri(), e.a(c.c(a), com.google.android.apps.youtube.core.player.overlay.c.d(a)));
        }
    }
}
