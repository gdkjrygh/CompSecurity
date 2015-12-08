// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            i

abstract class m
    implements b
{

    final i b;

    private m(i i)
    {
        b = i;
        super();
    }

    m(i i, byte byte0)
    {
        this(i);
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (Uri)obj;
        L.c((new StringBuilder("Couldn't retrieve annotation image from [uri=")).append(obj).append("]").toString());
    }
}
