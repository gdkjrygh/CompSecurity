// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Set;
import oauth.signpost.OAuth;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.HttpRequest;

public class SignatureBaseString
{

    private HttpRequest request;
    private HttpParameters requestParameters;

    public SignatureBaseString(HttpRequest httprequest, HttpParameters httpparameters)
    {
        request = httprequest;
        requestParameters = httpparameters;
    }

    public String generate()
        throws OAuthMessageSignerException
    {
        String s;
        try
        {
            s = normalizeRequestUrl();
            String s1 = normalizeRequestParameters();
            s = (new StringBuilder()).append(request.getMethod()).append('&').append(OAuth.percentEncode(s)).append('&').append(OAuth.percentEncode(s1)).toString();
        }
        catch (Exception exception)
        {
            throw new OAuthMessageSignerException(exception);
        }
        return s;
    }

    public String normalizeRequestParameters()
        throws IOException
    {
        if (requestParameters == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = requestParameters.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            if (!"oauth_signature".equals(s) && !"realm".equals(s))
            {
                if (i > 0)
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append(requestParameters.getAsQueryString(s, false));
            }
            i++;
        }
        return stringbuilder.toString();
    }

    public String normalizeRequestUrl()
        throws URISyntaxException
    {
label0:
        {
            Object obj = new URI(request.getRequestUrl());
            String s2 = ((URI) (obj)).getScheme().toLowerCase();
            String s1 = ((URI) (obj)).getAuthority().toLowerCase();
            String s;
            int i;
            if (s2.equals("http") && ((URI) (obj)).getPort() == 80 || s2.equals("https") && ((URI) (obj)).getPort() == 443)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s = s1;
            if (i != 0)
            {
                i = s1.lastIndexOf(":");
                s = s1;
                if (i >= 0)
                {
                    s = s1.substring(0, i);
                }
            }
            obj = ((URI) (obj)).getRawPath();
            if (obj != null)
            {
                s1 = ((String) (obj));
                if (((String) (obj)).length() > 0)
                {
                    break label0;
                }
            }
            s1 = "/";
        }
        return (new StringBuilder()).append(s2).append("://").append(s).append(s1).toString();
    }
}
