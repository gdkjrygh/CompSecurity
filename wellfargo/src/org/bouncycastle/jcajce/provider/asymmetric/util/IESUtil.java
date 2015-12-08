// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.util;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.jce.spec.IESParameterSpec;

public class IESUtil
{

    public IESUtil()
    {
    }

    public static IESParameterSpec guessParameterSpec(IESEngine iesengine)
    {
        if (iesengine.getCipher() == null)
        {
            return new IESParameterSpec(null, null, 128);
        }
        if (iesengine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("DES") || iesengine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("RC2") || iesengine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("RC5-32") || iesengine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("RC5-64"))
        {
            return new IESParameterSpec(null, null, 64, 64);
        }
        if (iesengine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("SKIPJACK"))
        {
            return new IESParameterSpec(null, null, 80, 80);
        }
        if (iesengine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("GOST28147"))
        {
            return new IESParameterSpec(null, null, 256, 256);
        } else
        {
            return new IESParameterSpec(null, null, 128, 128);
        }
    }
}
