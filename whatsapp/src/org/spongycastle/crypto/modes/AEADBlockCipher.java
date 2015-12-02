// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;

public interface AEADBlockCipher
{

    public abstract int doFinal(byte abyte0[], int i);

    public abstract String getAlgorithmName();

    public abstract byte[] getMac();

    public abstract int getOutputSize(int i);

    public abstract BlockCipher getUnderlyingCipher();

    public abstract int getUpdateOutputSize(int i);

    public abstract void init(boolean flag, CipherParameters cipherparameters);

    public abstract void processAADByte(byte byte0);

    public abstract void processAADBytes(byte abyte0[], int i, int j);

    public abstract int processByte(byte byte0, byte abyte0[], int i);

    public abstract int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k);

    public abstract void reset();
}
