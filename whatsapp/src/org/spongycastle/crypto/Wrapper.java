// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            CipherParameters

public interface Wrapper
{

    public abstract String getAlgorithmName();

    public abstract void init(boolean flag, CipherParameters cipherparameters);

    public abstract byte[] unwrap(byte abyte0[], int i, int j);

    public abstract byte[] wrap(byte abyte0[], int i, int j);
}
