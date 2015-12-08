// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralName

public class AccessDescription extends ASN1Object
{

    public static final ASN1ObjectIdentifier id_ad_caIssuers = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.2");
    public static final ASN1ObjectIdentifier id_ad_ocsp = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1");
    GeneralName accessLocation;
    ASN1ObjectIdentifier accessMethod;

    public AccessDescription(ASN1ObjectIdentifier asn1objectidentifier, GeneralName generalname)
    {
        accessMethod = null;
        accessLocation = null;
        accessMethod = asn1objectidentifier;
        accessLocation = generalname;
    }

    private AccessDescription(ASN1Sequence asn1sequence)
    {
        accessMethod = null;
        accessLocation = null;
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException("wrong number of elements in sequence");
        } else
        {
            accessMethod = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
            accessLocation = GeneralName.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public static AccessDescription getInstance(Object obj)
    {
        if (obj instanceof AccessDescription)
        {
            return (AccessDescription)obj;
        }
        if (obj != null)
        {
            return new AccessDescription(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public GeneralName getAccessLocation()
    {
        return accessLocation;
    }

    public ASN1ObjectIdentifier getAccessMethod()
    {
        return accessMethod;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(accessMethod);
        asn1encodablevector.add(accessLocation);
        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        return (new StringBuilder()).append("AccessDescription: Oid(").append(accessMethod.getId()).append(")").toString();
    }

}
