// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.util.List;
import java.util.Map;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            AbstractAuthenticationHandler

public class DefaultTargetAuthenticationHandler extends AbstractAuthenticationHandler
{

    public DefaultTargetAuthenticationHandler()
    {
    }

    protected List getAuthPreferences(HttpResponse httpresponse, HttpContext httpcontext)
    {
        List list = (List)httpresponse.getParams().getParameter("http.auth.target-scheme-pref");
        if (list != null)
        {
            return list;
        } else
        {
            return super.getAuthPreferences(httpresponse, httpcontext);
        }
    }

    public Map getChallenges(HttpResponse httpresponse, HttpContext httpcontext)
        throws MalformedChallengeException
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else
        {
            return parseChallenges(httpresponse.getHeaders("WWW-Authenticate"));
        }
    }

    public boolean isAuthenticationRequested(HttpResponse httpresponse, HttpContext httpcontext)
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        return httpresponse.getStatusLine().getStatusCode() == 401;
    }
}
