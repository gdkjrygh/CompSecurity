// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.protobuf.nano:
//            a, e, CodedOutputByteBufferNano

public final class f
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
    public static final Integer m[] = new Integer[0];
    public static final Long n[] = new Long[0];
    public static final Float o[] = new Float[0];
    public static final Double p[] = new Double[0];
    public static final Boolean q[] = new Boolean[0];

    static int a(int i1)
    {
        return i1 & 7;
    }

    static int a(int i1, int j1)
    {
        return i1 << 3 | j1;
    }

    public static final int a(a a1, int i1)
    {
        int j1 = 1;
        int k1 = a1.l();
        a1.b(i1);
        while (a1.k() > 0 && a1.a() == i1) 
        {
            a1.b(i1);
            j1++;
        }
        a1.c(k1);
        return j1;
    }

    public static int a(List list)
    {
        if (list == null)
        {
            return 0;
        }
        list = list.iterator();
        e e1;
        int i1;
        int j1;
        for (i1 = 0; list.hasNext(); i1 = e1.b.length + (i1 + j1))
        {
            e1 = (e)list.next();
            j1 = CodedOutputByteBufferNano.d(e1.a);
        }

        return i1;
    }

    public static void a(List list, CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                e e1 = (e)list.next();
                codedoutputbytebuffernano.g(e1.a >>> 3, e1.a & 7);
                codedoutputbytebuffernano.b(e1.b);
            }
        }
    }

    public static boolean a(List list, a a1, int i1)
    {
        int j1 = a1.l();
        boolean flag = a1.b(i1);
        list.add(new e(i1, a1.a(j1, a1.l() - j1)));
        return flag;
    }

    public static int b(int i1)
    {
        return i1 >>> 3;
    }

}
