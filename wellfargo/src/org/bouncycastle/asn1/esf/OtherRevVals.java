// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class OtherRevVals extends ASN1Object
{

    private ASN1ObjectIdentifier otherRevValType;
    private ASN1Encodable otherRevVals;

    public OtherRevVals(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        otherRevValType = asn1objectidentifier;
        otherRevVals = asn1encodable;
    }

    private OtherRevVals(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        otherRevValType = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        try
        {
            otherRevVals = ASN1Primitive.fromByteArray(asn1sequence.getObjectAt(1).toASN1Primitive().getEncoded("DER"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ASN1Sequence asn1sequence)
        {
            throw new IllegalStateException();
        }
    }

    public static OtherRevVals getInstance(Object obj)
    {
        if (obj instanceof OtherRevVals)
        {
            return (OtherRevVals)obj;
        }
        if (obj != null)
        {
            return new OtherRevVals(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getOtherRevValType()
    {
        return otherRevValType;
    }

    public ASN1Encodable getOtherRevVals()
    {
        return otherRevVals;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(otherRevValType);
        asn1encodablevector.add(otherRevVals);
        return new DERSequence(asn1encodablevector);
    }
}
