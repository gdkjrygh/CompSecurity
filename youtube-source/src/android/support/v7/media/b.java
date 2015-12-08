// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package android.support.v7.media:
//            a

public final class b
{

    private final Bundle a = new Bundle();

    public b(int i)
    {
        a(SystemClock.elapsedRealtime());
        a.putInt("playbackState", i);
    }

    public final a a()
    {
        return new a(a, (byte)0);
    }

    public final b a(long l)
    {
        a.putLong("timestamp", l);
        return this;
    }

    public final b b(long l)
    {
        a.putLong("contentPosition", l);
        return this;
    }
}
