// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, TlsPSKIdentity, TlsUtils, TlsRSAUtils, 
//            TlsClientContext, TlsDHUtils, TlsFatalAlert, Certificate, 
//            TlsCredentials, CertificateRequest

class TlsPSKKeyExchange
    implements TlsKeyExchange
{

    protected TlsClientContext context;
    protected DHPrivateKeyParameters dhAgreeClientPrivateKey;
    protected DHPublicKeyParameters dhAgreeServerPublicKey;
    protected int keyExchange;
    protected byte premasterSecret[];
    protected TlsPSKIdentity pskIdentity;
    protected byte psk_identity_hint[];
    protected RSAKeyParameters rsaServerPublicKey;
    protected AsymmetricKeyParameter serverPublicKey;

    TlsPSKKeyExchange(TlsClientContext tlsclientcontext, int i, TlsPSKIdentity tlspskidentity)
    {
        psk_identity_hint = null;
        dhAgreeServerPublicKey = null;
        dhAgreeClientPrivateKey = null;
        serverPublicKey = null;
        rsaServerPublicKey = null;
        switch (i)
        {
        default:
            throw new IllegalArgumentException("unsupported key exchange algorithm");

        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
            context = tlsclientcontext;
            break;
        }
        keyExchange = i;
        pskIdentity = tlspskidentity;
    }

    public void generateClientKeyExchange(OutputStream outputstream)
    {
        if (psk_identity_hint == null || psk_identity_hint.length == 0)
        {
            pskIdentity.skipIdentityHint();
        } else
        {
            pskIdentity.notifyIdentityHint(psk_identity_hint);
        }
        TlsUtils.writeOpaque16(pskIdentity.getPSKIdentity(), outputstream);
        if (keyExchange == 15)
        {
            premasterSecret = TlsRSAUtils.generateEncryptedPreMasterSecret(context, rsaServerPublicKey, outputstream);
        } else
        if (keyExchange == 14)
        {
            dhAgreeClientPrivateKey = TlsDHUtils.generateEphemeralClientKeyExchange(context.getSecureRandom(), dhAgreeServerPublicKey.getParameters(), outputstream);
            return;
        }
    }

    protected byte[] generateOtherSecret(int i)
    {
        if (keyExchange == 14)
        {
            return TlsDHUtils.calculateDHBasicAgreement(dhAgreeServerPublicKey, dhAgreeClientPrivateKey);
        }
        if (keyExchange == 15)
        {
            return premasterSecret;
        } else
        {
            return new byte[i];
        }
    }

    public byte[] generatePremasterSecret()
    {
        byte abyte0[] = pskIdentity.getPSK();
        byte abyte1[] = generateOtherSecret(abyte0.length);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(abyte1.length + 4 + abyte0.length);
        TlsUtils.writeOpaque16(abyte1, bytearrayoutputstream);
        TlsUtils.writeOpaque16(abyte0, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public void processClientCredentials(TlsCredentials tlscredentials)
    {
        throw new TlsFatalAlert((short)80);
    }

    public void processServerCertificate(org.bouncycastle.crypto.tls.Certificate certificate)
    {
        if (keyExchange != 15)
        {
            throw new TlsFatalAlert((short)10);
        }
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
        psk_identity_hint = TlsUtils.readOpaque16(inputstream);
        if (keyExchange == 14)
        {
            byte abyte1[] = TlsUtils.readOpaque16(inputstream);
            byte abyte0[] = TlsUtils.readOpaque16(inputstream);
            inputstream = TlsUtils.readOpaque16(inputstream);
            BigInteger biginteger1 = new BigInteger(1, abyte1);
            BigInteger biginteger = new BigInteger(1, abyte0);
            dhAgreeServerPublicKey = TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(new BigInteger(1, inputstream), new DHParameters(biginteger1, biginteger)));
        } else
        if (psk_identity_hint.length == 0)
        {
            return;
        }
    }

    public void skipClientCredentials()
    {
    }

    public void skipServerCertificate()
    {
        if (keyExchange == 15)
        {
            throw new TlsFatalAlert((short)10);
        } else
        {
            return;
        }
    }

    public void skipServerKeyExchange()
    {
        if (keyExchange == 14)
        {
            throw new TlsFatalAlert((short)10);
        } else
        {
            psk_identity_hint = new byte[0];
            return;
        }
    }

    public void validateCertificateRequest(CertificateRequest certificaterequest)
    {
        throw new TlsFatalAlert((short)10);
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
