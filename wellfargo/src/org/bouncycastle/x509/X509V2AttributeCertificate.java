// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AttCertValidityPeriod;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.AttributeCertificateInfo;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.Holder;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.x509:
//            X509AttributeCertificate, X509Attribute, AttributeCertificateHolder, AttributeCertificateIssuer

public class X509V2AttributeCertificate
    implements X509AttributeCertificate
{

    private AttributeCertificate cert;
    private Date notAfter;
    private Date notBefore;

    public X509V2AttributeCertificate(InputStream inputstream)
    {
        this(getObject(inputstream));
    }

    X509V2AttributeCertificate(AttributeCertificate attributecertificate)
    {
        cert = attributecertificate;
        try
        {
            notAfter = attributecertificate.getAcinfo().getAttrCertValidityPeriod().getNotAfterTime().getDate();
            notBefore = attributecertificate.getAcinfo().getAttrCertValidityPeriod().getNotBeforeTime().getDate();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AttributeCertificate attributecertificate)
        {
            throw new IOException("invalid data structure in certificate!");
        }
    }

    public X509V2AttributeCertificate(byte abyte0[])
    {
        this(((InputStream) (new ByteArrayInputStream(abyte0))));
    }

    private Set getExtensionOIDs(boolean flag)
    {
        Extensions extensions = cert.getAcinfo().getExtensions();
        if (extensions != null)
        {
            HashSet hashset = new HashSet();
            Enumeration enumeration = extensions.oids();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)enumeration.nextElement();
                if (extensions.getExtension(asn1objectidentifier).isCritical() == flag)
                {
                    hashset.add(asn1objectidentifier.getId());
                }
            } while (true);
            return hashset;
        } else
        {
            return null;
        }
    }

    private static AttributeCertificate getObject(InputStream inputstream)
    {
        try
        {
            inputstream = AttributeCertificate.getInstance((new ASN1InputStream(inputstream)).readObject());
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new IOException((new StringBuilder()).append("exception decoding certificate structure: ").append(inputstream.toString()).toString());
        }
        return inputstream;
    }

    public void checkValidity()
    {
        checkValidity(new Date());
    }

    public void checkValidity(Date date)
    {
        if (date.after(getNotAfter()))
        {
            throw new CertificateExpiredException((new StringBuilder()).append("certificate expired on ").append(getNotAfter()).toString());
        }
        if (date.before(getNotBefore()))
        {
            throw new CertificateNotYetValidException((new StringBuilder()).append("certificate not valid till ").append(getNotBefore()).toString());
        } else
        {
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;
        if (obj == this)
        {
            flag = true;
        } else
        if (obj instanceof X509AttributeCertificate)
        {
            obj = (X509AttributeCertificate)obj;
            boolean flag1;
            try
            {
                flag1 = Arrays.areEqual(getEncoded(), ((X509AttributeCertificate) (obj)).getEncoded());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag1;
        }
        return flag;
    }

    public X509Attribute[] getAttributes()
    {
        ASN1Sequence asn1sequence = cert.getAcinfo().getAttributes();
        X509Attribute ax509attribute[] = new X509Attribute[asn1sequence.size()];
        for (int i = 0; i != asn1sequence.size(); i++)
        {
            ax509attribute[i] = new X509Attribute(asn1sequence.getObjectAt(i));
        }

        return ax509attribute;
    }

    public X509Attribute[] getAttributes(String s)
    {
        ASN1Sequence asn1sequence = cert.getAcinfo().getAttributes();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i != asn1sequence.size(); i++)
        {
            X509Attribute x509attribute = new X509Attribute(asn1sequence.getObjectAt(i));
            if (x509attribute.getOID().equals(s))
            {
                arraylist.add(x509attribute);
            }
        }

        if (arraylist.size() == 0)
        {
            return null;
        } else
        {
            return (X509Attribute[])(X509Attribute[])arraylist.toArray(new X509Attribute[arraylist.size()]);
        }
    }

    public Set getCriticalExtensionOIDs()
    {
        return getExtensionOIDs(true);
    }

    public byte[] getEncoded()
    {
        return cert.getEncoded();
    }

    public byte[] getExtensionValue(String s)
    {
        Extensions extensions = cert.getAcinfo().getExtensions();
        if (extensions != null)
        {
            s = extensions.getExtension(new ASN1ObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.getExtnValue().getEncoded("DER");
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

    public AttributeCertificateHolder getHolder()
    {
        return new AttributeCertificateHolder((ASN1Sequence)cert.getAcinfo().getHolder().toASN1Object());
    }

    public AttributeCertificateIssuer getIssuer()
    {
        return new AttributeCertificateIssuer(cert.getAcinfo().getIssuer());
    }

    public boolean[] getIssuerUniqueID()
    {
        DERBitString derbitstring = cert.getAcinfo().getIssuerUniqueID();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.getBytes();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.getPadBits()];
            int i = 0;
            while (i != aflag.length) 
            {
                boolean flag;
                if ((abyte0[i / 8] & 128 >>> i % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[i] = flag;
                i++;
            }
            return aflag;
        } else
        {
            return null;
        }
    }

    public Set getNonCriticalExtensionOIDs()
    {
        return getExtensionOIDs(false);
    }

    public Date getNotAfter()
    {
        return notAfter;
    }

    public Date getNotBefore()
    {
        return notBefore;
    }

    public BigInteger getSerialNumber()
    {
        return cert.getAcinfo().getSerialNumber().getValue();
    }

    public byte[] getSignature()
    {
        return cert.getSignatureValue().getBytes();
    }

    public int getVersion()
    {
        return cert.getAcinfo().getVersion().getValue().intValue() + 1;
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = Arrays.hashCode(getEncoded());
        }
        catch (IOException ioexception)
        {
            return 0;
        }
        return i;
    }

    public final void verify(PublicKey publickey, String s)
    {
        if (!cert.getSignatureAlgorithm().equals(cert.getAcinfo().getSignature()))
        {
            throw new CertificateException("Signature algorithm in certificate info not same as outer certificate");
        }
        s = Signature.getInstance(cert.getSignatureAlgorithm().getObjectId().getId(), s);
        s.initVerify(publickey);
        try
        {
            s.update(cert.getAcinfo().getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new SignatureException("Exception encoding certificate info object");
        }
        if (!s.verify(getSignature()))
        {
            throw new InvalidKeyException("Public key presented not for certificate signature");
        } else
        {
            return;
        }
    }
}
