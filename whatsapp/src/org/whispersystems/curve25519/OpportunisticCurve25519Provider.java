// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            D, g, NativeCurve25519Provider, JavaCurve25519Provider, 
//            u

public class OpportunisticCurve25519Provider
    implements D
{

    private D a;

    OpportunisticCurve25519Provider()
    {
        try
        {
            a = new NativeCurve25519Provider();
            return;
        }
        catch (g g1)
        {
            a = new JavaCurve25519Provider();
        }
    }

    public void a(u u)
    {
        a.a(u);
    }

    public boolean a()
    {
        return a.a();
    }

    public byte[] a(int i)
    {
        return a.a(i);
    }

    public byte[] b()
    {
        return a.b();
    }

    public byte[] calculateAgreement(byte abyte0[], byte abyte1[])
    {
        return a.calculateAgreement(abyte0, abyte1);
    }

    public byte[] calculateSignature(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        return a.calculateSignature(abyte0, abyte1, abyte2);
    }

    public byte[] generatePrivateKey(byte abyte0[])
    {
        return a.generatePrivateKey(abyte0);
    }

    public byte[] generatePublicKey(byte abyte0[])
    {
        return a.generatePublicKey(abyte0);
    }

    public boolean verifySignature(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        return a.verifySignature(abyte0, abyte1, abyte2);
    }
}
