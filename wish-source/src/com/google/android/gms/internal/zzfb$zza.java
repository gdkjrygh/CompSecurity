// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzfb

private static final class zzBK
{

    private long zzBJ;
    private long zzBK;

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", zzBJ);
        bundle.putLong("tclose", zzBK);
        return bundle;
    }

    public long zzeG()
    {
        return zzBK;
    }

    public void zzeH()
    {
        zzBK = SystemClock.elapsedRealtime();
    }

    public void zzeI()
    {
        zzBJ = SystemClock.elapsedRealtime();
    }

    public ()
    {
        zzBJ = -1L;
        zzBK = -1L;
    }
}
