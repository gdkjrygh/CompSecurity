// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;

public interface MessageEncryptor
{

    public abstract void init(boolean flag, CipherParameters cipherparameters);

    public abstract byte[] messageDecrypt(byte abyte0[]);

    public abstract byte[] messageEncrypt(byte abyte0[]);
}
