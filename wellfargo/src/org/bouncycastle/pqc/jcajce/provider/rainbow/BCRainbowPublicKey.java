// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.PublicKey;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.RainbowPublicKey;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec;
import org.bouncycastle.util.Arrays;

public class BCRainbowPublicKey
    implements PublicKey
{

    private static final long serialVersionUID = 1L;
    private short coeffquadratic[][];
    private short coeffscalar[];
    private short coeffsingular[][];
    private int docLength;
    private RainbowParameters rainbowParams;

    public BCRainbowPublicKey(int i, short aword0[][], short aword1[][], short aword2[])
    {
        docLength = i;
        coeffquadratic = aword0;
        coeffsingular = aword1;
        coeffscalar = aword2;
    }

    public BCRainbowPublicKey(RainbowPublicKeyParameters rainbowpublickeyparameters)
    {
        this(rainbowpublickeyparameters.getDocLength(), rainbowpublickeyparameters.getCoeffQuadratic(), rainbowpublickeyparameters.getCoeffSingular(), rainbowpublickeyparameters.getCoeffScalar());
    }

    public BCRainbowPublicKey(RainbowPublicKeySpec rainbowpublickeyspec)
    {
        this(rainbowpublickeyspec.getDocLength(), rainbowpublickeyspec.getCoeffQuadratic(), rainbowpublickeyspec.getCoeffSingular(), rainbowpublickeyspec.getCoeffScalar());
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof BCRainbowPublicKey))
        {
            if (docLength == ((BCRainbowPublicKey) (obj = (BCRainbowPublicKey)obj)).getDocLength() && RainbowUtil.equals(coeffquadratic, ((BCRainbowPublicKey) (obj)).getCoeffQuadratic()) && RainbowUtil.equals(coeffsingular, ((BCRainbowPublicKey) (obj)).getCoeffSingular()) && RainbowUtil.equals(coeffscalar, ((BCRainbowPublicKey) (obj)).getCoeffScalar()))
            {
                return true;
            }
        }
        return false;
    }

    public final String getAlgorithm()
    {
        return "Rainbow";
    }

    public short[][] getCoeffQuadratic()
    {
        return coeffquadratic;
    }

    public short[] getCoeffScalar()
    {
        return Arrays.clone(coeffscalar);
    }

    public short[][] getCoeffSingular()
    {
        short aword0[][] = new short[coeffsingular.length][];
        for (int i = 0; i != coeffsingular.length; i++)
        {
            aword0[i] = Arrays.clone(coeffsingular[i]);
        }

        return aword0;
    }

    public int getDocLength()
    {
        return docLength;
    }

    public byte[] getEncoded()
    {
        RainbowPublicKey rainbowpublickey = new RainbowPublicKey(docLength, coeffquadratic, coeffsingular, coeffscalar);
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.rainbow, DERNull.INSTANCE), rainbowpublickey);
    }

    public String getFormat()
    {
        return "X.509";
    }

    public int hashCode()
    {
        return ((docLength * 37 + Arrays.hashCode(coeffquadratic)) * 37 + Arrays.hashCode(coeffsingular)) * 37 + Arrays.hashCode(coeffscalar);
    }
}
