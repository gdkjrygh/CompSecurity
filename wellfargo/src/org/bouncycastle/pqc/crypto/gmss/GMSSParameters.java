// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.util.Arrays;

public class GMSSParameters
{

    private int K[];
    private int heightOfTrees[];
    private int numOfLayers;
    private int winternitzParameter[];

    public GMSSParameters(int i)
    {
        if (i <= 10)
        {
            int ai[] = new int[1];
            ai[0] = 10;
            init(ai.length, ai, new int[] {
                3
            }, new int[] {
                2
            });
            return;
        }
        if (i <= 20)
        {
            int ai1[] = new int[2];
            int[] _tmp = ai1;
            ai1[0] = 10;
            ai1[1] = 10;
            init(ai1.length, ai1, new int[] {
                5, 4
            }, new int[] {
                2, 2
            });
            return;
        } else
        {
            int ai2[] = new int[4];
            int[] _tmp1 = ai2;
            ai2[0] = 10;
            ai2[1] = 10;
            ai2[2] = 10;
            ai2[3] = 10;
            init(ai2.length, ai2, new int[] {
                9, 9, 9, 3
            }, new int[] {
                2, 2, 2, 2
            });
            return;
        }
    }

    public GMSSParameters(int i, int ai[], int ai1[], int ai2[])
    {
        init(i, ai, ai1, ai2);
    }

    private void init(int i, int ai[], int ai1[], int ai2[])
    {
        String s;
label0:
        {
            boolean flag = true;
            s = "";
            numOfLayers = i;
            if (numOfLayers == ai1.length && numOfLayers == ai.length)
            {
                i = ((flag) ? 1 : 0);
                if (numOfLayers == ai2.length)
                {
                    break label0;
                }
            }
            s = "Unexpected parameterset format";
            i = 0;
        }
        for (int j = 0; j < numOfLayers; j++)
        {
            if (ai2[j] < 2 || (ai[j] - ai2[j]) % 2 != 0)
            {
                s = "Wrong parameter K (K >= 2 and H-K even required)!";
                i = 0;
            }
            if (ai[j] < 4 || ai1[j] < 2)
            {
                s = "Wrong parameter H or w (H > 3 and w > 1 required)!";
                i = 0;
            }
        }

        if (i != 0)
        {
            heightOfTrees = Arrays.clone(ai);
            winternitzParameter = Arrays.clone(ai1);
            K = Arrays.clone(ai2);
            return;
        } else
        {
            throw new IllegalArgumentException(s);
        }
    }

    public int[] getHeightOfTrees()
    {
        return Arrays.clone(heightOfTrees);
    }

    public int[] getK()
    {
        return Arrays.clone(K);
    }

    public int getNumOfLayers()
    {
        return numOfLayers;
    }

    public int[] getWinternitzParameter()
    {
        return Arrays.clone(winternitzParameter);
    }
}
