// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

public class lm extends IOException
{

    public lm(String s)
    {
        super(s);
    }

    static lm gQ()
    {
        return new lm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static lm gR()
    {
        return new lm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static lm gS()
    {
        return new lm("CodedInputStream encountered a malformed varint.");
    }

    static lm gT()
    {
        return new lm("Protocol message contained an invalid tag (zero).");
    }

    static lm gU()
    {
        return new lm("Protocol message end-group tag did not match expected tag.");
    }

    static lm gV()
    {
        return new lm("Protocol message tag had invalid wire type.");
    }
}
