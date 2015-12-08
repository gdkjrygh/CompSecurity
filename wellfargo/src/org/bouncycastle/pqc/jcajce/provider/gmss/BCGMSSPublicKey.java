// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.gmss;

import java.security.PublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.asn1.GMSSPublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.ParSet;
import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.crypto.gmss.GMSSPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.GMSSPublicKeySpec;
import org.bouncycastle.util.encoders.Hex;

public class BCGMSSPublicKey
    implements PublicKey, CipherParameters
{

    private static final long serialVersionUID = 1L;
    private GMSSParameters gmssParameterSet;
    private GMSSParameters gmssParams;
    private byte publicKeyBytes[];

    public BCGMSSPublicKey(GMSSPublicKeyParameters gmsspublickeyparameters)
    {
        this(gmsspublickeyparameters.getPublicKey(), gmsspublickeyparameters.getParameters());
    }

    protected BCGMSSPublicKey(GMSSPublicKeySpec gmsspublickeyspec)
    {
        this(gmsspublickeyspec.getPublicKey(), gmsspublickeyspec.getParameters());
    }

    public BCGMSSPublicKey(byte abyte0[], GMSSParameters gmssparameters)
    {
        gmssParameterSet = gmssparameters;
        publicKeyBytes = abyte0;
    }

    public String getAlgorithm()
    {
        return "GMSS";
    }

    public byte[] getEncoded()
    {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.gmss, (new ParSet(gmssParameterSet.getNumOfLayers(), gmssParameterSet.getHeightOfTrees(), gmssParameterSet.getWinternitzParameter(), gmssParameterSet.getK())).toASN1Primitive()), new GMSSPublicKey(publicKeyBytes));
    }

    public String getFormat()
    {
        return "X.509";
    }

    public GMSSParameters getParameterSet()
    {
        return gmssParameterSet;
    }

    public byte[] getPublicKeyBytes()
    {
        return publicKeyBytes;
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("GMSS public key : ").append(new String(Hex.encode(publicKeyBytes))).append("\n").append("Height of Trees: \n").toString();
        for (int i = 0; i < gmssParameterSet.getHeightOfTrees().length; i++)
        {
            s = (new StringBuilder()).append(s).append("Layer ").append(i).append(" : ").append(gmssParameterSet.getHeightOfTrees()[i]).append(" WinternitzParameter: ").append(gmssParameterSet.getWinternitzParameter()[i]).append(" K: ").append(gmssParameterSet.getK()[i]).append("\n").toString();
        }

        return s;
    }
}
