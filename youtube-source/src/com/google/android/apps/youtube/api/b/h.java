// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.apps.youtube.api.t;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.player.internal.y;

// Referenced classes of package com.google.android.apps.youtube.api.b:
//            a

final class h
    implements t
{

    final a a;
    private y b;

    public h(a a1, y y1)
    {
        a = a1;
        super();
        b = (y)c.a(y1);
    }

    public final void a()
    {
        b = null;
    }

    public final void a(Bitmap bitmap, String s, boolean flag, boolean flag1)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        b.a(bitmap, s, flag, flag1);
        return;
        bitmap;
    }

    public final void a(String s, boolean flag, boolean flag1)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        b.a(s, flag, flag1);
        return;
        s;
    }
}
