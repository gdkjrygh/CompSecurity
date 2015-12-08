// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.params;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.params.HttpAbstractParamBean;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.util.Collection;

public class ClientParamBean extends HttpAbstractParamBean
{

    public ClientParamBean(HttpParams httpparams)
    {
        super(httpparams);
    }

    public void setAllowCircularRedirects(boolean flag)
    {
        params.setBooleanParameter("http.protocol.allow-circular-redirects", flag);
    }

    public void setConnectionManagerFactoryClassName(String s)
    {
        params.setParameter("http.connection-manager.factory-class-name", s);
    }

    public void setConnectionManagerTimeout(long l)
    {
        params.setLongParameter("http.conn-manager.timeout", l);
    }

    public void setCookiePolicy(String s)
    {
        params.setParameter("http.protocol.cookie-policy", s);
    }

    public void setDefaultHeaders(Collection collection)
    {
        params.setParameter("http.default-headers", collection);
    }

    public void setDefaultHost(HttpHost httphost)
    {
        params.setParameter("http.default-host", httphost);
    }

    public void setHandleAuthentication(boolean flag)
    {
        params.setBooleanParameter("http.protocol.handle-authentication", flag);
    }

    public void setHandleRedirects(boolean flag)
    {
        params.setBooleanParameter("http.protocol.handle-redirects", flag);
    }

    public void setMaxRedirects(int i)
    {
        params.setIntParameter("http.protocol.max-redirects", i);
    }

    public void setRejectRelativeRedirect(boolean flag)
    {
        params.setBooleanParameter("http.protocol.reject-relative-redirect", flag);
    }

    public void setVirtualHost(HttpHost httphost)
    {
        params.setParameter("http.virtual-host", httphost);
    }
}
