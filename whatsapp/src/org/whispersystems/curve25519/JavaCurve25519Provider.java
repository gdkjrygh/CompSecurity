// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            r, W, x, u

public class JavaCurve25519Provider extends r
{

    protected JavaCurve25519Provider()
    {
        super(new W(), new x());
    }

    public void a(u u)
    {
        super.a(u);
    }

    public boolean a()
    {
        return false;
    }

    public byte[] a(int i)
    {
        return super.a(i);
    }

    public byte[] b()
    {
        return super.b();
    }

    public byte[] calculateAgreement(byte abyte0[], byte abyte1[])
    {
        return super.calculateAgreement(abyte0, abyte1);
    }

    public byte[] calculateSignature(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        return super.calculateSignature(abyte0, abyte1, abyte2);
    }

    public byte[] generatePrivateKey(byte abyte0[])
    {
        return super.generatePrivateKey(abyte0);
    }

    public byte[] generatePublicKey(byte abyte0[])
    {
        return super.generatePublicKey(abyte0);
    }

    public boolean verifySignature(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        return super.verifySignature(abyte0, abyte1, abyte2);
    }
}
