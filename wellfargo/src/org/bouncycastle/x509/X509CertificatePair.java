// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jce.provider.X509CertificateObject;

// Referenced classes of package org.bouncycastle.x509:
//            ExtCertificateEncodingException

public class X509CertificatePair
{

    private X509Certificate forward;
    private X509Certificate reverse;

    public X509CertificatePair(X509Certificate x509certificate, X509Certificate x509certificate1)
    {
        forward = x509certificate;
        reverse = x509certificate1;
    }

    public X509CertificatePair(CertificatePair certificatepair)
    {
        if (certificatepair.getForward() != null)
        {
            forward = new X509CertificateObject(certificatepair.getForward());
        }
        if (certificatepair.getReverse() != null)
        {
            reverse = new X509CertificateObject(certificatepair.getReverse());
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag2;
        for (flag2 = true; obj == null || !(obj instanceof X509CertificatePair);)
        {
            return false;
        }

        obj = (X509CertificatePair)obj;
        boolean flag;
        boolean flag1;
        if (forward != null)
        {
            flag = forward.equals(((X509CertificatePair) (obj)).forward);
        } else
        if (((X509CertificatePair) (obj)).forward != null)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (reverse != null)
        {
            flag1 = reverse.equals(((X509CertificatePair) (obj)).reverse);
        } else
        if (((X509CertificatePair) (obj)).reverse != null)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (flag && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public byte[] getEncoded()
    {
        Certificate certificate = null;
        Certificate certificate1;
        if (forward == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        certificate1 = Certificate.getInstance((new ASN1InputStream(forward.getEncoded())).readObject());
        Object obj;
        obj = certificate1;
        if (certificate1 == null)
        {
            try
            {
                throw new CertificateEncodingException("unable to get encoding for forward");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ExtCertificateEncodingException(((IllegalArgumentException) (obj)).toString(), ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ExtCertificateEncodingException(((IOException) (obj)).toString(), ((Throwable) (obj)));
            }
        }
        break MISSING_BLOCK_LABEL_62;
        obj = null;
        if (reverse == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        certificate1 = Certificate.getInstance((new ASN1InputStream(reverse.getEncoded())).readObject());
        certificate = certificate1;
        if (certificate1 != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        throw new CertificateEncodingException("unable to get encoding for reverse");
        byte abyte0[] = (new CertificatePair(((Certificate) (obj)), certificate)).getEncoded("DER");
        return abyte0;
    }

    public X509Certificate getForward()
    {
        return forward;
    }

    public X509Certificate getReverse()
    {
        return reverse;
    }

    public int hashCode()
    {
        int i = -1;
        if (forward != null)
        {
            i = -1 ^ forward.hashCode();
        }
        int j = i;
        if (reverse != null)
        {
            j = i * 17 ^ reverse.hashCode();
        }
        return j;
    }
}
