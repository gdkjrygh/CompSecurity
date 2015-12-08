// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import com.urbanairship.Logger;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.urbanairship.restclient:
//            Response

public class Post extends HttpPost
{

    protected DefaultHttpClient httpclient;

    public Post(String s, List list)
    {
        super(s);
        httpclient = null;
        s = new BasicHttpParams();
        httpclient = new DefaultHttpClient(s);
        HttpConnectionParams.setConnectionTimeout(s, 10000);
        s = new UrlEncodedFormEntity(list, "UTF-8");
        try
        {
            setEntity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_55;
        s;
        Logger.error("UTF-8 Unsupported.", s);
        return;
    }

    public Response execute()
        throws IOException
    {
        return new Response(httpclient.execute(this));
    }
}
