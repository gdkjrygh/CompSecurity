// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import com.walmart.android.utils.HttpUtils;
import java.util.Date;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public class ServiceData
{
    public static final class ContentType extends Enum
    {

        private static final ContentType $VALUES[];
        public static final ContentType HTML;
        public static final ContentType JSON;
        public static final ContentType UNKNOWN;

        public static ContentType valueOf(String s)
        {
            return (ContentType)Enum.valueOf(com/walmart/android/service/ServiceData$ContentType, s);
        }

        public static ContentType[] values()
        {
            return (ContentType[])$VALUES.clone();
        }

        static 
        {
            JSON = new ContentType("JSON", 0);
            HTML = new ContentType("HTML", 1);
            UNKNOWN = new ContentType("UNKNOWN", 2);
            $VALUES = (new ContentType[] {
                JSON, HTML, UNKNOWN
            });
        }

        private ContentType(String s, int i)
        {
            super(s, i);
        }
    }


    private final boolean mCacheHeaderEnabled;
    private final long mCacheMaxAge;
    private final String mContent;
    private final ContentType mContentType;
    private final Date mExpiresDate;
    private final HttpResponse mHttpResponse;
    private final int mHttpStatusCode;
    private final Date mResponseDate;

    public ServiceData(String s, String s1)
    {
        mContentType = contentTypeFromString(s);
        if (s1 == null)
        {
            s1 = "";
        }
        mContent = s1;
        mResponseDate = null;
        mExpiresDate = null;
        mCacheMaxAge = -1L;
        mCacheHeaderEnabled = false;
        mHttpResponse = null;
        mHttpStatusCode = -1;
    }

    public ServiceData(HttpResponse httpresponse, String s)
    {
        mContentType = extractContentType(httpresponse);
        boolean flag;
        if (s == null)
        {
            s = "";
        }
        mContent = s;
        mResponseDate = HttpUtils.getDate(httpresponse, "Date");
        mExpiresDate = HttpUtils.getDate(httpresponse, "Expires");
        mCacheMaxAge = HttpUtils.getCacheMaxAge(httpresponse);
        if (mCacheMaxAge != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mCacheHeaderEnabled = flag;
        mHttpStatusCode = httpresponse.getStatusLine().getStatusCode();
        mHttpResponse = httpresponse;
    }

    private static ContentType contentTypeFromString(String s)
    {
        if (s.startsWith("application/json"))
        {
            return ContentType.JSON;
        }
        if (s.startsWith("text/html"))
        {
            return ContentType.HTML;
        } else
        {
            return ContentType.UNKNOWN;
        }
    }

    private static ContentType extractContentType(HttpResponse httpresponse)
    {
        Header header = httpresponse.getFirstHeader("Content-Type");
        httpresponse = "";
        if (header != null)
        {
            httpresponse = header.getValue();
        }
        return contentTypeFromString(httpresponse);
    }

    public long getCacheMaxAgeInSeconds()
    {
        return mCacheMaxAge;
    }

    public String getContent()
    {
        return mContent;
    }

    public ContentType getContentType()
    {
        return mContentType;
    }

    public Date getExpirationDate()
    {
        return mExpiresDate;
    }

    public HttpResponse getHttpResponse()
    {
        return mHttpResponse;
    }

    public int getHttpStatusCode()
    {
        return mHttpStatusCode;
    }

    public Date getResponseDate()
    {
        return mResponseDate;
    }

    public boolean hasHttpError()
    {
        return mHttpStatusCode >= 300;
    }

    public boolean isCacheHeaderEnabled()
    {
        return mCacheHeaderEnabled;
    }

    public String toString()
    {
        return mContent;
    }
}
