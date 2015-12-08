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
import org.bouncycastle.pqc.asn1.McEliecePrivateKey;
import org.bouncycastle.pqc.crypto.mceliece.McElieceParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McEliecePrivateKeySpec;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

public class BCMcEliecePrivateKey
    implements PrivateKey, CipherParameters
{

    private static final long serialVersionUID = 1L;
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;
    private GF2Matrix h;
    private int k;
    private McElieceParameters mcElieceParams;
    private int n;
    private String oid;
    private Permutation p1;
    private Permutation p2;
    private PolynomialGF2mSmallM qInv[];
    private GF2Matrix sInv;

    public BCMcEliecePrivateKey(String s, int i, int j, GF2mField gf2mfield, PolynomialGF2mSmallM polynomialgf2msmallm, GF2Matrix gf2matrix, Permutation permutation, 
            Permutation permutation1, GF2Matrix gf2matrix1, PolynomialGF2mSmallM apolynomialgf2msmallm[])
    {
        oid = s;
        n = i;
        k = j;
        field = gf2mfield;
        goppaPoly = polynomialgf2msmallm;
        sInv = gf2matrix;
        p1 = permutation;
        p2 = permutation1;
        h = gf2matrix1;
        qInv = apolynomialgf2msmallm;
    }

    public BCMcEliecePrivateKey(McEliecePrivateKeyParameters mcelieceprivatekeyparameters)
    {
        this(mcelieceprivatekeyparameters.getOIDString(), mcelieceprivatekeyparameters.getN(), mcelieceprivatekeyparameters.getK(), mcelieceprivatekeyparameters.getField(), mcelieceprivatekeyparameters.getGoppaPoly(), mcelieceprivatekeyparameters.getSInv(), mcelieceprivatekeyparameters.getP1(), mcelieceprivatekeyparameters.getP2(), mcelieceprivatekeyparameters.getH(), mcelieceprivatekeyparameters.getQInv());
        mcElieceParams = mcelieceprivatekeyparameters.getParameters();
    }

    public BCMcEliecePrivateKey(McEliecePrivateKeySpec mcelieceprivatekeyspec)
    {
        this(mcelieceprivatekeyspec.getOIDString(), mcelieceprivatekeyspec.getN(), mcelieceprivatekeyspec.getK(), mcelieceprivatekeyspec.getField(), mcelieceprivatekeyspec.getGoppaPoly(), mcelieceprivatekeyspec.getSInv(), mcelieceprivatekeyspec.getP1(), mcelieceprivatekeyspec.getP2(), mcelieceprivatekeyspec.getH(), mcelieceprivatekeyspec.getQInv());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof BCMcEliecePrivateKey)
        {
            if (n == ((BCMcEliecePrivateKey) (obj = (BCMcEliecePrivateKey)obj)).n && k == ((BCMcEliecePrivateKey) (obj)).k && field.equals(((BCMcEliecePrivateKey) (obj)).field) && goppaPoly.equals(((BCMcEliecePrivateKey) (obj)).goppaPoly) && sInv.equals(((BCMcEliecePrivateKey) (obj)).sInv) && p1.equals(((BCMcEliecePrivateKey) (obj)).p1) && p2.equals(((BCMcEliecePrivateKey) (obj)).p2) && h.equals(((BCMcEliecePrivateKey) (obj)).h))
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
        Object obj = new McEliecePrivateKey(new ASN1ObjectIdentifier(oid), n, k, field, goppaPoly, sInv, p1, p2, h, qInv);
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

    public McElieceParameters getMcElieceParameters()
    {
        return mcElieceParams;
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

    public Permutation getP1()
    {
        return p1;
    }

    public Permutation getP2()
    {
        return p2;
    }

    public PolynomialGF2mSmallM[] getQInv()
    {
        return qInv;
    }

    public GF2Matrix getSInv()
    {
        return sInv;
    }

    public int hashCode()
    {
        return k + n + field.hashCode() + goppaPoly.hashCode() + sInv.hashCode() + p1.hashCode() + p2.hashCode() + h.hashCode();
    }

    public String toString()
    {
        String s = (new StringBuilder()).append(" length of the code          : ").append(n).append("\n").toString();
        s = (new StringBuilder()).append(s).append(" dimension of the code       : ").append(k).append("\n").toString();
        s = (new StringBuilder()).append(s).append(" irreducible Goppa polynomial: ").append(goppaPoly).append("\n").toString();
        s = (new StringBuilder()).append(s).append(" (k x k)-matrix S^-1         : ").append(sInv).append("\n").toString();
        s = (new StringBuilder()).append(s).append(" permutation P1              : ").append(p1).append("\n").toString();
        return (new StringBuilder()).append(s).append(" permutation P2              : ").append(p2).toString();
    }
}
