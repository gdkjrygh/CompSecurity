// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

public class ClearCacheRequest extends Request
{

    private final Cache mCache;
    private final Runnable mCallback;

    public ClearCacheRequest(Cache cache, Runnable runnable)
    {
        super(0, null, null);
        mCache = cache;
        mCallback = runnable;
    }

    protected void deliverResponse(Object obj)
    {
    }

    public com.android.volley.Request.Priority getPriority()
    {
        return com.android.volley.Request.Priority.IMMEDIATE;
    }

    public boolean isCanceled()
    {
        mCache.clear();
        if (mCallback != null)
        {
            (new Handler(Looper.getMainLooper())).postAtFrontOfQueue(mCallback);
        }
        return true;
    }

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        return null;
    }
}
