// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;

public class BaseKeyGenerator extends KeyGeneratorSpi
{

    public static boolean a;
    private static final String z;
    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised;

    protected BaseKeyGenerator(String s, int i, CipherKeyGenerator cipherkeygenerator)
    {
        uninitialised = true;
        algName = s;
        defaultKeySize = i;
        keySize = i;
        engine = cipherkeygenerator;
    }

    protected SecretKey engineGenerateKey()
    {
        try
        {
            if (uninitialised)
            {
                engine.init(new KeyGenerationParameters(new SecureRandom(), defaultKeySize));
                uninitialised = false;
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return new SecretKeySpec(engine.generateKey(), algName);
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        SecureRandom securerandom1;
        securerandom1 = securerandom;
        if (securerandom != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        securerandom1 = new SecureRandom();
        engine.init(new KeyGenerationParameters(securerandom1, i));
        uninitialised = false;
        return;
        securerandom;
        throw new InvalidParameterException(securerandom.getMessage());
    }

    protected void engineInit(SecureRandom securerandom)
    {
        if (securerandom == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        engine.init(new KeyGenerationParameters(securerandom, defaultKeySize));
        uninitialised = false;
        return;
        securerandom;
        throw securerandom;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        throw new InvalidAlgorithmParameterException(z);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "R9u&Uq&mcqy8ucx".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 28;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 28;
          goto _L8
_L3:
        byte0 = 86;
          goto _L8
_L4:
        byte0 = 1;
          goto _L8
        byte0 = 6;
          goto _L8
    }
}
