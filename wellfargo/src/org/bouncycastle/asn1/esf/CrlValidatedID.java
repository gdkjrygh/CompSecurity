// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            OtherHash, CrlIdentifier

public class CrlValidatedID extends ASN1Object
{

    private OtherHash crlHash;
    private CrlIdentifier crlIdentifier;

    private CrlValidatedID(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1 || asn1sequence.size() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        crlHash = OtherHash.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() > 1)
        {
            crlIdentifier = CrlIdentifier.getInstance(asn1sequence.getObjectAt(1));
        }
    }

    public CrlValidatedID(OtherHash otherhash)
    {
        this(otherhash, null);
    }

    public CrlValidatedID(OtherHash otherhash, CrlIdentifier crlidentifier)
    {
        crlHash = otherhash;
        crlIdentifier = crlidentifier;
    }

    public static CrlValidatedID getInstance(Object obj)
    {
        if (obj instanceof CrlValidatedID)
        {
            return (CrlValidatedID)obj;
        }
        if (obj != null)
        {
            return new CrlValidatedID(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public OtherHash getCrlHash()
    {
        return crlHash;
    }

    public CrlIdentifier getCrlIdentifier()
    {
        return crlIdentifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(crlHash.toASN1Primitive());
        if (crlIdentifier != null)
        {
            asn1encodablevector.add(crlIdentifier.toASN1Primitive());
        }
        return new DERSequence(asn1encodablevector);
    }
}
