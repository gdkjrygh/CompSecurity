// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            zzoa, zzod

class zzaHP
    implements Comparator
{

    final zzoa zzaHP;

    public int compare(Object obj, Object obj1)
    {
        return zza((zzod)obj, (zzod)obj1);
    }

    public int zza(zzod zzod1, zzod zzod2)
    {
        return zzod1.getClass().getCanonicalName().compareTo(zzod2.getClass().getCanonicalName());
    }

    (zzoa zzoa1)
    {
        zzaHP = zzoa1;
        super();
    }
}
