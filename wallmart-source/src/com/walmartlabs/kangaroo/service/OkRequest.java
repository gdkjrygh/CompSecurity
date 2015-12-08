// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import android.text.TextUtils;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RealResponseBody;
import com.walmartlabs.kangaroo.Result;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            ExecutableRequest, Converter, Log

class OkRequest extends ExecutableRequest
    implements Callback
{
    private static class Logger
    {

        private static final AtomicInteger ID = new AtomicInteger(0);
        private volatile long mExecuteTime;
        private final int mId;
        private final Log mLog;
        private Buffer mResponseBody;
        private volatile long mResponseTimestamp;

        private static String createCurlString(Request request)
        {
            StringBuilder stringbuilder = new StringBuilder("curl -i");
            stringbuilder.append(" -X ").append(request.method());
            Object obj = request.body();
            if (obj != null)
            {
                String s = requestBodyToString(((RequestBody) (obj)));
                if (!TextUtils.isEmpty(s))
                {
                    stringbuilder.append(" -H '").append("Content-Type: ").append(((RequestBody) (obj)).contentType().toString()).append("'");
                    stringbuilder.append(" -d '").append(s).append("'");
                }
            }
            obj = request.headers();
            if (obj != null)
            {
                int i = 0;
                while (i < ((Headers) (obj)).size()) 
                {
                    stringbuilder.append(" -H '").append(((Headers) (obj)).name(i));
                    String s1 = ((Headers) (obj)).value(i);
                    if (TextUtils.isEmpty(s1))
                    {
                        stringbuilder.append(";");
                    } else
                    {
                        stringbuilder.append(":").append(s1);
                    }
                    stringbuilder.append("'");
                    i++;
                }
            }
            stringbuilder.append(" '").append(request.urlString()).append("'");
            return stringbuilder.toString();
        }

        private static long getContentLength(RequestBody requestbody)
        {
            long l;
            try
            {
                l = requestbody.contentLength();
            }
            // Misplaced declaration of an exception variable
            catch (RequestBody requestbody)
            {
                return -1L;
            }
            return l;
        }

        private static long getHeaderAsLong(Response response, String s)
        {
            long l;
            try
            {
                l = Long.parseLong(response.header(s));
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                return -1L;
            }
            return l;
        }

        private static boolean isSecure(Request request)
        {
            return "https".equals(request.url().getProtocol());
        }

        private static String requestBodyToString(RequestBody requestbody)
        {
            Buffer buffer = new Buffer();
            try
            {
                requestbody.writeTo(buffer);
            }
            // Misplaced declaration of an exception variable
            catch (RequestBody requestbody) { }
            return buffer.readUtf8();
        }

        private static String responseTypeString(com.walmartlabs.kangaroo.Result.ResponseType responsetype)
        {
            static class _cls1
            {

                static final int $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[];

                static 
                {
                    $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType = new int[com.walmartlabs.kangaroo.Result.ResponseType.values().length];
                    try
                    {
                        $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.Result.ResponseType.NETWORK.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.Result.ResponseType.CACHED.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.Result.ResponseType.CONDITIONAL_NETWORK.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.Result.ResponseType.CONDITIONAL_CACHED.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.Result.ResponseType.NO_RESPONSE.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.walmartlabs.kangaroo.Result.ResponseType[responsetype.ordinal()])
            {
            default:
                return "no resp";

            case 1: // '\001'
                return "nw";

            case 2: // '\002'
                return "cached";

            case 3: // '\003'
                return "cond nw";

            case 4: // '\004'
                return "cond cached";
            }
        }

        private static String safeUrl(URL url)
        {
            if (url.getPort() == -1)
            {
                return String.format(Locale.US, "%s://%s%s", new Object[] {
                    url.getProtocol(), url.getHost(), url.getPath()
                });
            } else
            {
                return String.format(Locale.US, "%s://%s:%d%s", new Object[] {
                    url.getProtocol(), url.getHost(), Integer.valueOf(url.getPort()), url.getPath()
                });
            }
        }

        public void onEvictCacheEntry(Response response)
        {
            mLog.print(Log.Level.BASIC, String.format(Locale.US, "[%d] cache entry evicted. cache control: %s", new Object[] {
                Integer.valueOf(mId), response.cacheControl().toString()
            }));
        }

        public void onExecute(Request request)
        {
            if (!mLog.shouldLog(Log.Level.EVERYTHING)) goto _L2; else goto _L1
_L1:
            mLog.print(String.format(Locale.US, "[%d] --> %s", new Object[] {
                Integer.valueOf(mId), createCurlString(request)
            }));
_L4:
            return;
_L2:
            Object obj;
            RequestBody requestbody;
            boolean flag;
            if (!mLog.shouldLog(Log.Level.BASIC))
            {
                continue; /* Loop/switch isn't completed */
            }
            mExecuteTime = System.currentTimeMillis();
            obj = request.url();
            mLog.print(String.format(Locale.US, "[%d] --> %s %s", new Object[] {
                Integer.valueOf(mId), request.method(), safeUrl(((URL) (obj)))
            }));
            if (!mLog.shouldLog(Log.Level.PARAMS_AND_BODIES) || TextUtils.isEmpty(((URL) (obj)).getQuery()))
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = isSecure(request);
            requestbody = request.body();
            request = null;
            if (!mLog.shouldLog(Log.Level.SECURE_PARAMS_AND_BODIES) && flag)
            {
                break; /* Loop/switch isn't completed */
            }
            String s = ((URL) (obj)).getQuery();
            obj = s;
            if (requestbody != null)
            {
                request = requestBodyToString(requestbody);
                obj = s;
            }
_L5:
            mLog.print(String.format(Locale.US, "[%d] --> %s", new Object[] {
                Integer.valueOf(mId), obj
            }), flag);
            if (!TextUtils.isEmpty(request))
            {
                mLog.print(String.format(Locale.US, "[%d] --> %s (%d bytes): %s", new Object[] {
                    Integer.valueOf(mId), requestbody.contentType(), Long.valueOf(getContentLength(requestbody)), request
                }), flag);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            String s1 = "[stripped query]";
            obj = s1;
            if (requestbody != null)
            {
                request = "[stripped body]";
                obj = s1;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public void onFailure(Request request, IOException ioexception, com.walmartlabs.kangaroo.Result.Error error)
        {
            mLog.print(Log.Level.BASIC, String.format(Locale.US, "[%d] %s (%s)", new Object[] {
                Integer.valueOf(mId), error.name(), ioexception.toString()
            }));
        }

        public Response onResponse(Response response)
        {
            boolean flag;
            if (mLog.shouldLog(Log.Level.EVERYTHING))
            {
                mResponseTimestamp = System.currentTimeMillis();
            }
            flag = isSecure(response.request());
            Object obj;
            if (mLog.shouldLog(Log.Level.PARAMS_AND_BODIES) && !flag)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            obj = response;
            if (!mLog.shouldLog(Log.Level.SECURE_PARAMS_AND_BODIES))
            {
                break MISSING_BLOCK_LABEL_113;
            }
            mResponseBody = new Buffer();
            obj = new ForwardingSource(response.body().source()) {

                final Logger this$0;

                public long read(Buffer buffer, long l)
                    throws IOException
                {
                    l = super.read(buffer, l);
                    if (l != -1L)
                    {
                        buffer.copyTo(mResponseBody, buffer.size() - l, l);
                    }
                    return l;
                }

            
            {
                this$0 = Logger.this;
                super(source);
            }
            };
            obj = response.newBuilder().body(new RealResponseBody(response.headers(), Okio.buffer(((Source) (obj))))).build();
            return ((Response) (obj));
            Object obj1;
            obj1;
_L2:
            mResponseBody.writeUtf8(String.format(Locale.US, "[failed to access source: %s]", new Object[] {
                ((Throwable) (obj1)).toString()
            }));
            return response;
            obj1;
            continue; /* Loop/switch isn't completed */
            obj1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onResponseParsed(Response response)
        {
            mLog.print(Log.Level.BASIC, String.format(Locale.US, "[%d] <-- [%s] %d %s %s", new Object[] {
                Integer.valueOf(mId), responseTypeString(OkRequest.getResponseType(response)), Integer.valueOf(response.code()), response.message(), safeUrl(response.request().url())
            }));
            if (!mLog.shouldLog(Log.Level.PARAMS_AND_BODIES)) goto _L2; else goto _L1
_L1:
            Object obj;
            long l;
            if (mResponseBody == null)
            {
                break MISSING_BLOCK_LABEL_408;
            }
            l = mResponseBody.size();
            obj = mResponseBody.readUtf8();
_L4:
            Object obj1;
            Log log;
            Locale locale;
            int i;
            obj1 = response.body().contentType();
            log = mLog;
            locale = Locale.US;
            i = mId;
            long l1;
            long l2;
            long l3;
            long l4;
            if (obj1 == null)
            {
                obj1 = "unspecified content-type";
            }
            log.print(String.format(locale, "[%d] <-- %s (%d bytes): %s", new Object[] {
                Integer.valueOf(i), obj1, Long.valueOf(l), obj
            }), isSecure(response.request()));
            if (!mLog.shouldLog(Log.Level.EVERYTHING)) goto _L2; else goto _L3
_L3:
            l2 = System.currentTimeMillis();
            l3 = mExecuteTime;
            l4 = mResponseTimestamp;
            l1 = getHeaderAsLong(response, OkHeaders.SENT_MILLIS);
            l = getHeaderAsLong(response, OkHeaders.RECEIVED_MILLIS) - l1;
            l1 -= mExecuteTime;
            response = mLog;
            obj = Locale.US;
            i = mId;
            if (l <= 0L)
            {
                l = -1L;
            }
            if (l1 <= 0L)
            {
                l1 = -1L;
            }
            try
            {
                response.print(String.format(((Locale) (obj)), "[%d] <-- Total: %dms, HTTP transport: %dms, Wait: %dms, Read & Parse: %dms", new Object[] {
                    Integer.valueOf(i), Long.valueOf(l2 - l3), Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2 - l4)
                }));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Response response) { }
            // Misplaced declaration of an exception variable
            catch (Response response) { }
            mLog.print(Log.Level.BASIC, String.format(Locale.US, "[%d] <-- got exception while logging response info. %s", new Object[] {
                Integer.valueOf(mId), response.toString()
            }));
            return;
_L2:
            return;
            obj = "[stripped body]";
            l = -1L;
              goto _L4
        }

        public void onResult(Result result)
        {
            if (result.hasError())
            {
                mLog.print(Log.Level.BASIC, String.format(Locale.US, "[%d] %s (%s)", new Object[] {
                    Integer.valueOf(mId), result.getError().name(), result.getException().toString()
                }));
                return;
            } else
            {
                mLog.print(Log.Level.EVERYTHING, String.format(Locale.US, "[%d] %s", new Object[] {
                    Integer.valueOf(mId), result.getData().toString()
                }));
                return;
            }
        }




        public Logger(Log log)
        {
            mId = ID.getAndIncrement();
            mLog = log;
        }
    }


    private final Converter mConverter;
    private final Logger mLogger;
    private final OkHttpClient mOkHttpClient;
    private final Request mRequest;
    private final Class mResponseClass;

    public OkRequest(Request request, OkHttpClient okhttpclient, Log log, Converter converter, Class class1)
    {
        mOkHttpClient = okhttpclient;
        mRequest = request;
        mLogger = new Logger(log);
        mConverter = converter;
        mResponseClass = class1;
    }

    public OkRequest(OkRequest okrequest)
    {
        super(okrequest);
        mOkHttpClient = okrequest.mOkHttpClient;
        mRequest = okrequest.mRequest;
        mLogger = new Logger(okrequest.mLogger.mLog);
        mConverter = okrequest.mConverter;
        mResponseClass = okrequest.mResponseClass;
    }

    private void evictCacheEntryForResponse(Response response)
    {
        String s = response.request().urlString();
        try
        {
            Iterator iterator = mOkHttpClient.getCache().urls();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!((String)iterator.next()).equals(s))
                {
                    continue;
                }
                iterator.remove();
                mLogger.onEvictCacheEntry(response);
                break;
            } while (true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            return;
        }
    }

    private static LinkedHashMap getHeaders(Response response)
    {
        response = response.headers();
        LinkedHashMap linkedhashmap = new LinkedHashMap(response.size());
        for (int i = 0; i < response.size(); i++)
        {
            linkedhashmap.put(response.name(i), response.value(i));
        }

        return linkedhashmap;
    }

    private static com.walmartlabs.kangaroo.Result.ResponseType getResponseType(Response response)
    {
        if (response.cacheResponse() != null)
        {
            if (response.networkResponse() == null)
            {
                return com.walmartlabs.kangaroo.Result.ResponseType.CACHED;
            }
            if (response.networkResponse().code() == 304)
            {
                return com.walmartlabs.kangaroo.Result.ResponseType.CONDITIONAL_CACHED;
            } else
            {
                return com.walmartlabs.kangaroo.Result.ResponseType.CONDITIONAL_NETWORK;
            }
        } else
        {
            return com.walmartlabs.kangaroo.Result.ResponseType.NETWORK;
        }
    }

    protected ExecutableRequest copy()
    {
        return new OkRequest(this);
    }

    com.walmartlabs.kangaroo.Request execute()
    {
        mLogger.onExecute(mRequest);
        mOkHttpClient.newCall(mRequest).enqueue(this);
        return this;
    }

    public void onFailure(Request request, IOException ioexception)
    {
        com.walmartlabs.kangaroo.Result.Error error;
        if (ioexception instanceof InterruptedIOException)
        {
            error = com.walmartlabs.kangaroo.Result.Error.ERROR_TIMEOUT;
        } else
        {
            error = com.walmartlabs.kangaroo.Result.Error.ERROR_CONNECT_UNCLASSIFIED;
        }
        mLogger.onFailure(request, ioexception, error);
        setAndNotifyResult((new com.walmartlabs.kangaroo.Result.Builder()).error(error, ioexception).build());
    }

    public void onResponse(Response response)
    {
        com.walmartlabs.kangaroo.Result.Builder builder;
        boolean flag;
        response = mLogger.onResponse(response);
        builder = (new com.walmartlabs.kangaroo.Result.Builder()).code(response.code()).headers(getHeaders(response)).responseType(getResponseType(response));
        boolean flag1;
        if (response.priorResponse() != null && response.priorResponse().isRedirect())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        builder = builder.setRedirect(flag1);
        flag = false;
        builder.data(mConverter.from(response.body().source(), mResponseClass));
        mLogger.onResponseParsed(response);
_L1:
        if (flag)
        {
            evictCacheEntryForResponse(response);
        }
        setAndNotifyResult(builder.build());
        return;
        Object obj;
        obj;
        flag = true;
        builder.error(com.walmartlabs.kangaroo.Result.Error.ERROR_UNEXPECTED_RESPONSE, ((Throwable) (obj)));
        mLogger.onResponseParsed(response);
          goto _L1
        obj;
        flag = true;
        builder.error(com.walmartlabs.kangaroo.Result.Error.ERROR_UNKNOWN, ((Throwable) (obj)));
        mLogger.onResponseParsed(response);
          goto _L1
        obj;
        builder.error(com.walmartlabs.kangaroo.Result.Error.ERROR_OUT_OF_MEMORY, ((Throwable) (obj)));
        mLogger.onResponseParsed(response);
          goto _L1
        Exception exception;
        exception;
        mLogger.onResponseParsed(response);
        throw exception;
    }

    protected void setAndNotifyResult(Result result)
    {
        mLogger.onResult(result);
        super.setAndNotifyResult(result);
    }

}
