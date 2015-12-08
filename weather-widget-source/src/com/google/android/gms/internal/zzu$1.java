// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            zzu

static final class 
    implements Comparator
{

    public int compare(Object obj, Object obj1)
    {
        return zza((byte[])obj, (byte[])obj1);
    }

    public int zza(byte abyte0[], byte abyte1[])
    {
        return abyte0.length - abyte1.length;
    }

    ()
    {
    }
}
