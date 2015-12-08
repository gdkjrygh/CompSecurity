// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.ocsp.OCSPResponseStatus;
import org.bouncycastle.asn1.ocsp.ResponseBytes;

// Referenced classes of package org.bouncycastle.ocsp:
//            BasicOCSPResp, OCSPException

public class OCSPResp
{

    private OCSPResponse resp;

    public OCSPResp(InputStream inputstream)
    {
        this(new ASN1InputStream(inputstream));
    }

    private OCSPResp(ASN1InputStream asn1inputstream)
    {
        try
        {
            resp = OCSPResponse.getInstance(asn1inputstream.readObject());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ASN1InputStream asn1inputstream)
        {
            throw new IOException((new StringBuilder()).append("malformed response: ").append(asn1inputstream.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (ASN1InputStream asn1inputstream)
        {
            throw new IOException((new StringBuilder()).append("malformed response: ").append(asn1inputstream.getMessage()).toString());
        }
    }

    public OCSPResp(OCSPResponse ocspresponse)
    {
        resp = ocspresponse;
    }

    public OCSPResp(byte abyte0[])
    {
        this(new ASN1InputStream(abyte0));
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof OCSPResp))
        {
            return false;
        } else
        {
            obj = (OCSPResp)obj;
            return resp.equals(((OCSPResp) (obj)).resp);
        }
    }

    public byte[] getEncoded()
    {
        return resp.getEncoded();
    }

    public Object getResponseObject()
    {
        Object obj = resp.getResponseBytes();
        if (obj == null)
        {
            return null;
        }
        if (((ResponseBytes) (obj)).getResponseType().equals(OCSPObjectIdentifiers.id_pkix_ocsp_basic))
        {
            try
            {
                obj = new BasicOCSPResp(BasicOCSPResponse.getInstance(ASN1Primitive.fromByteArray(((ResponseBytes) (obj)).getResponse().getOctets())));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new OCSPException((new StringBuilder()).append("problem decoding object: ").append(obj).toString(), ((Exception) (obj)));
            }
            return obj;
        } else
        {
            return ((ResponseBytes) (obj)).getResponse();
        }
    }

    public int getStatus()
    {
        return resp.getResponseStatus().getValue().intValue();
    }

    public int hashCode()
    {
        return resp.hashCode();
    }
}
