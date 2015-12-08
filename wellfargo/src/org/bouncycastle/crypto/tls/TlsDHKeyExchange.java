// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, TlsRSASigner, TlsDSSSigner, TlsDHUtils, 
//            TlsClientContext, TlsAgreementCredentials, TlsSignerCredentials, TlsFatalAlert, 
//            Certificate, TlsUtils, TlsSigner, CertificateRequest, 
//            TlsCredentials

class TlsDHKeyExchange
    implements TlsKeyExchange
{

    protected static final BigInteger ONE = BigInteger.valueOf(1L);
    protected static final BigInteger TWO = BigInteger.valueOf(2L);
    protected TlsAgreementCredentials agreementCredentials;
    protected TlsClientContext context;
    protected DHPrivateKeyParameters dhAgreeClientPrivateKey;
    protected DHPublicKeyParameters dhAgreeServerPublicKey;
    protected int keyExchange;
    protected AsymmetricKeyParameter serverPublicKey;
    protected TlsSigner tlsSigner;

    TlsDHKeyExchange(TlsClientContext tlsclientcontext, int i)
    {
        serverPublicKey = null;
        dhAgreeServerPublicKey = null;
        dhAgreeClientPrivateKey = null;
        i;
        JVM INSTR tableswitch 3 9: default 64
    //                   3 104
    //                   4 64
    //                   5 90
    //                   6 64
    //                   7 74
    //                   8 64
    //                   9 74;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L1 _L4
_L1:
        throw new IllegalArgumentException("unsupported key exchange algorithm");
_L4:
        tlsSigner = null;
_L6:
        context = tlsclientcontext;
        keyExchange = i;
        return;
_L3:
        tlsSigner = new TlsRSASigner();
        continue; /* Loop/switch isn't completed */
_L2:
        tlsSigner = new TlsDSSSigner();
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected boolean areCompatibleParameters(DHParameters dhparameters, DHParameters dhparameters1)
    {
        return dhparameters.getP().equals(dhparameters1.getP()) && dhparameters.getG().equals(dhparameters1.getG());
    }

    protected byte[] calculateDHBasicAgreement(DHPublicKeyParameters dhpublickeyparameters, DHPrivateKeyParameters dhprivatekeyparameters)
    {
        return TlsDHUtils.calculateDHBasicAgreement(dhpublickeyparameters, dhprivatekeyparameters);
    }

    public void generateClientKeyExchange(OutputStream outputstream)
    {
        if (agreementCredentials == null)
        {
            generateEphemeralClientKeyExchange(dhAgreeServerPublicKey.getParameters(), outputstream);
        }
    }

    protected AsymmetricCipherKeyPair generateDHKeyPair(DHParameters dhparameters)
    {
        return TlsDHUtils.generateDHKeyPair(context.getSecureRandom(), dhparameters);
    }

    protected void generateEphemeralClientKeyExchange(DHParameters dhparameters, OutputStream outputstream)
    {
        dhAgreeClientPrivateKey = TlsDHUtils.generateEphemeralClientKeyExchange(context.getSecureRandom(), dhparameters, outputstream);
    }

    public byte[] generatePremasterSecret()
    {
        if (agreementCredentials != null)
        {
            return agreementCredentials.generateAgreement(dhAgreeServerPublicKey);
        } else
        {
            return calculateDHBasicAgreement(dhAgreeServerPublicKey, dhAgreeClientPrivateKey);
        }
    }

    public void processClientCredentials(TlsCredentials tlscredentials)
    {
        if (tlscredentials instanceof TlsAgreementCredentials)
        {
            agreementCredentials = (TlsAgreementCredentials)tlscredentials;
        } else
        if (!(tlscredentials instanceof TlsSignerCredentials))
        {
            throw new TlsFatalAlert((short)80);
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
        if (tlsSigner == null)
        {
            try
            {
                dhAgreeServerPublicKey = validateDHPublicKey((DHPublicKeyParameters)serverPublicKey);
            }
            // Misplaced declaration of an exception variable
            catch (org.bouncycastle.crypto.tls.Certificate certificate)
            {
                throw new TlsFatalAlert((short)46);
            }
            TlsUtils.validateKeyUsage(certificate, 8);
            return;
        }
        if (!tlsSigner.isValidPublicKey(serverPublicKey))
        {
            throw new TlsFatalAlert((short)46);
        } else
        {
            TlsUtils.validateKeyUsage(certificate, 128);
            return;
        }
    }

    public void processServerKeyExchange(InputStream inputstream)
    {
        throw new TlsFatalAlert((short)10);
    }

    public void skipClientCredentials()
    {
        agreementCredentials = null;
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
            case 3: // '\003'
            case 4: // '\004'
            case 64: // '@'
                i++;
                break;
            }
        } while (true);
    }

    protected DHPublicKeyParameters validateDHPublicKey(DHPublicKeyParameters dhpublickeyparameters)
    {
        return TlsDHUtils.validateDHPublicKey(dhpublickeyparameters);
    }

}
