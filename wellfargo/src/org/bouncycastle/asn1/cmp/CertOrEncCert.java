// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedValue;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            CMPCertificate

public class CertOrEncCert extends ASN1Object
    implements ASN1Choice
{

    private CMPCertificate certificate;
    private EncryptedValue encryptedCert;

    private CertOrEncCert(ASN1TaggedObject asn1taggedobject)
    {
        if (asn1taggedobject.getTagNo() == 0)
        {
            certificate = CMPCertificate.getInstance(asn1taggedobject.getObject());
            return;
        }
        if (asn1taggedobject.getTagNo() == 1)
        {
            encryptedCert = EncryptedValue.getInstance(asn1taggedobject.getObject());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown tag: ").append(asn1taggedobject.getTagNo()).toString());
        }
    }

    public CertOrEncCert(CMPCertificate cmpcertificate)
    {
        if (cmpcertificate == null)
        {
            throw new IllegalArgumentException("'certificate' cannot be null");
        } else
        {
            certificate = cmpcertificate;
            return;
        }
    }

    public CertOrEncCert(EncryptedValue encryptedvalue)
    {
        if (encryptedvalue == null)
        {
            throw new IllegalArgumentException("'encryptedCert' cannot be null");
        } else
        {
            encryptedCert = encryptedvalue;
            return;
        }
    }

    public static CertOrEncCert getInstance(Object obj)
    {
        if (obj instanceof CertOrEncCert)
        {
            return (CertOrEncCert)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new CertOrEncCert((ASN1TaggedObject)obj);
        } else
        {
            return null;
        }
    }

    public CMPCertificate getCertificate()
    {
        return certificate;
    }

    public EncryptedValue getEncryptedCert()
    {
        return encryptedCert;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (certificate != null)
        {
            return new DERTaggedObject(true, 0, certificate);
        } else
        {
            return new DERTaggedObject(true, 1, encryptedCert);
        }
    }
}
