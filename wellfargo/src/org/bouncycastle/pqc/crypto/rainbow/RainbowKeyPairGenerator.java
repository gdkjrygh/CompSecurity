// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

// Referenced classes of package org.bouncycastle.pqc.crypto.rainbow:
//            Layer, RainbowKeyGenerationParameters, RainbowParameters, RainbowPrivateKeyParameters, 
//            RainbowPublicKeyParameters

public class RainbowKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private short A1[][];
    private short A1inv[][];
    private short A2[][];
    private short A2inv[][];
    private short b1[];
    private short b2[];
    private boolean initialized;
    private Layer layers[];
    private int numOfLayers;
    private short pub_quadratic[][];
    private short pub_scalar[];
    private short pub_singular[][];
    private RainbowKeyGenerationParameters rainbowParams;
    private SecureRandom sr;
    private int vi[];

    public RainbowKeyPairGenerator()
    {
        initialized = false;
    }

    private void compactPublicKey(short aword0[][][])
    {
        int j1 = aword0.length;
        int k1 = aword0[0].length;
        int i = ((k1 + 1) * k1) / 2;
        pub_quadratic = (short[][])Array.newInstance(Short.TYPE, new int[] {
            j1, i
        });
        for (int l = 0; l < j1; l++)
        {
            int j = 0;
            int k = 0;
            for (; j < k1; j++)
            {
                int i1 = j;
                while (i1 < k1) 
                {
                    if (i1 == j)
                    {
                        pub_quadratic[l][k] = aword0[l][j][i1];
                    } else
                    {
                        pub_quadratic[l][k] = GF2Field.addElem(aword0[l][j][i1], aword0[l][i1][j]);
                    }
                    k++;
                    i1++;
                }
            }

        }

    }

    private void computePublicKey()
    {
        ComputeInField computeinfield = new ComputeInField();
        int k2 = vi[vi.length - 1] - vi[0];
        int l2 = vi[vi.length - 1];
        short aword0[][][] = (short[][][])Array.newInstance(Short.TYPE, new int[] {
            k2, l2, l2
        });
        pub_singular = (short[][])Array.newInstance(Short.TYPE, new int[] {
            k2, l2
        });
        pub_scalar = new short[k2];
        int k = 0;
        Object obj = new short[l2];
        for (int i = 0; i < layers.length; i++)
        {
            short aword1[][][] = layers[i].getCoeffAlpha();
            short aword2[][][] = layers[i].getCoeffBeta();
            short aword4[][] = layers[i].getCoeffGamma();
            short aword6[] = layers[i].getCoeffEta();
            int i3 = aword1[0].length;
            int j3 = aword2[0].length;
            for (int i1 = 0; i1 < i3; i1++)
            {
                for (int j1 = 0; j1 < i3; j1++)
                {
                    for (int i2 = 0; i2 < j3; i2++)
                    {
                        short aword7[] = computeinfield.multVect(aword1[i1][j1][i2], A2[j1 + j3]);
                        aword0[k + i1] = computeinfield.addSquareMatrix(aword0[k + i1], computeinfield.multVects(aword7, A2[i2]));
                        aword7 = computeinfield.multVect(b2[i2], aword7);
                        pub_singular[k + i1] = computeinfield.addVect(aword7, pub_singular[k + i1]);
                        aword7 = computeinfield.multVect(aword1[i1][j1][i2], A2[i2]);
                        aword7 = computeinfield.multVect(b2[j1 + j3], aword7);
                        pub_singular[k + i1] = computeinfield.addVect(aword7, pub_singular[k + i1]);
                        short word0 = GF2Field.multElem(aword1[i1][j1][i2], b2[j1 + j3]);
                        pub_scalar[k + i1] = GF2Field.addElem(pub_scalar[k + i1], GF2Field.multElem(word0, b2[i2]));
                    }

                }

                for (int k1 = 0; k1 < j3; k1++)
                {
                    for (int j2 = 0; j2 < j3; j2++)
                    {
                        short aword8[] = computeinfield.multVect(aword2[i1][k1][j2], A2[k1]);
                        aword0[k + i1] = computeinfield.addSquareMatrix(aword0[k + i1], computeinfield.multVects(aword8, A2[j2]));
                        aword8 = computeinfield.multVect(b2[j2], aword8);
                        pub_singular[k + i1] = computeinfield.addVect(aword8, pub_singular[k + i1]);
                        aword8 = computeinfield.multVect(aword2[i1][k1][j2], A2[j2]);
                        aword8 = computeinfield.multVect(b2[k1], aword8);
                        pub_singular[k + i1] = computeinfield.addVect(aword8, pub_singular[k + i1]);
                        short word1 = GF2Field.multElem(aword2[i1][k1][j2], b2[k1]);
                        pub_scalar[k + i1] = GF2Field.addElem(pub_scalar[k + i1], GF2Field.multElem(word1, b2[j2]));
                    }

                }

                for (int l1 = 0; l1 < j3 + i3; l1++)
                {
                    short aword9[] = computeinfield.multVect(aword4[i1][l1], A2[l1]);
                    pub_singular[k + i1] = computeinfield.addVect(aword9, pub_singular[k + i1]);
                    pub_scalar[k + i1] = GF2Field.addElem(pub_scalar[k + i1], GF2Field.multElem(aword4[i1][l1], b2[l1]));
                }

                pub_scalar[k + i1] = GF2Field.addElem(pub_scalar[k + i1], aword6[i1]);
            }

            k += i3;
        }

        aword1 = (short[][][])Array.newInstance(Short.TYPE, new int[] {
            k2, l2, l2
        });
        short aword3[][] = (short[][])Array.newInstance(Short.TYPE, new int[] {
            k2, l2
        });
        short aword5[] = new short[k2];
        for (int j = 0; j < k2; j++)
        {
            for (int l = 0; l < A1.length; l++)
            {
                aword1[j] = computeinfield.addSquareMatrix(aword1[j], computeinfield.multMatrix(A1[j][l], aword0[l]));
                aword3[j] = computeinfield.addVect(aword3[j], computeinfield.multVect(A1[j][l], pub_singular[l]));
                aword5[j] = GF2Field.addElem(aword5[j], GF2Field.multElem(A1[j][l], pub_scalar[l]));
            }

            aword5[j] = GF2Field.addElem(aword5[j], b1[j]);
        }

        pub_singular = aword3;
        pub_scalar = aword5;
        compactPublicKey(aword1);
    }

    private void generateF()
    {
        layers = new Layer[numOfLayers];
        for (int i = 0; i < numOfLayers; i++)
        {
            layers[i] = new Layer(vi[i], vi[i + 1], sr);
        }

    }

    private void generateL1()
    {
        int l = vi[vi.length - 1] - vi[0];
        A1 = (short[][])Array.newInstance(Short.TYPE, new int[] {
            l, l
        });
        A1inv = (short[][])null;
        ComputeInField computeinfield = new ComputeInField();
        for (; A1inv == null; A1inv = computeinfield.inverse(A1))
        {
            for (int i = 0; i < l; i++)
            {
                for (int k = 0; k < l; k++)
                {
                    A1[i][k] = (short)(sr.nextInt() & 0xff);
                }

            }

        }

        b1 = new short[l];
        for (int j = 0; j < l; j++)
        {
            b1[j] = (short)(sr.nextInt() & 0xff);
        }

    }

    private void generateL2()
    {
        int l = vi[vi.length - 1];
        A2 = (short[][])Array.newInstance(Short.TYPE, new int[] {
            l, l
        });
        A2inv = (short[][])null;
        ComputeInField computeinfield = new ComputeInField();
        for (; A2inv == null; A2inv = computeinfield.inverse(A2))
        {
            for (int i = 0; i < l; i++)
            {
                for (int k = 0; k < l; k++)
                {
                    A2[i][k] = (short)(sr.nextInt() & 0xff);
                }

            }

        }

        b2 = new short[l];
        for (int j = 0; j < l; j++)
        {
            b2[j] = (short)(sr.nextInt() & 0xff);
        }

    }

    private void initializeDefault()
    {
        initialize(new RainbowKeyGenerationParameters(new SecureRandom(), new RainbowParameters()));
    }

    private void keygen()
    {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair()
    {
        if (!initialized)
        {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowprivatekeyparameters = new RainbowPrivateKeyParameters(A1inv, b1, A2inv, b2, vi, layers);
        return new AsymmetricCipherKeyPair(new RainbowPublicKeyParameters(vi[vi.length - 1] - vi[0], pub_quadratic, pub_singular, pub_scalar), rainbowprivatekeyparameters);
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        return genKeyPair();
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        initialize(keygenerationparameters);
    }

    public void initialize(KeyGenerationParameters keygenerationparameters)
    {
        rainbowParams = (RainbowKeyGenerationParameters)keygenerationparameters;
        sr = new SecureRandom();
        vi = rainbowParams.getParameters().getVi();
        numOfLayers = rainbowParams.getParameters().getNumOfLayers();
        initialized = true;
    }
}
