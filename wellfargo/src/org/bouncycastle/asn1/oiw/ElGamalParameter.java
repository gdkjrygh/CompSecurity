// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ElGamalParameter extends ASN1Object
{

    ASN1Integer g;
    ASN1Integer p;

    public ElGamalParameter(BigInteger biginteger, BigInteger biginteger1)
    {
        p = new ASN1Integer(biginteger);
        g = new ASN1Integer(biginteger1);
    }

    public ElGamalParameter(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        p = (ASN1Integer)asn1sequence.nextElement();
        g = (ASN1Integer)asn1sequence.nextElement();
    }

    public BigInteger getG()
    {
        return g.getPositiveValue();
    }

    public BigInteger getP()
    {
        return p.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(p);
        asn1encodablevector.add(g);
        return new DERSequence(asn1encodablevector);
    }
}
