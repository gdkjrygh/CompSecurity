// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.commonshttp;

import oauth.signpost.AbstractOAuthConsumer;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package oauth.signpost.commonshttp:
//            HttpRequestAdapter

public class CommonsHttpOAuthConsumer extends AbstractOAuthConsumer
{

    private static final long serialVersionUID = 1L;

    public CommonsHttpOAuthConsumer(String s, String s1)
    {
        super(s, s1);
    }

    protected oauth.signpost.http.HttpRequest wrap(Object obj)
    {
        if (!(obj instanceof HttpRequest))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("This consumer expects requests of type ").append(org/apache/http/HttpRequest.getCanonicalName()).toString());
        } else
        {
            return new HttpRequestAdapter((HttpUriRequest)obj);
        }
    }
}
