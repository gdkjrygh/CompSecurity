// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            PBE, BCPBEKey

public class BaseMac extends MacSpi
    implements PBE
{

    public static boolean a;
    private static final String z[];
    private Mac macEngine;

    protected BaseMac(Mac mac)
    {
        macEngine = mac;
    }

    protected byte[] engineDoFinal()
    {
        byte abyte0[] = new byte[engineGetMacLength()];
        macEngine.doFinal(abyte0, 0);
        return abyte0;
    }

    protected int engineGetMacLength()
    {
        return macEngine.getMacSize();
    }

    protected void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec)
    {
        Object obj;
label0:
        {
            boolean flag;
label1:
            {
label2:
                {
                    flag = a;
                    if (key == null)
                    {
                        throw new InvalidKeyException(z[0]);
                    }
                    if (!(key instanceof BCPBEKey))
                    {
                        break label1;
                    }
                    BCPBEKey bcpbekey = (BCPBEKey)key;
                    if (bcpbekey.getParam() != null)
                    {
                        obj = bcpbekey.getParam();
                        if (!flag)
                        {
                            break label2;
                        }
                    }
                    if (algorithmparameterspec instanceof PBEParameterSpec)
                    {
                        obj = PBE.Util.makePBEMacParameters(bcpbekey, algorithmparameterspec);
                        if (!flag)
                        {
                            break label2;
                        }
                    }
                    throw new InvalidAlgorithmParameterException(z[2]);
                }
                if (!flag)
                {
                    break label0;
                }
            }
            if (algorithmparameterspec instanceof IvParameterSpec)
            {
                obj = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmparameterspec).getIV());
                if (!flag)
                {
                    break label0;
                }
            }
            if (algorithmparameterspec == null)
            {
                obj = new KeyParameter(key.getEncoded());
                if (!flag)
                {
                    break label0;
                }
            }
            throw new InvalidAlgorithmParameterException(z[1]);
        }
        macEngine.init(((org.spongycastle.crypto.CipherParameters) (obj)));
    }

    protected void engineReset()
    {
        macEngine.reset();
    }

    protected void engineUpdate(byte byte0)
    {
        macEngine.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        macEngine.update(abyte0, i, j);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "X\0324P%@_#\005 _".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "F\021&\036#D\021m\000-A\036 \0258V\rm\0045C\032c".toCharArray();
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
        byte0 = 76;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 51;
          goto _L7
_L3:
        byte0 = 127;
          goto _L7
_L4:
        byte0 = 77;
          goto _L7
        byte0 = 112;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            ac = "c=\bP>V\0168\031>V\fm \016v_=\021>R\022(\004)A\fm\004#\023\035(P?V\013c".toCharArray();
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
        byte1 = 76;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 51;
          goto _L14
_L10:
        byte1 = 127;
          goto _L14
_L11:
        byte1 = 77;
          goto _L14
        byte1 = 112;
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
        byte byte2 = 76;
_L22:
        ac[i] = (char)(byte2 ^ c);
        i++;
        if (true) goto _L21; else goto _L20
_L20:
        byte2 = 51;
          goto _L22
_L17:
        byte2 = 127;
          goto _L22
_L18:
        byte2 = 77;
          goto _L22
        byte2 = 112;
          goto _L22
    }
}
