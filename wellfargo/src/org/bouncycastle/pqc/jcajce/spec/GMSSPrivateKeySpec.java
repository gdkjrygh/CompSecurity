// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import java.util.Vector;
import org.bouncycastle.pqc.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.crypto.gmss.Treehash;
import org.bouncycastle.util.Arrays;

public class GMSSPrivateKeySpec
    implements KeySpec
{

    private byte currentAuthPath[][][];
    private Vector currentRetain[][];
    private byte currentRootSig[][];
    private byte currentSeed[][];
    private Vector currentStack[];
    private Treehash currentTreehash[][];
    private GMSSParameters gmssPS;
    private int index[];
    private byte keep[][][];
    private int minTreehash[];
    private byte nextAuthPath[][][];
    private GMSSLeaf nextNextLeaf[];
    private GMSSRootCalc nextNextRoot[];
    private byte nextNextSeed[][];
    private Vector nextRetain[][];
    private byte nextRoot[][];
    private GMSSRootSig nextRootSig[];
    private Vector nextStack[];
    private Treehash nextTreehash[][];
    private GMSSLeaf upperLeaf[];
    private GMSSLeaf upperTreehashLeaf[];

    public GMSSPrivateKeySpec(int ai[], byte abyte0[][], byte abyte1[][], byte abyte2[][][], byte abyte3[][][], Treehash atreehash[][], Treehash atreehash1[][], 
            Vector avector[], Vector avector1[], Vector avector2[][], Vector avector3[][], byte abyte4[][][], GMSSLeaf agmssleaf[], GMSSLeaf agmssleaf1[], 
            GMSSLeaf agmssleaf2[], int ai1[], byte abyte5[][], GMSSRootCalc agmssrootcalc[], byte abyte6[][], GMSSRootSig agmssrootsig[], GMSSParameters gmssparameters)
    {
        index = ai;
        currentSeed = abyte0;
        nextNextSeed = abyte1;
        currentAuthPath = abyte2;
        nextAuthPath = abyte3;
        currentTreehash = atreehash;
        nextTreehash = atreehash1;
        currentStack = avector;
        nextStack = avector1;
        currentRetain = avector2;
        nextRetain = avector3;
        keep = abyte4;
        nextNextLeaf = agmssleaf;
        upperLeaf = agmssleaf1;
        upperTreehashLeaf = agmssleaf2;
        minTreehash = ai1;
        nextRoot = abyte5;
        nextNextRoot = agmssrootcalc;
        currentRootSig = abyte6;
        nextRootSig = agmssrootsig;
        gmssPS = gmssparameters;
    }

    private static Vector[] clone(Vector avector[])
    {
        if (avector == null)
        {
            return null;
        }
        Vector avector1[] = new Vector[avector.length];
        for (int i = 0; i != avector.length; i++)
        {
            avector1[i] = new Vector(avector[i]);
        }

        return avector1;
    }

    private static GMSSLeaf[] clone(GMSSLeaf agmssleaf[])
    {
        if (agmssleaf == null)
        {
            return null;
        } else
        {
            GMSSLeaf agmssleaf1[] = new GMSSLeaf[agmssleaf.length];
            System.arraycopy(agmssleaf, 0, agmssleaf1, 0, agmssleaf.length);
            return agmssleaf1;
        }
    }

    private static GMSSRootCalc[] clone(GMSSRootCalc agmssrootcalc[])
    {
        if (agmssrootcalc == null)
        {
            return null;
        } else
        {
            GMSSRootCalc agmssrootcalc1[] = new GMSSRootCalc[agmssrootcalc.length];
            System.arraycopy(agmssrootcalc, 0, agmssrootcalc1, 0, agmssrootcalc.length);
            return agmssrootcalc1;
        }
    }

    private static GMSSRootSig[] clone(GMSSRootSig agmssrootsig[])
    {
        if (agmssrootsig == null)
        {
            return null;
        } else
        {
            GMSSRootSig agmssrootsig1[] = new GMSSRootSig[agmssrootsig.length];
            System.arraycopy(agmssrootsig, 0, agmssrootsig1, 0, agmssrootsig.length);
            return agmssrootsig1;
        }
    }

    private static Treehash[] clone(Treehash atreehash[])
    {
        if (atreehash == null)
        {
            return null;
        } else
        {
            Treehash atreehash1[] = new Treehash[atreehash.length];
            System.arraycopy(atreehash, 0, atreehash1, 0, atreehash.length);
            return atreehash1;
        }
    }

    private static byte[][] clone(byte abyte0[][])
    {
        if (abyte0 == null)
        {
            return (byte[][])null;
        }
        byte abyte1[][] = new byte[abyte0.length][];
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte1[i] = Arrays.clone(abyte0[i]);
        }

        return abyte1;
    }

    private static Vector[][] clone(Vector avector[][])
    {
        if (avector == null)
        {
            return (Vector[][])null;
        }
        Vector avector1[][] = new Vector[avector.length][];
        for (int i = 0; i != avector.length; i++)
        {
            avector1[i] = clone(avector[i]);
        }

        return avector1;
    }

    private static Treehash[][] clone(Treehash atreehash[][])
    {
        if (atreehash == null)
        {
            return (Treehash[][])null;
        }
        Treehash atreehash1[][] = new Treehash[atreehash.length][];
        for (int i = 0; i != atreehash.length; i++)
        {
            atreehash1[i] = clone(atreehash[i]);
        }

        return atreehash1;
    }

    private static byte[][][] clone(byte abyte0[][][])
    {
        if (abyte0 == null)
        {
            return (byte[][][])null;
        }
        byte abyte1[][][] = new byte[abyte0.length][][];
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte1[i] = clone(abyte0[i]);
        }

        return abyte1;
    }

    public byte[][][] getCurrentAuthPath()
    {
        return clone(currentAuthPath);
    }

    public Vector[][] getCurrentRetain()
    {
        return clone(currentRetain);
    }

    public byte[][] getCurrentRootSig()
    {
        return clone(currentRootSig);
    }

    public byte[][] getCurrentSeed()
    {
        return clone(currentSeed);
    }

    public Vector[] getCurrentStack()
    {
        return clone(currentStack);
    }

    public Treehash[][] getCurrentTreehash()
    {
        return clone(currentTreehash);
    }

    public GMSSParameters getGmssPS()
    {
        return gmssPS;
    }

    public int[] getIndex()
    {
        return Arrays.clone(index);
    }

    public byte[][][] getKeep()
    {
        return clone(keep);
    }

    public int[] getMinTreehash()
    {
        return Arrays.clone(minTreehash);
    }

    public byte[][][] getNextAuthPath()
    {
        return clone(nextAuthPath);
    }

    public GMSSLeaf[] getNextNextLeaf()
    {
        return clone(nextNextLeaf);
    }

    public GMSSRootCalc[] getNextNextRoot()
    {
        return clone(nextNextRoot);
    }

    public byte[][] getNextNextSeed()
    {
        return clone(nextNextSeed);
    }

    public Vector[][] getNextRetain()
    {
        return clone(nextRetain);
    }

    public byte[][] getNextRoot()
    {
        return clone(nextRoot);
    }

    public GMSSRootSig[] getNextRootSig()
    {
        return clone(nextRootSig);
    }

    public Vector[] getNextStack()
    {
        return clone(nextStack);
    }

    public Treehash[][] getNextTreehash()
    {
        return clone(nextTreehash);
    }

    public GMSSLeaf[] getUpperLeaf()
    {
        return clone(upperLeaf);
    }

    public GMSSLeaf[] getUpperTreehashLeaf()
    {
        return clone(upperTreehashLeaf);
    }
}
