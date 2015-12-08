// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzw

private static class zzaPS
{

    final byte zzaPS[];
    final String zztP;

    public String toString()
    {
        return (new StringBuilder()).append("KeyAndSerialized: key = ").append(zztP).append(" serialized hash = ").append(Arrays.hashCode(zzaPS)).toString();
    }

    (String s, byte abyte0[])
    {
        zztP = s;
        zzaPS = abyte0;
    }
}
