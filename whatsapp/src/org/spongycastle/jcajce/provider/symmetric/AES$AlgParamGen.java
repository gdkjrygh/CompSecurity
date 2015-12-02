// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;

public class hmParameterGenerator extends BaseAlgorithmParameterGenerator
{

    private static final String z[];

    protected AlgorithmParameters engineGenerateParameters()
    {
        byte abyte0[] = new byte[16];
        AlgorithmParameters algorithmparameters;
        try
        {
            if (random == null)
            {
                random = new SecureRandom();
            }
        }
        catch (Exception exception)
        {
            throw exception;
        }
        random.nextBytes(abyte0);
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance(z[1], z[2]);
            algorithmparameters.init(new IvParameterSpec(abyte0));
        }
        catch (Exception exception1)
        {
            throw new RuntimeException(exception1.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        throw new InvalidAlgorithmParameterException(z[0]);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\020\024e6m.\013*7l;\037e\004t9\0247,l6\026\025$j?\026 1},(5 {~\035*78\037>\026eh?\t$(}*\0367e\177;\025 7y*\022*+6".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\037>\026".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_195;
_L1:
        byte0 = 24;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 94;
          goto _L7
_L3:
        byte0 = 123;
          goto _L7
_L4:
        byte0 = 69;
          goto _L7
        byte0 = 69;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            ac = "\r8".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 240
    //                   0 261
    //                   1 267
    //                   2 273
    //                   3 279;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_279;
_L8:
        byte1 = 24;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 94;
          goto _L14
_L10:
        byte1 = 123;
          goto _L14
_L11:
        byte1 = 69;
          goto _L14
        byte1 = 69;
          goto _L14
_L21:
        byte byte1;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 345
    //                   1 351
    //                   2 357
    //                   3 363;
           goto _L15 _L16 _L17 _L18 _L19
_L16:
        break; /* Loop/switch isn't completed */
_L19:
        break MISSING_BLOCK_LABEL_363;
_L15:
        byte byte2 = 24;
_L22:
        ac[i] = (char)(byte2 ^ c);
        i++;
        if (true) goto _L21; else goto _L20
_L20:
        byte2 = 94;
          goto _L22
_L17:
        byte2 = 123;
          goto _L22
_L18:
        byte2 = 69;
          goto _L22
        byte2 = 69;
          goto _L22
    }

    public hmParameterGenerator()
    {
    }
}
