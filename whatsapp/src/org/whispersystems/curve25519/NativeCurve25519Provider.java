// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            D, x, g, u

class NativeCurve25519Provider
    implements D
{

    private static Throwable a;
    private static boolean c;
    private u b;

    NativeCurve25519Provider()
    {
        b = new x();
        if (!c)
        {
            throw new g(a);
        }
        try
        {
            smokeCheck(31337);
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            throw new g(unsatisfiedlinkerror);
        }
    }

    private native boolean smokeCheck(int i);

    public void a(u u1)
    {
        b = u1;
    }

    public boolean a()
    {
        return true;
    }

    public byte[] a(int i)
    {
        byte abyte0[] = new byte[i];
        b.a(abyte0);
        return abyte0;
    }

    public byte[] b()
    {
        return generatePrivateKey(a(32));
    }

    public native byte[] calculateAgreement(byte abyte0[], byte abyte1[]);

    public native byte[] calculateSignature(byte abyte0[], byte abyte1[], byte abyte2[]);

    public native byte[] generatePrivateKey(byte abyte0[]);

    public native byte[] generatePublicKey(byte abyte0[]);

    public native boolean verifySignature(byte abyte0[], byte abyte1[], byte abyte2[]);

    static 
    {
        Object obj;
        int i;
        int j;
        c = false;
        a = null;
        obj = "\036\0240<bOTw{>".toCharArray();
        j = obj.length;
        i = 0;
_L7:
        if (j > i)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = (new String(((char []) (obj)))).intern();
        System.loadLibrary(((String) (obj)));
        c = true;
        return;
        char c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 84
    //                   0 102
    //                   1 108
    //                   2 114
    //                   3 120;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_120;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 7;
_L8:
        obj[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 125;
          goto _L8
_L3:
        byte0 = 97;
          goto _L8
_L4:
        byte0 = 66;
          goto _L8
        byte0 = 74;
          goto _L8
        Object obj1;
        obj1;
_L10:
        c = false;
        a = ((Throwable) (obj1));
        return;
        obj1;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
