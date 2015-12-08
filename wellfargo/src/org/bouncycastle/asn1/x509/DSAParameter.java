// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class DSAParameter extends ASN1Object
{

    ASN1Integer g;
    ASN1Integer p;
    ASN1Integer q;

    public DSAParameter(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        p = new ASN1Integer(biginteger);
        q = new ASN1Integer(biginteger1);
        g = new ASN1Integer(biginteger2);
    }

    private DSAParameter(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            asn1sequence = asn1sequence.getObjects();
            p = ASN1Integer.getInstance(asn1sequence.nextElement());
            q = ASN1Integer.getInstance(asn1sequence.nextElement());
            g = ASN1Integer.getInstance(asn1sequence.nextElement());
            return;
        }
    }

    public static DSAParameter getInstance(Object obj)
    {
        if (obj instanceof DSAParameter)
        {
            return (DSAParameter)obj;
        }
        if (obj != null)
        {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static DSAParameter getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public BigInteger getG()
    {
        return g.getPositiveValue();
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
        asn1encodablevector.add(p);
        asn1encodablevector.add(q);
        asn1encodablevector.add(g);
        return new DERSequence(asn1encodablevector);
    }
}
