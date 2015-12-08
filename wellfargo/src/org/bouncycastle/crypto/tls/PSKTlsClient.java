// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.util.Hashtable;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClient, DefaultTlsCipherFactory, TlsPSKKeyExchange, TlsFatalAlert, 
//            TlsCipherFactory, ProtocolVersion, TlsNullCompression, TlsClientContext, 
//            TlsPSKIdentity, TlsKeyExchange, TlsCipher, TlsCompression

public abstract class PSKTlsClient
    implements TlsClient
{

    protected TlsCipherFactory cipherFactory;
    protected TlsClientContext context;
    protected TlsPSKIdentity pskIdentity;
    protected int selectedCipherSuite;
    protected int selectedCompressionMethod;

    public PSKTlsClient(TlsCipherFactory tlscipherfactory, TlsPSKIdentity tlspskidentity)
    {
        cipherFactory = tlscipherfactory;
        pskIdentity = tlspskidentity;
    }

    public PSKTlsClient(TlsPSKIdentity tlspskidentity)
    {
        this(((TlsCipherFactory) (new DefaultTlsCipherFactory())), tlspskidentity);
    }

    protected TlsKeyExchange createPSKKeyExchange(int i)
    {
        return new TlsPSKKeyExchange(context, i, pskIdentity);
    }

    public TlsCipher getCipher()
    {
        switch (selectedCipherSuite)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 139: 
        case 143: 
        case 147: 
            return cipherFactory.createCipher(context, 7, 2);

        case 140: 
        case 144: 
        case 148: 
            return cipherFactory.createCipher(context, 8, 2);

        case 141: 
        case 145: 
        case 149: 
            return cipherFactory.createCipher(context, 9, 2);

        case 138: 
        case 142: 
        case 146: 
            return cipherFactory.createCipher(context, 2, 2);
        }
    }

    public int[] getCipherSuites()
    {
        return (new int[] {
            145, 144, 143, 142, 149, 148, 147, 146, 141, 140, 
            139, 138
        });
    }

    public Hashtable getClientExtensions()
    {
        return null;
    }

    public ProtocolVersion getClientVersion()
    {
        return ProtocolVersion.TLSv10;
    }

    public TlsCompression getCompression()
    {
        switch (selectedCompressionMethod)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 0: // '\0'
            return new TlsNullCompression();
        }
    }

    public short[] getCompressionMethods()
    {
        return (new short[] {
            0
        });
    }

    public TlsKeyExchange getKeyExchange()
    {
        switch (selectedCipherSuite)
        {
        default:
            throw new TlsFatalAlert((short)80);

        case 138: 
        case 139: 
        case 140: 
        case 141: 
            return createPSKKeyExchange(13);

        case 146: 
        case 147: 
        case 148: 
        case 149: 
            return createPSKKeyExchange(15);

        case 142: 
        case 143: 
        case 144: 
        case 145: 
            return createPSKKeyExchange(14);
        }
    }

    public void init(TlsClientContext tlsclientcontext)
    {
        context = tlsclientcontext;
    }

    public void notifySecureRenegotiation(boolean flag)
    {
        if (flag);
    }

    public void notifySelectedCipherSuite(int i)
    {
        selectedCipherSuite = i;
    }

    public void notifySelectedCompressionMethod(short word0)
    {
        selectedCompressionMethod = word0;
    }

    public void notifyServerVersion(ProtocolVersion protocolversion)
    {
        if (!ProtocolVersion.TLSv10.equals(protocolversion))
        {
            throw new TlsFatalAlert((short)47);
        } else
        {
            return;
        }
    }

    public void notifySessionID(byte abyte0[])
    {
    }

    public void processServerExtensions(Hashtable hashtable)
    {
    }
}
