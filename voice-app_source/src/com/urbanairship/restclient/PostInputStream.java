// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.urbanairship.restclient:
//            Response

public class PostInputStream extends HttpPost
{

    protected DefaultHttpClient httpclient;

    public PostInputStream(String s, InputStream inputstream, Long long1)
    {
        super(s);
        httpclient = new DefaultHttpClient();
        setEntity(new InputStreamEntity(inputstream, long1.longValue()));
    }

    public Response execute()
        throws IOException
    {
        return new Response(httpclient.execute(this));
    }
}
