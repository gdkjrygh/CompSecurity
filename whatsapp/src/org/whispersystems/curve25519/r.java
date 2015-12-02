// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            D, u, z, J, 
//            g, T, ah

abstract class r
    implements D
{

    private static final String z;
    private u a;
    private final ah b;

    protected r(ah ah, u u1)
    {
        b = ah;
        a = u1;
    }

    public void a(u u1)
    {
        a = u1;
    }

    public abstract boolean a();

    public byte[] a(int i)
    {
        byte abyte0[] = new byte[i];
        a.a(abyte0);
        return abyte0;
    }

    public byte[] b()
    {
        return generatePrivateKey(a(32));
    }

    public byte[] calculateAgreement(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[32];
        org.whispersystems.curve25519.z.a(abyte2, abyte0, abyte1);
        return abyte2;
    }

    public byte[] calculateSignature(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        byte abyte3[] = new byte[64];
        try
        {
            if (J.a(b, abyte3, abyte1, abyte2, abyte2.length, abyte0) != 0)
            {
                throw new IllegalArgumentException(z);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        return abyte3;
    }

    public byte[] generatePrivateKey(byte abyte0[])
    {
        byte abyte1[];
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = g.a;
        abyte1 = new byte[32];
        System.arraycopy(abyte0, 0, abyte1, 0, 32);
        abyte1[0] = (byte)(abyte1[0] & 0xf8);
        abyte1[31] = (byte)(abyte1[31] & 0x7f);
        abyte1[31] = (byte)(abyte1[31] | 0x40);
        if (flag1)
        {
            boolean flag2;
            try
            {
                flag2 = T.b;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (!flag2)
            {
                flag = true;
            }
            T.b = flag;
        }
        return abyte1;
        abyte0;
        throw abyte0;
    }

    public byte[] generatePublicKey(byte abyte0[])
    {
        byte abyte1[] = new byte[32];
        J.a(abyte1, abyte0);
        return abyte1;
    }

    public boolean verifySignature(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        int i;
        try
        {
            i = J.a(b, abyte2, abyte0, abyte1, abyte1.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        return i == 0;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\027k)\0002=kz\026+9k?\027 zc;\013s6k4\024'2/".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 83;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 90;
          goto _L8
_L3:
        byte0 = 14;
          goto _L8
_L4:
        byte0 = 90;
          goto _L8
        byte0 = 115;
          goto _L8
    }
}
