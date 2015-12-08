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

public class AuthorizationHeaderSigningStrategy
    implements SigningStrategy
{

    private static final long serialVersionUID = 1L;

    public AuthorizationHeaderSigningStrategy()
    {
    }

    public String writeSignature(String s, HttpRequest httprequest, HttpParameters httpparameters)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("OAuth ");
        if (httpparameters.containsKey("realm"))
        {
            stringbuilder.append(httpparameters.getAsHeaderElement("realm"));
            stringbuilder.append(", ");
        }
        httpparameters = httpparameters.getOAuthParameters();
        httpparameters.put("oauth_signature", s, true);
        s = httpparameters.keySet().iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            stringbuilder.append(httpparameters.getAsHeaderElement((String)s.next()));
            if (s.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        s = stringbuilder.toString();
        OAuth.debugOut("Auth Header", s);
        httprequest.setHeader("Authorization", s);
        return s;
    }
}
