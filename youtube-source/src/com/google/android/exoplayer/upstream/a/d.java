// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.a;


final class d
{

    public static long a(String s)
    {
        long l = 0L;
        if (s != null) goto _L2; else goto _L1
_L1:
        long l1 = l;
_L4:
        return l1;
_L2:
        int i = 0;
        do
        {
            l1 = l;
            if (i >= s.length())
            {
                continue;
            }
            l ^= s.charAt(i);
            l += (l << 1) + (l << 4) + (l << 5) + (l << 7) + (l << 8) + (l << 40);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
