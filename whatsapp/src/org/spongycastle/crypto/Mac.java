// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            CipherParameters

public interface Mac
{

    public abstract int doFinal(byte abyte0[], int i);

    public abstract String getAlgorithmName();

    public abstract int getMacSize();

    public abstract void init(CipherParameters cipherparameters);

    public abstract void reset();

    public abstract void update(byte byte0);

    public abstract void update(byte abyte0[], int i, int j);
}
