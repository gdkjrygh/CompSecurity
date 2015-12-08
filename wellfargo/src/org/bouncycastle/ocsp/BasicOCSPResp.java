// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.ocsp:
//            OCSPUtil, OCSPException, RespID, RespData, 
//            SingleResp

public class BasicOCSPResp
    implements X509Extension
{

    X509Certificate chain[];
    ResponseData data;
    BasicOCSPResponse resp;

    public BasicOCSPResp(BasicOCSPResponse basicocspresponse)
    {
        chain = null;
        resp = basicocspresponse;
        data = basicocspresponse.getTbsResponseData();
    }

    private List getCertList(String s)
    {
        ArrayList arraylist = new ArrayList();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        Object obj;
        try
        {
            s = OCSPUtil.createX509CertificateFactory(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OCSPException("can't get certificate factory.", s);
        }
        obj = resp.getCerts();
        if (obj != null)
        {
            obj = ((ASN1Sequence) (obj)).getObjects();
            while (((Enumeration) (obj)).hasMoreElements()) 
            {
                try
                {
                    asn1outputstream.writeObject((ASN1Encodable)((Enumeration) (obj)).nextElement());
                    arraylist.add(s.generateCertificate(new ByteArrayInputStream(bytearrayoutputstream.toByteArray())));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new OCSPException("can't re-encode certificate!", s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new OCSPException("can't re-encode certificate!", s);
                }
                bytearrayoutputstream.reset();
            }
        }
        return arraylist;
    }

    private Set getExtensionOIDs(boolean flag)
    {
        HashSet hashset = new HashSet();
        X509Extensions x509extensions = getResponseExtensions();
        if (x509extensions != null)
        {
            Enumeration enumeration = x509extensions.oids();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                if (flag == x509extensions.getExtension(derobjectidentifier).isCritical())
                {
                    hashset.add(derobjectidentifier.getId());
                }
            } while (true);
        }
        return hashset;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof BasicOCSPResp))
        {
            return false;
        } else
        {
            obj = (BasicOCSPResp)obj;
            return resp.equals(((BasicOCSPResp) (obj)).resp);
        }
    }

    public CertStore getCertificates(String s, String s1)
    {
        try
        {
            s = OCSPUtil.createCertStoreInstance(s, new CollectionCertStoreParameters(getCertList(s1)), s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OCSPException("can't setup the CertStore", s);
        }
        return s;
    }

    public X509Certificate[] getCerts(String s)
    {
        s = getCertList(s);
        return (X509Certificate[])(X509Certificate[])s.toArray(new X509Certificate[s.size()]);
    }

    public Set getCriticalExtensionOIDs()
    {
        return getExtensionOIDs(true);
    }

    public byte[] getEncoded()
    {
        return resp.getEncoded();
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = getResponseExtensions();
        if (x509extensions != null)
        {
            s = x509extensions.getExtension(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.getValue().getEncoded("DER");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new RuntimeException((new StringBuilder()).append("error encoding ").append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs()
    {
        return getExtensionOIDs(false);
    }

    public Date getProducedAt()
    {
        Date date;
        try
        {
            date = data.getProducedAt().getDate();
        }
        catch (ParseException parseexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("ParseException:").append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public RespID getResponderId()
    {
        return new RespID(data.getResponderID());
    }

    public RespData getResponseData()
    {
        return new RespData(resp.getTbsResponseData());
    }

    public X509Extensions getResponseExtensions()
    {
        return X509Extensions.getInstance(data.getResponseExtensions());
    }

    public SingleResp[] getResponses()
    {
        ASN1Sequence asn1sequence = data.getResponses();
        SingleResp asingleresp[] = new SingleResp[asn1sequence.size()];
        for (int i = 0; i != asingleresp.length; i++)
        {
            asingleresp[i] = new SingleResp(SingleResponse.getInstance(asn1sequence.getObjectAt(i)));
        }

        return asingleresp;
    }

    public byte[] getSignature()
    {
        return resp.getSignature().getBytes();
    }

    public String getSignatureAlgName()
    {
        return OCSPUtil.getAlgorithmName(resp.getSignatureAlgorithm().getObjectId());
    }

    public String getSignatureAlgOID()
    {
        return resp.getSignatureAlgorithm().getObjectId().getId();
    }

    public byte[] getTBSResponseData()
    {
        byte abyte0[];
        try
        {
            abyte0 = resp.getTbsResponseData().getEncoded();
        }
        catch (IOException ioexception)
        {
            throw new OCSPException("problem encoding tbsResponseData", ioexception);
        }
        return abyte0;
    }

    public int getVersion()
    {
        return data.getVersion().getValue().intValue() + 1;
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public int hashCode()
    {
        return resp.hashCode();
    }

    public boolean verify(PublicKey publickey, String s)
    {
        boolean flag;
        try
        {
            s = OCSPUtil.createSignatureInstance(getSignatureAlgName(), s);
            s.initVerify(publickey);
            s.update(resp.getTbsResponseData().getEncoded("DER"));
            flag = s.verify(getSignature());
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw publickey;
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new OCSPException((new StringBuilder()).append("exception processing sig: ").append(publickey).toString(), publickey);
        }
        return flag;
    }
}
