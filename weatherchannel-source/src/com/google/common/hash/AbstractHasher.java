// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.nio.charset.Charset;

// Referenced classes of package com.google.common.hash:
//            Hasher, PrimitiveSink

abstract class AbstractHasher
    implements Hasher
{

    AbstractHasher()
    {
    }

    public final Hasher putBoolean(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        return putByte(byte0);
    }

    public volatile PrimitiveSink putBoolean(boolean flag)
    {
        return putBoolean(flag);
    }

    public final Hasher putDouble(double d)
    {
        return putLong(Double.doubleToRawLongBits(d));
    }

    public volatile PrimitiveSink putDouble(double d)
    {
        return putDouble(d);
    }

    public final Hasher putFloat(float f)
    {
        return putInt(Float.floatToRawIntBits(f));
    }

    public volatile PrimitiveSink putFloat(float f)
    {
        return putFloat(f);
    }

    public Hasher putString(CharSequence charsequence, Charset charset)
    {
        return putBytes(charsequence.toString().getBytes(charset));
    }

    public volatile PrimitiveSink putString(CharSequence charsequence, Charset charset)
    {
        return putString(charsequence, charset);
    }

    public Hasher putUnencodedChars(CharSequence charsequence)
    {
        int i = 0;
        for (int j = charsequence.length(); i < j; i++)
        {
            putChar(charsequence.charAt(i));
        }

        return this;
    }

    public volatile PrimitiveSink putUnencodedChars(CharSequence charsequence)
    {
        return putUnencodedChars(charsequence);
    }
}
