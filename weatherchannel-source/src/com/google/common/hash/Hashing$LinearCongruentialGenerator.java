// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;


// Referenced classes of package com.google.common.hash:
//            Hashing

private static final class state
{

    private long state;

    public double nextDouble()
    {
        state = 0x27bb2ee687b0b0fdL * state + 1L;
        return (double)((int)(state >>> 33) + 1) / 2147483648D;
    }

    public (long l)
    {
        state = l;
    }
}
