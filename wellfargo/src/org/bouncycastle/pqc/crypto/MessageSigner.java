// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;

public interface MessageSigner
{

    public abstract byte[] generateSignature(byte abyte0[]);

    public abstract void init(boolean flag, CipherParameters cipherparameters);

    public abstract boolean verifySignature(byte abyte0[], byte abyte1[]);
}
