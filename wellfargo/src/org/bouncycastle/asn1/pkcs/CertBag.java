// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class CertBag extends ASN1Object
{

    private ASN1ObjectIdentifier certId;
    private ASN1Encodable certValue;

    public CertBag(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        certId = asn1objectidentifier;
        certValue = asn1encodable;
    }

    private CertBag(ASN1Sequence asn1sequence)
    {
        certId = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        certValue = ((DERTaggedObject)asn1sequence.getObjectAt(1)).getObject();
    }

    public static CertBag getInstance(Object obj)
    {
        if (obj instanceof CertBag)
        {
            return (CertBag)obj;
        }
        if (obj != null)
        {
            return new CertBag(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getCertId()
    {
        return certId;
    }

    public ASN1Encodable getCertValue()
    {
        return certValue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certId);
        asn1encodablevector.add(new DERTaggedObject(0, certValue));
        return new DERSequence(asn1encodablevector);
    }
}
