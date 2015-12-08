// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralName

public class GeneralSubtree extends ASN1Object
{

    private static final BigInteger ZERO = BigInteger.valueOf(0L);
    private GeneralName base;
    private ASN1Integer maximum;
    private ASN1Integer minimum;

    private GeneralSubtree(ASN1Sequence asn1sequence)
    {
        base = GeneralName.getInstance(asn1sequence.getObjectAt(0));
        asn1sequence.size();
        JVM INSTR tableswitch 1 3: default 48
    //                   1 151
    //                   2 78
    //                   3 162;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
_L3:
        asn1sequence = ASN1TaggedObject.getInstance(asn1sequence.getObjectAt(1));
        asn1sequence.getTagNo();
        JVM INSTR tableswitch 0 1: default 112
    //                   0 142
    //                   1 152;
           goto _L5 _L6 _L7
_L5:
        throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number: ").append(asn1sequence.getTagNo()).toString());
_L6:
        minimum = ASN1Integer.getInstance(asn1sequence, false);
_L2:
        return;
_L7:
        maximum = ASN1Integer.getInstance(asn1sequence, false);
        return;
_L4:
        ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.getObjectAt(1));
        if (asn1taggedobject.getTagNo() != 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number for 'minimum': ").append(asn1taggedobject.getTagNo()).toString());
        }
        minimum = ASN1Integer.getInstance(asn1taggedobject, false);
        asn1sequence = ASN1TaggedObject.getInstance(asn1sequence.getObjectAt(2));
        if (asn1sequence.getTagNo() != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number for 'maximum': ").append(asn1sequence.getTagNo()).toString());
        } else
        {
            maximum = ASN1Integer.getInstance(asn1sequence, false);
            return;
        }
    }

    public GeneralSubtree(GeneralName generalname)
    {
        this(generalname, null, null);
    }

    public GeneralSubtree(GeneralName generalname, BigInteger biginteger, BigInteger biginteger1)
    {
        base = generalname;
        if (biginteger1 != null)
        {
            maximum = new ASN1Integer(biginteger1);
        }
        if (biginteger == null)
        {
            minimum = null;
            return;
        } else
        {
            minimum = new ASN1Integer(biginteger);
            return;
        }
    }

    public static GeneralSubtree getInstance(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof GeneralSubtree)
        {
            return (GeneralSubtree)obj;
        } else
        {
            return new GeneralSubtree(ASN1Sequence.getInstance(obj));
        }
    }

    public static GeneralSubtree getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return new GeneralSubtree(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public GeneralName getBase()
    {
        return base;
    }

    public BigInteger getMaximum()
    {
        if (maximum == null)
        {
            return null;
        } else
        {
            return maximum.getValue();
        }
    }

    public BigInteger getMinimum()
    {
        if (minimum == null)
        {
            return ZERO;
        } else
        {
            return minimum.getValue();
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(base);
        if (minimum != null && !minimum.getValue().equals(ZERO))
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, minimum));
        }
        if (maximum != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, maximum));
        }
        return new DERSequence(asn1encodablevector);
    }

}
