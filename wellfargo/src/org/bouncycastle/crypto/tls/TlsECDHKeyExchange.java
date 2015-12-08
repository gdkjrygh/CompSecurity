// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, TlsRSASigner, TlsECDSASigner, TlsClientContext, 
//            TlsUtils, TlsAgreementCredentials, TlsSignerCredentials, TlsFatalAlert, 
//            Certificate, TlsSigner, CertificateRequest, TlsCredentials

class TlsECDHKeyExchange
    implements TlsKeyExchange
{

    protected TlsAgreementCredentials agreementCredentials;
    protected TlsClientContext context;
    protected ECPrivateKeyParameters ecAgreeClientPrivateKey;
    protected ECPublicKeyParameters ecAgreeServerPublicKey;
    protected int keyExchange;
    protected AsymmetricKeyParameter serverPublicKey;
    protected TlsSigner tlsSigner;

    TlsECDHKeyExchange(TlsClientContext tlsclientcontext, int i)
    {
        ecAgreeClientPrivateKey = null;
        i;
        JVM INSTR tableswitch 16 19: default 40
    //                   16 86
    //                   17 72
    //                   18 86
    //                   19 50;
           goto _L1 _L2 _L3 _L2 _L4
_L1:
        throw new IllegalArgumentException("unsupported key exchange algorithm");
_L4:
        tlsSigner = new TlsRSASigner();
_L6:
        context = tlsclientcontext;
        keyExchange = i;
        return;
_L3:
        tlsSigner = new TlsECDSASigner();
        continue; /* Loop/switch isn't completed */
_L2:
        tlsSigner = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected boolean areOnSameCurve(ECDomainParameters ecdomainparameters, ECDomainParameters ecdomainparameters1)
    {
        return ecdomainparameters.getCurve().equals(ecdomainparameters1.getCurve()) && ecdomainparameters.getG().equals(ecdomainparameters1.getG()) && ecdomainparameters.getN().equals(ecdomainparameters1.getN()) && ecdomainparameters.getH().equals(ecdomainparameters1.getH());
    }

    protected byte[] calculateECDHBasicAgreement(ECPublicKeyParameters ecpublickeyparameters, ECPrivateKeyParameters ecprivatekeyparameters)
    {
        ECDHBasicAgreement ecdhbasicagreement = new ECDHBasicAgreement();
        ecdhbasicagreement.init(ecprivatekeyparameters);
        return BigIntegers.asUnsignedByteArray(ecdhbasicagreement.calculateAgreement(ecpublickeyparameters));
    }

    protected byte[] externalizeKey(ECPublicKeyParameters ecpublickeyparameters)
    {
        return ecpublickeyparameters.getQ().getEncoded();
    }

    public void generateClientKeyExchange(OutputStream outputstream)
    {
        if (agreementCredentials == null)
        {
            generateEphemeralClientKeyExchange(ecAgreeServerPublicKey.getParameters(), outputstream);
        }
    }

    protected AsymmetricCipherKeyPair generateECKeyPair(ECDomainParameters ecdomainparameters)
    {
        ECKeyPairGenerator eckeypairgenerator = new ECKeyPairGenerator();
        eckeypairgenerator.init(new ECKeyGenerationParameters(ecdomainparameters, context.getSecureRandom()));
        return eckeypairgenerator.generateKeyPair();
    }

    protected void generateEphemeralClientKeyExchange(ECDomainParameters ecdomainparameters, OutputStream outputstream)
    {
        ecdomainparameters = generateECKeyPair(ecdomainparameters);
        ecAgreeClientPrivateKey = (ECPrivateKeyParameters)ecdomainparameters.getPrivate();
        TlsUtils.writeOpaque8(externalizeKey((ECPublicKeyParameters)ecdomainparameters.getPublic()), outputstream);
    }

    public byte[] generatePremasterSecret()
    {
        if (agreementCredentials != null)
        {
            return agreementCredentials.generateAgreement(ecAgreeServerPublicKey);
        } else
        {
            return calculateECDHBasicAgreement(ecAgreeServerPublicKey, ecAgreeClientPrivateKey);
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
                ecAgreeServerPublicKey = validateECPublicKey((ECPublicKeyParameters)serverPublicKey);
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
            case 64: // '@'
            case 65: // 'A'
            case 66: // 'B'
                i++;
                break;
            }
        } while (true);
    }

    protected ECPublicKeyParameters validateECPublicKey(ECPublicKeyParameters ecpublickeyparameters)
    {
        return ecpublickeyparameters;
    }
}
