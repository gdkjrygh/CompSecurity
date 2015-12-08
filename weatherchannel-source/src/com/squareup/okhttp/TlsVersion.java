// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


public final class TlsVersion extends Enum
{

    private static final TlsVersion $VALUES[];
    public static final TlsVersion SSL_3_0;
    public static final TlsVersion TLS_1_0;
    public static final TlsVersion TLS_1_1;
    public static final TlsVersion TLS_1_2;
    final String javaName;

    private TlsVersion(String s, int i, String s1)
    {
        super(s, i);
        javaName = s1;
    }

    static TlsVersion forJavaName(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 48
    //                   -503070503: 121
    //                   -503070502: 107
    //                   79201641: 149
    //                   79923350: 135;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_149;
_L6:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected TLS version: ").append(s).toString());

        case 0: // '\0'
            return TLS_1_2;

        case 1: // '\001'
            return TLS_1_1;

        case 2: // '\002'
            return TLS_1_0;

        case 3: // '\003'
            return SSL_3_0;
        }
_L3:
        if (s.equals("TLSv1.2"))
        {
            byte0 = 0;
        }
          goto _L6
_L2:
        if (s.equals("TLSv1.1"))
        {
            byte0 = 1;
        }
          goto _L6
_L5:
        if (s.equals("TLSv1"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("SSLv3"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    public static TlsVersion valueOf(String s)
    {
        return (TlsVersion)Enum.valueOf(com/squareup/okhttp/TlsVersion, s);
    }

    public static TlsVersion[] values()
    {
        return (TlsVersion[])$VALUES.clone();
    }

    static 
    {
        TLS_1_2 = new TlsVersion("TLS_1_2", 0, "TLSv1.2");
        TLS_1_1 = new TlsVersion("TLS_1_1", 1, "TLSv1.1");
        TLS_1_0 = new TlsVersion("TLS_1_0", 2, "TLSv1");
        SSL_3_0 = new TlsVersion("SSL_3_0", 3, "SSLv3");
        $VALUES = (new TlsVersion[] {
            TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0
        });
    }
}
