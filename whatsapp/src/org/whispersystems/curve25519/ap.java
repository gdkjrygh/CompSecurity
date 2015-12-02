// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            c, X, N

public class ap
{

    public static void a(c c1, X x)
    {
        N.a(c1.a, x.d, x.c);
        N.a(c1.b, x.a, x.b);
        N.a(c1.c, x.b, x.c);
    }
}
