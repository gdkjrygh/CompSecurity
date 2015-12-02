// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            p

public class E
{

    public static void a(byte abyte0[], byte byte0)
    {
        boolean flag = p.d;
        int i = 0;
        int j = abyte0.length;
        do
        {
            if (i >= j)
            {
                break;
            }
            abyte0[i] = byte0;
            i++;
        } while (!flag);
    }
}
