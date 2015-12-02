// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            u

interface D
{

    public abstract void a(u u);

    public abstract boolean a();

    public abstract byte[] a(int i);

    public abstract byte[] b();

    public abstract byte[] calculateAgreement(byte abyte0[], byte abyte1[]);

    public abstract byte[] calculateSignature(byte abyte0[], byte abyte1[], byte abyte2[]);

    public abstract byte[] generatePrivateKey(byte abyte0[]);

    public abstract byte[] generatePublicKey(byte abyte0[]);

    public abstract boolean verifySignature(byte abyte0[], byte abyte1[], byte abyte2[]);
}
