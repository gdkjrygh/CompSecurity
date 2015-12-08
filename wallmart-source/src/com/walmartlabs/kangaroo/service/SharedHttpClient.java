// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import android.content.Context;
import android.util.Log;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.io.IOException;

public class SharedHttpClient
{

    private static final long CACHE_SIZE = 0xa00000L;
    private static volatile OkHttpClient sInstance;

    public SharedHttpClient()
    {
    }

    public static void create(Context context)
    {
        create(context, false);
    }

    public static void create(Context context, boolean flag)
    {
        sInstance = new OkHttpClient();
        if (flag)
        {
            try
            {
                getCache(context).delete();
            }
            catch (IOException ioexception)
            {
                Log.w("Service", "couldn't purge cache");
            }
        }
        sInstance.setCache(getCache(context));
    }

    public static void destroy()
    {
        sInstance = null;
    }

    public static OkHttpClient get()
    {
        return sInstance;
    }

    private static Cache getCache(Context context)
    {
        return new Cache(new File(context.getCacheDir(), "okhttp-shared"), 0xa00000L);
    }
}
