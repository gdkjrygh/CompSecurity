// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;

// Referenced classes of package org.bouncycastle.asn1.eac:
//            CertificateBody, CertificateHolderAuthorization, Flags, CertificationAuthorityReference, 
//            PackedDate, CertificateHolderReference

public class CVCertificate extends ASN1Object
{

    public static String ReferenceEncoding = "ISO-8859-1";
    private static int bodyValid = 1;
    private static int signValid = 2;
    public static final byte version_1 = 0;
    private CertificateBody certificateBody;
    private byte signature[];
    private int valid;

    public CVCertificate(ASN1InputStream asn1inputstream)
    {
        initFrom(asn1inputstream);
    }

    private CVCertificate(DERApplicationSpecific derapplicationspecific)
    {
        setPrivateData(derapplicationspecific);
    }

    public CVCertificate(CertificateBody certificatebody, byte abyte0[])
    {
        certificateBody = certificatebody;
        signature = abyte0;
        valid = valid | bodyValid;
        valid = valid | signValid;
    }

    public static CVCertificate getInstance(Object obj)
    {
        if (obj instanceof CVCertificate)
        {
            return (CVCertificate)obj;
        }
        if (obj != null)
        {
            try
            {
                obj = new CVCertificate(DERApplicationSpecific.getInstance(obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ASN1ParsingException((new StringBuilder()).append("unable to parse data: ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
            }
            return ((CVCertificate) (obj));
        } else
        {
            return null;
        }
    }

    private void initFrom(ASN1InputStream asn1inputstream)
    {
        do
        {
            ASN1Primitive asn1primitive = asn1inputstream.readObject();
            if (asn1primitive != null)
            {
                if (asn1primitive instanceof DERApplicationSpecific)
                {
                    setPrivateData((DERApplicationSpecific)asn1primitive);
                } else
                {
                    throw new IOException("Invalid Input Stream for creating an Iso7816CertificateStructure");
                }
            } else
            {
                return;
            }
        } while (true);
    }

    private void setPrivateData(DERApplicationSpecific derapplicationspecific)
    {
        valid = 0;
        if (derapplicationspecific.getApplicationTag() != 33) goto _L2; else goto _L1
_L1:
        derapplicationspecific = new ASN1InputStream(derapplicationspecific.getContents());
_L4:
        Object obj = derapplicationspecific.readObject();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj instanceof DERApplicationSpecific)
        {
            obj = (DERApplicationSpecific)obj;
            switch (((DERApplicationSpecific) (obj)).getApplicationTag())
            {
            default:
                throw new IOException((new StringBuilder()).append("Invalid tag, not an Iso7816CertificateStructure :").append(((DERApplicationSpecific) (obj)).getApplicationTag()).toString());

            case 78: // 'N'
                certificateBody = CertificateBody.getInstance(obj);
                valid = valid | bodyValid;
                break;

            case 55: // '7'
                signature = ((DERApplicationSpecific) (obj)).getContents();
                valid = valid | signValid;
                break;
            }
        } else
        {
            throw new IOException("Invalid Object, not an Iso7816CertificateStructure");
        }
        continue; /* Loop/switch isn't completed */
_L2:
        throw new IOException((new StringBuilder()).append("not a CARDHOLDER_CERTIFICATE :").append(derapplicationspecific.getApplicationTag()).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public CertificationAuthorityReference getAuthorityReference()
    {
        return certificateBody.getCertificationAuthorityReference();
    }

    public CertificateBody getBody()
    {
        return certificateBody;
    }

    public int getCertificateType()
    {
        return certificateBody.getCertificateType();
    }

    public PackedDate getEffectiveDate()
    {
        return certificateBody.getCertificateEffectiveDate();
    }

    public PackedDate getExpirationDate()
    {
        return certificateBody.getCertificateExpirationDate();
    }

    public ASN1ObjectIdentifier getHolderAuthorization()
    {
        return certificateBody.getCertificateHolderAuthorization().getOid();
    }

    public Flags getHolderAuthorizationRights()
    {
        return new Flags(certificateBody.getCertificateHolderAuthorization().getAccessRights() & 0x1f);
    }

    public int getHolderAuthorizationRole()
    {
        return certificateBody.getCertificateHolderAuthorization().getAccessRights() & 0xc0;
    }

    public CertificateHolderReference getHolderReference()
    {
        return certificateBody.getCertificateHolderReference();
    }

    public int getRole()
    {
        return certificateBody.getCertificateHolderAuthorization().getAccessRights();
    }

    public byte[] getSignature()
    {
        return signature;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (valid != (signValid | bodyValid))
        {
            return null;
        }
        asn1encodablevector.add(certificateBody);
        try
        {
            asn1encodablevector.add(new DERApplicationSpecific(false, 55, new DEROctetString(signature)));
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("unable to convert signature!");
        }
        return new DERApplicationSpecific(33, asn1encodablevector);
    }

}
