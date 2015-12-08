// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            zze

static final class nit> extends zze
{

    final char zzacX[];

    public boolean zzd(char c)
    {
        return Arrays.binarySearch(zzacX, c) >= 0;
    }

    (char ac[])
    {
        zzacX = ac;
        super();
    }
}
