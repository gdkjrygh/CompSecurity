// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.TBSCertificateStructure;
import org.bouncycastle.asn1.x509.X509Name;

// Referenced classes of package org.bouncycastle.jce:
//            X509Principal

public class PrincipalUtil
{

    public PrincipalUtil()
    {
    }

    public static X509Principal getIssuerX509Principal(X509CRL x509crl)
    {
        try
        {
            x509crl = new X509Principal(X509Name.getInstance(TBSCertList.getInstance(ASN1Primitive.fromByteArray(x509crl.getTBSCertList())).getIssuer()));
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new CRLException(x509crl.toString());
        }
        return x509crl;
    }

    public static X509Principal getIssuerX509Principal(X509Certificate x509certificate)
    {
        try
        {
            x509certificate = new X509Principal(X509Name.getInstance(TBSCertificateStructure.getInstance(ASN1Primitive.fromByteArray(x509certificate.getTBSCertificate())).getIssuer()));
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertificateEncodingException(x509certificate.toString());
        }
        return x509certificate;
    }

    public static X509Principal getSubjectX509Principal(X509Certificate x509certificate)
    {
        try
        {
            x509certificate = new X509Principal(X509Name.getInstance(TBSCertificateStructure.getInstance(ASN1Primitive.fromByteArray(x509certificate.getTBSCertificate())).getSubject()));
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertificateEncodingException(x509certificate.toString());
        }
        return x509certificate;
    }
}
