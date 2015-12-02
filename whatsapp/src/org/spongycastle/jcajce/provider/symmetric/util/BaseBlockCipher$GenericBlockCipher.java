// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;

interface 
{

    public abstract int doFinal(byte abyte0[], int i);

    public abstract String getAlgorithmName();

    public abstract int getOutputSize(int i);

    public abstract BlockCipher getUnderlyingCipher();

    public abstract int getUpdateOutputSize(int i);

    public abstract void init(boolean flag, CipherParameters cipherparameters);

    public abstract int processByte(byte byte0, byte abyte0[], int i);

    public abstract int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k);

    public abstract void updateAAD(byte abyte0[], int i, int j);

    public abstract boolean wrapOnNoPadding();
}
