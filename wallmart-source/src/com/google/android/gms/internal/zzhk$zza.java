// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzhk

private static final class zzGX
{

    private long zzGW;
    private long zzGX;

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", zzGW);
        bundle.putLong("tclose", zzGX);
        return bundle;
    }

    public long zzfW()
    {
        return zzGX;
    }

    public void zzfX()
    {
        zzGX = SystemClock.elapsedRealtime();
    }

    public void zzfY()
    {
        zzGW = SystemClock.elapsedRealtime();
    }

    public ()
    {
        zzGW = -1L;
        zzGX = -1L;
    }
}
