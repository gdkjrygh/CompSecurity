// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.engines.AESFastEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCipherFactory, TlsBlockCipher, TlsFatalAlert, TlsStreamCipher, 
//            TlsClientContext, TlsCipher

public class DefaultTlsCipherFactory
    implements TlsCipherFactory
{

    public DefaultTlsCipherFactory()
    {
    }

    protected BlockCipher createAESBlockCipher()
    {
        return new CBCBlockCipher(new AESFastEngine());
    }

    protected TlsCipher createAESCipher(TlsClientContext tlsclientcontext, int i, int j)
    {
        return new TlsBlockCipher(tlsclientcontext, createAESBlockCipher(), createAESBlockCipher(), createDigest(j), createDigest(j), i);
    }

    public TlsCipher createCipher(TlsClientContext tlsclientcontext, int i, int j)
    {
        switch (i)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        default:
            throw new TlsFatalAlert((short)80);

        case 7: // '\007'
            return createDESedeCipher(tlsclientcontext, 24, j);

        case 8: // '\b'
            return createAESCipher(tlsclientcontext, 16, j);

        case 9: // '\t'
            return createAESCipher(tlsclientcontext, 32, j);

        case 2: // '\002'
            return createRC4Cipher(tlsclientcontext, 16, j);
        }
    }

    protected BlockCipher createDESedeBlockCipher()
    {
        return new CBCBlockCipher(new DESedeEngine());
    }

    protected TlsCipher createDESedeCipher(TlsClientContext tlsclientcontext, int i, int j)
    {
        return new TlsBlockCipher(tlsclientcontext, createDESedeBlockCipher(), createDESedeBlockCipher(), createDigest(j), createDigest(j), i);
    }

    protected Digest createDigest(int i)
    {
        switch (i)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 1: // '\001'
            return new MD5Digest();

        case 2: // '\002'
            return new SHA1Digest();

        case 3: // '\003'
            return new SHA256Digest();

        case 4: // '\004'
            return new SHA384Digest();
        }
    }

    protected TlsCipher createRC4Cipher(TlsClientContext tlsclientcontext, int i, int j)
    {
        return new TlsStreamCipher(tlsclientcontext, createRC4StreamCipher(), createRC4StreamCipher(), createDigest(j), createDigest(j), i);
    }

    protected StreamCipher createRC4StreamCipher()
    {
        return new RC4Engine();
    }
}
