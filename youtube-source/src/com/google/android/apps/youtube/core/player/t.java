// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            s

final class t
    implements b
{

    final s a;
    private int b;

    public t(s s1, int i)
    {
        a = s1;
        super();
        b = i;
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (Uri)obj;
        L.c((new StringBuilder("Couldn't retrieve info card image from [uri=")).append(obj).append("]").toString());
        s.a(a, b, null);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        s.a(a, b, ((Bitmap) (obj)));
    }
}
