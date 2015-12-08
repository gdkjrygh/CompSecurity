// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.pqc.crypto.gmss:
//            GMSSLeaf, GMSSRootCalc, GMSSRootSig, Treehash

class GMSSUtils
{

    GMSSUtils()
    {
    }

    static Vector[] clone(Vector avector[])
    {
        if (avector == null)
        {
            return null;
        }
        Vector avector1[] = new Vector[avector.length];
        for (int i = 0; i != avector.length; i++)
        {
            avector1[i] = new Vector();
            for (Enumeration enumeration = avector[i].elements(); enumeration.hasMoreElements(); avector1[i].addElement(enumeration.nextElement())) { }
        }

        return avector1;
    }

    static GMSSLeaf[] clone(GMSSLeaf agmssleaf[])
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

    static GMSSRootCalc[] clone(GMSSRootCalc agmssrootcalc[])
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

    static GMSSRootSig[] clone(GMSSRootSig agmssrootsig[])
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

    static Treehash[] clone(Treehash atreehash[])
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

    static byte[][] clone(byte abyte0[][])
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

    static Vector[][] clone(Vector avector[][])
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

    static Treehash[][] clone(Treehash atreehash[][])
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

    static byte[][][] clone(byte abyte0[][][])
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
}
