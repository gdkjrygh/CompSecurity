// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            DHDomainParameters

public class DHValidationParms extends ASN1Object
{

    private ASN1Integer pgenCounter;
    private DERBitString seed;

    private DHValidationParms(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            seed = DERBitString.getInstance(asn1sequence.getObjectAt(0));
            pgenCounter = ASN1Integer.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public DHValidationParms(DERBitString derbitstring, ASN1Integer asn1integer)
    {
        if (derbitstring == null)
        {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        if (asn1integer == null)
        {
            throw new IllegalArgumentException("'pgenCounter' cannot be null");
        } else
        {
            seed = derbitstring;
            pgenCounter = asn1integer;
            return;
        }
    }

    public static DHValidationParms getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DHDomainParameters))
        {
            return (DHValidationParms)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new DHValidationParms((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid DHValidationParms: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DHValidationParms getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1Integer getPgenCounter()
    {
        return pgenCounter;
    }

    public DERBitString getSeed()
    {
        return seed;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(seed);
        asn1encodablevector.add(pgenCounter);
        return new DERSequence(asn1encodablevector);
    }
}
