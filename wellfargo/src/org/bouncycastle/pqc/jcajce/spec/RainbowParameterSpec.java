// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

public class RainbowParameterSpec
    implements AlgorithmParameterSpec
{

    private static final int DEFAULT_VI[] = {
        6, 12, 17, 22, 33
    };
    private int vi[];

    public RainbowParameterSpec()
    {
        vi = DEFAULT_VI;
    }

    public RainbowParameterSpec(int ai[])
    {
        vi = ai;
        try
        {
            checkParams();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            ai.printStackTrace();
        }
    }

    private void checkParams()
    {
        if (vi == null)
        {
            throw new IllegalArgumentException("no layers defined.");
        }
        if (vi.length > 1)
        {
            for (int i = 0; i < vi.length - 1; i++)
            {
                if (vi[i] >= vi[i + 1])
                {
                    throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
                }
            }

        } else
        {
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
    }

    public int getDocumentLength()
    {
        return vi[vi.length - 1] - vi[0];
    }

    public int getNumOfLayers()
    {
        return vi.length - 1;
    }

    public int[] getVi()
    {
        return Arrays.clone(vi);
    }

}
