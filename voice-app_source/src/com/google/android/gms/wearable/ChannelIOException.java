// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import java.io.IOException;

public class ChannelIOException extends IOException
{

    private final int zzaSO;
    private final int zzaSP;

    public ChannelIOException(String s, int i, int j)
    {
        super(s);
        zzaSO = i;
        zzaSP = j;
    }

    public int getAppSpecificErrorCode()
    {
        return zzaSP;
    }

    public int getCloseReason()
    {
        return zzaSO;
    }
}
