// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.util.Arrays;

public class Layer
{

    private short coeff_alpha[][][];
    private short coeff_beta[][][];
    private short coeff_eta[];
    private short coeff_gamma[][];
    private int oi;
    private int vi;
    private int viNext;

    public Layer(byte byte0, byte byte1, short aword0[][][], short aword1[][][], short aword2[][], short aword3[])
    {
        vi = byte0 & 0xff;
        viNext = byte1 & 0xff;
        oi = viNext - vi;
        coeff_alpha = aword0;
        coeff_beta = aword1;
        coeff_gamma = aword2;
        coeff_eta = aword3;
    }

    public Layer(int i, int j, SecureRandom securerandom)
    {
        boolean flag = false;
        super();
        vi = i;
        viNext = j;
        oi = j - i;
        i = oi;
        j = oi;
        int k = vi;
        coeff_alpha = (short[][][])Array.newInstance(Short.TYPE, new int[] {
            i, j, k
        });
        i = oi;
        j = vi;
        k = vi;
        coeff_beta = (short[][][])Array.newInstance(Short.TYPE, new int[] {
            i, j, k
        });
        i = oi;
        j = viNext;
        coeff_gamma = (short[][])Array.newInstance(Short.TYPE, new int[] {
            i, j
        });
        coeff_eta = new short[oi];
        int j1 = oi;
        for (i = 0; i < j1; i++)
        {
            for (j = 0; j < oi; j++)
            {
                for (int l = 0; l < vi; l++)
                {
                    coeff_alpha[i][j][l] = (short)(securerandom.nextInt() & 0xff);
                }

            }

        }

        for (i = 0; i < j1; i++)
        {
            for (j = 0; j < vi; j++)
            {
                for (int i1 = 0; i1 < vi; i1++)
                {
                    coeff_beta[i][j][i1] = (short)(securerandom.nextInt() & 0xff);
                }

            }

        }

        i = 0;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= j1)
            {
                break;
            }
            for (j = 0; j < viNext; j++)
            {
                coeff_gamma[i][j] = (short)(securerandom.nextInt() & 0xff);
            }

            i++;
        } while (true);
        for (; j < j1; j++)
        {
            coeff_eta[j] = (short)(securerandom.nextInt() & 0xff);
        }

    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof Layer))
        {
            if (vi == ((Layer) (obj = (Layer)obj)).getVi() && viNext == ((Layer) (obj)).getViNext() && oi == ((Layer) (obj)).getOi() && RainbowUtil.equals(coeff_alpha, ((Layer) (obj)).getCoeffAlpha()) && RainbowUtil.equals(coeff_beta, ((Layer) (obj)).getCoeffBeta()) && RainbowUtil.equals(coeff_gamma, ((Layer) (obj)).getCoeffGamma()) && RainbowUtil.equals(coeff_eta, ((Layer) (obj)).getCoeffEta()))
            {
                return true;
            }
        }
        return false;
    }

    public short[][][] getCoeffAlpha()
    {
        return coeff_alpha;
    }

    public short[][][] getCoeffBeta()
    {
        return coeff_beta;
    }

    public short[] getCoeffEta()
    {
        return coeff_eta;
    }

    public short[][] getCoeffGamma()
    {
        return coeff_gamma;
    }

    public int getOi()
    {
        return oi;
    }

    public int getVi()
    {
        return vi;
    }

    public int getViNext()
    {
        return viNext;
    }

    public int hashCode()
    {
        return (((((vi * 37 + viNext) * 37 + oi) * 37 + Arrays.hashCode(coeff_alpha)) * 37 + Arrays.hashCode(coeff_beta)) * 37 + Arrays.hashCode(coeff_gamma)) * 37 + Arrays.hashCode(coeff_eta);
    }

    public short[][] plugInVinegars(short aword0[])
    {
        boolean flag = false;
        int i = oi;
        int j = oi;
        short aword1[][] = (short[][])Array.newInstance(Short.TYPE, new int[] {
            i, j + 1
        });
        short aword2[] = new short[oi];
        for (i = 0; i < oi; i++)
        {
            for (j = 0; j < vi; j++)
            {
                for (int k = 0; k < vi; k++)
                {
                    short word0 = GF2Field.multElem(GF2Field.multElem(coeff_beta[i][j][k], aword0[j]), aword0[k]);
                    aword2[i] = GF2Field.addElem(aword2[i], word0);
                }

            }

        }

        for (i = 0; i < oi; i++)
        {
            for (j = 0; j < oi; j++)
            {
                for (int l = 0; l < vi; l++)
                {
                    short word1 = GF2Field.multElem(coeff_alpha[i][j][l], aword0[l]);
                    aword1[i][j] = GF2Field.addElem(aword1[i][j], word1);
                }

            }

        }

        for (i = 0; i < oi; i++)
        {
            for (j = 0; j < vi; j++)
            {
                short word2 = GF2Field.multElem(coeff_gamma[i][j], aword0[j]);
                aword2[i] = GF2Field.addElem(aword2[i], word2);
            }

        }

        for (i = 0; i < oi; i++)
        {
            for (j = vi; j < viNext; j++)
            {
                aword1[i][j - vi] = GF2Field.addElem(coeff_gamma[i][j], aword1[i][j - vi]);
            }

        }

        i = 0;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= oi)
            {
                break;
            }
            aword2[i] = GF2Field.addElem(aword2[i], coeff_eta[i]);
            i++;
        } while (true);
        for (; j < oi; j++)
        {
            aword1[j][oi] = aword2[j];
        }

        return aword1;
    }
}
