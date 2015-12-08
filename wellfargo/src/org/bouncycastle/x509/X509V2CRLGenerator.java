// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V2TBSCertListGenerator;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.X509CRLObject;

// Referenced classes of package org.bouncycastle.x509:
//            X509Util

public class X509V2CRLGenerator
{

    private X509ExtensionsGenerator extGenerator;
    private AlgorithmIdentifier sigAlgId;
    private DERObjectIdentifier sigOID;
    private String signatureAlgorithm;
    private V2TBSCertListGenerator tbsGen;

    public X509V2CRLGenerator()
    {
        tbsGen = new V2TBSCertListGenerator();
        extGenerator = new X509ExtensionsGenerator();
    }

    private TBSCertList generateCertList()
    {
        if (!extGenerator.isEmpty())
        {
            tbsGen.setExtensions(extGenerator.generate());
        }
        return tbsGen.generateTBSCertList();
    }

    private X509CRL generateJcaObject(TBSCertList tbscertlist, byte abyte0[])
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(tbscertlist);
        asn1encodablevector.add(sigAlgId);
        asn1encodablevector.add(new DERBitString(abyte0));
        return new X509CRLObject(new CertificateList(new DERSequence(asn1encodablevector)));
    }

    public void addCRL(X509CRL x509crl)
    {
        x509crl = x509crl.getRevokedCertificates();
        if (x509crl != null)
        {
            for (x509crl = x509crl.iterator(); x509crl.hasNext();)
            {
                ASN1InputStream asn1inputstream = new ASN1InputStream(((X509CRLEntry)x509crl.next()).getEncoded());
                try
                {
                    tbsGen.addCRLEntry(ASN1Sequence.getInstance(asn1inputstream.readObject()));
                }
                // Misplaced declaration of an exception variable
                catch (X509CRL x509crl)
                {
                    throw new CRLException((new StringBuilder()).append("exception processing encoding of CRL: ").append(x509crl.toString()).toString());
                }
            }

        }
    }

    public void addCRLEntry(BigInteger biginteger, Date date, int i)
    {
        tbsGen.addCRLEntry(new ASN1Integer(biginteger), new Time(date), i);
    }

    public void addCRLEntry(BigInteger biginteger, Date date, int i, Date date1)
    {
        tbsGen.addCRLEntry(new ASN1Integer(biginteger), new Time(date), i, new ASN1GeneralizedTime(date1));
    }

    public void addCRLEntry(BigInteger biginteger, Date date, X509Extensions x509extensions)
    {
        tbsGen.addCRLEntry(new ASN1Integer(biginteger), new Time(date), Extensions.getInstance(x509extensions));
    }

    public void addExtension(String s, boolean flag, ASN1Encodable asn1encodable)
    {
        addExtension(new DERObjectIdentifier(s), flag, asn1encodable);
    }

    public void addExtension(String s, boolean flag, byte abyte0[])
    {
        addExtension(new DERObjectIdentifier(s), flag, abyte0);
    }

    public void addExtension(DERObjectIdentifier derobjectidentifier, boolean flag, ASN1Encodable asn1encodable)
    {
        extGenerator.addExtension(new ASN1ObjectIdentifier(derobjectidentifier.getId()), flag, asn1encodable);
    }

    public void addExtension(DERObjectIdentifier derobjectidentifier, boolean flag, byte abyte0[])
    {
        extGenerator.addExtension(new ASN1ObjectIdentifier(derobjectidentifier.getId()), flag, abyte0);
    }

    public X509CRL generate(PrivateKey privatekey)
    {
        return generate(privatekey, (SecureRandom)null);
    }

    public X509CRL generate(PrivateKey privatekey, String s)
    {
        return generate(privatekey, s, null);
    }

    public X509CRL generate(PrivateKey privatekey, String s, SecureRandom securerandom)
    {
        TBSCertList tbscertlist = generateCertList();
        try
        {
            privatekey = X509Util.calculateSignature(sigOID, signatureAlgorithm, s, privatekey, securerandom, tbscertlist);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new ExtCRLException("cannot generate CRL encoding", privatekey);
        }
        return generateJcaObject(tbscertlist, privatekey);
    }

    public X509CRL generate(PrivateKey privatekey, SecureRandom securerandom)
    {
        TBSCertList tbscertlist = generateCertList();
        try
        {
            privatekey = X509Util.calculateSignature(sigOID, signatureAlgorithm, privatekey, securerandom, tbscertlist);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new ExtCRLException("cannot generate CRL encoding", privatekey);
        }
        return generateJcaObject(tbscertlist, privatekey);
    }

    public X509CRL generateX509CRL(PrivateKey privatekey)
    {
        try
        {
            privatekey = generateX509CRL(privatekey, "BC", null);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new SecurityException("BC provider not installed!");
        }
        return privatekey;
    }

    public X509CRL generateX509CRL(PrivateKey privatekey, String s)
    {
        return generateX509CRL(privatekey, s, null);
    }

    public X509CRL generateX509CRL(PrivateKey privatekey, String s, SecureRandom securerandom)
    {
        try
        {
            privatekey = generate(privatekey, s, securerandom);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw privatekey;
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw privatekey;
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw privatekey;
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new SecurityException((new StringBuilder()).append("exception: ").append(privatekey).toString());
        }
        return privatekey;
    }

    public X509CRL generateX509CRL(PrivateKey privatekey, SecureRandom securerandom)
    {
        try
        {
            privatekey = generateX509CRL(privatekey, "BC", securerandom);
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new SecurityException("BC provider not installed!");
        }
        return privatekey;
    }

    public Iterator getSignatureAlgNames()
    {
        return X509Util.getAlgNames();
    }

    public void reset()
    {
        tbsGen = new V2TBSCertListGenerator();
        extGenerator.reset();
    }

    public void setIssuerDN(X500Principal x500principal)
    {
        try
        {
            tbsGen.setIssuer(new X509Principal(x500principal.getEncoded()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (X500Principal x500principal)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("can't process principal: ").append(x500principal).toString());
        }
    }

    public void setIssuerDN(X509Name x509name)
    {
        tbsGen.setIssuer(x509name);
    }

    public void setNextUpdate(Date date)
    {
        tbsGen.setNextUpdate(new Time(date));
    }

    public void setSignatureAlgorithm(String s)
    {
        signatureAlgorithm = s;
        try
        {
            sigOID = X509Util.getAlgorithmOID(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Unknown signature type requested");
        }
        sigAlgId = X509Util.getSigAlgID(sigOID, s);
        tbsGen.setSignature(sigAlgId);
    }

    public void setThisUpdate(Date date)
    {
        tbsGen.setThisUpdate(new Time(date));
    }

    private class ExtCRLException extends CRLException
    {

        Throwable cause;

        public Throwable getCause()
        {
            return cause;
        }

        ExtCRLException(String s, Throwable throwable)
        {
            super(s);
            cause = throwable;
        }
    }

}
