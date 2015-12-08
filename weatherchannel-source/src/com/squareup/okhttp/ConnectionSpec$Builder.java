// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


// Referenced classes of package com.squareup.okhttp:
//            ConnectionSpec, CipherSuite, TlsVersion

public static final class <init>
{

    private String cipherSuites[];
    private boolean supportsTlsExtensions;
    private boolean tls;
    private String tlsVersions[];

    public ConnectionSpec build()
    {
        return new ConnectionSpec(this, null);
    }

    public transient <init> cipherSuites(CipherSuite aciphersuite[])
    {
        if (!tls)
        {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String as[] = new String[aciphersuite.length];
        for (int i = 0; i < aciphersuite.length; i++)
        {
            as[i] = aciphersuite[i].javaName;
        }

        return cipherSuites(as);
    }

    cipherSuites cipherSuites(String as[])
    {
        cipherSuites = as;
        return this;
    }

    public cipherSuites supportsTlsExtensions(boolean flag)
    {
        if (!tls)
        {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        } else
        {
            supportsTlsExtensions = flag;
            return this;
        }
    }

    public transient supportsTlsExtensions tlsVersions(TlsVersion atlsversion[])
    {
        if (!tls)
        {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String as[] = new String[atlsversion.length];
        for (int i = 0; i < atlsversion.length; i++)
        {
            as[i] = atlsversion[i].javaName;
        }

        return tlsVersions(as);
    }

    transient tlsVersions tlsVersions(String as[])
    {
        tlsVersions = as;
        return this;
    }





    public (ConnectionSpec connectionspec)
    {
        tls = connectionspec.tls;
        cipherSuites = ConnectionSpec.access$500(connectionspec);
        tlsVersions = ConnectionSpec.access$600(connectionspec);
        supportsTlsExtensions = connectionspec.supportsTlsExtensions;
    }

    private TlsExtensions(boolean flag)
    {
        tls = flag;
    }

    tls(boolean flag, tls tls1)
    {
        this(flag);
    }
}
