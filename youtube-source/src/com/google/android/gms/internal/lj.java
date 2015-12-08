// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

public class lj extends IOException
{

    public lj(String s)
    {
        super(s);
    }

    static lj gE()
    {
        return new lj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static lj gF()
    {
        return new lj("CodedInputStream encountered a malformed varint.");
    }

    static lj gG()
    {
        return new lj("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
