// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;

// Referenced classes of package org.bouncycastle.asn1.eac:
//            CertificateBody, PublicKeyDataObject

public class CVCertificateRequest extends ASN1Object
{

    public static byte ZeroArray[] = {
        0
    };
    private static int bodyValid = 1;
    private static int signValid = 2;
    int ProfileId;
    byte certificate[];
    private CertificateBody certificateBody;
    byte encoded[];
    byte encodedAuthorityReference[];
    private byte innerSignature[];
    PublicKeyDataObject iso7816PubKey;
    ASN1ObjectIdentifier keyOid;
    private byte outerSignature[];
    protected String overSignerReference;
    ASN1ObjectIdentifier signOid;
    String strCertificateHolderReference;
    private int valid;

    private CVCertificateRequest(DERApplicationSpecific derapplicationspecific)
    {
        innerSignature = null;
        outerSignature = null;
        signOid = null;
        keyOid = null;
        certificate = null;
        overSignerReference = null;
        iso7816PubKey = null;
        if (derapplicationspecific.getApplicationTag() == 103)
        {
            derapplicationspecific = ASN1Sequence.getInstance(derapplicationspecific.getObject(16));
            initCertBody(DERApplicationSpecific.getInstance(derapplicationspecific.getObjectAt(0)));
            outerSignature = DERApplicationSpecific.getInstance(derapplicationspecific.getObjectAt(derapplicationspecific.size() - 1)).getContents();
            return;
        } else
        {
            initCertBody(derapplicationspecific);
            return;
        }
    }

    public static CVCertificateRequest getInstance(Object obj)
    {
        if (obj instanceof CVCertificateRequest)
        {
            return (CVCertificateRequest)obj;
        }
        if (obj != null)
        {
            try
            {
                obj = new CVCertificateRequest(DERApplicationSpecific.getInstance(obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ASN1ParsingException((new StringBuilder()).append("unable to parse data: ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
            }
            return ((CVCertificateRequest) (obj));
        } else
        {
            return null;
        }
    }

    private void initCertBody(DERApplicationSpecific derapplicationspecific)
    {
        if (derapplicationspecific.getApplicationTag() != 33) goto _L2; else goto _L1
_L1:
        derapplicationspecific = ASN1Sequence.getInstance(derapplicationspecific.getObject(16)).getObjects();
_L4:
        if (!derapplicationspecific.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        DERApplicationSpecific derapplicationspecific1 = DERApplicationSpecific.getInstance(derapplicationspecific.nextElement());
        switch (derapplicationspecific1.getApplicationTag())
        {
        default:
            throw new IOException((new StringBuilder()).append("Invalid tag, not an CV Certificate Request element:").append(derapplicationspecific1.getApplicationTag()).toString());

        case 78: // 'N'
            certificateBody = CertificateBody.getInstance(derapplicationspecific1);
            valid = valid | bodyValid;
            break;

        case 55: // '7'
            innerSignature = derapplicationspecific1.getContents();
            valid = valid | signValid;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        throw new IOException((new StringBuilder()).append("not a CARDHOLDER_CERTIFICATE in request:").append(derapplicationspecific.getApplicationTag()).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public CertificateBody getCertificateBody()
    {
        return certificateBody;
    }

    public byte[] getInnerSignature()
    {
        return innerSignature;
    }

    public byte[] getOuterSignature()
    {
        return outerSignature;
    }

    public PublicKeyDataObject getPublicKey()
    {
        return certificateBody.getPublicKey();
    }

    public boolean hasOuterSignature()
    {
        return outerSignature != null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certificateBody);
        try
        {
            asn1encodablevector.add(new DERApplicationSpecific(false, 55, new DEROctetString(innerSignature)));
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("unable to convert signature!");
        }
        return new DERApplicationSpecific(33, asn1encodablevector);
    }

}
