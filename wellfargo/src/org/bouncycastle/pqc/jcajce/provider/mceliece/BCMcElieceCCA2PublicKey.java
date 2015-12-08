// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PublicKeySpec;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

public class BCMcElieceCCA2PublicKey
    implements PublicKey, CipherParameters
{

    private static final long serialVersionUID = 1L;
    private McElieceCCA2Parameters McElieceCCA2Params;
    private GF2Matrix g;
    private int n;
    private String oid;
    private int t;

    public BCMcElieceCCA2PublicKey(String s, int i, int j, GF2Matrix gf2matrix)
    {
        oid = s;
        n = i;
        t = j;
        g = gf2matrix;
    }

    public BCMcElieceCCA2PublicKey(McElieceCCA2PublicKeyParameters mceliececca2publickeyparameters)
    {
        this(mceliececca2publickeyparameters.getOIDString(), mceliececca2publickeyparameters.getN(), mceliececca2publickeyparameters.getT(), mceliececca2publickeyparameters.getMatrixG());
        McElieceCCA2Params = mceliececca2publickeyparameters.getParameters();
    }

    public BCMcElieceCCA2PublicKey(McElieceCCA2PublicKeySpec mceliececca2publickeyspec)
    {
        this(mceliececca2publickeyspec.getOIDString(), mceliececca2publickeyspec.getN(), mceliececca2publickeyspec.getT(), mceliececca2publickeyspec.getMatrixG());
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof BCMcElieceCCA2PublicKey))
        {
            if (n == ((BCMcElieceCCA2PublicKey) (obj = (BCMcElieceCCA2PublicKey)obj)).n && t == ((BCMcElieceCCA2PublicKey) (obj)).t && g.equals(((BCMcElieceCCA2PublicKey) (obj)).g))
            {
                return true;
            }
        }
        return false;
    }

    protected ASN1Primitive getAlgParams()
    {
        return null;
    }

    public String getAlgorithm()
    {
        return "McEliece";
    }

    public byte[] getEncoded()
    {
        McElieceCCA2PublicKey mceliececca2publickey = new McElieceCCA2PublicKey(new ASN1ObjectIdentifier(oid), n, t, g);
        AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(getOID(), DERNull.INSTANCE);
        byte abyte0[];
        try
        {
            abyte0 = (new SubjectPublicKeyInfo(algorithmidentifier, mceliececca2publickey)).getEncoded();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
    }

    public String getFormat()
    {
        return null;
    }

    public GF2Matrix getG()
    {
        return g;
    }

    public int getK()
    {
        return g.getNumRows();
    }

    public McElieceCCA2Parameters getMcElieceCCA2Parameters()
    {
        return McElieceCCA2Params;
    }

    public int getN()
    {
        return n;
    }

    protected ASN1ObjectIdentifier getOID()
    {
        return new ASN1ObjectIdentifier("1.3.6.1.4.1.8301.3.1.3.4.2");
    }

    public String getOIDString()
    {
        return oid;
    }

    public int getT()
    {
        return t;
    }

    public int hashCode()
    {
        return n + t + g.hashCode();
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("McEliecePublicKey:\n").append(" length of the code         : ").append(n).append("\n").toString();
        s = (new StringBuilder()).append(s).append(" error correction capability: ").append(t).append("\n").toString();
        return (new StringBuilder()).append(s).append(" generator matrix           : ").append(g.toString()).toString();
    }
}
