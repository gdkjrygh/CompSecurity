// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            X, T, aX, U, 
//            p, N

public class ad
{

    public static void a(X x, T t, p p1)
    {
        int ai[] = new int[10];
        aX.a(x.d, t.e, t.a);
        U.a(x.a, t.e, t.a);
        N.a(x.b, x.d, p1.b);
        N.a(x.a, x.a, p1.a);
        N.a(x.c, p1.c, t.d);
        aX.a(ai, t.c, t.c);
        U.a(x.d, x.b, x.a);
        aX.a(x.a, x.b, x.a);
        U.a(x.b, ai, x.c);
        aX.a(x.c, ai, x.c);
    }
}
