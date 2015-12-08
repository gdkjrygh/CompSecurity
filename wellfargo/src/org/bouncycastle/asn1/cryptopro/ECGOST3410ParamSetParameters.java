// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class ECGOST3410ParamSetParameters extends ASN1Object
{

    ASN1Integer a;
    ASN1Integer b;
    ASN1Integer p;
    ASN1Integer q;
    ASN1Integer x;
    ASN1Integer y;

    public ECGOST3410ParamSetParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, int i, BigInteger biginteger4)
    {
        a = new ASN1Integer(biginteger);
        b = new ASN1Integer(biginteger1);
        p = new ASN1Integer(biginteger2);
        q = new ASN1Integer(biginteger3);
        x = new ASN1Integer(i);
        y = new ASN1Integer(biginteger4);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        a = (ASN1Integer)asn1sequence.nextElement();
        b = (ASN1Integer)asn1sequence.nextElement();
        p = (ASN1Integer)asn1sequence.nextElement();
        q = (ASN1Integer)asn1sequence.nextElement();
        x = (ASN1Integer)asn1sequence.nextElement();
        y = (ASN1Integer)asn1sequence.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters))
        {
            return (ECGOST3410ParamSetParameters)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new ECGOST3410ParamSetParameters((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid GOST3410Parameter: ").append(obj.getClass().getName()).toString());
        }
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public BigInteger getA()
    {
        return a.getPositiveValue();
    }

    public BigInteger getP()
    {
        return p.getPositiveValue();
    }

    public BigInteger getQ()
    {
        return q.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(a);
        asn1encodablevector.add(b);
        asn1encodablevector.add(p);
        asn1encodablevector.add(q);
        asn1encodablevector.add(x);
        asn1encodablevector.add(y);
        return new DERSequence(asn1encodablevector);
    }
}
