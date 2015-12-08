// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ua;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class DSTU4145BinaryField extends ASN1Object
{

    private int j;
    private int k;
    private int l;
    private int m;

    public DSTU4145BinaryField(int i, int i1)
    {
        this(i, i1, 0, 0);
    }

    public DSTU4145BinaryField(int i, int i1, int j1, int k1)
    {
        m = i;
        k = i1;
        j = j1;
        l = k1;
    }

    private DSTU4145BinaryField(ASN1Sequence asn1sequence)
    {
        m = ASN1Integer.getInstance(asn1sequence.getObjectAt(0)).getPositiveValue().intValue();
        if (asn1sequence.getObjectAt(1) instanceof ASN1Integer)
        {
            k = ((ASN1Integer)asn1sequence.getObjectAt(1)).getPositiveValue().intValue();
            return;
        }
        if (asn1sequence.getObjectAt(1) instanceof ASN1Sequence)
        {
            asn1sequence = ASN1Sequence.getInstance(asn1sequence.getObjectAt(1));
            k = ASN1Integer.getInstance(asn1sequence.getObjectAt(0)).getPositiveValue().intValue();
            j = ASN1Integer.getInstance(asn1sequence.getObjectAt(1)).getPositiveValue().intValue();
            l = ASN1Integer.getInstance(asn1sequence.getObjectAt(2)).getPositiveValue().intValue();
            return;
        } else
        {
            throw new IllegalArgumentException("object parse error");
        }
    }

    public static DSTU4145BinaryField getInstance(Object obj)
    {
        if (obj instanceof DSTU4145BinaryField)
        {
            return (DSTU4145BinaryField)obj;
        }
        if (obj != null)
        {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public int getK1()
    {
        return k;
    }

    public int getK2()
    {
        return j;
    }

    public int getK3()
    {
        return l;
    }

    public int getM()
    {
        return m;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(m));
        if (j == 0)
        {
            asn1encodablevector.add(new ASN1Integer(k));
        } else
        {
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.add(new ASN1Integer(k));
            asn1encodablevector1.add(new ASN1Integer(j));
            asn1encodablevector1.add(new ASN1Integer(l));
            asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        }
        return new DERSequence(asn1encodablevector);
    }
}
