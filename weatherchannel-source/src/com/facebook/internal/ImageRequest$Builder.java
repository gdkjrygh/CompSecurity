// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import java.net.URI;

// Referenced classes of package com.facebook.internal:
//            ImageRequest, Validate

public static class imageUrl
{

    private boolean allowCachedRedirects;
    private  callback;
    private Object callerTag;
    private Context context;
    private URI imageUrl;

    public ImageRequest build()
    {
        return new ImageRequest(this, null);
    }

    public imageUrl setAllowCachedRedirects(boolean flag)
    {
        allowCachedRedirects = flag;
        return this;
    }

    public  setCallback( )
    {
        callback = ;
        return this;
    }

    public callback setCallerTag(Object obj)
    {
        callerTag = obj;
        return this;
    }






    public (Context context1, URI uri)
    {
        Validate.notNull(uri, "imageUrl");
        context = context1;
        imageUrl = uri;
    }
}
