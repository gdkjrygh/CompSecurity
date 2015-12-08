// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.basic;

import java.net.HttpURLConnection;
import oauth.signpost.AbstractOAuthConsumer;
import oauth.signpost.http.HttpRequest;

// Referenced classes of package oauth.signpost.basic:
//            HttpURLConnectionRequestAdapter

public class DefaultOAuthConsumer extends AbstractOAuthConsumer
{

    private static final long serialVersionUID = 1L;

    public DefaultOAuthConsumer(String s, String s1)
    {
        super(s, s1);
    }

    protected HttpRequest wrap(Object obj)
    {
        if (!(obj instanceof HttpURLConnection))
        {
            throw new IllegalArgumentException("The default consumer expects requests of type java.net.HttpURLConnection");
        } else
        {
            return new HttpURLConnectionRequestAdapter((HttpURLConnection)obj);
        }
    }
}
