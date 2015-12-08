// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzf, zzx

public static final class zzadg
{

    public final Set zzZp;
    public final boolean zzadg;

    public (Set set, boolean flag)
    {
        zzx.zzv(set);
        zzZp = Collections.unmodifiableSet(set);
        zzadg = flag;
    }
}
