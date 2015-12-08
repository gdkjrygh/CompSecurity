// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import com.squareup.okhttp.OkHttpClient;
import java.util.HashMap;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            RequestBuilder, Log, Converter

public class Service
{
    public static class Builder
    {

        private Converter mConverter;
        private String mHost;
        private Log mLog;
        private OkHttpClient mOkHttpClient;
        private String mPath;
        private final HashMap mQueryParameters = new HashMap();
        private boolean mSecure;

        private OkHttpClient createDefaultOkHttpClient()
        {
            return new OkHttpClient();
        }

        public Service build()
        {
            if (mOkHttpClient == null)
            {
                mOkHttpClient = createDefaultOkHttpClient();
            }
            if (mLog == null)
            {
                logLevel(Log.Level.NONE);
            }
            return new Service(this);
        }

        public Builder converter(Converter converter1)
        {
            mConverter = converter1;
            return this;
        }

        public Builder host(String s)
        {
            mHost = s;
            return this;
        }

        public Builder log(Log log1)
        {
            mLog = log1;
            return this;
        }

        public Builder logLevel(Log.Level level)
        {
            mLog = Log.createDefault(level);
            return this;
        }

        public Builder okHttpClient(OkHttpClient okhttpclient)
        {
            mOkHttpClient = okhttpclient;
            return this;
        }

        public Builder path(String s)
        {
            mPath = s;
            return this;
        }

        public Builder query(String s, String s1)
        {
            mQueryParameters.put(s, s1);
            return this;
        }

        public Builder secure(boolean flag)
        {
            mSecure = flag;
            return this;
        }








        public Builder()
        {
        }
    }


    private final RequestBuilder mRequestBuilder;

    private Service(Builder builder)
    {
        mRequestBuilder = (new RequestBuilder(builder.mOkHttpClient)).host(builder.mHost).path(builder.mPath).query(builder.mQueryParameters).secure(builder.mSecure).converter(builder.mConverter).log(builder.mLog);
    }


    public RequestBuilder newRequest()
    {
        return new RequestBuilder(mRequestBuilder);
    }
}
