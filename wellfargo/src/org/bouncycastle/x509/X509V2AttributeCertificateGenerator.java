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
import java.util.Date;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;

// Referenced classes of package org.bouncycastle.x509:
//            X509Attribute, X509Util, X509V2AttributeCertificate, ExtCertificateEncodingException, 
//            AttributeCertificateHolder, AttributeCertificateIssuer, X509AttributeCertificate

public class X509V2AttributeCertificateGenerator
{

    private V2AttributeCertificateInfoGenerator acInfoGen;
    private X509ExtensionsGenerator extGenerator;
    private AlgorithmIdentifier sigAlgId;
    private DERObjectIdentifier sigOID;
    private String signatureAlgorithm;

    public X509V2AttributeCertificateGenerator()
    {
        acInfoGen = new V2AttributeCertificateInfoGenerator();
        extGenerator = new X509ExtensionsGenerator();
    }

    public void addAttribute(X509Attribute x509attribute)
    {
        acInfoGen.addAttribute(Attribute.getInstance(x509attribute.toASN1Object()));
    }

    public void addExtension(String s, boolean flag, ASN1Encodable asn1encodable)
    {
        extGenerator.addExtension(new ASN1ObjectIdentifier(s), flag, asn1encodable);
    }

    public void addExtension(String s, boolean flag, byte abyte0[])
    {
        extGenerator.addExtension(new ASN1ObjectIdentifier(s), flag, abyte0);
    }

    public X509AttributeCertificate generate(PrivateKey privatekey, String s)
    {
        return generate(privatekey, s, null);
    }

    public X509AttributeCertificate generate(PrivateKey privatekey, String s, SecureRandom securerandom)
    {
        if (!extGenerator.isEmpty())
        {
            acInfoGen.setExtensions(extGenerator.generate());
        }
        org.bouncycastle.asn1.x509.AttributeCertificateInfo attributecertificateinfo = acInfoGen.generateAttributeCertificateInfo();
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(attributecertificateinfo);
        asn1encodablevector.add(sigAlgId);
        try
        {
            asn1encodablevector.add(new DERBitString(X509Util.calculateSignature(sigOID, signatureAlgorithm, s, privatekey, securerandom, attributecertificateinfo)));
            privatekey = new X509V2AttributeCertificate(new AttributeCertificate(new DERSequence(asn1encodablevector)));
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new ExtCertificateEncodingException("constructed invalid certificate", privatekey);
        }
        return privatekey;
    }

    public X509AttributeCertificate generateCertificate(PrivateKey privatekey, String s)
    {
        return generateCertificate(privatekey, s, null);
    }

    public X509AttributeCertificate generateCertificate(PrivateKey privatekey, String s, SecureRandom securerandom)
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
            throw new SecurityException((new StringBuilder()).append("exception creating certificate: ").append(privatekey).toString());
        }
        return privatekey;
    }

    public Iterator getSignatureAlgNames()
    {
        return X509Util.getAlgNames();
    }

    public void reset()
    {
        acInfoGen = new V2AttributeCertificateInfoGenerator();
        extGenerator.reset();
    }

    public void setHolder(AttributeCertificateHolder attributecertificateholder)
    {
        acInfoGen.setHolder(attributecertificateholder.holder);
    }

    public void setIssuer(AttributeCertificateIssuer attributecertificateissuer)
    {
        acInfoGen.setIssuer(AttCertIssuer.getInstance(attributecertificateissuer.form));
    }

    public void setIssuerUniqueId(boolean aflag[])
    {
        throw new RuntimeException("not implemented (yet)");
    }

    public void setNotAfter(Date date)
    {
        acInfoGen.setEndDate(new ASN1GeneralizedTime(date));
    }

    public void setNotBefore(Date date)
    {
        acInfoGen.setStartDate(new ASN1GeneralizedTime(date));
    }

    public void setSerialNumber(BigInteger biginteger)
    {
        acInfoGen.setSerialNumber(new ASN1Integer(biginteger));
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
        acInfoGen.setSignature(sigAlgId);
    }
}
