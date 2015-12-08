// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.asn1;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

public class McElieceCCA2PrivateKey extends ASN1Object
{

    private byte encField[];
    private byte encGp[];
    private byte encH[];
    private byte encP[];
    private byte encqInv[][];
    private int k;
    private int n;
    private ASN1ObjectIdentifier oid;

    public McElieceCCA2PrivateKey(ASN1ObjectIdentifier asn1objectidentifier, int i, int j, GF2mField gf2mfield, PolynomialGF2mSmallM polynomialgf2msmallm, Permutation permutation, GF2Matrix gf2matrix, 
            PolynomialGF2mSmallM apolynomialgf2msmallm[])
    {
        oid = asn1objectidentifier;
        n = i;
        k = j;
        encField = gf2mfield.getEncoded();
        encGp = polynomialgf2msmallm.getEncoded();
        encP = permutation.getEncoded();
        encH = gf2matrix.getEncoded();
        encqInv = new byte[apolynomialgf2msmallm.length][];
        for (i = 0; i != apolynomialgf2msmallm.length; i++)
        {
            encqInv[i] = apolynomialgf2msmallm[i].getEncoded();
        }

    }

    private McElieceCCA2PrivateKey(ASN1Sequence asn1sequence)
    {
        oid = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        n = ((ASN1Integer)asn1sequence.getObjectAt(1)).getValue().intValue();
        k = ((ASN1Integer)asn1sequence.getObjectAt(2)).getValue().intValue();
        encField = ((ASN1OctetString)asn1sequence.getObjectAt(3)).getOctets();
        encGp = ((ASN1OctetString)asn1sequence.getObjectAt(4)).getOctets();
        encP = ((ASN1OctetString)asn1sequence.getObjectAt(5)).getOctets();
        encH = ((ASN1OctetString)asn1sequence.getObjectAt(6)).getOctets();
        asn1sequence = (ASN1Sequence)asn1sequence.getObjectAt(7);
        encqInv = new byte[asn1sequence.size()][];
        for (int i = 0; i < asn1sequence.size(); i++)
        {
            encqInv[i] = ((ASN1OctetString)asn1sequence.getObjectAt(i)).getOctets();
        }

    }

    public static McElieceCCA2PrivateKey getInstance(Object obj)
    {
        if (obj instanceof McElieceCCA2PrivateKey)
        {
            return (McElieceCCA2PrivateKey)obj;
        }
        if (obj != null)
        {
            return new McElieceCCA2PrivateKey(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public GF2mField getField()
    {
        return new GF2mField(encField);
    }

    public PolynomialGF2mSmallM getGoppaPoly()
    {
        return new PolynomialGF2mSmallM(getField(), encGp);
    }

    public GF2Matrix getH()
    {
        return new GF2Matrix(encH);
    }

    public int getK()
    {
        return k;
    }

    public int getN()
    {
        return n;
    }

    public ASN1ObjectIdentifier getOID()
    {
        return oid;
    }

    public Permutation getP()
    {
        return new Permutation(encP);
    }

    public PolynomialGF2mSmallM[] getQInv()
    {
        PolynomialGF2mSmallM apolynomialgf2msmallm[] = new PolynomialGF2mSmallM[encqInv.length];
        GF2mField gf2mfield = getField();
        for (int i = 0; i < encqInv.length; i++)
        {
            apolynomialgf2msmallm[i] = new PolynomialGF2mSmallM(gf2mfield, encqInv[i]);
        }

        return apolynomialgf2msmallm;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(oid);
        asn1encodablevector.add(new ASN1Integer(n));
        asn1encodablevector.add(new ASN1Integer(k));
        asn1encodablevector.add(new DEROctetString(encField));
        asn1encodablevector.add(new DEROctetString(encGp));
        asn1encodablevector.add(new DEROctetString(encP));
        asn1encodablevector.add(new DEROctetString(encH));
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        for (int i = 0; i < encqInv.length; i++)
        {
            asn1encodablevector1.add(new DEROctetString(encqInv[i]));
        }

        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        return new DERSequence(asn1encodablevector);
    }
}
