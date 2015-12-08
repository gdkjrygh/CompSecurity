// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.security.cert.X509Extension;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.ocsp:
//            CertificateID

public class Req
    implements X509Extension
{

    private Request req;

    public Req(Request request)
    {
        req = request;
    }

    private Set getExtensionOIDs(boolean flag)
    {
        HashSet hashset = new HashSet();
        X509Extensions x509extensions = getSingleRequestExtensions();
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

    public CertificateID getCertID()
    {
        return new CertificateID(req.getReqCert());
    }

    public Set getCriticalExtensionOIDs()
    {
        return getExtensionOIDs(true);
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = getSingleRequestExtensions();
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

    public X509Extensions getSingleRequestExtensions()
    {
        return X509Extensions.getInstance(req.getSingleRequestExtensions());
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }
}
