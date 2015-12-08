// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClientContext, TlsUtils, ProtocolVersion, TlsFatalAlert

public class TlsRSAUtils
{

    public TlsRSAUtils()
    {
    }

    public static byte[] generateEncryptedPreMasterSecret(TlsClientContext tlsclientcontext, RSAKeyParameters rsakeyparameters, OutputStream outputstream)
    {
        byte abyte0[];
        PKCS1Encoding pkcs1encoding;
        boolean flag;
        flag = true;
        abyte0 = new byte[48];
        tlsclientcontext.getSecureRandom().nextBytes(abyte0);
        TlsUtils.writeVersion(tlsclientcontext.getClientVersion(), abyte0, 0);
        pkcs1encoding = new PKCS1Encoding(new RSABlindedEngine());
        pkcs1encoding.init(true, new ParametersWithRandom(rsakeyparameters, tlsclientcontext.getSecureRandom()));
        if (tlsclientcontext.getServerVersion().getFullVersion() < ProtocolVersion.TLSv10.getFullVersion())
        {
            flag = false;
        }
        tlsclientcontext = pkcs1encoding.processBlock(abyte0, 0, abyte0.length);
        if (flag)
        {
            try
            {
                TlsUtils.writeOpaque16(tlsclientcontext, outputstream);
            }
            // Misplaced declaration of an exception variable
            catch (TlsClientContext tlsclientcontext)
            {
                throw new TlsFatalAlert((short)80);
            }
            return abyte0;
        }
        outputstream.write(tlsclientcontext);
        return abyte0;
    }
}
