// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

// Referenced classes of package com.whatsapp.messaging:
//            bk, a6

final class bo extends bk
{

    private static bo c = new bo();
    private static final TrustManager d[] = {
        new a6()
    };

    bo()
    {
    }

    public static bo a()
    {
        return c;
    }

    protected SSLSocketFactory a(SSLContext sslcontext)
    {
        try
        {
            sslcontext.init(null, d, null);
            sslcontext = sslcontext.getSocketFactory();
        }
        // Misplaced declaration of an exception variable
        catch (SSLContext sslcontext)
        {
            Log.a(sslcontext);
            throw new RuntimeException(sslcontext);
        }
        return sslcontext;
    }

}
