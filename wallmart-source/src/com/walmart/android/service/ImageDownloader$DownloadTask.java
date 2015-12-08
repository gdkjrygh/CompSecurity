// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import com.walmartlabs.utils.WLog;
import java.util.LinkedList;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.walmart.android.service:
//            ImageDownloader

private static class expiryTime
{

    private final LinkedList attachedCallbacks = new LinkedList();
    private final String cacheFileName;
    private final long expiryTime;
    private final HttpGet request;

    public static expiryTime create(String s, String s1, long l)
    {
        Object obj = null;
        try
        {
            s = new HttpGet(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(ImageDownloader.TAG, "couldn't create get request: ", s);
            s = obj;
        }
        if (s != null)
        {
            return new <init>(s, s1, l);
        } else
        {
            return null;
        }
    }





    public (HttpGet httpget, String s, long l)
    {
        cacheFileName = s;
        request = httpget;
        expiryTime = l;
    }
}
