// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.ocsp.OCSPRequest;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.ocsp.Signature;
import org.bouncycastle.asn1.ocsp.TBSRequest;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.ocsp:
//            OCSPUtil, OCSPException, Req

public class OCSPReq
    implements X509Extension
{

    private OCSPRequest req;

    public OCSPReq(InputStream inputstream)
    {
        this(new ASN1InputStream(inputstream));
    }

    private OCSPReq(ASN1InputStream asn1inputstream)
    {
        try
        {
            req = OCSPRequest.getInstance(asn1inputstream.readObject());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ASN1InputStream asn1inputstream)
        {
            throw new IOException((new StringBuilder()).append("malformed request: ").append(asn1inputstream.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (ASN1InputStream asn1inputstream)
        {
            throw new IOException((new StringBuilder()).append("malformed request: ").append(asn1inputstream.getMessage()).toString());
        }
    }

    public OCSPReq(OCSPRequest ocsprequest)
    {
        req = ocsprequest;
    }

    public OCSPReq(byte abyte0[])
    {
        this(new ASN1InputStream(abyte0));
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
        obj = req.getOptionalSignature().getCerts();
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
        X509Extensions x509extensions = getRequestExtensions();
        if (x509extensions != null)
        {
            Enumeration enumeration = x509extensions.oids();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
                if (flag == x509extensions.getExtension(asn1objectidentifier).isCritical())
                {
                    hashset.add(asn1objectidentifier.getId());
                }
            } while (true);
        }
        return hashset;
    }

    public CertStore getCertificates(String s, String s1)
    {
        if (!isSigned())
        {
            return null;
        }
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
        if (!isSigned())
        {
            return null;
        } else
        {
            s = getCertList(s);
            return (X509Certificate[])(X509Certificate[])s.toArray(new X509Certificate[s.size()]);
        }
    }

    public Set getCriticalExtensionOIDs()
    {
        return getExtensionOIDs(true);
    }

    public byte[] getEncoded()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        (new ASN1OutputStream(bytearrayoutputstream)).writeObject(req);
        return bytearrayoutputstream.toByteArray();
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = getRequestExtensions();
        if (x509extensions != null)
        {
            s = x509extensions.getExtension(new ASN1ObjectIdentifier(s));
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

    public X509Extensions getRequestExtensions()
    {
        return X509Extensions.getInstance(req.getTbsRequest().getRequestExtensions());
    }

    public Req[] getRequestList()
    {
        ASN1Sequence asn1sequence = req.getTbsRequest().getRequestList();
        Req areq[] = new Req[asn1sequence.size()];
        for (int i = 0; i != areq.length; i++)
        {
            areq[i] = new Req(Request.getInstance(asn1sequence.getObjectAt(i)));
        }

        return areq;
    }

    public GeneralName getRequestorName()
    {
        return GeneralName.getInstance(req.getTbsRequest().getRequestorName());
    }

    public byte[] getSignature()
    {
        if (!isSigned())
        {
            return null;
        } else
        {
            return req.getOptionalSignature().getSignature().getBytes();
        }
    }

    public String getSignatureAlgOID()
    {
        if (!isSigned())
        {
            return null;
        } else
        {
            return req.getOptionalSignature().getSignatureAlgorithm().getObjectId().getId();
        }
    }

    public byte[] getTBSRequest()
    {
        byte abyte0[];
        try
        {
            abyte0 = req.getTbsRequest().getEncoded();
        }
        catch (IOException ioexception)
        {
            throw new OCSPException("problem encoding tbsRequest", ioexception);
        }
        return abyte0;
    }

    public int getVersion()
    {
        return req.getTbsRequest().getVersion().getValue().intValue() + 1;
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public boolean isSigned()
    {
        return req.getOptionalSignature() != null;
    }

    public boolean verify(PublicKey publickey, String s)
    {
        if (!isSigned())
        {
            throw new OCSPException("attempt to verify signature on unsigned object");
        }
        boolean flag;
        try
        {
            s = OCSPUtil.createSignatureInstance(getSignatureAlgOID(), s);
            s.initVerify(publickey);
            publickey = new ByteArrayOutputStream();
            (new ASN1OutputStream(publickey)).writeObject(req.getTbsRequest());
            s.update(publickey.toByteArray());
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
