// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.ocsp.OCSPRequest;
import org.bouncycastle.asn1.ocsp.TBSRequest;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.X509Principal;

// Referenced classes of package org.bouncycastle.ocsp:
//            OCSPException, OCSPUtil, OCSPReq, CertificateID

public class OCSPReqGenerator
{

    private List list;
    private X509Extensions requestExtensions;
    private GeneralName requestorName;

    public OCSPReqGenerator()
    {
        list = new ArrayList();
        requestorName = null;
        requestExtensions = null;
    }

    private OCSPReq generateRequest(DERObjectIdentifier derobjectidentifier, PrivateKey privatekey, X509Certificate ax509certificate[], String s, SecureRandom securerandom)
    {
        Object obj;
        Object obj1;
        obj = list.iterator();
        obj1 = new ASN1EncodableVector();
        while (((Iterator) (obj)).hasNext()) 
        {
            try
            {
                ((ASN1EncodableVector) (obj1)).add(((RequestObject)((Iterator) (obj)).next()).toRequest());
            }
            // Misplaced declaration of an exception variable
            catch (DERObjectIdentifier derobjectidentifier)
            {
                throw new OCSPException("exception creating Request", derobjectidentifier);
            }
        }
        obj1 = new TBSRequest(requestorName, new DERSequence(((ASN1EncodableVector) (obj1))), requestExtensions);
        obj = null;
        if (derobjectidentifier == null) goto _L2; else goto _L1
_L1:
        if (requestorName == null)
        {
            throw new OCSPException("requestorName must be specified if request is signed.");
        }
        int i;
        try
        {
            s = OCSPUtil.createSignatureInstance(derobjectidentifier.getId(), s);
        }
        // Misplaced declaration of an exception variable
        catch (DERObjectIdentifier derobjectidentifier)
        {
            throw derobjectidentifier;
        }
        // Misplaced declaration of an exception variable
        catch (DERObjectIdentifier derobjectidentifier)
        {
            throw new OCSPException((new StringBuilder()).append("exception creating signature: ").append(derobjectidentifier).toString(), derobjectidentifier);
        }
        if (securerandom == null) goto _L4; else goto _L3
_L3:
        s.initSign(privatekey, securerandom);
_L7:
        try
        {
            privatekey = new ByteArrayOutputStream();
            (new ASN1OutputStream(privatekey)).writeObject(((org.bouncycastle.asn1.ASN1Encodable) (obj1)));
            s.update(privatekey.toByteArray());
            privatekey = new DERBitString(s.sign());
        }
        // Misplaced declaration of an exception variable
        catch (DERObjectIdentifier derobjectidentifier)
        {
            throw new OCSPException((new StringBuilder()).append("exception processing TBSRequest: ").append(derobjectidentifier).toString(), derobjectidentifier);
        }
        derobjectidentifier = new AlgorithmIdentifier(derobjectidentifier, DERNull.INSTANCE);
        if (ax509certificate == null || ax509certificate.length <= 0) goto _L6; else goto _L5
_L4:
        s.initSign(privatekey);
          goto _L7
_L5:
        s = new ASN1EncodableVector();
        i = 0;
        do
        {
            try
            {
                if (i == ax509certificate.length)
                {
                    break;
                }
                s.add(new X509CertificateStructure((ASN1Sequence)ASN1Primitive.fromByteArray(ax509certificate[i].getEncoded())));
            }
            // Misplaced declaration of an exception variable
            catch (DERObjectIdentifier derobjectidentifier)
            {
                throw new OCSPException("error processing certs", derobjectidentifier);
            }
            // Misplaced declaration of an exception variable
            catch (DERObjectIdentifier derobjectidentifier)
            {
                throw new OCSPException("error encoding certs", derobjectidentifier);
            }
            i++;
        } while (true);
        obj = new org.bouncycastle.asn1.ocsp.Signature(derobjectidentifier, privatekey, new DERSequence(s));
_L2:
        return new OCSPReq(new OCSPRequest(((TBSRequest) (obj1)), ((org.bouncycastle.asn1.ocsp.Signature) (obj))));
_L6:
        obj = new org.bouncycastle.asn1.ocsp.Signature(derobjectidentifier, privatekey);
        if (true) goto _L2; else goto _L8
_L8:
    }

    public void addRequest(CertificateID certificateid)
    {
        list.add(new RequestObject(certificateid, null));
    }

    public void addRequest(CertificateID certificateid, X509Extensions x509extensions)
    {
        list.add(new RequestObject(certificateid, x509extensions));
    }

    public OCSPReq generate()
    {
        OCSPReq ocspreq;
        try
        {
            ocspreq = generateRequest(null, null, null, null, null);
        }
        catch (NoSuchProviderException nosuchproviderexception)
        {
            throw new OCSPException((new StringBuilder()).append("no provider! - ").append(nosuchproviderexception).toString(), nosuchproviderexception);
        }
        return ocspreq;
    }

    public OCSPReq generate(String s, PrivateKey privatekey, X509Certificate ax509certificate[], String s1)
    {
        return generate(s, privatekey, ax509certificate, s1, null);
    }

    public OCSPReq generate(String s, PrivateKey privatekey, X509Certificate ax509certificate[], String s1, SecureRandom securerandom)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("no signing algorithm specified");
        }
        try
        {
            privatekey = generateRequest(OCSPUtil.getAlgorithmOID(s), privatekey, ax509certificate, s1, securerandom);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown signing algorithm specified: ").append(s).toString());
        }
        return privatekey;
    }

    public Iterator getSignatureAlgNames()
    {
        return OCSPUtil.getAlgNames();
    }

    public void setRequestExtensions(X509Extensions x509extensions)
    {
        requestExtensions = x509extensions;
    }

    public void setRequestorName(X500Principal x500principal)
    {
        try
        {
            requestorName = new GeneralName(4, new X509Principal(x500principal.getEncoded()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (X500Principal x500principal)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("cannot encode principal: ").append(x500principal).toString());
        }
    }

    public void setRequestorName(GeneralName generalname)
    {
        requestorName = generalname;
    }

    private class RequestObject
    {

        CertificateID certId;
        X509Extensions extensions;
        final OCSPReqGenerator this$0;

        public Request toRequest()
        {
            return new Request(certId.toASN1Object(), Extensions.getInstance(extensions));
        }

        public RequestObject(CertificateID certificateid, X509Extensions x509extensions)
        {
            this$0 = OCSPReqGenerator.this;
            super();
            certId = certificateid;
            extensions = x509extensions;
        }
    }

}
