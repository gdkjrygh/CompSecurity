// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.PrincipalUtil;
import org.bouncycastle.jce.X509Principal;

// Referenced classes of package org.bouncycastle.ocsp:
//            OCSPUtil, OCSPException

public class CertificateID
{

    public static final String HASH_SHA1 = "1.3.14.3.2.26";
    private final CertID id;

    public CertificateID(String s, X509Certificate x509certificate, BigInteger biginteger)
    {
        this(s, x509certificate, biginteger, "BC");
    }

    public CertificateID(String s, X509Certificate x509certificate, BigInteger biginteger, String s1)
    {
        id = createCertID(new AlgorithmIdentifier(new DERObjectIdentifier(s), DERNull.INSTANCE), x509certificate, new ASN1Integer(biginteger), s1);
    }

    public CertificateID(CertID certid)
    {
        if (certid == null)
        {
            throw new IllegalArgumentException("'id' cannot be null");
        } else
        {
            id = certid;
            return;
        }
    }

    private static CertID createCertID(AlgorithmIdentifier algorithmidentifier, X509Certificate x509certificate, ASN1Integer asn1integer, String s)
    {
        try
        {
            s = OCSPUtil.createDigestInstance(algorithmidentifier.getAlgorithm().getId(), s);
            s.update(PrincipalUtil.getSubjectX509Principal(x509certificate).getEncoded());
            DEROctetString deroctetstring = new DEROctetString(s.digest());
            s.update(SubjectPublicKeyInfo.getInstance((new ASN1InputStream(x509certificate.getPublicKey().getEncoded())).readObject()).getPublicKeyData().getBytes());
            algorithmidentifier = new CertID(algorithmidentifier, deroctetstring, new DEROctetString(s.digest()), asn1integer);
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            throw new OCSPException((new StringBuilder()).append("problem creating ID: ").append(algorithmidentifier).toString(), algorithmidentifier);
        }
        return algorithmidentifier;
    }

    public static CertificateID deriveCertificateID(CertificateID certificateid, BigInteger biginteger)
    {
        return new CertificateID(new CertID(certificateid.id.getHashAlgorithm(), certificateid.id.getIssuerNameHash(), certificateid.id.getIssuerKeyHash(), new ASN1Integer(biginteger)));
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof CertificateID))
        {
            return false;
        } else
        {
            obj = (CertificateID)obj;
            return id.toASN1Primitive().equals(((CertificateID) (obj)).id.toASN1Primitive());
        }
    }

    public String getHashAlgOID()
    {
        return id.getHashAlgorithm().getObjectId().getId();
    }

    public byte[] getIssuerKeyHash()
    {
        return id.getIssuerKeyHash().getOctets();
    }

    public byte[] getIssuerNameHash()
    {
        return id.getIssuerNameHash().getOctets();
    }

    public BigInteger getSerialNumber()
    {
        return id.getSerialNumber().getValue();
    }

    public int hashCode()
    {
        return id.toASN1Primitive().hashCode();
    }

    public boolean matchesIssuer(X509Certificate x509certificate, String s)
    {
        return createCertID(id.getHashAlgorithm(), x509certificate, id.getSerialNumber(), s).equals(id);
    }

    public CertID toASN1Object()
    {
        return id;
    }
}
