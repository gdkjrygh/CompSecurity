// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class PKCS5S2ParametersGenerator extends PBEParametersGenerator
{

    public static boolean a;
    private static final String z;
    private Mac hMac;
    private byte state[];

    public PKCS5S2ParametersGenerator(Digest digest)
    {
        boolean flag = a;
        super();
        hMac = new HMac(digest);
        state = new byte[hMac.getMacSize()];
        if (BaseKeyGenerator.a)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            a = flag;
        }
    }

    private void F(byte abyte0[], int i, byte abyte1[], byte abyte2[], int j)
    {
        boolean flag = a;
        if (i == 0)
        {
            try
            {
                throw new IllegalArgumentException(z);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        int k;
        if (abyte0 != null)
        {
            try
            {
                hMac.update(abyte0, 0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        hMac.update(abyte1, 0, abyte1.length);
        hMac.doFinal(state, 0);
        System.arraycopy(state, 0, abyte2, j, state.length);
        k = 1;
        do
        {
label0:
            {
                if (k < i)
                {
                    hMac.update(state, 0, state.length);
                    hMac.doFinal(state, 0);
                    int l = 0;
                    do
                    {
                        if (l == state.length)
                        {
                            break;
                        }
                        int i1 = j + l;
                        abyte2[i1] = (byte)(abyte2[i1] ^ state[l]);
                        l++;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            k++;
        } while (true);
    }

    private byte[] generateDerivedKey(int i)
    {
        boolean flag = a;
        int l = hMac.getMacSize();
        int i1 = ((i + l) - 1) / l;
        byte abyte0[] = new byte[4];
        byte abyte1[] = new byte[i1 * l];
        int j = 0;
        KeyParameter keyparameter = new KeyParameter(password);
        hMac.init(keyparameter);
        i = 1;
        do
        {
label0:
            {
                if (i <= i1)
                {
                    int k = 3;
                    do
                    {
                        byte byte0 = (byte)(abyte0[k] + 1);
                        abyte0[k] = byte0;
                        if (byte0 != 0)
                        {
                            break;
                        }
                        k--;
                    } while (!flag);
                    F(salt, iterationCount, abyte0, abyte1, j);
                    j += l;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return abyte1;
            }
            i++;
        } while (true);
    }

    public CipherParameters generateDerivedMacParameters(int i)
    {
        return generateDerivedParameters(i);
    }

    public CipherParameters generateDerivedParameters(int i)
    {
        i /= 8;
        return new KeyParameter(generateDerivedKey(i), 0, i);
    }

    public CipherParameters generateDerivedParameters(int i, int j)
    {
        byte abyte0[];
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = a;
        i /= 8;
        j /= 8;
        abyte0 = generateDerivedKey(i + j);
        ParametersWithIV parameterswithiv = new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte0, i, j);
        if (flag1)
        {
            IllegalArgumentException illegalargumentexception;
            boolean flag2;
            try
            {
                flag2 = BaseKeyGenerator.a;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (!flag2)
            {
                flag = true;
            }
            BaseKeyGenerator.a = flag;
        }
        return parameterswithiv;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "y,\026kXd1\034w\031s7\006wM05\006jM0:\0269Xdx\037|Xc,S(\027".toCharArray();
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
        byte byte0 = 57;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 16;
          goto _L8
_L3:
        byte0 = 88;
          goto _L8
_L4:
        byte0 = 115;
          goto _L8
        byte0 = 25;
          goto _L8
    }
}
