// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import java.io.IOException;

public final class UnexpectedLengthException extends IOException
{

    public final long actualLength;
    public final long expectedLength;

    public UnexpectedLengthException(long l, long l1)
    {
        super((new StringBuilder("Expected: ")).append(l).append(", got: ").append(l1).toString());
        expectedLength = l;
        actualLength = l1;
    }
}
