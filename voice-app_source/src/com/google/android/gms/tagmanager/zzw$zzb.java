// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzw

private static class zzaLy
{

    final byte zzaLy[];
    final String zztw;

    public String toString()
    {
        return (new StringBuilder()).append("KeyAndSerialized: key = ").append(zztw).append(" serialized hash = ").append(Arrays.hashCode(zzaLy)).toString();
    }

    (String s, byte abyte0[])
    {
        zztw = s;
        zzaLy = abyte0;
    }
}
