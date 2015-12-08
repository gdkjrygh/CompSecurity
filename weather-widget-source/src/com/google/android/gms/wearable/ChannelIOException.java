// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import java.io.IOException;

public class ChannelIOException extends IOException
{

    private final int zzaYM;
    private final int zzaYN;

    public ChannelIOException(String s, int i, int j)
    {
        super(s);
        zzaYM = i;
        zzaYN = j;
    }

    public int getAppSpecificErrorCode()
    {
        return zzaYN;
    }

    public int getCloseReason()
    {
        return zzaYM;
    }
}
