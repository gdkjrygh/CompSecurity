// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.protocol;

import ch.boye.httpclientandroidlib.auth.AuthSchemeRegistry;
import ch.boye.httpclientandroidlib.client.CookieStore;
import ch.boye.httpclientandroidlib.client.CredentialsProvider;
import ch.boye.httpclientandroidlib.cookie.CookieSpecRegistry;
import ch.boye.httpclientandroidlib.protocol.HttpContext;

// Referenced classes of package ch.boye.httpclientandroidlib.client.protocol:
//            ClientContext

public class ClientContextConfigurer
    implements ClientContext
{

    private final HttpContext context;

    public ClientContextConfigurer(HttpContext httpcontext)
    {
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else
        {
            context = httpcontext;
            return;
        }
    }

    public void setAuthSchemeRegistry(AuthSchemeRegistry authschemeregistry)
    {
        context.setAttribute("http.authscheme-registry", authschemeregistry);
    }

    public void setCookieSpecRegistry(CookieSpecRegistry cookiespecregistry)
    {
        context.setAttribute("http.cookiespec-registry", cookiespecregistry);
    }

    public void setCookieStore(CookieStore cookiestore)
    {
        context.setAttribute("http.cookie-store", cookiestore);
    }

    public void setCredentialsProvider(CredentialsProvider credentialsprovider)
    {
        context.setAttribute("http.auth.credentials-provider", credentialsprovider);
    }
}
