// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.RainbowPrivateKey;
import org.bouncycastle.pqc.crypto.rainbow.Layer;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec;

public class BCRainbowPrivateKey
    implements PrivateKey
{

    private static final long serialVersionUID = 1L;
    private short A1inv[][];
    private short A2inv[][];
    private short b1[];
    private short b2[];
    private Layer layers[];
    private int vi[];

    public BCRainbowPrivateKey(RainbowPrivateKeyParameters rainbowprivatekeyparameters)
    {
        this(rainbowprivatekeyparameters.getInvA1(), rainbowprivatekeyparameters.getB1(), rainbowprivatekeyparameters.getInvA2(), rainbowprivatekeyparameters.getB2(), rainbowprivatekeyparameters.getVi(), rainbowprivatekeyparameters.getLayers());
    }

    public BCRainbowPrivateKey(RainbowPrivateKeySpec rainbowprivatekeyspec)
    {
        this(rainbowprivatekeyspec.getInvA1(), rainbowprivatekeyspec.getB1(), rainbowprivatekeyspec.getInvA2(), rainbowprivatekeyspec.getB2(), rainbowprivatekeyspec.getVi(), rainbowprivatekeyspec.getLayers());
    }

    public BCRainbowPrivateKey(short aword0[][], short aword1[], short aword2[][], short aword3[], int ai[], Layer alayer[])
    {
        A1inv = aword0;
        b1 = aword1;
        A2inv = aword2;
        b2 = aword3;
        vi = ai;
        layers = alayer;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = true;
        flag2 = false;
        flag1 = flag2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (obj instanceof BCRainbowPrivateKey) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
_L2:
        return flag1;
_L4:
        obj = (BCRainbowPrivateKey)obj;
        int i;
        if (RainbowUtil.equals(A1inv, ((BCRainbowPrivateKey) (obj)).getInvA1()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && RainbowUtil.equals(A2inv, ((BCRainbowPrivateKey) (obj)).getInvA2()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && RainbowUtil.equals(b1, ((BCRainbowPrivateKey) (obj)).getB1()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && RainbowUtil.equals(b2, ((BCRainbowPrivateKey) (obj)).getB2()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0 || !Arrays.equals(vi, ((BCRainbowPrivateKey) (obj)).getVi()))
        {
            flag = false;
        }
        flag1 = flag2;
        if (layers.length != ((BCRainbowPrivateKey) (obj)).getLayers().length)
        {
            continue;
        }
        i = layers.length;
        i--;
        do
        {
            flag1 = flag;
            if (i < 0)
            {
                continue;
            }
            flag &= layers[i].equals(((BCRainbowPrivateKey) (obj)).getLayers()[i]);
            i--;
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final String getAlgorithm()
    {
        return "Rainbow";
    }

    public short[] getB1()
    {
        return b1;
    }

    public short[] getB2()
    {
        return b2;
    }

    public byte[] getEncoded()
    {
        Object obj = new RainbowPrivateKey(A1inv, b1, A2inv, b2, vi, layers);
        byte abyte0[];
        try
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.rainbow, DERNull.INSTANCE), ((org.bouncycastle.asn1.ASN1Encodable) (obj)));
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return null;
        }
        try
        {
            abyte0 = ((PrivateKeyInfo) (obj)).getEncoded();
        }
        catch (IOException ioexception1)
        {
            ioexception1.printStackTrace();
            return null;
        }
        return abyte0;
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public short[][] getInvA1()
    {
        return A1inv;
    }

    public short[][] getInvA2()
    {
        return A2inv;
    }

    public Layer[] getLayers()
    {
        return layers;
    }

    public int[] getVi()
    {
        return vi;
    }

    public int hashCode()
    {
        int i = layers.length;
        int k = org.bouncycastle.util.Arrays.hashCode(A1inv);
        int l = org.bouncycastle.util.Arrays.hashCode(b1);
        int i1 = org.bouncycastle.util.Arrays.hashCode(A2inv);
        int j1 = org.bouncycastle.util.Arrays.hashCode(b2);
        k = org.bouncycastle.util.Arrays.hashCode(vi) + ((((i * 37 + k) * 37 + l) * 37 + i1) * 37 + j1) * 37;
        for (int j = layers.length - 1; j >= 0; j--)
        {
            k = k * 37 + layers[j].hashCode();
        }

        return k;
    }
}
