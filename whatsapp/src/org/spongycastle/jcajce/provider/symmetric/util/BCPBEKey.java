// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseMac

public class BCPBEKey
    implements PBEKey
{

    private static final String z;
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    CipherParameters param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong;
    int type;

    public BCPBEKey(String s, int i, int j, int k, int l, PBEKeySpec pbekeyspec, CipherParameters cipherparameters)
    {
        tryWrong = false;
        algorithm = s;
        type = i;
        digest = j;
        keySize = k;
        ivSize = l;
        pbeKeySpec = pbekeyspec;
        param = cipherparameters;
    }

    public String getAlgorithm()
    {
        return algorithm;
    }

    int getDigest()
    {
        return digest;
    }

    public byte[] getEncoded()
    {
label0:
        {
            KeyParameter keyparameter;
label1:
            {
                if (param == null)
                {
                    break label0;
                }
                if (param instanceof ParametersWithIV)
                {
                    keyparameter = (KeyParameter)((ParametersWithIV)param).getParameters();
                    if (!BaseMac.a)
                    {
                        break label1;
                    }
                }
                keyparameter = (KeyParameter)param;
            }
            return keyparameter.getKey();
        }
        if (type == 5)
        {
            return PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pbeKeySpec.getPassword());
        } else
        {
            return PBEParametersGenerator.PKCS5PasswordToBytes(pbeKeySpec.getPassword());
        }
    }

    public String getFormat()
    {
        return z;
    }

    public int getIterationCount()
    {
        return pbeKeySpec.getIterationCount();
    }

    public int getIvSize()
    {
        return ivSize;
    }

    int getKeySize()
    {
        return keySize;
    }

    public CipherParameters getParam()
    {
        return param;
    }

    public char[] getPassword()
    {
        return pbeKeySpec.getPassword();
    }

    public byte[] getSalt()
    {
        return pbeKeySpec.getSalt();
    }

    int getType()
    {
        return type;
    }

    public void setTryWrongPKCS12Zero(boolean flag)
    {
        tryWrong = flag;
    }

    boolean shouldTryWrongPKCS12()
    {
        return tryWrong;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\013%g".toCharArray();
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
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 33;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 89;
          goto _L8
_L3:
        byte0 = 100;
          goto _L8
_L4:
        byte0 = 48;
          goto _L8
        byte0 = 67;
          goto _L8
    }
}
