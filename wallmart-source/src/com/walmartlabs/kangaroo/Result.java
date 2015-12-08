// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;

import com.walmartlabs.kangaroo.service.Header;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Result
{
    public static class Builder
    {

        private Object mData;
        private Error mError;
        private Throwable mException;
        private ArrayList mHeaderList;
        private LinkedHashMap mHeaders;
        private boolean mRedirect;
        private ResponseType mResponseType;
        private int mStatusCode;

        public Result build()
        {
            if (mData != null || mError != null && mException != null)
            {
                if (mHeaderList == null)
                {
                    mHeaderList = new ArrayList(mHeaders.size());
                    java.util.Map.Entry entry;
                    for (Iterator iterator = mHeaders.entrySet().iterator(); iterator.hasNext(); mHeaderList.add(new Header((String)entry.getKey(), (String)entry.getValue())))
                    {
                        entry = (java.util.Map.Entry)iterator.next();
                    }

                }
                return new Result(this);
            } else
            {
                throw new IllegalArgumentException("must have data, or error and exception");
            }
        }

        public Builder code(int i)
        {
            mStatusCode = i;
            return this;
        }

        public Builder data(Object obj)
        {
            mData = obj;
            return this;
        }

        public Builder error(Error error1, Throwable throwable)
        {
            mError = error1;
            mException = throwable;
            return this;
        }

        public Builder headers(LinkedHashMap linkedhashmap)
        {
            mHeaders = linkedhashmap;
            return this;
        }

        public Builder headers(List list)
        {
            mHeaderList = new ArrayList(list);
            return this;
        }

        public Builder responseType(ResponseType responsetype)
        {
            mResponseType = responsetype;
            return this;
        }

        public Builder setRedirect(boolean flag)
        {
            mRedirect = flag;
            return this;
        }








        public Builder()
        {
            mResponseType = ResponseType.NO_RESPONSE;
            mHeaders = new LinkedHashMap();
        }
    }

    public static final class Error extends Enum
    {

        private static final Error $VALUES[];
        public static final Error ERROR_CONNECT_OTHER;
        public static final Error ERROR_CONNECT_UNCLASSIFIED;
        public static final Error ERROR_NOT_CONNECTED;
        public static final Error ERROR_OUT_OF_MEMORY;
        public static final Error ERROR_TIMEOUT;
        public static final Error ERROR_UNEXPECTED_RESPONSE;
        public static final Error ERROR_UNKNOWN;
        private final Category mCategory;

        public static Error valueOf(String s)
        {
            return (Error)Enum.valueOf(com/walmartlabs/kangaroo/Result$Error, s);
        }

        public static Error[] values()
        {
            return (Error[])$VALUES.clone();
        }

        public boolean connectionError()
        {
            return mCategory.equals(Category.CONNECT);
        }

        static 
        {
            ERROR_CONNECT_UNCLASSIFIED = new Error("ERROR_CONNECT_UNCLASSIFIED", 0, Category.CONNECT);
            ERROR_NOT_CONNECTED = new Error("ERROR_NOT_CONNECTED", 1, Category.CONNECT);
            ERROR_TIMEOUT = new Error("ERROR_TIMEOUT", 2, Category.CONNECT);
            ERROR_CONNECT_OTHER = new Error("ERROR_CONNECT_OTHER", 3, Category.CONNECT);
            ERROR_UNEXPECTED_RESPONSE = new Error("ERROR_UNEXPECTED_RESPONSE", 4, Category.PARSE);
            ERROR_OUT_OF_MEMORY = new Error("ERROR_OUT_OF_MEMORY", 5, Category.PARSE);
            ERROR_UNKNOWN = new Error("ERROR_UNKNOWN", 6, Category.UNKNOWN);
            $VALUES = (new Error[] {
                ERROR_CONNECT_UNCLASSIFIED, ERROR_NOT_CONNECTED, ERROR_TIMEOUT, ERROR_CONNECT_OTHER, ERROR_UNEXPECTED_RESPONSE, ERROR_OUT_OF_MEMORY, ERROR_UNKNOWN
            });
        }

        private Error(String s, int i, Category category)
        {
            super(s, i);
            mCategory = category;
        }
    }

    public static final class Error.Category extends Enum
    {

        private static final Error.Category $VALUES[];
        public static final Error.Category CONNECT;
        public static final Error.Category PARSE;
        public static final Error.Category UNKNOWN;

        public static Error.Category valueOf(String s)
        {
            return (Error.Category)Enum.valueOf(com/walmartlabs/kangaroo/Result$Error$Category, s);
        }

        public static Error.Category[] values()
        {
            return (Error.Category[])$VALUES.clone();
        }

        static 
        {
            CONNECT = new Error.Category("CONNECT", 0);
            PARSE = new Error.Category("PARSE", 1);
            UNKNOWN = new Error.Category("UNKNOWN", 2);
            $VALUES = (new Error.Category[] {
                CONNECT, PARSE, UNKNOWN
            });
        }

        private Error.Category(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ResponseType extends Enum
    {

        private static final ResponseType $VALUES[];
        public static final ResponseType CACHED;
        public static final ResponseType CONDITIONAL_CACHED;
        public static final ResponseType CONDITIONAL_NETWORK;
        public static final ResponseType NETWORK;
        public static final ResponseType NO_RESPONSE;

        public static ResponseType valueOf(String s)
        {
            return (ResponseType)Enum.valueOf(com/walmartlabs/kangaroo/Result$ResponseType, s);
        }

        public static ResponseType[] values()
        {
            return (ResponseType[])$VALUES.clone();
        }

        static 
        {
            NO_RESPONSE = new ResponseType("NO_RESPONSE", 0);
            NETWORK = new ResponseType("NETWORK", 1);
            CACHED = new ResponseType("CACHED", 2);
            CONDITIONAL_NETWORK = new ResponseType("CONDITIONAL_NETWORK", 3);
            CONDITIONAL_CACHED = new ResponseType("CONDITIONAL_CACHED", 4);
            $VALUES = (new ResponseType[] {
                NO_RESPONSE, NETWORK, CACHED, CONDITIONAL_NETWORK, CONDITIONAL_CACHED
            });
        }

        private ResponseType(String s, int i)
        {
            super(s, i);
        }
    }


    private final Object mData;
    private final Error mError;
    private final Throwable mException;
    private final List mHeaders;
    private final ResponseType mResponseType;
    private final int mStatusCode;
    private final boolean mWasRedirected;

    private Result(Builder builder1)
    {
        mData = builder1.mData;
        mError = builder1.mError;
        mException = builder1.mException;
        mStatusCode = builder1.mStatusCode;
        mResponseType = builder1.mResponseType;
        mWasRedirected = builder1.mRedirect;
        mHeaders = Collections.unmodifiableList(builder1.mHeaderList);
    }


    Builder builder()
    {
        return (new Builder()).data(mData).error(mError, mException).code(mStatusCode).headers(mHeaders).responseType(mResponseType).setRedirect(mWasRedirected);
    }

    public Object getData()
    {
        return mData;
    }

    public Error getError()
    {
        return mError;
    }

    public Throwable getException()
    {
        return mException;
    }

    public List getHeaders()
    {
        return mHeaders;
    }

    public ResponseType getResponseType()
    {
        return mResponseType;
    }

    public int getStatusCode()
    {
        return mStatusCode;
    }

    public boolean hasData()
    {
        return mData != null;
    }

    public boolean hasError()
    {
        return mError != null;
    }

    public boolean isCachedResponse()
    {
        return ResponseType.CACHED == mResponseType || ResponseType.CONDITIONAL_CACHED == mResponseType;
    }

    public boolean successful()
    {
        return mStatusCode >= 200 && mStatusCode < 300;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Result{mData=").append(mData).append(", mError=").append(mError).append(", mStatusCode=").append(mStatusCode).append(", mResponseType=").append(mResponseType).append('}').toString();
    }

    public boolean wasRedirected()
    {
        return mWasRedirected;
    }
}
