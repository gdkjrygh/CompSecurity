// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.bouncycastle.crypto.agreement.srp.SRP6Util;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.io.SignerInputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsKeyExchange, TlsRSASigner, TlsDSSSigner, TlsUtils, 
//            TlsFatalAlert, TlsSigner, SecurityParameters, Certificate, 
//            TlsClientContext, TlsCredentials, CertificateRequest

class TlsSRPKeyExchange
    implements TlsKeyExchange
{

    protected BigInteger B;
    protected TlsClientContext context;
    protected byte identity[];
    protected int keyExchange;
    protected byte password[];
    protected byte s[];
    protected AsymmetricKeyParameter serverPublicKey;
    protected SRP6Client srpClient;
    protected TlsSigner tlsSigner;

    TlsSRPKeyExchange(TlsClientContext tlsclientcontext, int i, byte abyte0[], byte abyte1[])
    {
        serverPublicKey = null;
        s = null;
        B = null;
        srpClient = new SRP6Client();
        i;
        JVM INSTR tableswitch 21 23: default 56
    //                   21 66
    //                   22 107
    //                   23 93;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("unsupported key exchange algorithm");
_L2:
        tlsSigner = null;
_L6:
        context = tlsclientcontext;
        keyExchange = i;
        identity = abyte0;
        password = abyte1;
        return;
_L4:
        tlsSigner = new TlsRSASigner();
        continue; /* Loop/switch isn't completed */
_L3:
        tlsSigner = new TlsDSSSigner();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void generateClientKeyExchange(OutputStream outputstream)
    {
        TlsUtils.writeOpaque16(BigIntegers.asUnsignedByteArray(srpClient.generateClientCredentials(s, identity, password)), outputstream);
    }

    public byte[] generatePremasterSecret()
    {
        byte abyte0[];
        try
        {
            abyte0 = BigIntegers.asUnsignedByteArray(srpClient.calculateSecret(B));
        }
        catch (CryptoException cryptoexception)
        {
            throw new TlsFatalAlert((short)47);
        }
        return abyte0;
    }

    protected Signer initSigner(TlsSigner tlssigner, SecurityParameters securityparameters)
    {
        tlssigner = tlssigner.createVerifyer(serverPublicKey);
        tlssigner.update(securityparameters.clientRandom, 0, securityparameters.clientRandom.length);
        tlssigner.update(securityparameters.serverRandom, 0, securityparameters.serverRandom.length);
        return tlssigner;
    }

    public void processClientCredentials(TlsCredentials tlscredentials)
    {
        throw new TlsFatalAlert((short)80);
    }

    public void processServerCertificate(org.bouncycastle.crypto.tls.Certificate certificate)
    {
        if (tlsSigner == null)
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
        Object obj1 = context.getSecurityParameters();
        Object obj = null;
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        if (tlsSigner != null)
        {
            obj = initSigner(tlsSigner, ((SecurityParameters) (obj1)));
            obj1 = new SignerInputStream(inputstream, ((Signer) (obj)));
        } else
        {
            obj1 = inputstream;
        }
        abyte2 = TlsUtils.readOpaque16(((InputStream) (obj1)));
        abyte1 = TlsUtils.readOpaque16(((InputStream) (obj1)));
        abyte0 = TlsUtils.readOpaque8(((InputStream) (obj1)));
        obj1 = TlsUtils.readOpaque16(((InputStream) (obj1)));
        if (obj != null && !((Signer) (obj)).verifySignature(TlsUtils.readOpaque16(inputstream)))
        {
            throw new TlsFatalAlert((short)42);
        }
        inputstream = new BigInteger(1, abyte2);
        obj = new BigInteger(1, abyte1);
        s = abyte0;
        try
        {
            B = SRP6Util.validatePublicValue(inputstream, new BigInteger(1, ((byte []) (obj1))));
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new TlsFatalAlert((short)47);
        }
        srpClient.init(inputstream, ((BigInteger) (obj)), new SHA1Digest(), context.getSecureRandom());
    }

    public void skipClientCredentials()
    {
    }

    public void skipServerCertificate()
    {
        if (tlsSigner != null)
        {
            throw new TlsFatalAlert((short)10);
        } else
        {
            return;
        }
    }

    public void skipServerKeyExchange()
    {
        throw new TlsFatalAlert((short)10);
    }

    public void validateCertificateRequest(CertificateRequest certificaterequest)
    {
        throw new TlsFatalAlert((short)10);
    }
}
