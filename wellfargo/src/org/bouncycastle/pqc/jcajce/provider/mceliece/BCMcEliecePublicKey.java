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
import org.bouncycastle.pqc.asn1.McEliecePublicKey;
import org.bouncycastle.pqc.crypto.mceliece.McElieceParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McEliecePublicKeySpec;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

public class BCMcEliecePublicKey
    implements PublicKey, CipherParameters
{

    private static final long serialVersionUID = 1L;
    private McElieceParameters McElieceParams;
    private GF2Matrix g;
    private int n;
    private String oid;
    private int t;

    public BCMcEliecePublicKey(String s, int i, int j, GF2Matrix gf2matrix)
    {
        oid = s;
        n = i;
        t = j;
        g = gf2matrix;
    }

    public BCMcEliecePublicKey(McEliecePublicKeyParameters mceliecepublickeyparameters)
    {
        this(mceliecepublickeyparameters.getOIDString(), mceliecepublickeyparameters.getN(), mceliecepublickeyparameters.getT(), mceliecepublickeyparameters.getG());
        McElieceParams = mceliecepublickeyparameters.getParameters();
    }

    public BCMcEliecePublicKey(McEliecePublicKeySpec mceliecepublickeyspec)
    {
        this(mceliecepublickeyspec.getOIDString(), mceliecepublickeyspec.getN(), mceliecepublickeyspec.getT(), mceliecepublickeyspec.getG());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof BCMcEliecePublicKey)
        {
            if (n == ((BCMcEliecePublicKey) (obj = (BCMcEliecePublicKey)obj)).n && t == ((BCMcEliecePublicKey) (obj)).t && g.equals(((BCMcEliecePublicKey) (obj)).g))
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
        McEliecePublicKey mceliecepublickey = new McEliecePublicKey(new ASN1ObjectIdentifier(oid), n, t, g);
        AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(getOID(), DERNull.INSTANCE);
        byte abyte0[];
        try
        {
            abyte0 = (new SubjectPublicKeyInfo(algorithmidentifier, mceliecepublickey)).getEncoded();
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

    public McElieceParameters getMcElieceParameters()
    {
        return McElieceParams;
    }

    public int getN()
    {
        return n;
    }

    protected ASN1ObjectIdentifier getOID()
    {
        return new ASN1ObjectIdentifier("1.3.6.1.4.1.8301.3.1.3.4.1");
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
