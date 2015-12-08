// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            PolicyQualifierId

public class PolicyQualifierInfo extends ASN1Object
{

    private ASN1ObjectIdentifier policyQualifierId;
    private ASN1Encodable qualifier;

    public PolicyQualifierInfo(String s)
    {
        policyQualifierId = PolicyQualifierId.id_qt_cps;
        qualifier = new DERIA5String(s);
    }

    public PolicyQualifierInfo(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        policyQualifierId = asn1objectidentifier;
        qualifier = asn1encodable;
    }

    public PolicyQualifierInfo(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            policyQualifierId = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
            qualifier = asn1sequence.getObjectAt(1);
            return;
        }
    }

    public static PolicyQualifierInfo getInstance(Object obj)
    {
        if (obj instanceof PolicyQualifierInfo)
        {
            return (PolicyQualifierInfo)obj;
        }
        if (obj != null)
        {
            return new PolicyQualifierInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getPolicyQualifierId()
    {
        return policyQualifierId;
    }

    public ASN1Encodable getQualifier()
    {
        return qualifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(policyQualifierId);
        asn1encodablevector.add(qualifier);
        return new DERSequence(asn1encodablevector);
    }
}
