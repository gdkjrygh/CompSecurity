// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.ocsp:
//            RespID, OCSPUtil, OCSPException, BasicOCSPResp, 
//            CertificateID, CertificateStatus

public class BasicOCSPRespGenerator
{

    private List list;
    private RespID responderID;
    private X509Extensions responseExtensions;

    public BasicOCSPRespGenerator(PublicKey publickey)
    {
        list = new ArrayList();
        responseExtensions = null;
        responderID = new RespID(publickey);
    }

    public BasicOCSPRespGenerator(RespID respid)
    {
        list = new ArrayList();
        responseExtensions = null;
        responderID = respid;
    }

    private BasicOCSPResp generateResponse(String s, PrivateKey privatekey, X509Certificate ax509certificate[], Date date, String s1, SecureRandom securerandom)
    {
        Iterator iterator = list.iterator();
        org.bouncycastle.asn1.DERObjectIdentifier derobjectidentifier;
        ASN1EncodableVector asn1encodablevector;
        try
        {
            derobjectidentifier = OCSPUtil.getAlgorithmOID(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("unknown signing algorithm specified");
        }
        asn1encodablevector = new ASN1EncodableVector();
        while (iterator.hasNext()) 
        {
            try
            {
                asn1encodablevector.add(((ResponseObject)iterator.next()).toResponse());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new OCSPException("exception creating Request", s);
            }
        }
        date = new ResponseData(responderID.toASN1Object(), new DERGeneralizedTime(date), new DERSequence(asn1encodablevector), responseExtensions);
        int i;
        try
        {
            s = OCSPUtil.createSignatureInstance(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OCSPException((new StringBuilder()).append("exception creating signature: ").append(s).toString(), s);
        }
        if (securerandom == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        s.initSign(privatekey, securerandom);
_L1:
        try
        {
            s.update(date.getEncoded("DER"));
            s1 = new DERBitString(s.sign());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OCSPException((new StringBuilder()).append("exception processing TBSRequest: ").append(s).toString(), s);
        }
        securerandom = OCSPUtil.getSigAlgID(derobjectidentifier);
        privatekey = null;
        s = privatekey;
        if (ax509certificate == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        s = privatekey;
        if (ax509certificate.length <= 0)
        {
            break MISSING_BLOCK_LABEL_336;
        }
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
            catch (String s)
            {
                throw new OCSPException("error processing certs", s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new OCSPException("error encoding certs", s);
            }
            i++;
        } while (true);
        break MISSING_BLOCK_LABEL_327;
        s.initSign(privatekey);
          goto _L1
        s = new DERSequence(s);
        return new BasicOCSPResp(new BasicOCSPResponse(date, securerandom, s1, s));
    }

    public void addResponse(CertificateID certificateid, CertificateStatus certificatestatus)
    {
        list.add(new ResponseObject(certificateid, certificatestatus, new Date(), null, null));
    }

    public void addResponse(CertificateID certificateid, CertificateStatus certificatestatus, Date date, Date date1, X509Extensions x509extensions)
    {
        list.add(new ResponseObject(certificateid, certificatestatus, date, date1, x509extensions));
    }

    public void addResponse(CertificateID certificateid, CertificateStatus certificatestatus, Date date, X509Extensions x509extensions)
    {
        list.add(new ResponseObject(certificateid, certificatestatus, new Date(), date, x509extensions));
    }

    public void addResponse(CertificateID certificateid, CertificateStatus certificatestatus, X509Extensions x509extensions)
    {
        list.add(new ResponseObject(certificateid, certificatestatus, new Date(), null, x509extensions));
    }

    public BasicOCSPResp generate(String s, PrivateKey privatekey, X509Certificate ax509certificate[], Date date, String s1)
    {
        return generate(s, privatekey, ax509certificate, date, s1, null);
    }

    public BasicOCSPResp generate(String s, PrivateKey privatekey, X509Certificate ax509certificate[], Date date, String s1, SecureRandom securerandom)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("no signing algorithm specified");
        } else
        {
            return generateResponse(s, privatekey, ax509certificate, date, s1, securerandom);
        }
    }

    public Iterator getSignatureAlgNames()
    {
        return OCSPUtil.getAlgNames();
    }

    public void setResponseExtensions(X509Extensions x509extensions)
    {
        responseExtensions = x509extensions;
    }

    private class ResponseObject
    {

        CertificateID certId;
        CertStatus certStatus;
        X509Extensions extensions;
        DERGeneralizedTime nextUpdate;
        final BasicOCSPRespGenerator this$0;
        DERGeneralizedTime thisUpdate;

        public SingleResponse toResponse()
        {
            return new SingleResponse(certId.toASN1Object(), certStatus, thisUpdate, nextUpdate, extensions);
        }

        public ResponseObject(CertificateID certificateid, CertificateStatus certificatestatus, Date date, Date date1, X509Extensions x509extensions)
        {
            this$0 = BasicOCSPRespGenerator.this;
            super();
            certId = certificateid;
            if (certificatestatus == null)
            {
                certStatus = new CertStatus();
            } else
            if (certificatestatus instanceof UnknownStatus)
            {
                certStatus = new CertStatus(2, DERNull.INSTANCE);
            } else
            {
                basicocsprespgenerator = (RevokedStatus)certificatestatus;
                if (hasRevocationReason())
                {
                    certStatus = new CertStatus(new RevokedInfo(new ASN1GeneralizedTime(getRevocationTime()), CRLReason.lookup(getRevocationReason())));
                } else
                {
                    certStatus = new CertStatus(new RevokedInfo(new ASN1GeneralizedTime(getRevocationTime()), null));
                }
            }
            thisUpdate = new DERGeneralizedTime(date);
            if (date1 != null)
            {
                nextUpdate = new DERGeneralizedTime(date1);
            } else
            {
                nextUpdate = null;
            }
            extensions = x509extensions;
        }
    }

}
