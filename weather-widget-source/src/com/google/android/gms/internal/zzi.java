// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

public class zzi
{

    public final byte data[];
    public final int statusCode;
    public final Map zzA;
    public final boolean zzB;
    public final long zzC;

    public zzi(int i, byte abyte0[], Map map, boolean flag, long l)
    {
        statusCode = i;
        data = abyte0;
        zzA = map;
        zzB = flag;
        zzC = l;
    }

    public zzi(byte abyte0[], Map map)
    {
        this(200, abyte0, map, false, 0L);
    }
}
