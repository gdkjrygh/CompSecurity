// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PrivateKeySpec;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

public class BCMcElieceCCA2PrivateKey
    implements PrivateKey, CipherParameters
{

    private static final long serialVersionUID = 1L;
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;
    private GF2Matrix h;
    private int k;
    private McElieceCCA2Parameters mcElieceCCA2Params;
    private int n;
    private String oid;
    private Permutation p;
    private PolynomialGF2mSmallM qInv[];

    public BCMcElieceCCA2PrivateKey(String s, int i, int j, GF2mField gf2mfield, PolynomialGF2mSmallM polynomialgf2msmallm, Permutation permutation, GF2Matrix gf2matrix, 
            PolynomialGF2mSmallM apolynomialgf2msmallm[])
    {
        oid = s;
        n = i;
        k = j;
        field = gf2mfield;
        goppaPoly = polynomialgf2msmallm;
        p = permutation;
        h = gf2matrix;
        qInv = apolynomialgf2msmallm;
    }

    public BCMcElieceCCA2PrivateKey(McElieceCCA2PrivateKeyParameters mceliececca2privatekeyparameters)
    {
        this(mceliececca2privatekeyparameters.getOIDString(), mceliececca2privatekeyparameters.getN(), mceliececca2privatekeyparameters.getK(), mceliececca2privatekeyparameters.getField(), mceliececca2privatekeyparameters.getGoppaPoly(), mceliececca2privatekeyparameters.getP(), mceliececca2privatekeyparameters.getH(), mceliececca2privatekeyparameters.getQInv());
        mcElieceCCA2Params = mceliececca2privatekeyparameters.getParameters();
    }

    public BCMcElieceCCA2PrivateKey(McElieceCCA2PrivateKeySpec mceliececca2privatekeyspec)
    {
        this(mceliececca2privatekeyspec.getOIDString(), mceliececca2privatekeyspec.getN(), mceliececca2privatekeyspec.getK(), mceliececca2privatekeyspec.getField(), mceliececca2privatekeyspec.getGoppaPoly(), mceliececca2privatekeyspec.getP(), mceliececca2privatekeyspec.getH(), mceliececca2privatekeyspec.getQInv());
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof BCMcElieceCCA2PrivateKey))
        {
            if (n == ((BCMcElieceCCA2PrivateKey) (obj = (BCMcElieceCCA2PrivateKey)obj)).n && k == ((BCMcElieceCCA2PrivateKey) (obj)).k && field.equals(((BCMcElieceCCA2PrivateKey) (obj)).field) && goppaPoly.equals(((BCMcElieceCCA2PrivateKey) (obj)).goppaPoly) && p.equals(((BCMcElieceCCA2PrivateKey) (obj)).p) && h.equals(((BCMcElieceCCA2PrivateKey) (obj)).h))
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
        Object obj = new McElieceCCA2PrivateKey(new ASN1ObjectIdentifier(oid), n, k, field, goppaPoly, p, h, qInv);
        byte abyte0[];
        try
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(getOID(), DERNull.INSTANCE), ((org.bouncycastle.asn1.ASN1Encodable) (obj)));
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

    public GF2mField getField()
    {
        return field;
    }

    public String getFormat()
    {
        return null;
    }

    public PolynomialGF2mSmallM getGoppaPoly()
    {
        return goppaPoly;
    }

    public GF2Matrix getH()
    {
        return h;
    }

    public int getK()
    {
        return k;
    }

    public McElieceCCA2Parameters getMcElieceCCA2Parameters()
    {
        return mcElieceCCA2Params;
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

    public Permutation getP()
    {
        return p;
    }

    public PolynomialGF2mSmallM[] getQInv()
    {
        return qInv;
    }

    public int getT()
    {
        return goppaPoly.getDegree();
    }

    public int hashCode()
    {
        return k + n + field.hashCode() + goppaPoly.hashCode() + p.hashCode() + h.hashCode();
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("").append(" extension degree of the field      : ").append(n).append("\n").toString();
        s = (new StringBuilder()).append(s).append(" dimension of the code              : ").append(k).append("\n").toString();
        return (new StringBuilder()).append(s).append(" irreducible Goppa polynomial       : ").append(goppaPoly).append("\n").toString();
    }
}
