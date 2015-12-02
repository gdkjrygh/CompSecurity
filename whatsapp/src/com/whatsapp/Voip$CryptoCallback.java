// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.math.BigInteger;

public interface 
{

    public abstract BigInteger generateDiffieHellmanSharedPublicKey(byte abyte0[]);

    public abstract boolean generateDiffieHellmanSymmetricKey(BigInteger biginteger, byte abyte0[], byte abyte1[]);

    public abstract byte[] generateRandomBytes(int i);
}
