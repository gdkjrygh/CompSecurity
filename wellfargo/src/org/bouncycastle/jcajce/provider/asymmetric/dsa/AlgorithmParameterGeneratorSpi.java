// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class AlgorithmParameterGeneratorSpi extends java.security.AlgorithmParameterGeneratorSpi
{

    protected SecureRandom random;
    protected int strength;

    public AlgorithmParameterGeneratorSpi()
    {
        strength = 1024;
    }

    protected AlgorithmParameters engineGenerateParameters()
    {
        Object obj = new DSAParametersGenerator();
        AlgorithmParameters algorithmparameters;
        if (random != null)
        {
            ((DSAParametersGenerator) (obj)).init(strength, 20, random);
        } else
        {
            ((DSAParametersGenerator) (obj)).init(strength, 20, new SecureRandom());
        }
        obj = ((DSAParametersGenerator) (obj)).generateParameters();
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("DSA", BouncyCastleProvider.PROVIDER_NAME);
            algorithmparameters.init(new DSAParameterSpec(((DSAParameters) (obj)).getP(), ((DSAParameters) (obj)).getQ(), ((DSAParameters) (obj)).getG()));
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        if (i < 512 || i > 1024 || i % 64 != 0)
        {
            throw new InvalidParameterException("strength must be from 512 - 1024 and a multiple of 64");
        } else
        {
            strength = i;
            random = securerandom;
            return;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
