// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.j;
import com.google.android.apps.youtube.medialib.player.n;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.player.a:
//            l, p

public final class o extends j
{

    private final l b;
    private final p c = new p(this, Looper.myLooper(), (byte)0);
    private boolean d;

    public o(n n, l l1)
    {
        super(n);
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
    }

    static void a(o o1, int k)
    {
        o1.e(k);
    }

    private void i()
    {
        if (d)
        {
            c.obtainMessage(1, 100, -1).sendToTarget();
        }
    }

    public final void a(Context context, Uri uri, Map map)
    {
        super.a(context, b.a(uri), map);
        d = true;
        i();
    }

    public final void a(com.google.android.apps.youtube.medialib.player.o o1)
    {
        super.a(o1);
        i();
    }

    public final void d(int k)
    {
    }
}
