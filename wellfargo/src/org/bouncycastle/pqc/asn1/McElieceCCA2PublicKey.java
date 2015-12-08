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

public class McElieceCCA2PublicKey extends ASN1Object
{

    private byte matrixG[];
    private int n;
    private ASN1ObjectIdentifier oid;
    private int t;

    public McElieceCCA2PublicKey(ASN1ObjectIdentifier asn1objectidentifier, int i, int j, GF2Matrix gf2matrix)
    {
        oid = asn1objectidentifier;
        n = i;
        t = j;
        matrixG = gf2matrix.getEncoded();
    }

    private McElieceCCA2PublicKey(ASN1Sequence asn1sequence)
    {
        oid = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        n = ((ASN1Integer)asn1sequence.getObjectAt(1)).getValue().intValue();
        t = ((ASN1Integer)asn1sequence.getObjectAt(2)).getValue().intValue();
        matrixG = ((ASN1OctetString)asn1sequence.getObjectAt(3)).getOctets();
    }

    public static McElieceCCA2PublicKey getInstance(Object obj)
    {
        if (obj instanceof McElieceCCA2PublicKey)
        {
            return (McElieceCCA2PublicKey)obj;
        }
        if (obj != null)
        {
            return new McElieceCCA2PublicKey(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public GF2Matrix getG()
    {
        return new GF2Matrix(matrixG);
    }

    public int getN()
    {
        return n;
    }

    public ASN1ObjectIdentifier getOID()
    {
        return oid;
    }

    public int getT()
    {
        return t;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(oid);
        asn1encodablevector.add(new ASN1Integer(n));
        asn1encodablevector.add(new ASN1Integer(t));
        asn1encodablevector.add(new DEROctetString(matrixG));
        return new DERSequence(asn1encodablevector);
    }
}
