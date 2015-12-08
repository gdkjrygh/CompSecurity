// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.AudioManager;

// Referenced classes of package android.support.v7.media:
//            j, bq

final class br extends j
{

    final bq a;

    br(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void a(int i)
    {
        bq.a(a).setStreamVolume(3, i, 0);
        bq.b(a);
    }

    public final void b(int i)
    {
        int k = bq.a(a).getStreamVolume(3);
        if (Math.min(bq.a(a).getStreamMaxVolume(3), Math.max(0, k + i)) != k)
        {
            bq.a(a).setStreamVolume(3, k, 0);
        }
        bq.b(a);
    }
}
