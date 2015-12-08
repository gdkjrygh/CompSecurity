// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.util.Hashtable;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsAuthentication, TlsCipher, ProtocolVersion, TlsCompression, 
//            TlsKeyExchange, TlsClientContext

public interface TlsClient
{

    public abstract TlsAuthentication getAuthentication();

    public abstract TlsCipher getCipher();

    public abstract int[] getCipherSuites();

    public abstract Hashtable getClientExtensions();

    public abstract ProtocolVersion getClientVersion();

    public abstract TlsCompression getCompression();

    public abstract short[] getCompressionMethods();

    public abstract TlsKeyExchange getKeyExchange();

    public abstract void init(TlsClientContext tlsclientcontext);

    public abstract void notifySecureRenegotiation(boolean flag);

    public abstract void notifySelectedCipherSuite(int i);

    public abstract void notifySelectedCompressionMethod(short word0);

    public abstract void notifyServerVersion(ProtocolVersion protocolversion);

    public abstract void notifySessionID(byte abyte0[]);

    public abstract void processServerExtensions(Hashtable hashtable);
}
