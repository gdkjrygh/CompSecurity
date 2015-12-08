// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.asn1;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class ParSet extends ASN1Object
{

    private static final BigInteger ZERO = BigInteger.valueOf(0L);
    private int h[];
    private int k[];
    private int t;
    private int w[];

    public ParSet(int i, int ai[], int ai1[], int ai2[])
    {
        t = i;
        h = ai;
        w = ai1;
        k = ai2;
    }

    private ParSet(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 4)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("sie of seqOfParams = ").append(asn1sequence.size()).toString());
        }
        t = checkBigIntegerInIntRangeAndPositive(((ASN1Integer)asn1sequence.getObjectAt(0)).getValue());
        ASN1Sequence asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(1);
        ASN1Sequence asn1sequence2 = (ASN1Sequence)asn1sequence.getObjectAt(2);
        asn1sequence = (ASN1Sequence)asn1sequence.getObjectAt(3);
        if (asn1sequence1.size() != t || asn1sequence2.size() != t || asn1sequence.size() != t)
        {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        h = new int[asn1sequence1.size()];
        w = new int[asn1sequence2.size()];
        k = new int[asn1sequence.size()];
        for (int i = 0; i < t; i++)
        {
            h[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer)asn1sequence1.getObjectAt(i)).getValue());
            w[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer)asn1sequence2.getObjectAt(i)).getValue());
            k[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer)asn1sequence.getObjectAt(i)).getValue());
        }

    }

    private static int checkBigIntegerInIntRangeAndPositive(BigInteger biginteger)
    {
        if (biginteger.compareTo(BigInteger.valueOf(0x7fffffffL)) > 0 || biginteger.compareTo(ZERO) <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("BigInteger not in Range: ").append(biginteger.toString()).toString());
        } else
        {
            return biginteger.intValue();
        }
    }

    public static ParSet getInstance(Object obj)
    {
        if (obj instanceof ParSet)
        {
            return (ParSet)obj;
        }
        if (obj != null)
        {
            return new ParSet(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public int[] getH()
    {
        return Arrays.clone(h);
    }

    public int[] getK()
    {
        return Arrays.clone(k);
    }

    public int getT()
    {
        return t;
    }

    public int[] getW()
    {
        return Arrays.clone(w);
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector2 = new ASN1EncodableVector();
        for (int i = 0; i < h.length; i++)
        {
            asn1encodablevector.add(new ASN1Integer(h[i]));
            asn1encodablevector1.add(new ASN1Integer(w[i]));
            asn1encodablevector2.add(new ASN1Integer(k[i]));
        }

        ASN1EncodableVector asn1encodablevector3 = new ASN1EncodableVector();
        asn1encodablevector3.add(new ASN1Integer(t));
        asn1encodablevector3.add(new DERSequence(asn1encodablevector));
        asn1encodablevector3.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector3.add(new DERSequence(asn1encodablevector2));
        return new DERSequence(asn1encodablevector3);
    }

}
