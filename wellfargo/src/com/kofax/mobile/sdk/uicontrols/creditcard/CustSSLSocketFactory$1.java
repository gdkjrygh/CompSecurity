// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CustSSLSocketFactory

class a
    implements X509TrustManager
{

    final CustSSLSocketFactory a;

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }

    (CustSSLSocketFactory custsslsocketfactory)
    {
        a = custsslsocketfactory;
        super();
    }
}
