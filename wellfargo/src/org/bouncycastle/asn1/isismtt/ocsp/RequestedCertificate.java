// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.ocsp;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Certificate;

public class RequestedCertificate extends ASN1Object
    implements ASN1Choice
{

    public static final int attributeCertificate = 1;
    public static final int certificate = -1;
    public static final int publicKeyCertificate = 0;
    private byte attributeCert[];
    private Certificate cert;
    private byte publicKeyCert[];

    public RequestedCertificate(int i, byte abyte0[])
    {
        this(((ASN1TaggedObject) (new DERTaggedObject(i, new DEROctetString(abyte0)))));
    }

    private RequestedCertificate(ASN1TaggedObject asn1taggedobject)
    {
        if (asn1taggedobject.getTagNo() == 0)
        {
            publicKeyCert = ASN1OctetString.getInstance(asn1taggedobject, true).getOctets();
            return;
        }
        if (asn1taggedobject.getTagNo() == 1)
        {
            attributeCert = ASN1OctetString.getInstance(asn1taggedobject, true).getOctets();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown tag number: ").append(asn1taggedobject.getTagNo()).toString());
        }
    }

    public RequestedCertificate(Certificate certificate1)
    {
        cert = certificate1;
    }

    public static RequestedCertificate getInstance(Object obj)
    {
        if (obj == null || (obj instanceof RequestedCertificate))
        {
            return (RequestedCertificate)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new RequestedCertificate(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new RequestedCertificate((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static RequestedCertificate getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException("choice item must be explicitly tagged");
        } else
        {
            return getInstance(asn1taggedobject.getObject());
        }
    }

    public byte[] getCertificateBytes()
    {
        if (cert != null)
        {
            byte abyte0[];
            try
            {
                abyte0 = cert.getEncoded();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException((new StringBuilder()).append("can't decode certificate: ").append(ioexception).toString());
            }
            return abyte0;
        }
        if (publicKeyCert != null)
        {
            return publicKeyCert;
        } else
        {
            return attributeCert;
        }
    }

    public int getType()
    {
        if (cert != null)
        {
            return -1;
        }
        return publicKeyCert == null ? 1 : 0;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (publicKeyCert != null)
        {
            return new DERTaggedObject(0, new DEROctetString(publicKeyCert));
        }
        if (attributeCert != null)
        {
            return new DERTaggedObject(1, new DEROctetString(attributeCert));
        } else
        {
            return cert.toASN1Primitive();
        }
    }
}
