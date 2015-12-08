// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zze, zzu

public static final class zzZW
{

    public final Set zzWJ;
    public final boolean zzZW;

    public (Set set, boolean flag)
    {
        zzu.zzu(set);
        zzWJ = Collections.unmodifiableSet(set);
        zzZW = flag;
    }
}
