// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp:
//            CipherSuite, TlsVersion, Route, Address

public final class ConnectionSpec
{
    public static final class Builder
    {

        private String cipherSuites[];
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String tlsVersions[];

        public ConnectionSpec build()
        {
            return new ConnectionSpec(this);
        }

        public transient Builder cipherSuites(CipherSuite aciphersuite[])
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

            cipherSuites = as;
            return this;
        }

        public transient Builder cipherSuites(String as[])
        {
            if (!tls)
            {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (as == null)
            {
                cipherSuites = null;
                return this;
            } else
            {
                cipherSuites = (String[])as.clone();
                return this;
            }
        }

        public Builder supportsTlsExtensions(boolean flag)
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

        public transient Builder tlsVersions(TlsVersion atlsversion[])
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

            tlsVersions = as;
            return this;
        }

        public transient Builder tlsVersions(String as[])
        {
            if (!tls)
            {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (as == null)
            {
                tlsVersions = null;
                return this;
            } else
            {
                tlsVersions = (String[])as.clone();
                return this;
            }
        }





        public Builder(ConnectionSpec connectionspec)
        {
            tls = connectionspec.tls;
            cipherSuites = connectionspec.cipherSuites;
            tlsVersions = connectionspec.tlsVersions;
            supportsTlsExtensions = connectionspec.supportsTlsExtensions;
        }

        Builder(boolean flag)
        {
            tls = flag;
        }
    }


    public static final ConnectionSpec CLEARTEXT = (new Builder(false)).build();
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final ConnectionSpec MODERN_TLS;
    private final String cipherSuites[];
    final boolean supportsTlsExtensions;
    final boolean tls;
    private final String tlsVersions[];

    private ConnectionSpec(Builder builder)
    {
        tls = builder.tls;
        cipherSuites = builder.cipherSuites;
        tlsVersions = builder.tlsVersions;
        supportsTlsExtensions = builder.supportsTlsExtensions;
    }


    private ConnectionSpec supportedSpec(SSLSocket sslsocket)
    {
        String as[] = null;
        if (cipherSuites != null)
        {
            as = sslsocket.getEnabledCipherSuites();
            as = (String[])Util.intersect(java/lang/String, cipherSuites, as);
        }
        sslsocket = sslsocket.getEnabledProtocols();
        sslsocket = (String[])Util.intersect(java/lang/String, tlsVersions, sslsocket);
        return (new Builder(this)).cipherSuites(as).tlsVersions(sslsocket).build();
    }

    void apply(SSLSocket sslsocket, Route route)
    {
        ConnectionSpec connectionspec = supportedSpec(sslsocket);
        sslsocket.setEnabledProtocols(connectionspec.tlsVersions);
        Object obj = connectionspec.cipherSuites;
        String as[] = ((String []) (obj));
        if (route.shouldSendTlsFallbackIndicator)
        {
            as = ((String []) (obj));
            if (Arrays.asList(sslsocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV"))
            {
                if (obj == null)
                {
                    obj = sslsocket.getEnabledCipherSuites();
                }
                as = new String[obj.length + 1];
                System.arraycopy(obj, 0, as, 0, obj.length);
                as[as.length - 1] = "TLS_FALLBACK_SCSV";
            }
        }
        if (as != null)
        {
            sslsocket.setEnabledCipherSuites(as);
        }
        obj = Platform.get();
        if (connectionspec.supportsTlsExtensions)
        {
            ((Platform) (obj)).configureTlsExtensions(sslsocket, route.address.uriHost, route.address.protocols);
        }
    }

    public List cipherSuites()
    {
        if (cipherSuites == null)
        {
            return null;
        }
        CipherSuite aciphersuite[] = new CipherSuite[cipherSuites.length];
        for (int i = 0; i < cipherSuites.length; i++)
        {
            aciphersuite[i] = CipherSuite.forJavaName(cipherSuites[i]);
        }

        return Util.immutableList(aciphersuite);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ConnectionSpec)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (ConnectionSpec)obj;
            if (tls == ((ConnectionSpec) (obj)).tls && (!tls || Arrays.equals(cipherSuites, ((ConnectionSpec) (obj)).cipherSuites) && Arrays.equals(tlsVersions, ((ConnectionSpec) (obj)).tlsVersions) && supportsTlsExtensions == ((ConnectionSpec) (obj)).supportsTlsExtensions))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int i = 17;
        if (tls)
        {
            int j = Arrays.hashCode(cipherSuites);
            int k = Arrays.hashCode(tlsVersions);
            if (supportsTlsExtensions)
            {
                i = 0;
            } else
            {
                i = 1;
            }
            i = ((j + 527) * 31 + k) * 31 + i;
        }
        return i;
    }

    public boolean isTls()
    {
        return tls;
    }

    public boolean supportsTlsExtensions()
    {
        return supportsTlsExtensions;
    }

    public List tlsVersions()
    {
        TlsVersion atlsversion[] = new TlsVersion[tlsVersions.length];
        for (int i = 0; i < tlsVersions.length; i++)
        {
            atlsversion[i] = TlsVersion.forJavaName(tlsVersions[i]);
        }

        return Util.immutableList(atlsversion);
    }

    public String toString()
    {
        if (tls)
        {
            Object obj = cipherSuites();
            if (obj == null)
            {
                obj = "[use default]";
            } else
            {
                obj = obj.toString();
            }
            return (new StringBuilder()).append("ConnectionSpec(cipherSuites=").append(((String) (obj))).append(", tlsVersions=").append(tlsVersions()).append(", supportsTlsExtensions=").append(supportsTlsExtensions).append(")").toString();
        } else
        {
            return "ConnectionSpec()";
        }
    }

    static 
    {
        MODERN_TLS = (new Builder(true)).cipherSuites(new CipherSuite[] {
            CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, 
            CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA
        }).tlsVersions(new TlsVersion[] {
            TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0
        }).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = (new Builder(MODERN_TLS)).tlsVersions(new TlsVersion[] {
            TlsVersion.TLS_1_0
        }).supportsTlsExtensions(true).build();
    }


}
