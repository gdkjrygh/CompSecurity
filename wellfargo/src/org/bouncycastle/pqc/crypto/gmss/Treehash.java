// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;

public class Treehash
{

    private byte firstNode[];
    private int firstNodeHeight;
    private Vector heightOfNodes;
    private boolean isFinished;
    private boolean isInitialized;
    private int maxHeight;
    private Digest messDigestTree;
    private byte seedActive[];
    private boolean seedInitialized;
    private byte seedNext[];
    private int tailLength;
    private Vector tailStack;

    public Treehash(Vector vector, int i, Digest digest)
    {
        tailStack = vector;
        maxHeight = i;
        firstNode = null;
        isInitialized = false;
        isFinished = false;
        seedInitialized = false;
        messDigestTree = digest;
        seedNext = new byte[messDigestTree.getDigestSize()];
        seedActive = new byte[messDigestTree.getDigestSize()];
    }

    public Treehash(Digest digest, byte abyte0[][], int ai[])
    {
        boolean flag = false;
        super();
        messDigestTree = digest;
        maxHeight = ai[0];
        tailLength = ai[1];
        firstNodeHeight = ai[2];
        if (ai[3] == 1)
        {
            isFinished = true;
        } else
        {
            isFinished = false;
        }
        if (ai[4] == 1)
        {
            isInitialized = true;
        } else
        {
            isInitialized = false;
        }
        if (ai[5] == 1)
        {
            seedInitialized = true;
        } else
        {
            seedInitialized = false;
        }
        heightOfNodes = new Vector();
        for (int i = 0; i < tailLength; i++)
        {
            heightOfNodes.addElement(Integers.valueOf(ai[i + 6]));
        }

        firstNode = abyte0[0];
        seedActive = abyte0[1];
        seedNext = abyte0[2];
        tailStack = new Vector();
        for (int j = ((flag) ? 1 : 0); j < tailLength; j++)
        {
            tailStack.addElement(abyte0[j + 3]);
        }

    }

    public void destroy()
    {
        isInitialized = false;
        isFinished = false;
        firstNode = null;
        tailLength = 0;
        firstNodeHeight = -1;
    }

    public byte[] getFirstNode()
    {
        return firstNode;
    }

    public int getFirstNodeHeight()
    {
        if (firstNode == null)
        {
            return maxHeight;
        } else
        {
            return firstNodeHeight;
        }
    }

    public int getLowestNodeHeight()
    {
        if (firstNode == null)
        {
            return maxHeight;
        }
        if (tailLength == 0)
        {
            return firstNodeHeight;
        } else
        {
            return Math.min(firstNodeHeight, ((Integer)heightOfNodes.lastElement()).intValue());
        }
    }

    public byte[] getSeedActive()
    {
        return seedActive;
    }

    public byte[][] getStatByte()
    {
        int i = tailLength;
        int k = messDigestTree.getDigestSize();
        byte abyte0[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i + 3, k
        });
        abyte0[0] = firstNode;
        abyte0[1] = seedActive;
        abyte0[2] = seedNext;
        for (int j = 0; j < tailLength; j++)
        {
            abyte0[j + 3] = (byte[])(byte[])tailStack.elementAt(j);
        }

        return abyte0;
    }

    public int[] getStatInt()
    {
        int ai[] = new int[tailLength + 6];
        ai[0] = maxHeight;
        ai[1] = tailLength;
        ai[2] = firstNodeHeight;
        int i;
        if (isFinished)
        {
            ai[3] = 1;
        } else
        {
            ai[3] = 0;
        }
        if (isInitialized)
        {
            ai[4] = 1;
        } else
        {
            ai[4] = 0;
        }
        if (seedInitialized)
        {
            ai[5] = 1;
        } else
        {
            ai[5] = 0;
        }
        for (i = 0; i < tailLength; i++)
        {
            ai[i + 6] = ((Integer)heightOfNodes.elementAt(i)).intValue();
        }

        return ai;
    }

    public Vector getTailStack()
    {
        return tailStack;
    }

    public void initialize()
    {
        if (!seedInitialized)
        {
            System.err.println((new StringBuilder()).append("Seed ").append(maxHeight).append(" not initialized").toString());
            return;
        } else
        {
            heightOfNodes = new Vector();
            tailLength = 0;
            firstNode = null;
            firstNodeHeight = -1;
            isInitialized = true;
            System.arraycopy(seedNext, 0, seedActive, 0, messDigestTree.getDigestSize());
            return;
        }
    }

    public void initializeSeed(byte abyte0[])
    {
        System.arraycopy(abyte0, 0, seedNext, 0, messDigestTree.getDigestSize());
        seedInitialized = true;
    }

    public void setFirstNode(byte abyte0[])
    {
        if (!isInitialized)
        {
            initialize();
        }
        firstNode = abyte0;
        firstNodeHeight = maxHeight;
        isFinished = true;
    }

    public String toString()
    {
        boolean flag = false;
        String s = "Treehash    : ";
        int i = 0;
        String s2;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            s2 = s;
            if (i >= tailLength + 6)
            {
                break;
            }
            s = (new StringBuilder()).append(s).append(getStatInt()[i]).append(" ").toString();
            i++;
        } while (true);
        while (j < tailLength + 3) 
        {
            String s1;
            if (getStatByte()[j] != null)
            {
                s1 = (new StringBuilder()).append(s2).append(new String(Hex.encode(getStatByte()[j]))).append(" ").toString();
            } else
            {
                s1 = (new StringBuilder()).append(s2).append("null ").toString();
            }
            j++;
            s2 = s1;
        }
        return (new StringBuilder()).append(s2).append("  ").append(messDigestTree.getDigestSize()).toString();
    }

    public void update(GMSSRandom gmssrandom, byte abyte0[])
    {
        if (!isFinished) goto _L2; else goto _L1
_L1:
        System.err.println("No more update possible for treehash instance!");
_L4:
        return;
_L2:
        if (!isInitialized)
        {
            System.err.println("Treehash instance not initialized before update");
            return;
        }
        byte abyte1[] = new byte[messDigestTree.getDigestSize()];
        gmssrandom.nextSeed(seedActive);
        if (firstNode != null)
        {
            break; /* Loop/switch isn't completed */
        }
        firstNode = abyte0;
        firstNodeHeight = 0;
_L5:
        if (firstNodeHeight == maxHeight)
        {
            isFinished = true;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int i;
        for (i = 0; tailLength > 0 && i == ((Integer)heightOfNodes.lastElement()).intValue(); i++)
        {
            gmssrandom = new byte[messDigestTree.getDigestSize() << 1];
            System.arraycopy(tailStack.lastElement(), 0, gmssrandom, 0, messDigestTree.getDigestSize());
            tailStack.removeElementAt(tailStack.size() - 1);
            heightOfNodes.removeElementAt(heightOfNodes.size() - 1);
            System.arraycopy(abyte0, 0, gmssrandom, messDigestTree.getDigestSize(), messDigestTree.getDigestSize());
            messDigestTree.update(gmssrandom, 0, gmssrandom.length);
            abyte0 = new byte[messDigestTree.getDigestSize()];
            messDigestTree.doFinal(abyte0, 0);
            tailLength = tailLength - 1;
        }

        tailStack.addElement(abyte0);
        heightOfNodes.addElement(Integers.valueOf(i));
        tailLength = tailLength + 1;
        if (((Integer)heightOfNodes.lastElement()).intValue() == firstNodeHeight)
        {
            gmssrandom = new byte[messDigestTree.getDigestSize() << 1];
            System.arraycopy(firstNode, 0, gmssrandom, 0, messDigestTree.getDigestSize());
            System.arraycopy(tailStack.lastElement(), 0, gmssrandom, messDigestTree.getDigestSize(), messDigestTree.getDigestSize());
            tailStack.removeElementAt(tailStack.size() - 1);
            heightOfNodes.removeElementAt(heightOfNodes.size() - 1);
            messDigestTree.update(gmssrandom, 0, gmssrandom.length);
            firstNode = new byte[messDigestTree.getDigestSize()];
            messDigestTree.doFinal(firstNode, 0);
            firstNodeHeight = firstNodeHeight + 1;
            tailLength = 0;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void updateNextSeed(GMSSRandom gmssrandom)
    {
        gmssrandom.nextSeed(seedNext);
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
