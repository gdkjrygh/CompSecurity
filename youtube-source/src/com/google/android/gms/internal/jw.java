// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            js

public final class jw
{

    static final int a = 11;
    static final int b = 12;
    static final int c = 16;
    static final int d = 26;
    public static final int e[] = new int[0];
    public static final long f[] = new long[0];
    public static final float g[] = new float[0];
    public static final double h[] = new double[0];
    public static final boolean i[] = new boolean[0];
    public static final String j[] = new String[0];
    public static final byte k[][] = new byte[0][];
    public static final byte l[] = new byte[0];

    static int a(int i1)
    {
        return i1 & 7;
    }

    static int a(int i1, int j1)
    {
        return i1 << 3 | j1;
    }

    public static boolean a(js js1, int i1)
    {
        return js1.b(i1);
    }

    public static int b(int i1)
    {
        return i1 >>> 3;
    }

}
