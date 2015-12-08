// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.pqc.crypto.gmss:
//            GMSSDigestProvider, GMSSUtils, Treehash

public class GMSSRootCalc
{

    private byte AuthPath[][];
    private int K;
    private GMSSDigestProvider digestProvider;
    private int heightOfNextSeed;
    private Vector heightOfNodes;
    private int heightOfTree;
    private int index[];
    private int indexForNextSeed;
    private boolean isFinished;
    private boolean isInitialized;
    private int mdLength;
    private Digest messDigestTree;
    private Vector retain[];
    private byte root[];
    private Vector tailStack;
    private Treehash treehash[];

    public GMSSRootCalc(int i, int j, GMSSDigestProvider gmssdigestprovider)
    {
        heightOfTree = i;
        digestProvider = gmssdigestprovider;
        messDigestTree = gmssdigestprovider.get();
        mdLength = messDigestTree.getDigestSize();
        K = j;
        index = new int[i];
        int k = mdLength;
        AuthPath = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i, k
        });
        root = new byte[mdLength];
        retain = new Vector[K - 1];
        for (i = 0; i < j - 1; i++)
        {
            retain[i] = new Vector();
        }

    }

    public GMSSRootCalc(Digest digest, byte abyte0[][], int ai[], Treehash atreehash[], Vector avector[])
    {
        boolean flag = false;
        super();
        messDigestTree = digestProvider.get();
        digestProvider = digestProvider;
        heightOfTree = ai[0];
        mdLength = ai[1];
        K = ai[2];
        indexForNextSeed = ai[3];
        heightOfNextSeed = ai[4];
        int j1;
        if (ai[5] == 1)
        {
            isFinished = true;
        } else
        {
            isFinished = false;
        }
        if (ai[6] == 1)
        {
            isInitialized = true;
        } else
        {
            isInitialized = false;
        }
        j1 = ai[7];
        index = new int[heightOfTree];
        for (int i = 0; i < heightOfTree; i++)
        {
            index[i] = ai[i + 8];
        }

        heightOfNodes = new Vector();
        for (int j = 0; j < j1; j++)
        {
            heightOfNodes.addElement(Integers.valueOf(ai[heightOfTree + 8 + j]));
        }

        root = abyte0[0];
        int k = heightOfTree;
        int k1 = mdLength;
        AuthPath = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            k, k1
        });
        for (int l = 0; l < heightOfTree; l++)
        {
            AuthPath[l] = abyte0[l + 1];
        }

        tailStack = new Vector();
        for (int i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            tailStack.addElement(abyte0[heightOfTree + 1 + i1]);
        }

        treehash = GMSSUtils.clone(atreehash);
        retain = GMSSUtils.clone(avector);
    }

    public byte[][] getAuthPath()
    {
        return GMSSUtils.clone(AuthPath);
    }

    public Vector[] getRetain()
    {
        return GMSSUtils.clone(retain);
    }

    public byte[] getRoot()
    {
        return Arrays.clone(root);
    }

    public Vector getStack()
    {
        Vector vector = new Vector();
        for (Enumeration enumeration = tailStack.elements(); enumeration.hasMoreElements(); vector.addElement(enumeration.nextElement())) { }
        return vector;
    }

    public byte[][] getStatByte()
    {
        byte abyte0[][];
        int i;
        int j;
        if (tailStack == null)
        {
            i = 0;
        } else
        {
            i = tailStack.size();
        }
        j = heightOfTree;
        abyte0 = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            j + 1 + i, 64
        });
        abyte0[0] = root;
        for (int k = 0; k < heightOfTree; k++)
        {
            abyte0[k + 1] = AuthPath[k];
        }

        for (int l = 0; l < i; l++)
        {
            abyte0[heightOfTree + 1 + l] = (byte[])(byte[])tailStack.elementAt(l);
        }

        return abyte0;
    }

    public int[] getStatInt()
    {
        int ai[];
        int i;
        if (tailStack == null)
        {
            i = 0;
        } else
        {
            i = tailStack.size();
        }
        ai = new int[heightOfTree + 8 + i];
        ai[0] = heightOfTree;
        ai[1] = mdLength;
        ai[2] = K;
        ai[3] = indexForNextSeed;
        ai[4] = heightOfNextSeed;
        if (isFinished)
        {
            ai[5] = 1;
        } else
        {
            ai[5] = 0;
        }
        if (isInitialized)
        {
            ai[6] = 1;
        } else
        {
            ai[6] = 0;
        }
        ai[7] = i;
        for (int j = 0; j < heightOfTree; j++)
        {
            ai[j + 8] = index[j];
        }

        for (int k = 0; k < i; k++)
        {
            ai[heightOfTree + 8 + k] = ((Integer)heightOfNodes.elementAt(k)).intValue();
        }

        return ai;
    }

    public Treehash[] getTreehash()
    {
        return GMSSUtils.clone(treehash);
    }

    public void initialize(Vector vector)
    {
        treehash = new Treehash[heightOfTree - K];
        for (int i = 0; i < heightOfTree - K; i++)
        {
            treehash[i] = new Treehash(vector, i, digestProvider.get());
        }

        index = new int[heightOfTree];
        int j = heightOfTree;
        int i1 = mdLength;
        AuthPath = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            j, i1
        });
        root = new byte[mdLength];
        tailStack = new Vector();
        heightOfNodes = new Vector();
        isInitialized = true;
        isFinished = false;
        for (int k = 0; k < heightOfTree; k++)
        {
            index[k] = -1;
        }

        retain = new Vector[K - 1];
        for (int l = 0; l < K - 1; l++)
        {
            retain[l] = new Vector();
        }

        indexForNextSeed = 3;
        heightOfNextSeed = 0;
    }

    public void initializeTreehashSeed(byte abyte0[], int i)
    {
        treehash[i].initializeSeed(abyte0);
    }

    public String toString()
    {
        boolean flag = false;
        String s;
        String s1;
        int i;
        int j;
        int k;
        if (tailStack == null)
        {
            i = 0;
        } else
        {
            i = tailStack.size();
        }
        s = "";
        j = 0;
        do
        {
            k = ((flag) ? 1 : 0);
            s1 = s;
            if (j >= heightOfTree + 8 + i)
            {
                break;
            }
            s = (new StringBuilder()).append(s).append(getStatInt()[j]).append(" ").toString();
            j++;
        } while (true);
        for (; k < heightOfTree + 1 + i; k++)
        {
            s1 = (new StringBuilder()).append(s1).append(new String(Hex.encode(getStatByte()[k]))).append(" ").toString();
        }

        return (new StringBuilder()).append(s1).append("  ").append(digestProvider.get().getDigestSize()).toString();
    }

    public void update(byte abyte0[])
    {
        if (!isFinished) goto _L2; else goto _L1
_L1:
        System.out.print("Too much updates for Tree!!");
_L8:
        return;
_L2:
        if (!isInitialized)
        {
            System.err.println("GMSSRootCalc not initialized!");
            return;
        }
        int ai[] = index;
        ai[0] = ai[0] + 1;
        if (index[0] != 1) goto _L4; else goto _L3
_L3:
        System.arraycopy(abyte0, 0, AuthPath[0], 0, mdLength);
_L6:
        if ((index[0] - 3) % 2 == 0 && index[0] >= 3 && heightOfTree == K)
        {
            retain[0].insertElementAt(abyte0, 0);
        }
        if (index[0] == 0)
        {
            tailStack.addElement(abyte0);
            heightOfNodes.addElement(Integers.valueOf(0));
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (index[0] == 3 && heightOfTree > K)
        {
            treehash[0].setFirstNode(abyte0);
        }
        if (true) goto _L6; else goto _L5
_L5:
        byte abyte1[] = new byte[mdLength];
        byte abyte2[] = new byte[mdLength << 1];
        System.arraycopy(abyte0, 0, abyte1, 0, mdLength);
        int i = 0;
        abyte0 = abyte1;
        do
        {
            if (tailStack.size() <= 0 || i != ((Integer)heightOfNodes.lastElement()).intValue())
            {
                break;
            }
            System.arraycopy(tailStack.lastElement(), 0, abyte2, 0, mdLength);
            tailStack.removeElementAt(tailStack.size() - 1);
            heightOfNodes.removeElementAt(heightOfNodes.size() - 1);
            System.arraycopy(abyte0, 0, abyte2, mdLength, mdLength);
            messDigestTree.update(abyte2, 0, abyte2.length);
            abyte0 = new byte[messDigestTree.getDigestSize()];
            messDigestTree.doFinal(abyte0, 0);
            i++;
            if (i < heightOfTree)
            {
                int ai1[] = index;
                ai1[i] = ai1[i] + 1;
                if (index[i] == 1)
                {
                    System.arraycopy(abyte0, 0, AuthPath[i], 0, mdLength);
                }
                if (i >= heightOfTree - K)
                {
                    if (i == 0)
                    {
                        System.out.println("M\uFFFD\uFFFD\uFFFDP");
                    }
                    if ((index[i] - 3) % 2 == 0 && index[i] >= 3)
                    {
                        retain[i - (heightOfTree - K)].insertElementAt(abyte0, 0);
                    }
                } else
                if (index[i] == 3)
                {
                    treehash[i].setFirstNode(abyte0);
                }
            }
        } while (true);
        tailStack.addElement(abyte0);
        heightOfNodes.addElement(Integers.valueOf(i));
        if (i == heightOfTree)
        {
            isFinished = true;
            isInitialized = false;
            root = (byte[])(byte[])tailStack.lastElement();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void update(byte abyte0[], byte abyte1[])
    {
        if (heightOfNextSeed < heightOfTree - K && indexForNextSeed - 2 == index[0])
        {
            initializeTreehashSeed(abyte0, heightOfNextSeed);
            heightOfNextSeed = heightOfNextSeed + 1;
            indexForNextSeed = indexForNextSeed * 2;
        }
        update(abyte1);
    }

    public boolean wasFinished()
    {
        return isFinished;
    }

    public boolean wasInitialized()
    {
        return isInitialized;
    }
}
