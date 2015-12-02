// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            M

public class at
{

    public static int a(int ai[])
    {
        byte abyte0[] = new byte[32];
        M.a(abyte0, ai);
        return abyte0[0] & 1;
    }
}
