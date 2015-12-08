// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;

// Referenced classes of package org.bouncycastle.pqc.crypto.gmss:
//            GMSSDigestProvider, Treehash, GMSSRootCalc, GMSSPublicKeyParameters, 
//            GMSSPrivateKeyParameters, GMSSKeyGenerationParameters, GMSSParameters

public class GMSSKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";
    private int K[];
    private byte currentRootSigs[][];
    private byte currentSeeds[][];
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int heightOfTrees[];
    private boolean initialized;
    private int mdLength;
    private Digest messDigestTree;
    private byte nextNextSeeds[][];
    private int numLayer;
    private int otsIndex[];

    public GMSSKeyPairGenerator(GMSSDigestProvider gmssdigestprovider)
    {
        initialized = false;
        digestProvider = gmssdigestprovider;
        messDigestTree = gmssdigestprovider.get();
        mdLength = messDigestTree.getDigestSize();
        gmssRandom = new GMSSRandom(messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair()
    {
        byte abyte0[][][];
        byte abyte1[][][];
        Treehash atreehash[][];
        Treehash atreehash1[][];
        Vector avector[];
        Vector avector1[];
        Vector avector2[][];
        Vector avector3[][];
        byte abyte2[][];
        byte abyte3[][];
        byte abyte4[][];
        int j;
        if (!initialized)
        {
            initializeDefault();
        }
        abyte0 = new byte[numLayer][][];
        abyte1 = new byte[numLayer - 1][][];
        atreehash = new Treehash[numLayer][];
        atreehash1 = new Treehash[numLayer - 1][];
        avector = new Vector[numLayer];
        avector1 = new Vector[numLayer - 1];
        avector2 = new Vector[numLayer][];
        avector3 = new Vector[numLayer - 1][];
        for (int i = 0; i < numLayer; i++)
        {
            int l = heightOfTrees[i];
            int i2 = mdLength;
            abyte0[i] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
                l, i2
            });
            atreehash[i] = new Treehash[heightOfTrees[i] - K[i]];
            if (i > 0)
            {
                int i1 = heightOfTrees[i];
                int j2 = mdLength;
                abyte1[i - 1] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
                    i1, j2
                });
                atreehash1[i - 1] = new Treehash[heightOfTrees[i] - K[i]];
            }
            avector[i] = new Vector();
            if (i > 0)
            {
                avector1[i - 1] = new Vector();
            }
        }

        j = numLayer;
        int j1 = mdLength;
        abyte2 = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            j, j1
        });
        j = numLayer;
        j1 = mdLength;
        abyte3 = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            j - 1, j1
        });
        j = numLayer;
        j1 = mdLength;
        abyte4 = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            j, j1
        });
        for (j = 0; j < numLayer; j++)
        {
            System.arraycopy(currentSeeds[j], 0, abyte4[j], 0, mdLength);
        }

        j = numLayer;
        j1 = mdLength;
        currentRootSigs = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            j - 1, j1
        });
        j = numLayer - 1;
_L6:
        GMSSRootCalc gmssrootcalc;
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        gmssrootcalc = new GMSSRootCalc(heightOfTrees[j], K[j], digestProvider);
        if (j != numLayer - 1) goto _L2; else goto _L1
_L1:
        GMSSRootCalc gmssrootcalc2 = generateCurrentAuthpathAndRoot(null, avector[j], abyte4[j], j);
        gmssrootcalc = gmssrootcalc2;
_L4:
        for (int k1 = 0; k1 < heightOfTrees[j]; k1++)
        {
            System.arraycopy(gmssrootcalc.getAuthPath()[k1], 0, abyte0[j][k1], 0, mdLength);
        }

        break; /* Loop/switch isn't completed */
_L2:
        gmssrootcalc2 = generateCurrentAuthpathAndRoot(abyte2[j + 1], avector[j], abyte4[j], j);
        gmssrootcalc = gmssrootcalc2;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        exception.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
        avector2[j] = gmssrootcalc.getRetain();
        atreehash[j] = gmssrootcalc.getTreehash();
        System.arraycopy(gmssrootcalc.getRoot(), 0, abyte2[j], 0, mdLength);
        j--;
        if (true) goto _L6; else goto _L5
_L5:
        for (int k = numLayer - 2; k >= 0; k--)
        {
            GMSSRootCalc gmssrootcalc1 = generateNextAuthpathAndRoot(avector1[k], abyte4[k + 1], k + 1);
            for (int l1 = 0; l1 < heightOfTrees[k + 1]; l1++)
            {
                System.arraycopy(gmssrootcalc1.getAuthPath()[l1], 0, abyte1[k][l1], 0, mdLength);
            }

            avector3[k] = gmssrootcalc1.getRetain();
            atreehash1[k] = gmssrootcalc1.getTreehash();
            System.arraycopy(gmssrootcalc1.getRoot(), 0, abyte3[k], 0, mdLength);
            System.arraycopy(abyte4[k + 1], 0, nextNextSeeds[k], 0, mdLength);
        }

        return new AsymmetricCipherKeyPair(new GMSSPublicKeyParameters(abyte2[0], gmssPS), new GMSSPrivateKeyParameters(currentSeeds, nextNextSeeds, abyte0, abyte1, atreehash, atreehash1, avector, avector1, avector2, avector3, abyte3, currentRootSigs, gmssPS, digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte abyte0[], Vector vector, byte abyte1[], int i)
    {
        byte abyte2[] = new byte[mdLength];
        abyte2 = new byte[mdLength];
        byte abyte3[] = gmssRandom.nextSeed(abyte1);
        GMSSRootCalc gmssrootcalc = new GMSSRootCalc(heightOfTrees[i], K[i], digestProvider);
        gmssrootcalc.initialize(vector);
        int k;
        int l;
        if (i == numLayer - 1)
        {
            abyte0 = (new WinternitzOTSignature(abyte3, digestProvider.get(), otsIndex[i])).getPublicKey();
        } else
        {
            vector = new WinternitzOTSignature(abyte3, digestProvider.get(), otsIndex[i]);
            currentRootSigs[i] = vector.getSignature(abyte0);
            abyte0 = (new WinternitzOTSVerify(digestProvider.get(), otsIndex[i])).Verify(abyte0, currentRootSigs[i]);
        }
        gmssrootcalc.update(abyte0);
        l = 3;
        k = 0;
        for (int j = 1; j < 1 << heightOfTrees[i];)
        {
            int j1 = k;
            int i1 = l;
            if (j == l)
            {
                j1 = k;
                i1 = l;
                if (k < heightOfTrees[i] - K[i])
                {
                    gmssrootcalc.initializeTreehashSeed(abyte1, k);
                    i1 = l * 2;
                    j1 = k + 1;
                }
            }
            gmssrootcalc.update((new WinternitzOTSignature(gmssRandom.nextSeed(abyte1), digestProvider.get(), otsIndex[i])).getPublicKey());
            j++;
            k = j1;
            l = i1;
        }

        if (gmssrootcalc.wasFinished())
        {
            return gmssrootcalc;
        } else
        {
            System.err.println("Baum noch nicht fertig konstruiert!!!");
            return null;
        }
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte abyte0[], int i)
    {
        int j = 0;
        byte abyte1[] = new byte[numLayer];
        GMSSRootCalc gmssrootcalc = new GMSSRootCalc(heightOfTrees[i], K[i], digestProvider);
        gmssrootcalc.initialize(vector);
        int l = 3;
        int k = 0;
        while (j < 1 << heightOfTrees[i]) 
        {
            int j1 = k;
            int i1 = l;
            if (j == l)
            {
                j1 = k;
                i1 = l;
                if (k < heightOfTrees[i] - K[i])
                {
                    gmssrootcalc.initializeTreehashSeed(abyte0, k);
                    i1 = l * 2;
                    j1 = k + 1;
                }
            }
            gmssrootcalc.update((new WinternitzOTSignature(gmssRandom.nextSeed(abyte0), digestProvider.get(), otsIndex[i])).getPublicKey());
            j++;
            k = j1;
            l = i1;
        }
        if (gmssrootcalc.wasFinished())
        {
            return gmssrootcalc;
        } else
        {
            System.err.println("N\uFFFDchster Baum noch nicht fertig konstruiert!!!");
            return null;
        }
    }

    private void initializeDefault()
    {
        int ai[] = new int[4];
        int[] _tmp = ai;
        ai[0] = 10;
        ai[1] = 10;
        ai[2] = 10;
        ai[3] = 10;
        initialize(new GMSSKeyGenerationParameters(new SecureRandom(), new GMSSParameters(ai.length, ai, new int[] {
            3, 3, 3, 3
        }, new int[] {
            2, 2, 2, 2
        })));
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        return genKeyPair();
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        initialize(keygenerationparameters);
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        if (i <= 10)
        {
            int ai[] = new int[1];
            ai[0] = 10;
            securerandom = new GMSSKeyGenerationParameters(securerandom, new GMSSParameters(ai.length, ai, new int[] {
                3
            }, new int[] {
                2
            }));
        } else
        if (i <= 20)
        {
            int ai1[] = new int[2];
            int[] _tmp = ai1;
            ai1[0] = 10;
            ai1[1] = 10;
            securerandom = new GMSSKeyGenerationParameters(securerandom, new GMSSParameters(ai1.length, ai1, new int[] {
                5, 4
            }, new int[] {
                2, 2
            }));
        } else
        {
            int ai2[] = new int[4];
            int[] _tmp1 = ai2;
            ai2[0] = 10;
            ai2[1] = 10;
            ai2[2] = 10;
            ai2[3] = 10;
            securerandom = new GMSSKeyGenerationParameters(securerandom, new GMSSParameters(ai2.length, ai2, new int[] {
                9, 9, 9, 3
            }, new int[] {
                2, 2, 2, 2
            }));
        }
        initialize(((KeyGenerationParameters) (securerandom)));
    }

    public void initialize(KeyGenerationParameters keygenerationparameters)
    {
        gmssParams = (GMSSKeyGenerationParameters)keygenerationparameters;
        gmssPS = new GMSSParameters(gmssParams.getParameters().getNumOfLayers(), gmssParams.getParameters().getHeightOfTrees(), gmssParams.getParameters().getWinternitzParameter(), gmssParams.getParameters().getK());
        numLayer = gmssPS.getNumOfLayers();
        heightOfTrees = gmssPS.getHeightOfTrees();
        otsIndex = gmssPS.getWinternitzParameter();
        K = gmssPS.getK();
        int i = numLayer;
        int k = mdLength;
        currentSeeds = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i, k
        });
        i = numLayer;
        k = mdLength;
        nextNextSeeds = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i - 1, k
        });
        keygenerationparameters = new SecureRandom();
        for (int j = 0; j < numLayer; j++)
        {
            keygenerationparameters.nextBytes(currentSeeds[j]);
            gmssRandom.nextSeed(currentSeeds[j]);
        }

        initialized = true;
    }
}
