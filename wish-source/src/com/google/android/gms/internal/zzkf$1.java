// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            zzkf, zzki

class zzavW
    implements Comparator
{

    final zzkf zzavW;

    public int compare(Object obj, Object obj1)
    {
        return zza((zzki)obj, (zzki)obj1);
    }

    public int zza(zzki zzki1, zzki zzki2)
    {
        return zzki1.getClass().getCanonicalName().compareTo(zzki2.getClass().getCanonicalName());
    }

    (zzkf zzkf1)
    {
        zzavW = zzkf1;
        super();
    }
}
