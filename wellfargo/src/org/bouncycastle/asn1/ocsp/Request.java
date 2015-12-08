// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;

// Referenced classes of package org.bouncycastle.asn1.ocsp:
//            CertID

public class Request extends ASN1Object
{

    CertID reqCert;
    Extensions singleRequestExtensions;

    private Request(ASN1Sequence asn1sequence)
    {
        reqCert = CertID.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() == 2)
        {
            singleRequestExtensions = Extensions.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(1), true);
        }
    }

    public Request(CertID certid, Extensions extensions)
    {
        reqCert = certid;
        singleRequestExtensions = extensions;
    }

    public static Request getInstance(Object obj)
    {
        if (obj instanceof Request)
        {
            return (Request)obj;
        }
        if (obj != null)
        {
            return new Request(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static Request getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public CertID getReqCert()
    {
        return reqCert;
    }

    public Extensions getSingleRequestExtensions()
    {
        return singleRequestExtensions;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(reqCert);
        if (singleRequestExtensions != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, singleRequestExtensions));
        }
        return new DERSequence(asn1encodablevector);
    }
}
