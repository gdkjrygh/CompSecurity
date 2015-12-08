// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.volley:
//            DefaultRetryPolicy, RequestQueue, VolleyLog, AuthFailureError, 
//            RetryPolicy, VolleyError, NetworkResponse, Response

public abstract class Request
    implements Comparable
{
    public static interface Method
    {

        public static final int DELETE = 3;
        public static final int DEPRECATED_GET_OR_POST = -1;
        public static final int GET = 0;
        public static final int HEAD = 4;
        public static final int OPTIONS = 5;
        public static final int PATCH = 7;
        public static final int POST = 1;
        public static final int PUT = 2;
        public static final int TRACE = 6;
    }

    public static final class Priority extends Enum
    {

        private static final Priority $VALUES[];
        public static final Priority HIGH;
        public static final Priority IMMEDIATE;
        public static final Priority LOW;
        public static final Priority NORMAL;

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(com/android/volley/Request$Priority, s);
        }

        public static Priority[] values()
        {
            return (Priority[])$VALUES.clone();
        }

        static 
        {
            LOW = new Priority("LOW", 0);
            NORMAL = new Priority("NORMAL", 1);
            HIGH = new Priority("HIGH", 2);
            IMMEDIATE = new Priority("IMMEDIATE", 3);
            $VALUES = (new Priority[] {
                LOW, NORMAL, HIGH, IMMEDIATE
            });
        }

        private Priority(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private static final long SLOW_REQUEST_THRESHOLD_MS = 3000L;
    private Cache.Entry mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private final Response.ErrorListener mErrorListener;
    private final VolleyLog.MarkerLog mEventLog;
    private final int mMethod;
    private long mRequestBirthTime;
    private RequestQueue mRequestQueue;
    private boolean mResponseDelivered;
    private RetryPolicy mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private Object mTag;
    private final String mUrl;

    public Request(int i, String s, Response.ErrorListener errorlistener)
    {
        VolleyLog.MarkerLog markerlog;
        if (VolleyLog.MarkerLog.ENABLED)
        {
            markerlog = new VolleyLog.MarkerLog();
        } else
        {
            markerlog = null;
        }
        mEventLog = markerlog;
        mShouldCache = true;
        mCanceled = false;
        mResponseDelivered = false;
        mRequestBirthTime = 0L;
        mCacheEntry = null;
        mMethod = i;
        mUrl = s;
        mErrorListener = errorlistener;
        setRetryPolicy(new DefaultRetryPolicy());
        mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(s);
    }

    public Request(String s, Response.ErrorListener errorlistener)
    {
        this(-1, s, errorlistener);
    }

    private byte[] encodeParameters(Map map, String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        try
        {
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder()).append("Encoding not supported: ").append(s).toString(), map);
        }
        map = stringbuilder.toString().getBytes(s);
        return map;
    }

    private static int findDefaultTrafficStatsTag(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = Uri.parse(s);
            if (s != null)
            {
                s = s.getHost();
                if (s != null)
                {
                    return s.hashCode();
                }
            }
        }
        return 0;
    }

    public void addMarker(String s)
    {
        if (VolleyLog.MarkerLog.ENABLED)
        {
            mEventLog.add(s, Thread.currentThread().getId());
        } else
        if (mRequestBirthTime == 0L)
        {
            mRequestBirthTime = SystemClock.elapsedRealtime();
            return;
        }
    }

    public void cancel()
    {
        mCanceled = true;
    }

    public int compareTo(Request request)
    {
        Priority priority = getPriority();
        Priority priority1 = request.getPriority();
        if (priority == priority1)
        {
            return mSequence.intValue() - request.mSequence.intValue();
        } else
        {
            return priority1.ordinal() - priority.ordinal();
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Request)obj);
    }

    public void deliverError(VolleyError volleyerror)
    {
        if (mErrorListener != null)
        {
            mErrorListener.onErrorResponse(volleyerror);
        }
    }

    protected abstract void deliverResponse(Object obj);

    void finish(final String tag)
    {
        if (mRequestQueue != null)
        {
            mRequestQueue.finish(this);
        }
        if (!VolleyLog.MarkerLog.ENABLED) goto _L2; else goto _L1
_L1:
        final long threadId = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new Runnable() {

            final Request this$0;
            final String val$tag;
            final long val$threadId;

            public void run()
            {
                mEventLog.add(tag, threadId);
                mEventLog.finish(((Object)this).toString());
            }

            
            {
                this$0 = Request.this;
                tag = s;
                threadId = l;
                super();
            }
        });
_L6:
        return;
_L4:
        mEventLog.add(tag, threadId);
        mEventLog.finish(toString());
        return;
_L2:
        long l = SystemClock.elapsedRealtime() - mRequestBirthTime;
        if (l >= 3000L)
        {
            VolleyLog.d("%d ms: %s", new Object[] {
                Long.valueOf(l), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public byte[] getBody()
        throws AuthFailureError
    {
        Map map = getParams();
        if (map != null && map.size() > 0)
        {
            return encodeParameters(map, getParamsEncoding());
        } else
        {
            return null;
        }
    }

    public String getBodyContentType()
    {
        return (new StringBuilder()).append("application/x-www-form-urlencoded; charset=").append(getParamsEncoding()).toString();
    }

    public Cache.Entry getCacheEntry()
    {
        return mCacheEntry;
    }

    public String getCacheKey()
    {
        return getUrl();
    }

    public Map getHeaders()
        throws AuthFailureError
    {
        return Collections.emptyMap();
    }

    public int getMethod()
    {
        return mMethod;
    }

    protected Map getParams()
        throws AuthFailureError
    {
        return null;
    }

    protected String getParamsEncoding()
    {
        return "UTF-8";
    }

    public byte[] getPostBody()
        throws AuthFailureError
    {
        Map map = getPostParams();
        if (map != null && map.size() > 0)
        {
            return encodeParameters(map, getPostParamsEncoding());
        } else
        {
            return null;
        }
    }

    public String getPostBodyContentType()
    {
        return getBodyContentType();
    }

    protected Map getPostParams()
        throws AuthFailureError
    {
        return getParams();
    }

    protected String getPostParamsEncoding()
    {
        return getParamsEncoding();
    }

    public Priority getPriority()
    {
        return Priority.NORMAL;
    }

    public RetryPolicy getRetryPolicy()
    {
        return mRetryPolicy;
    }

    public final int getSequence()
    {
        if (mSequence == null)
        {
            throw new IllegalStateException("getSequence called before setSequence");
        } else
        {
            return mSequence.intValue();
        }
    }

    public Object getTag()
    {
        return mTag;
    }

    public final int getTimeoutMs()
    {
        return mRetryPolicy.getCurrentTimeout();
    }

    public int getTrafficStatsTag()
    {
        return mDefaultTrafficStatsTag;
    }

    public String getUrl()
    {
        return mUrl;
    }

    public boolean hasHadResponseDelivered()
    {
        return mResponseDelivered;
    }

    public boolean isCanceled()
    {
        return mCanceled;
    }

    public void markDelivered()
    {
        mResponseDelivered = true;
    }

    protected VolleyError parseNetworkError(VolleyError volleyerror)
    {
        return volleyerror;
    }

    protected abstract Response parseNetworkResponse(NetworkResponse networkresponse);

    public Request setCacheEntry(Cache.Entry entry)
    {
        mCacheEntry = entry;
        return this;
    }

    public Request setRequestQueue(RequestQueue requestqueue)
    {
        mRequestQueue = requestqueue;
        return this;
    }

    public Request setRetryPolicy(RetryPolicy retrypolicy)
    {
        mRetryPolicy = retrypolicy;
        return this;
    }

    public final Request setSequence(int i)
    {
        mSequence = Integer.valueOf(i);
        return this;
    }

    public final Request setShouldCache(boolean flag)
    {
        mShouldCache = flag;
        return this;
    }

    public Request setTag(Object obj)
    {
        mTag = obj;
        return this;
    }

    public final boolean shouldCache()
    {
        return mShouldCache;
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("0x").append(Integer.toHexString(getTrafficStatsTag())).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (mCanceled)
        {
            s = "[X] ";
        } else
        {
            s = "[ ] ";
        }
        return stringbuilder.append(s).append(getUrl()).append(" ").append(s1).append(" ").append(getPriority()).append(" ").append(mSequence).toString();
    }

}
