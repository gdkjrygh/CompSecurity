// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.walmartlabs.kangaroo.Form;
import com.walmartlabs.mockaroo.base.Mockaroo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okio.BufferedSource;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            Header, OkRequest, TransformRequest, Converter, 
//            Log, Transformer

public class RequestBuilder
{
    private static class ByteConverter
        implements Converter
    {

        public Object from(BufferedSource bufferedsource, Class class1)
            throws IOException
        {
            return bufferedsource.readByteArray();
        }

        public String getContentType()
        {
            throw new UnsupportedOperationException();
        }

        public String toString(Object obj)
            throws IOException
        {
            throw new UnsupportedOperationException();
        }

        private ByteConverter()
        {
        }

    }

    private static class FormUrlEncodedConverter
        implements Converter
    {

        public Object from(BufferedSource bufferedsource, Class class1)
            throws IOException
        {
            throw new UnsupportedEncodingException();
        }

        public String getContentType()
        {
            return "application/x-www-form-urlencoded";
        }

        public String toString(Object obj)
            throws IOException
        {
            Object obj1 = (Form)obj;
            obj = new StringBuilder();
            for (obj1 = ((Form) (obj1)).getKeyValuePairs().iterator(); ((Iterator) (obj1)).hasNext();)
            {
                Pair pair = (Pair)((Iterator) (obj1)).next();
                if (((StringBuilder) (obj)).length() > 0)
                {
                    ((StringBuilder) (obj)).append('&');
                }
                try
                {
                    ((StringBuilder) (obj)).append(URLEncoder.encode((String)pair.first, "UTF-8"));
                    ((StringBuilder) (obj)).append('=');
                    ((StringBuilder) (obj)).append(URLEncoder.encode((String)pair.second, "UTF-8"));
                }
                catch (UnsupportedEncodingException unsupportedencodingexception) { }
            }

            return ((StringBuilder) (obj)).toString();
        }

        private FormUrlEncodedConverter()
        {
        }

    }


    private Converter mConverter;
    private final ArrayList mHeaders;
    private Log mLog;
    private String mMethod;
    private final OkHttpClient mOkHttpClient;
    private RequestBody mRequestBody;
    private android.net.Uri.Builder mUriBuilder;

    public RequestBuilder(OkHttpClient okhttpclient)
    {
        mOkHttpClient = okhttpclient;
        mHeaders = new ArrayList();
        mUriBuilder = (new android.net.Uri.Builder()).scheme("http");
        logLevel(Log.Level.NONE);
    }

    public RequestBuilder(RequestBuilder requestbuilder)
    {
        mOkHttpClient = requestbuilder.mOkHttpClient;
        mConverter = requestbuilder.mConverter;
        mHeaders = new ArrayList(requestbuilder.mHeaders);
        mUriBuilder = requestbuilder.mUriBuilder.build().buildUpon();
        mLog = requestbuilder.mLog;
    }

    private RequestBuilder body(String s, String s1)
    {
        mRequestBody = RequestBody.create(MediaType.parse(s), s1);
        return this;
    }

    private Request build(String s)
    {
        try
        {
            s = (new com.squareup.okhttp.Request.Builder()).url(s).method(mMethod, mRequestBody);
            Header header1;
            for (Iterator iterator = mHeaders.iterator(); iterator.hasNext(); s.addHeader(header1.name(), header1.value()))
            {
                header1 = (Header)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(String.format(Locale.US, "incorrectly configured. method=%s, url=%s", new Object[] {
                mMethod, mUriBuilder.toString()
            }));
        }
        s = s.build();
        return s;
    }

    private Uri checkAndModifyIfMock()
    {
        return Mockaroo.modifyUriIfMocking(mUriBuilder.build(), mMethod);
    }

    private Converter getRequestConverter(Object obj)
    {
        if (obj instanceof Form)
        {
            return new FormUrlEncodedConverter();
        } else
        {
            return mConverter;
        }
    }

    private Converter getResponseConverter(Class class1)
    {
        if (class1.equals([B))
        {
            class1 = new ByteConverter();
        } else
        {
            class1 = mConverter;
        }
        if (class1 == null)
        {
            throw new IllegalArgumentException("No converter has been configured. Only raw responses can be used.");
        } else
        {
            return class1;
        }
    }

    private com.walmartlabs.kangaroo.Request send(Class class1)
    {
        return send(class1, getResponseConverter(class1));
    }

    private com.walmartlabs.kangaroo.Request send(Class class1, Converter converter1)
    {
        return (new OkRequest(build(checkAndModifyIfMock().toString()), mOkHttpClient, mLog, converter1, class1)).execute();
    }

    private com.walmartlabs.kangaroo.Request send(Class class1, Converter converter1, Transformer transformer)
    {
        return (new TransformRequest(new OkRequest(build(checkAndModifyIfMock().toString()), mOkHttpClient, mLog, converter1, class1), transformer)).execute();
    }

    private com.walmartlabs.kangaroo.Request send(Class class1, Transformer transformer)
    {
        return send(class1, getResponseConverter(class1), transformer);
    }

    public RequestBuilder appendPath(String s)
    {
        s = s.split("/");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = s[i];
            mUriBuilder.appendPath(s1);
        }

        return this;
    }

    public RequestBuilder body(Object obj, Converter converter1)
    {
        try
        {
            mRequestBody = RequestBody.create(MediaType.parse(converter1.getContentType()), converter1.toString(obj));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return this;
        }
        return this;
    }

    public RequestBuilder converter(Converter converter1)
    {
        mConverter = converter1;
        return this;
    }

    public com.walmartlabs.kangaroo.Request delete(Class class1)
    {
        return delete(null, class1);
    }

    public com.walmartlabs.kangaroo.Request delete(Object obj, Converter converter1, Class class1)
    {
        mMethod = "DELETE";
        if (obj != null)
        {
            body(obj, converter1);
        }
        return send(class1);
    }

    public com.walmartlabs.kangaroo.Request delete(Object obj, Converter converter1, Class class1, Transformer transformer)
    {
        mMethod = "DELETE";
        if (obj != null)
        {
            body(obj, converter1);
        }
        return send(class1, transformer);
    }

    public com.walmartlabs.kangaroo.Request delete(Object obj, Class class1)
    {
        return delete(obj, getRequestConverter(obj), class1);
    }

    public com.walmartlabs.kangaroo.Request delete(Object obj, Class class1, Transformer transformer)
    {
        return delete(obj, getRequestConverter(obj), class1, transformer);
    }

    public com.walmartlabs.kangaroo.Request get(Class class1)
    {
        mMethod = "GET";
        return send(class1);
    }

    public com.walmartlabs.kangaroo.Request get(Class class1, Transformer transformer)
    {
        mMethod = "GET";
        return send(class1, transformer);
    }

    public RequestBuilder header(Header header1)
    {
        mHeaders.add(header1);
        return this;
    }

    public RequestBuilder host(String s)
    {
        mUriBuilder.encodedAuthority(s);
        return this;
    }

    public RequestBuilder log(Log log1)
    {
        if (log1 != null)
        {
            mLog = log1;
        }
        return this;
    }

    public RequestBuilder logLevel(Log.Level level)
    {
        mLog = Log.createDefault(level);
        return this;
    }

    public RequestBuilder noCache()
    {
        mHeaders.add(Header.NO_CACHE);
        return this;
    }

    public com.walmartlabs.kangaroo.Request patch(Class class1)
    {
        return patch(null, class1);
    }

    public com.walmartlabs.kangaroo.Request patch(Object obj, Converter converter1, Class class1)
    {
        mMethod = "PATCH";
        if (obj != null)
        {
            body(obj, converter1);
        }
        return send(class1);
    }

    public com.walmartlabs.kangaroo.Request patch(Object obj, Converter converter1, Class class1, Transformer transformer)
    {
        mMethod = "PATCH";
        if (obj != null)
        {
            body(obj, converter1);
        }
        return send(class1, transformer);
    }

    public com.walmartlabs.kangaroo.Request patch(Object obj, Class class1)
    {
        return patch(obj, getRequestConverter(obj), class1);
    }

    public com.walmartlabs.kangaroo.Request patch(Object obj, Class class1, Transformer transformer)
    {
        return patch(obj, getRequestConverter(obj), class1, transformer);
    }

    public RequestBuilder path(String s)
    {
        mUriBuilder.path(s);
        return this;
    }

    public com.walmartlabs.kangaroo.Request post(Class class1)
    {
        return post(null, class1);
    }

    public com.walmartlabs.kangaroo.Request post(Object obj, Converter converter1, Class class1)
    {
        mMethod = "POST";
        if (obj != null)
        {
            body(obj, converter1);
        }
        return send(class1);
    }

    public com.walmartlabs.kangaroo.Request post(Object obj, Converter converter1, Class class1, Transformer transformer)
    {
        mMethod = "POST";
        if (obj != null)
        {
            body(obj, converter1);
        }
        return send(class1, transformer);
    }

    public com.walmartlabs.kangaroo.Request post(Object obj, Class class1)
    {
        return post(obj, getRequestConverter(obj), class1);
    }

    public com.walmartlabs.kangaroo.Request post(Object obj, Class class1, Transformer transformer)
    {
        return post(obj, getRequestConverter(obj), class1, transformer);
    }

    public com.walmartlabs.kangaroo.Request put(Class class1)
    {
        return put(null, class1);
    }

    public com.walmartlabs.kangaroo.Request put(Object obj, Converter converter1, Class class1)
    {
        mMethod = "PUT";
        if (obj != null)
        {
            body(obj, converter1);
        }
        return send(class1);
    }

    public com.walmartlabs.kangaroo.Request put(Object obj, Converter converter1, Class class1, Transformer transformer)
    {
        mMethod = "PUT";
        if (obj != null)
        {
            body(obj, converter1);
        }
        return send(class1, transformer);
    }

    public com.walmartlabs.kangaroo.Request put(Object obj, Class class1)
    {
        return put(obj, getRequestConverter(obj), class1);
    }

    public com.walmartlabs.kangaroo.Request put(Object obj, Class class1, Transformer transformer)
    {
        return put(obj, getRequestConverter(obj), class1, transformer);
    }

    public RequestBuilder query(String s, String s1)
    {
        mUriBuilder.appendQueryParameter(s, s1);
        return this;
    }

    public RequestBuilder query(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); query((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return this;
    }

    public RequestBuilder queryIfNotEmpty(String s, String s1)
    {
        RequestBuilder requestbuilder = this;
        if (!TextUtils.isEmpty(s1))
        {
            requestbuilder = query(s, s1);
        }
        return requestbuilder;
    }

    public RequestBuilder secure()
    {
        return secure(true);
    }

    public RequestBuilder secure(boolean flag)
    {
        android.net.Uri.Builder builder = mUriBuilder;
        String s;
        if (flag)
        {
            s = "https";
        } else
        {
            s = "http";
        }
        builder.scheme(s);
        return this;
    }

    public RequestBuilder uri(String s)
    {
        mUriBuilder = Uri.parse(s).buildUpon();
        return this;
    }
}
