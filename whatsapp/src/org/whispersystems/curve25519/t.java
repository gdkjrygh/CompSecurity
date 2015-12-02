// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            T, X, N

public class t
{

    public static void a(T t1, X x)
    {
        N.a(t1.a, x.d, x.c);
        N.a(t1.e, x.a, x.b);
        N.a(t1.c, x.b, x.c);
        N.a(t1.d, x.d, x.a);
    }
}
