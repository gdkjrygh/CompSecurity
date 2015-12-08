// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

// Referenced classes of package org.bouncycastle.pqc.crypto.rainbow:
//            RainbowPrivateKeyParameters, Layer, RainbowPublicKeyParameters, RainbowKeyParameters

public class RainbowSigner
    implements MessageSigner
{

    private ComputeInField cf;
    RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;
    private short x[];

    public RainbowSigner()
    {
        cf = new ComputeInField();
    }

    private short[] initSign(Layer alayer[], short aword0[])
    {
        short aword1[] = new short[aword0.length];
        aword0 = cf.addVect(((RainbowPrivateKeyParameters)key).getB1(), aword0);
        aword0 = cf.multiplyMatrix(((RainbowPrivateKeyParameters)key).getInvA1(), aword0);
        for (int i = 0; i < alayer[0].getVi(); i++)
        {
            x[i] = (short)random.nextInt();
            x[i] = (short)(x[i] & 0xff);
        }

        return aword0;
    }

    private short[] makeMessageRepresentative(byte abyte0[])
    {
        int i = 0;
        short aword0[] = new short[signableDocumentLength];
        int j = 0;
        int k;
        do
        {
            if (i >= abyte0.length)
            {
                return aword0;
            }
            aword0[i] = abyte0[j];
            aword0[i] = (short)(aword0[i] & 0xff);
            j++;
            k = i + 1;
            i = k;
        } while (k < aword0.length);
        return aword0;
    }

    private short[] verifySignatureIntern(short aword0[])
    {
        short aword1[][] = ((RainbowPublicKeyParameters)key).getCoeffQuadratic();
        short aword2[][] = ((RainbowPublicKeyParameters)key).getCoeffSingular();
        short aword3[] = ((RainbowPublicKeyParameters)key).getCoeffScalar();
        short aword4[] = new short[aword1.length];
        int i1 = aword2[0].length;
        for (int k = 0; k < aword1.length; k++)
        {
            int i = 0;
            int j = 0;
            for (; i < i1; i++)
            {
                for (int l = i; l < i1; l++)
                {
                    short word0 = GF2Field.multElem(aword1[k][j], GF2Field.multElem(aword0[i], aword0[l]));
                    aword4[k] = GF2Field.addElem(aword4[k], word0);
                    j++;
                }

                short word1 = GF2Field.multElem(aword2[k][i], aword0[i]);
                aword4[k] = GF2Field.addElem(aword4[k], word1);
            }

            aword4[k] = GF2Field.addElem(aword4[k], aword3[k]);
        }

        return aword4;
    }

    public byte[] generateSignature(byte abyte0[])
    {
        Layer alayer[];
        byte abyte1[];
        int l;
        alayer = ((RainbowPrivateKeyParameters)key).getLayers();
        l = alayer.length;
        x = new short[((RainbowPrivateKeyParameters)key).getInvA2().length];
        abyte1 = new byte[alayer[l - 1].getViNext()];
        abyte0 = makeMessageRepresentative(abyte0);
_L5:
        short aword0[] = initSign(alayer, abyte0);
        int i;
        int j;
        j = 0;
        i = 0;
_L6:
        if (j >= l) goto _L2; else goto _L1
_L1:
        short aword1[];
        aword1 = new short[alayer[j].getOi()];
        short aword2[] = new short[alayer[j].getOi()];
        int k = 0;
        while (k < alayer[j].getOi()) 
        {
            aword1[k] = aword0[i];
            i++;
            k++;
        }
        aword1 = cf.solveEquation(alayer[j].plugInVinegars(x), aword1);
        if (aword1 != null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        throw new Exception("LES is not solveable!");
_L3:
        if (k >= aword1.length)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        x[alayer[j].getVi() + k] = aword1[k];
        k++;
          goto _L3
_L2:
        aword0 = cf.addVect(((RainbowPrivateKeyParameters)key).getB2(), x);
        aword0 = cf.multiplyMatrix(((RainbowPrivateKeyParameters)key).getInvA2(), aword0);
        i = 0;
        while (i < abyte1.length) 
        {
            abyte1[i] = (byte)aword0[i];
            i++;
        }
        i = 1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        i = 0;
        if (!i) goto _L5; else goto _L4
_L4:
        return abyte1;
        k = 0;
          goto _L3
        j++;
          goto _L6
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                random = cipherparameters.getRandom();
                key = (RainbowPrivateKeyParameters)cipherparameters.getParameters();
            } else
            {
                random = new SecureRandom();
                key = (RainbowPrivateKeyParameters)cipherparameters;
            }
        } else
        {
            key = (RainbowPublicKeyParameters)cipherparameters;
        }
        signableDocumentLength = key.getDocLength();
    }

    public boolean verifySignature(byte abyte0[], byte abyte1[])
    {
        short aword0[] = new short[abyte1.length];
        for (int i = 0; i < abyte1.length; i++)
        {
            aword0[i] = (short)((short)abyte1[i] & 0xff);
        }

        abyte0 = makeMessageRepresentative(abyte0);
        abyte1 = verifySignatureIntern(aword0);
        if (abyte0.length != abyte1.length)
        {
            return false;
        }
        int j = 0;
        boolean flag = true;
        while (j < abyte0.length) 
        {
            if (flag && abyte0[j] == abyte1[j])
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j++;
        }
        return flag;
    }
}
