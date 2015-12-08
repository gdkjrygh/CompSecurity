// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;

public class CMPCertificate extends ASN1Object
    implements ASN1Choice
{

    private AttributeCertificate x509v2AttrCert;
    private Certificate x509v3PKCert;

    public CMPCertificate(AttributeCertificate attributecertificate)
    {
        x509v2AttrCert = attributecertificate;
    }

    public CMPCertificate(Certificate certificate)
    {
        if (certificate.getVersionNumber() != 3)
        {
            throw new IllegalArgumentException("only version 3 certificates allowed");
        } else
        {
            x509v3PKCert = certificate;
            return;
        }
    }

    public static CMPCertificate getInstance(Object obj)
    {
        if (obj == null || (obj instanceof CMPCertificate))
        {
            return (CMPCertificate)obj;
        }
        if ((obj instanceof ASN1Sequence) || (obj instanceof byte[]))
        {
            return new CMPCertificate(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new CMPCertificate(AttributeCertificate.getInstance(((ASN1TaggedObject)obj).getObject()));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid object: ").append(obj.getClass().getName()).toString());
        }
    }

    public AttributeCertificate getX509v2AttrCert()
    {
        return x509v2AttrCert;
    }

    public Certificate getX509v3PKCert()
    {
        return x509v3PKCert;
    }

    public boolean isX509v3PKCert()
    {
        return x509v3PKCert != null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (x509v2AttrCert != null)
        {
            return new DERTaggedObject(true, 1, x509v2AttrCert);
        } else
        {
            return x509v3PKCert.toASN1Primitive();
        }
    }
}
