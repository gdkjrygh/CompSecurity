// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;

// Referenced classes of package org.bouncycastle.pqc.crypto.gmss:
//            GMSSKeyParameters, GMSSDigestProvider, GMSSParameters, GMSSRootCalc, 
//            GMSSLeaf, GMSSRootSig, Treehash

public class GMSSPrivateKeyParameters extends GMSSKeyParameters
{

    private int K[];
    private byte currentAuthPaths[][][];
    private Vector currentRetain[][];
    private byte currentRootSig[][];
    private byte currentSeeds[][];
    private Vector currentStack[];
    private Treehash currentTreehash[][];
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private int heightOfTrees[];
    private int index[];
    private byte keep[][][];
    private int mdLength;
    private Digest messDigestTrees;
    private int minTreehash[];
    private byte nextAuthPaths[][][];
    private GMSSLeaf nextNextLeaf[];
    private GMSSRootCalc nextNextRoot[];
    private byte nextNextSeeds[][];
    private Vector nextRetain[][];
    private byte nextRoot[][];
    private GMSSRootSig nextRootSig[];
    private Vector nextStack[];
    private Treehash nextTreehash[][];
    private int numLayer;
    private int numLeafs[];
    private int otsIndex[];
    private GMSSLeaf upperLeaf[];
    private GMSSLeaf upperTreehashLeaf[];

    public GMSSPrivateKeyParameters(int ai[], byte abyte0[][], byte abyte1[][], byte abyte2[][][], byte abyte3[][][], byte abyte4[][][], Treehash atreehash[][], 
            Treehash atreehash1[][], Vector avector[], Vector avector1[], Vector avector2[][], Vector avector3[][], GMSSLeaf agmssleaf[], GMSSLeaf agmssleaf1[], 
            GMSSLeaf agmssleaf2[], int ai1[], byte abyte5[][], GMSSRootCalc agmssrootcalc[], byte abyte6[][], GMSSRootSig agmssrootsig[], GMSSParameters gmssparameters, 
            GMSSDigestProvider gmssdigestprovider)
    {
        super(true, gmssparameters);
        messDigestTrees = gmssdigestprovider.get();
        mdLength = messDigestTrees.getDigestSize();
        gmssPS = gmssparameters;
        otsIndex = gmssparameters.getWinternitzParameter();
        K = gmssparameters.getK();
        heightOfTrees = gmssparameters.getHeightOfTrees();
        numLayer = gmssPS.getNumOfLayers();
        if (ai == null)
        {
            index = new int[numLayer];
            for (int i = 0; i < numLayer; i++)
            {
                index[i] = 0;
            }

        } else
        {
            index = ai;
        }
        currentSeeds = abyte0;
        nextNextSeeds = abyte1;
        currentAuthPaths = abyte2;
        nextAuthPaths = abyte3;
        if (abyte4 == null)
        {
            keep = new byte[numLayer][][];
            for (int j = 0; j < numLayer; j++)
            {
                ai = keep;
                int l2 = (int)Math.floor(heightOfTrees[j] / 2);
                int i3 = mdLength;
                ai[j] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
                    l2, i3
                });
            }

        } else
        {
            keep = abyte4;
        }
        if (avector == null)
        {
            currentStack = new Vector[numLayer];
            for (int k = 0; k < numLayer; k++)
            {
                currentStack[k] = new Vector();
            }

        } else
        {
            currentStack = avector;
        }
        if (avector1 == null)
        {
            nextStack = new Vector[numLayer - 1];
            for (int l = 0; l < numLayer - 1; l++)
            {
                nextStack[l] = new Vector();
            }

        } else
        {
            nextStack = avector1;
        }
        currentTreehash = atreehash;
        nextTreehash = atreehash1;
        currentRetain = avector2;
        nextRetain = avector3;
        nextRoot = abyte5;
        digestProvider = gmssdigestprovider;
        if (agmssrootcalc == null)
        {
            nextNextRoot = new GMSSRootCalc[numLayer - 1];
            for (int i1 = 0; i1 < numLayer - 1; i1++)
            {
                nextNextRoot[i1] = new GMSSRootCalc(heightOfTrees[i1 + 1], K[i1 + 1], digestProvider);
            }

        } else
        {
            nextNextRoot = agmssrootcalc;
        }
        currentRootSig = abyte6;
        numLeafs = new int[numLayer];
        for (int j1 = 0; j1 < numLayer; j1++)
        {
            numLeafs[j1] = 1 << heightOfTrees[j1];
        }

        gmssRandom = new GMSSRandom(messDigestTrees);
        if (numLayer > 1)
        {
            if (agmssleaf == null)
            {
                nextNextLeaf = new GMSSLeaf[numLayer - 2];
                for (int k1 = 0; k1 < numLayer - 2; k1++)
                {
                    nextNextLeaf[k1] = new GMSSLeaf(gmssdigestprovider.get(), otsIndex[k1 + 1], numLeafs[k1 + 2]);
                    nextNextLeaf[k1].initLeafCalc(nextNextSeeds[k1]);
                }

            } else
            {
                nextNextLeaf = agmssleaf;
            }
        } else
        {
            nextNextLeaf = new GMSSLeaf[0];
        }
        if (agmssleaf1 == null)
        {
            upperLeaf = new GMSSLeaf[numLayer - 1];
            for (int l1 = 0; l1 < numLayer - 1; l1++)
            {
                upperLeaf[l1] = new GMSSLeaf(gmssdigestprovider.get(), otsIndex[l1], numLeafs[l1 + 1]);
                upperLeaf[l1].initLeafCalc(currentSeeds[l1]);
            }

        } else
        {
            upperLeaf = agmssleaf1;
        }
        if (agmssleaf2 == null)
        {
            upperTreehashLeaf = new GMSSLeaf[numLayer - 1];
            for (int i2 = 0; i2 < numLayer - 1; i2++)
            {
                upperTreehashLeaf[i2] = new GMSSLeaf(gmssdigestprovider.get(), otsIndex[i2], numLeafs[i2 + 1]);
            }

        } else
        {
            upperTreehashLeaf = agmssleaf2;
        }
        if (ai1 == null)
        {
            minTreehash = new int[numLayer - 1];
            for (int j2 = 0; j2 < numLayer - 1; j2++)
            {
                minTreehash[j2] = -1;
            }

        } else
        {
            minTreehash = ai1;
        }
        ai = new byte[mdLength];
        abyte1 = new byte[mdLength];
        if (agmssrootsig == null)
        {
            nextRootSig = new GMSSRootSig[numLayer - 1];
            for (int k2 = 0; k2 < numLayer - 1; k2++)
            {
                System.arraycopy(abyte0[k2], 0, ai, 0, mdLength);
                gmssRandom.nextSeed(ai);
                abyte1 = gmssRandom.nextSeed(ai);
                nextRootSig[k2] = new GMSSRootSig(gmssdigestprovider.get(), otsIndex[k2], heightOfTrees[k2 + 1]);
                nextRootSig[k2].initSign(abyte1, abyte5[k2]);
            }

        } else
        {
            nextRootSig = agmssrootsig;
        }
    }

    public GMSSPrivateKeyParameters(byte abyte0[][], byte abyte1[][], byte abyte2[][][], byte abyte3[][][], Treehash atreehash[][], Treehash atreehash1[][], Vector avector[], 
            Vector avector1[], Vector avector2[][], Vector avector3[][], byte abyte4[][], byte abyte5[][], GMSSParameters gmssparameters, GMSSDigestProvider gmssdigestprovider)
    {
        this(null, abyte0, abyte1, abyte2, abyte3, (byte[][][])null, atreehash, atreehash1, avector, avector1, avector2, avector3, null, null, null, null, abyte4, null, abyte5, null, gmssparameters, gmssdigestprovider);
    }

    private void computeAuthPaths(int i)
    {
        int k1 = index[i];
        int i1 = heightOfTrees[i];
        int j1 = K[i];
        for (int j = 0; j < i1 - j1; j++)
        {
            currentTreehash[i][j].updateNextSeed(gmssRandom);
        }

        int l1 = heightOfPhi(k1);
        byte abyte0[] = new byte[mdLength];
        abyte0 = gmssRandom.nextSeed(currentSeeds[i]);
        int i2 = k1 >>> l1 + 1 & 1;
        byte abyte2[] = new byte[mdLength];
        if (l1 < i1 - 1 && i2 == 0)
        {
            System.arraycopy(currentAuthPaths[i][l1], 0, abyte2, 0, mdLength);
        }
        byte abyte3[] = new byte[mdLength];
        if (l1 == 0)
        {
            int k;
            if (i == numLayer - 1)
            {
                abyte0 = (new WinternitzOTSignature(abyte0, digestProvider.get(), otsIndex[i])).getPublicKey();
            } else
            {
                byte abyte4[] = new byte[mdLength];
                System.arraycopy(currentSeeds[i], 0, abyte4, 0, mdLength);
                gmssRandom.nextSeed(abyte4);
                abyte0 = upperLeaf[i].getLeaf();
                upperLeaf[i].initLeafCalc(abyte4);
            }
            System.arraycopy(abyte0, 0, currentAuthPaths[i][0], 0, mdLength);
        } else
        {
            byte abyte1[] = new byte[mdLength << 1];
            System.arraycopy(currentAuthPaths[i][l1 - 1], 0, abyte1, 0, mdLength);
            System.arraycopy(keep[i][(int)Math.floor((l1 - 1) / 2)], 0, abyte1, mdLength, mdLength);
            messDigestTrees.update(abyte1, 0, abyte1.length);
            currentAuthPaths[i][l1] = new byte[messDigestTrees.getDigestSize()];
            messDigestTrees.doFinal(currentAuthPaths[i][l1], 0);
            int l = 0;
            while (l < l1) 
            {
                if (l < i1 - j1)
                {
                    if (currentTreehash[i][l].wasFinished())
                    {
                        System.arraycopy(currentTreehash[i][l].getFirstNode(), 0, currentAuthPaths[i][l], 0, mdLength);
                        currentTreehash[i][l].destroy();
                    } else
                    {
                        System.err.println((new StringBuilder()).append("Treehash (").append(i).append(",").append(l).append(") not finished when needed in AuthPathComputation").toString());
                    }
                }
                if (l < i1 - 1 && l >= i1 - j1 && currentRetain[i][l - (i1 - j1)].size() > 0)
                {
                    System.arraycopy(currentRetain[i][l - (i1 - j1)].lastElement(), 0, currentAuthPaths[i][l], 0, mdLength);
                    currentRetain[i][l - (i1 - j1)].removeElementAt(currentRetain[i][l - (i1 - j1)].size() - 1);
                }
                if (l < i1 - j1 && (1 << l) * 3 + k1 < numLeafs[i])
                {
                    currentTreehash[i][l].initialize();
                }
                l++;
            }
        }
        if (l1 < i1 - 1 && i2 == 0)
        {
            System.arraycopy(abyte2, 0, keep[i][(int)Math.floor(l1 / 2)], 0, mdLength);
        }
        if (i == numLayer - 1)
        {
            k = 1;
            while (k <= (i1 - j1) / 2) 
            {
                k1 = getMinTreehashIndex(i);
                if (k1 >= 0)
                {
                    try
                    {
                        abyte0 = new byte[mdLength];
                        System.arraycopy(currentTreehash[i][k1].getSeedActive(), 0, abyte0, 0, mdLength);
                        abyte0 = (new WinternitzOTSignature(gmssRandom.nextSeed(abyte0), digestProvider.get(), otsIndex[i])).getPublicKey();
                        currentTreehash[i][k1].update(gmssRandom, abyte0);
                    }
                    catch (Exception exception)
                    {
                        System.out.println(exception);
                    }
                }
                k++;
            }
        } else
        {
            minTreehash[i] = getMinTreehashIndex(i);
        }
    }

    private int getMinTreehashIndex(int i)
    {
        int j = 0;
        int l = -1;
        while (j < heightOfTrees[i] - K[i]) 
        {
            int k = l;
            if (currentTreehash[i][j].wasInitialized())
            {
                k = l;
                if (!currentTreehash[i][j].wasFinished())
                {
                    if (l == -1)
                    {
                        k = j;
                    } else
                    {
                        k = l;
                        if (currentTreehash[i][j].getLowestNodeHeight() < currentTreehash[i][l].getLowestNodeHeight())
                        {
                            k = j;
                        }
                    }
                }
            }
            j++;
            l = k;
        }
        return l;
    }

    private int heightOfPhi(int i)
    {
        if (i == 0)
        {
            return -1;
        }
        int j = 0;
        for (int k = 1; i % k == 0;)
        {
            k *= 2;
            j++;
        }

        return j - 1;
    }

    private void nextTree(int i)
    {
        int ai[];
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        ai = index;
        int j = i - 1;
        ai[j] = ai[j] + 1;
        int j1 = i;
        j = 1;
        boolean flag;
        int k1;
        do
        {
            k1 = j1 - 1;
            flag = j;
            if (index[k1] < numLeafs[k1])
            {
                flag = false;
            }
            if (!flag)
            {
                break;
            }
            j1 = k1;
            j = ((flag) ? 1 : 0);
        } while (k1 > 0);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        gmssRandom.nextSeed(currentSeeds[i]);
        nextRootSig[i - 1].updateSign();
        if (i > 1)
        {
            nextNextLeaf[i - 1 - 1].updateLeafCalc();
        }
        upperLeaf[i - 1].updateLeafCalc();
        if (minTreehash[i - 1] < 0)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        upperTreehashLeaf[i - 1].updateLeafCalc();
        ai = upperTreehashLeaf[i - 1].getLeaf();
        boolean flag1;
        currentTreehash[i - 1][minTreehash[i - 1]].update(gmssRandom, ai);
        flag1 = currentTreehash[i - 1][minTreehash[i - 1]].wasFinished();
        if (!flag1);
_L2:
        updateNextNextAuthRoot(i);
        currentRootSig[i - 1] = nextRootSig[i - 1].getSig();
        for (int k = 0; k < heightOfTrees[i] - K[i]; k++)
        {
            currentTreehash[i][k] = nextTreehash[i - 1][k];
            nextTreehash[i - 1][k] = nextNextRoot[i - 1].getTreehash()[k];
        }

        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        System.out.println(exception);
        if (true) goto _L2; else goto _L1
_L1:
        for (int l = 0; l < heightOfTrees[i]; l++)
        {
            System.arraycopy(nextAuthPaths[i - 1][l], 0, currentAuthPaths[i][l], 0, mdLength);
            System.arraycopy(nextNextRoot[i - 1].getAuthPath()[l], 0, nextAuthPaths[i - 1][l], 0, mdLength);
        }

        for (int i1 = 0; i1 < K[i] - 1; i1++)
        {
            currentRetain[i][i1] = nextRetain[i - 1][i1];
            nextRetain[i - 1][i1] = nextNextRoot[i - 1].getRetain()[i1];
        }

        currentStack[i] = nextStack[i - 1];
        nextStack[i - 1] = nextNextRoot[i - 1].getStack();
        nextRoot[i - 1] = nextNextRoot[i - 1].getRoot();
        byte abyte0[] = new byte[mdLength];
        abyte0 = new byte[mdLength];
        System.arraycopy(currentSeeds[i - 1], 0, abyte0, 0, mdLength);
        gmssRandom.nextSeed(abyte0);
        gmssRandom.nextSeed(abyte0);
        abyte0 = gmssRandom.nextSeed(abyte0);
        nextRootSig[i - 1].initSign(abyte0, nextRoot[i - 1]);
        nextKey(i - 1);
    }

    private void updateKey(int i)
    {
        computeAuthPaths(i);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j;
        if (i > 1)
        {
            nextNextLeaf[i - 1 - 1].updateLeafCalc();
        }
        upperLeaf[i - 1].updateLeafCalc();
        j = (int)Math.floor((double)(getNumLeafs(i) * 2) / (double)(heightOfTrees[i - 1] - K[i - 1]));
        if (index[i] % j != 1)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        if (index[i] <= 1 || minTreehash[i - 1] < 0)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        abyte0 = upperTreehashLeaf[i - 1].getLeaf();
        boolean flag;
        currentTreehash[i - 1][minTreehash[i - 1]].update(gmssRandom, abyte0);
        flag = currentTreehash[i - 1][minTreehash[i - 1]].wasFinished();
        if (!flag);
_L3:
        minTreehash[i - 1] = getMinTreehashIndex(i - 1);
        if (minTreehash[i - 1] >= 0)
        {
            byte abyte1[] = currentTreehash[i - 1][minTreehash[i - 1]].getSeedActive();
            upperTreehashLeaf[i - 1] = new GMSSLeaf(digestProvider.get(), otsIndex[i - 1], j);
            upperTreehashLeaf[i - 1].initLeafCalc(abyte1);
            upperTreehashLeaf[i - 1].updateLeafCalc();
        }
_L4:
        nextRootSig[i - 1].updateSign();
        if (index[i] == 1)
        {
            nextNextRoot[i - 1].initialize(new Vector());
        }
        updateNextNextAuthRoot(i);
_L2:
        return;
        Exception exception;
        exception;
        System.out.println(exception);
          goto _L3
        if (minTreehash[i - 1] >= 0)
        {
            upperTreehashLeaf[i - 1].updateLeafCalc();
        }
          goto _L4
    }

    private void updateNextNextAuthRoot(int i)
    {
        byte abyte0[] = new byte[mdLength];
        abyte0 = gmssRandom.nextSeed(nextNextSeeds[i - 1]);
        if (i == numLayer - 1)
        {
            WinternitzOTSignature winternitzotsignature = new WinternitzOTSignature(abyte0, digestProvider.get(), otsIndex[i]);
            nextNextRoot[i - 1].update(nextNextSeeds[i - 1], winternitzotsignature.getPublicKey());
            return;
        } else
        {
            nextNextRoot[i - 1].update(nextNextSeeds[i - 1], nextNextLeaf[i - 1].getLeaf());
            nextNextLeaf[i - 1].initLeafCalc(nextNextSeeds[i - 1]);
            return;
        }
    }

    public byte[][][] getCurrentAuthPaths()
    {
        return currentAuthPaths;
    }

    public Vector[][] getCurrentRetain()
    {
        return currentRetain;
    }

    public byte[][] getCurrentRootSig()
    {
        return currentRootSig;
    }

    public byte[][] getCurrentSeeds()
    {
        return currentSeeds;
    }

    public Vector[] getCurrentStack()
    {
        return currentStack;
    }

    public Treehash[][] getCurrentTreehash()
    {
        return currentTreehash;
    }

    public int getIndex(int i)
    {
        return index[i];
    }

    public int[] getIndex()
    {
        return index;
    }

    public byte[][][] getKeep()
    {
        return keep;
    }

    public int[] getMinTreehash()
    {
        return minTreehash;
    }

    public GMSSDigestProvider getName()
    {
        return digestProvider;
    }

    public byte[][][] getNextAuthPaths()
    {
        return nextAuthPaths;
    }

    public GMSSLeaf[] getNextNextLeaf()
    {
        return nextNextLeaf;
    }

    public GMSSRootCalc[] getNextNextRoot()
    {
        return nextNextRoot;
    }

    public byte[][] getNextNextSeeds()
    {
        return nextNextSeeds;
    }

    public Vector[][] getNextRetain()
    {
        return nextRetain;
    }

    public byte[][] getNextRoot()
    {
        return nextRoot;
    }

    public GMSSRootSig[] getNextRootSig()
    {
        return nextRootSig;
    }

    public Vector[] getNextStack()
    {
        return nextStack;
    }

    public Treehash[][] getNextTreehash()
    {
        return nextTreehash;
    }

    public int getNumLeafs(int i)
    {
        return numLeafs[i];
    }

    public int[] getNumLeafs()
    {
        return numLeafs;
    }

    public byte[] getSubtreeRootSig(int i)
    {
        return currentRootSig[i];
    }

    public GMSSLeaf[] getUpperLeaf()
    {
        return upperLeaf;
    }

    public GMSSLeaf[] getUpperTreehashLeaf()
    {
        return upperTreehashLeaf;
    }

    public void nextKey(int i)
    {
        if (i == numLayer - 1)
        {
            int ai[] = index;
            ai[i] = ai[i] + 1;
        }
        if (index[i] == numLeafs[i])
        {
            if (numLayer != 1)
            {
                nextTree(i);
                index[i] = 0;
            }
            return;
        } else
        {
            updateKey(i);
            return;
        }
    }
}
