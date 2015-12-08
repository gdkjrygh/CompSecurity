// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.nio.charset.Charset;

// Referenced classes of package com.google.common.hash:
//            Hasher, AbstractCompositeHashFunction, HashCode, PrimitiveSink, 
//            Funnel

class val.hashers
    implements Hasher
{

    final AbstractCompositeHashFunction this$0;
    final Hasher val$hashers[];

    public HashCode hash()
    {
        return makeHash(val$hashers);
    }

    public Hasher putBoolean(boolean flag)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putBoolean(flag);
        }

        return this;
    }

    public volatile PrimitiveSink putBoolean(boolean flag)
    {
        return putBoolean(flag);
    }

    public Hasher putByte(byte byte0)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putByte(byte0);
        }

        return this;
    }

    public volatile PrimitiveSink putByte(byte byte0)
    {
        return putByte(byte0);
    }

    public Hasher putBytes(byte abyte0[])
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putBytes(abyte0);
        }

        return this;
    }

    public Hasher putBytes(byte abyte0[], int i, int j)
    {
        Hasher ahasher[] = val$hashers;
        int l = ahasher.length;
        for (int k = 0; k < l; k++)
        {
            ahasher[k].putBytes(abyte0, i, j);
        }

        return this;
    }

    public volatile PrimitiveSink putBytes(byte abyte0[])
    {
        return putBytes(abyte0);
    }

    public volatile PrimitiveSink putBytes(byte abyte0[], int i, int j)
    {
        return putBytes(abyte0, i, j);
    }

    public Hasher putChar(char c)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putChar(c);
        }

        return this;
    }

    public volatile PrimitiveSink putChar(char c)
    {
        return putChar(c);
    }

    public Hasher putDouble(double d)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putDouble(d);
        }

        return this;
    }

    public volatile PrimitiveSink putDouble(double d)
    {
        return putDouble(d);
    }

    public Hasher putFloat(float f)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putFloat(f);
        }

        return this;
    }

    public volatile PrimitiveSink putFloat(float f)
    {
        return putFloat(f);
    }

    public Hasher putInt(int i)
    {
        Hasher ahasher[] = val$hashers;
        int k = ahasher.length;
        for (int j = 0; j < k; j++)
        {
            ahasher[j].putInt(i);
        }

        return this;
    }

    public volatile PrimitiveSink putInt(int i)
    {
        return putInt(i);
    }

    public Hasher putLong(long l)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putLong(l);
        }

        return this;
    }

    public volatile PrimitiveSink putLong(long l)
    {
        return putLong(l);
    }

    public Hasher putObject(Object obj, Funnel funnel)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putObject(obj, funnel);
        }

        return this;
    }

    public Hasher putShort(short word0)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putShort(word0);
        }

        return this;
    }

    public volatile PrimitiveSink putShort(short word0)
    {
        return putShort(word0);
    }

    public Hasher putString(CharSequence charsequence, Charset charset)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putString(charsequence, charset);
        }

        return this;
    }

    public volatile PrimitiveSink putString(CharSequence charsequence, Charset charset)
    {
        return putString(charsequence, charset);
    }

    public Hasher putUnencodedChars(CharSequence charsequence)
    {
        Hasher ahasher[] = val$hashers;
        int j = ahasher.length;
        for (int i = 0; i < j; i++)
        {
            ahasher[i].putUnencodedChars(charsequence);
        }

        return this;
    }

    public volatile PrimitiveSink putUnencodedChars(CharSequence charsequence)
    {
        return putUnencodedChars(charsequence);
    }

    ()
    {
        this$0 = final_abstractcompositehashfunction;
        val$hashers = _5B_Lcom.google.common.hash.Hasher_3B_.this;
        super();
    }
}
