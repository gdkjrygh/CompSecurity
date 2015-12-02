// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            p, T, ah, G, 
//            aO, l, K

public class B
{

    static int a(ah ah1, byte abyte0[], byte abyte1[], long l1, byte abyte2[], byte abyte3[], byte abyte4[])
    {
        boolean flag = p.d;
        byte abyte5[] = new byte[64];
        byte abyte6[] = new byte[64];
        T t = new T();
        System.arraycopy(abyte1, 0, abyte0, 64, (int)l1);
        System.arraycopy(abyte2, 0, abyte0, 32, 32);
        abyte0[0] = -2;
        int i = 1;
        do
        {
            if (i >= 32)
            {
                break;
            }
            abyte0[i] = -1;
            i++;
        } while (!flag);
        System.arraycopy(abyte4, 0, abyte0, (int)(64L + l1), 64);
        ah1.a(abyte5, abyte0, 128L + l1);
        System.arraycopy(abyte3, 0, abyte0, 32, 32);
        G.a(abyte5);
        aO.a(t, abyte5);
        l.a(abyte0, t);
        ah1.a(abyte6, abyte0, 64L + l1);
        G.a(abyte6);
        ah1 = new byte[32];
        K.a(ah1, abyte6, abyte2, abyte5);
        System.arraycopy(ah1, 0, abyte0, 32, 32);
        return 0;
    }
}
