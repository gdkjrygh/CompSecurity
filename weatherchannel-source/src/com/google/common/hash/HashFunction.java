// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.nio.charset.Charset;

// Referenced classes of package com.google.common.hash:
//            HashCode, Funnel, Hasher

public interface HashFunction
{

    public abstract int bits();

    public abstract HashCode hashBytes(byte abyte0[]);

    public abstract HashCode hashBytes(byte abyte0[], int i, int j);

    public abstract HashCode hashInt(int i);

    public abstract HashCode hashLong(long l);

    public abstract HashCode hashObject(Object obj, Funnel funnel);

    public abstract HashCode hashString(CharSequence charsequence, Charset charset);

    public abstract HashCode hashUnencodedChars(CharSequence charsequence);

    public abstract Hasher newHasher();

    public abstract Hasher newHasher(int i);
}
