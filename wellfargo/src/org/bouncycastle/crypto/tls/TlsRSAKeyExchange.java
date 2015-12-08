// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, TlsRSAUtils, TlsSignerCredentials, TlsFatalAlert, 
//            Certificate, TlsUtils, CertificateRequest, TlsClientContext, 
//            TlsCredentials

class TlsRSAKeyExchange
    implements TlsKeyExchange
{

    protected TlsClientContext context;
    protected byte premasterSecret[];
    protected RSAKeyParameters rsaServerPublicKey;
    protected AsymmetricKeyParameter serverPublicKey;

    TlsRSAKeyExchange(TlsClientContext tlsclientcontext)
    {
        serverPublicKey = null;
        rsaServerPublicKey = null;
        context = tlsclientcontext;
    }

    public void generateClientKeyExchange(OutputStream outputstream)
    {
        premasterSecret = TlsRSAUtils.generateEncryptedPreMasterSecret(context, rsaServerPublicKey, outputstream);
    }

    public byte[] generatePremasterSecret()
    {
        byte abyte0[] = premasterSecret;
        premasterSecret = null;
        return abyte0;
    }

    public void processClientCredentials(TlsCredentials tlscredentials)
    {
        if (!(tlscredentials instanceof TlsSignerCredentials))
        {
            throw new TlsFatalAlert((short)80);
        } else
        {
            return;
        }
    }

    public void processServerCertificate(org.bouncycastle.crypto.tls.Certificate certificate)
    {
        certificate = certificate.certs[0];
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectpublickeyinfo = certificate.getSubjectPublicKeyInfo();
        try
        {
            serverPublicKey = PublicKeyFactory.createKey(subjectpublickeyinfo);
        }
        // Misplaced declaration of an exception variable
        catch (org.bouncycastle.crypto.tls.Certificate certificate)
        {
            throw new TlsFatalAlert((short)43);
        }
        if (serverPublicKey.isPrivate())
        {
            throw new TlsFatalAlert((short)80);
        } else
        {
            rsaServerPublicKey = validateRSAPublicKey((RSAKeyParameters)serverPublicKey);
            TlsUtils.validateKeyUsage(certificate, 32);
            return;
        }
    }

    public void processServerKeyExchange(InputStream inputstream)
    {
        throw new TlsFatalAlert((short)10);
    }

    public void skipClientCredentials()
    {
    }

    public void skipServerCertificate()
    {
        throw new TlsFatalAlert((short)10);
    }

    public void skipServerKeyExchange()
    {
    }

    public void validateCertificateRequest(CertificateRequest certificaterequest)
    {
        certificaterequest = certificaterequest.getCertificateTypes();
        int i = 0;
        do
        {
            if (i >= certificaterequest.length)
            {
                break;
            }
            switch (certificaterequest[i])
            {
            default:
                throw new TlsFatalAlert((short)47);

            case 1: // '\001'
            case 2: // '\002'
            case 64: // '@'
                i++;
                break;
            }
        } while (true);
    }

    protected RSAKeyParameters validateRSAPublicKey(RSAKeyParameters rsakeyparameters)
    {
        if (!rsakeyparameters.getExponent().isProbablePrime(2))
        {
            throw new TlsFatalAlert((short)47);
        } else
        {
            return rsakeyparameters;
        }
    }
}
