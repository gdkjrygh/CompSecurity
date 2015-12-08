// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzw

private static class zzaDk
{

    final byte zzaDk[];
    final String zzra;

    public String toString()
    {
        return (new StringBuilder()).append("KeyAndSerialized: key = ").append(zzra).append(" serialized hash = ").append(Arrays.hashCode(zzaDk)).toString();
    }

    (String s, byte abyte0[])
    {
        zzra = s;
        zzaDk = abyte0;
    }
}
