// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames, IssuerSerial, ObjectDigestInfo

public class V2Form extends ASN1Object
{

    IssuerSerial baseCertificateID;
    GeneralNames issuerName;
    ObjectDigestInfo objectDigestInfo;

    public V2Form(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        int i;
        if (!(asn1sequence.getObjectAt(0) instanceof ASN1TaggedObject))
        {
            issuerName = GeneralNames.getInstance(asn1sequence.getObjectAt(0));
            i = 1;
        } else
        {
            i = 0;
        }
        while (i != asn1sequence.size()) 
        {
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.getObjectAt(i));
            if (asn1taggedobject.getTagNo() == 0)
            {
                baseCertificateID = IssuerSerial.getInstance(asn1taggedobject, false);
            } else
            if (asn1taggedobject.getTagNo() == 1)
            {
                objectDigestInfo = ObjectDigestInfo.getInstance(asn1taggedobject, false);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number: ").append(asn1taggedobject.getTagNo()).toString());
            }
            i++;
        }
    }

    public V2Form(GeneralNames generalnames)
    {
        issuerName = generalnames;
    }

    public static V2Form getInstance(Object obj)
    {
        if (obj == null || (obj instanceof V2Form))
        {
            return (V2Form)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new V2Form((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public static V2Form getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public IssuerSerial getBaseCertificateID()
    {
        return baseCertificateID;
    }

    public GeneralNames getIssuerName()
    {
        return issuerName;
    }

    public ObjectDigestInfo getObjectDigestInfo()
    {
        return objectDigestInfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (issuerName != null)
        {
            asn1encodablevector.add(issuerName);
        }
        if (baseCertificateID != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, baseCertificateID));
        }
        if (objectDigestInfo != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, objectDigestInfo));
        }
        return new DERSequence(asn1encodablevector);
    }
}
