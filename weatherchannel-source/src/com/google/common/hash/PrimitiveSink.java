// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.nio.charset.Charset;

public interface PrimitiveSink
{

    public abstract PrimitiveSink putBoolean(boolean flag);

    public abstract PrimitiveSink putByte(byte byte0);

    public abstract PrimitiveSink putBytes(byte abyte0[]);

    public abstract PrimitiveSink putBytes(byte abyte0[], int i, int j);

    public abstract PrimitiveSink putChar(char c);

    public abstract PrimitiveSink putDouble(double d);

    public abstract PrimitiveSink putFloat(float f);

    public abstract PrimitiveSink putInt(int i);

    public abstract PrimitiveSink putLong(long l);

    public abstract PrimitiveSink putShort(short word0);

    public abstract PrimitiveSink putString(CharSequence charsequence, Charset charset);

    public abstract PrimitiveSink putUnencodedChars(CharSequence charsequence);
}
