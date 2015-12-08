// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import java.util.Iterator;
import java.util.Set;
import oauth.signpost.OAuth;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.HttpRequest;

// Referenced classes of package oauth.signpost.signature:
//            SigningStrategy

public class QueryStringSigningStrategy
    implements SigningStrategy
{

    private static final long serialVersionUID = 1L;

    public QueryStringSigningStrategy()
    {
    }

    public String writeSignature(String s, HttpRequest httprequest, HttpParameters httpparameters)
    {
        httpparameters = httpparameters.getOAuthParameters();
        httpparameters.put("oauth_signature", s, true);
        s = httpparameters.keySet().iterator();
        Object obj = (String)s.next();
        obj = new StringBuilder(OAuth.addQueryString(httprequest.getRequestUrl(), httpparameters.getAsQueryString(obj)));
        for (; s.hasNext(); ((StringBuilder) (obj)).append(httpparameters.getAsQueryString((String)s.next())))
        {
            ((StringBuilder) (obj)).append("&");
        }

        s = ((StringBuilder) (obj)).toString();
        httprequest.setRequestUrl(s);
        return s;
    }
}
