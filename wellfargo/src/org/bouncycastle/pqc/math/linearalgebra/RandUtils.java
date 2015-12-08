// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

public class RandUtils
{

    public RandUtils()
    {
    }

    static int nextInt(SecureRandom securerandom, int i)
    {
        if ((-i & i) == i)
        {
            return (int)((long)i * (long)(securerandom.nextInt() >>> 1) >> 31);
        }
        int j;
        int k;
        do
        {
            j = securerandom.nextInt() >>> 1;
            k = j % i;
        } while ((j - k) + (i - 1) < 0);
        return k;
    }
}
