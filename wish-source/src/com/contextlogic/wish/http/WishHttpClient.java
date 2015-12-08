// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.auth.AuthScope;
import ch.boye.httpclientandroidlib.auth.UsernamePasswordCredentials;
import ch.boye.httpclientandroidlib.client.CookieStore;
import ch.boye.httpclientandroidlib.client.CredentialsProvider;
import ch.boye.httpclientandroidlib.conn.scheme.PlainSocketFactory;
import ch.boye.httpclientandroidlib.conn.scheme.Scheme;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry;
import ch.boye.httpclientandroidlib.conn.ssl.SSLSocketFactory;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.CookieSpec;
import ch.boye.httpclientandroidlib.cookie.CookieSpecFactory;
import ch.boye.httpclientandroidlib.cookie.CookieSpecRegistry;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.impl.client.AutoRetryHttpClient;
import ch.boye.httpclientandroidlib.impl.client.BasicCookieStore;
import ch.boye.httpclientandroidlib.impl.client.DefaultHttpClient;
import ch.boye.httpclientandroidlib.impl.client.DefaultServiceUnavailableRetryStrategy;
import ch.boye.httpclientandroidlib.impl.conn.PoolingClientConnectionManager;
import ch.boye.httpclientandroidlib.impl.cookie.BasicClientCookie;
import ch.boye.httpclientandroidlib.impl.cookie.BrowserCompatSpec;
import ch.boye.httpclientandroidlib.params.BasicHttpParams;
import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.params.HttpProtocolParams;
import ch.boye.httpclientandroidlib.protocol.BasicHttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.user.UserPreferences;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.contextlogic.wish.http:
//            HttpResponseHandler, HttpRequest, HttpRequestParams, LinkedBlockingQueue

public class WishHttpClient
{
    public class LifoBlockingQueue extends LinkedBlockingQueue
    {

        private static final long serialVersionUID = 0xc8425b83a3be032eL;
        final WishHttpClient this$0;

        public boolean add(Object obj)
        {
            return super.offerFirst(obj);
        }

        public boolean offer(Object obj)
        {
            return super.offerFirst(obj);
        }

        public boolean offer(Object obj, long l, TimeUnit timeunit)
            throws InterruptedException
        {
            return super.offerFirst(obj, l, timeunit);
        }

        public void put(Object obj)
            throws InterruptedException
        {
            super.putFirst(obj);
        }

        public LifoBlockingQueue()
        {
            this$0 = WishHttpClient.this;
            super();
        }
    }

    static class LowPriorityThreadFactory
        implements ThreadFactory
    {

        private RequestPool pool;
        private int priority;

        public Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable);
            runnable.setName((new StringBuilder()).append(pool.name()).append(runnable.getId()).toString());
            Process.setThreadPriority(priority);
            return runnable;
        }

        public LowPriorityThreadFactory(RequestPool requestpool)
        {
            pool = requestpool;
            if (requestpool == RequestPool.ImagePrefetch)
            {
                priority = 9;
                return;
            }
            if (requestpool == RequestPool.Image)
            {
                priority = 8;
                return;
            }
            if (requestpool == RequestPool.Cached)
            {
                priority = 7;
                return;
            }
            if (requestpool == RequestPool.Api)
            {
                priority = 6;
                return;
            } else
            {
                priority = 10;
                return;
            }
        }
    }

    public static final class RequestPool extends Enum
    {

        private static final RequestPool $VALUES[];
        public static final RequestPool Api;
        public static final RequestPool BackgroundApi;
        public static final RequestPool Cached;
        public static final RequestPool Image;
        public static final RequestPool ImagePrefetch;

        public static RequestPool valueOf(String s)
        {
            return (RequestPool)Enum.valueOf(com/contextlogic/wish/http/WishHttpClient$RequestPool, s);
        }

        public static RequestPool[] values()
        {
            return (RequestPool[])$VALUES.clone();
        }

        static 
        {
            BackgroundApi = new RequestPool("BackgroundApi", 0);
            Api = new RequestPool("Api", 1);
            ImagePrefetch = new RequestPool("ImagePrefetch", 2);
            Cached = new RequestPool("Cached", 3);
            Image = new RequestPool("Image", 4);
            $VALUES = (new RequestPool[] {
                BackgroundApi, Api, ImagePrefetch, Cached, Image
            });
        }

        private RequestPool(String s, int i)
        {
            super(s, i);
        }
    }

    static class TimestampedRunnable
    {

        private Runnable runnable;
        private long timestamp;

        public Runnable getRunnable()
        {
            return runnable;
        }

        public long getTimestamp()
        {
            return timestamp;
        }

        public TimestampedRunnable(Runnable runnable1)
        {
            timestamp = System.currentTimeMillis();
            runnable = runnable1;
        }
    }


    private static final int MAX_CONNECTIONS = 10;
    private static final int SOCKET_BUFFER_SIZE = 8192;
    private static final int SOCKET_TIMEOUT = 35000;
    private static WishHttpClient _instance = new WishHttpClient();
    private BasicClientCookie bsidCookie;
    private final CookieStore cookieStore = new BasicCookieStore();
    private final DefaultHttpClient httpClient;
    private final PoolingClientConnectionManager httpConnectionManager = new PoolingClientConnectionManager(new SchemeRegistry());
    private final Map requestFutureMap = Collections.synchronizedMap(new WeakHashMap());
    private final Map requestMap = Collections.synchronizedMap(new WeakHashMap());
    private boolean schemesRegistered;
    private BasicClientCookie sessionCookie;
    private final HashMap threadPools;
    private final AutoRetryHttpClient wrapperHttpClient;

    private WishHttpClient()
    {
        Object obj;
        BasicHttpParams basichttpparams;
label0:
        {
            super();
            threadPools = new HashMap();
            RequestPool arequestpool[] = RequestPool.values();
            int j = arequestpool.length;
            int i = 0;
            while (i < j) 
            {
                RequestPool requestpool = arequestpool[i];
                byte byte0 = 2;
                ThreadPoolExecutor threadpoolexecutor;
                if (requestpool == RequestPool.Image)
                {
                    byte0 = 3;
                } else
                if (requestpool == RequestPool.ImagePrefetch)
                {
                    byte0 = 2;
                } else
                if (requestpool == RequestPool.Cached)
                {
                    byte0 = 2;
                } else
                if (requestpool == RequestPool.BackgroundApi)
                {
                    byte0 = 2;
                }
                threadpoolexecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(byte0);
                threadpoolexecutor.setThreadFactory(new LowPriorityThreadFactory(requestpool));
                threadPools.put(requestpool.name(), threadpoolexecutor);
                i++;
            }
            basichttpparams = new BasicHttpParams();
            HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, false);
            HttpConnectionParams.setSoTimeout(basichttpparams, 35000);
            HttpConnectionParams.setConnectionTimeout(basichttpparams, 35000);
            HttpConnectionParams.setTcpNoDelay(basichttpparams, true);
            HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
            HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
            String s = UserPreferences.getUserAgent();
            if (s != null)
            {
                obj = s;
                if (!s.trim().equals(""))
                {
                    break label0;
                }
            }
            obj = System.getProperty("http.agent");
        }
        if (obj != null)
        {
            HttpProtocolParams.setUserAgent(basichttpparams, ((String) (obj)));
        }
        httpConnectionManager.setMaxTotal(40);
        httpConnectionManager.setDefaultMaxPerRoute(10);
        httpClient = new DefaultHttpClient(httpConnectionManager, basichttpparams);
        wrapperHttpClient = new AutoRetryHttpClient(httpClient, new DefaultServiceUnavailableRetryStrategy() {

            final WishHttpClient this$0;

            public boolean retryRequest(HttpResponse httpresponse, int k, HttpContext httpcontext)
            {
                Object obj1 = (ConnectivityManager)WishApplication.getAppInstance().getSystemService("connectivity");
                if (obj1 != null)
                {
                    obj1 = ((ConnectivityManager) (obj1)).getActiveNetworkInfo();
                    if (obj1 != null && ((NetworkInfo) (obj1)).isConnectedOrConnecting())
                    {
                        return super.retryRequest(httpresponse, k, httpcontext);
                    } else
                    {
                        return false;
                    }
                } else
                {
                    return super.retryRequest(httpresponse, k, httpcontext);
                }
            }

            
            {
                this$0 = WishHttpClient.this;
                super();
            }
        });
        httpClient.getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(true));
        obj = new BasicCookieStore();
        httpClient.setCookieStore(((CookieStore) (obj)));
        obj = new CookieSpecFactory() {

            final WishHttpClient this$0;

            public CookieSpec newInstance(HttpParams httpparams)
            {
                return new BrowserCompatSpec() {

                    final _cls2 this$1;

                    public void validate(Cookie cookie, CookieOrigin cookieorigin)
                        throws MalformedCookieException
                    {
                        throw new MalformedCookieException();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                };
            }

            
            {
                this$0 = WishHttpClient.this;
                super();
            }
        };
        httpClient.getCookieSpecs().register("reject-all", ((CookieSpecFactory) (obj)));
        httpClient.getParams().setParameter("http.protocol.cookie-policy", "reject-all");
        httpClient.getCredentialsProvider().setCredentials(new AuthScope("api.hipmob.com", 443), new UsernamePasswordCredentials("contextlogic", "29e09151d96379c6026215cf7196d646a5e4c2c0b34eaddc8f731b5c"));
    }

    public static WishHttpClient getInstance()
    {
        return _instance;
    }

    public static boolean isNetworkAvailable()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)WishApplication.getAppInstance().getSystemService("connectivity")).getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }

    private void request(RequestPool requestpool, Object obj, String s, HttpRequest.RequestType requesttype, HttpRequestParams httprequestparams, HttpResponseHandler httpresponsehandler)
    {
        if (httpresponsehandler.hasCachedResponse(s))
        {
            requestpool = RequestPool.Cached;
        }
        if (!Thread.currentThread().isInterrupted())
        {
            requestpool = (ThreadPoolExecutor)threadPools.get(requestpool.name());
            requestpool.purge();
            BasicHttpContext basichttpcontext = new BasicHttpContext();
            basichttpcontext.setAttribute("http.cookie-store", cookieStore);
            requesttype = new HttpRequest(wrapperHttpClient, basichttpcontext, s, requesttype, httprequestparams, httpresponsehandler);
            httprequestparams = requestpool.submit(requesttype);
            if (obj != null)
            {
                s = (LinkedList)requestFutureMap.get(obj);
                requestpool = s;
                if (s == null)
                {
                    requestpool = new LinkedList();
                    requestFutureMap.put(obj, requestpool);
                }
                requestpool.add(new WeakReference(httprequestparams));
                s = (LinkedList)requestMap.get(obj);
                requestpool = s;
                if (s == null)
                {
                    requestpool = new LinkedList();
                    requestMap.put(obj, requestpool);
                }
                requestpool.add(new WeakReference(requesttype));
                return;
            }
        }
    }

    public void addBsidCookie(String s, String s1)
    {
        bsidCookie = new BasicClientCookie("bsid", s);
        bsidCookie.setDomain(s1);
        bsidCookie.setPath("/");
        addCookie(bsidCookie);
    }

    public void addCookie(Cookie cookie)
    {
        cookieStore.addCookie(cookie);
    }

    public void addSessionCookie(String s, String s1)
    {
        sessionCookie = new BasicClientCookie("sweeper_session", s);
        sessionCookie.setDomain(s1);
        sessionCookie.setPath("/");
        addCookie(sessionCookie);
    }

    public void cancelRequests(Object obj)
    {
        LinkedList linkedlist = (LinkedList)requestMap.get(obj);
        if (linkedlist == null) goto _L2; else goto _L1
_L1:
        if (linkedlist.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1 = (WeakReference)linkedlist.poll();
_L11:
        if (obj1 == null) goto _L2; else goto _L4
_L4:
        obj1 = (HttpRequest)((WeakReference) (obj1)).get();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        ((HttpRequest) (obj1)).cancelRequest();
        int i = linkedlist.size();
        if (i != 0) goto _L5; else goto _L2
_L2:
        requestMap.remove(obj);
        linkedlist = (LinkedList)requestFutureMap.get(obj);
        if (linkedlist == null) goto _L7; else goto _L6
_L6:
        if (linkedlist.size() <= 0) goto _L7; else goto _L8
_L8:
        obj1 = (WeakReference)linkedlist.poll();
_L12:
        if (obj1 == null) goto _L7; else goto _L9
_L9:
        obj1 = (Future)((WeakReference) (obj1)).get();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        ((Future) (obj1)).cancel(true);
        i = linkedlist.size();
        if (i != 0) goto _L10; else goto _L7
_L7:
        requestFutureMap.remove(obj);
        return;
_L5:
        obj1 = (WeakReference)linkedlist.poll();
          goto _L11
_L10:
        obj1 = (WeakReference)linkedlist.poll();
          goto _L12
        NoSuchElementException nosuchelementexception;
        nosuchelementexception;
          goto _L7
        nosuchelementexception;
          goto _L2
    }

    public void clearCookies()
    {
        sessionCookie = null;
        cookieStore.clear();
    }

    public void closeIdleConnections()
    {
        httpConnectionManager.closeIdleConnections(1L, TimeUnit.SECONDS);
    }

    public void get(RequestPool requestpool, Object obj, String s, HttpRequestParams httprequestparams, HttpResponseHandler httpresponsehandler)
    {
        String s1 = s;
        if (httprequestparams != null)
        {
            s1 = (new StringBuilder()).append(s).append("?").append(httprequestparams.toString()).toString();
        }
        request(requestpool, obj, s1, HttpRequest.RequestType.Get, null, httpresponsehandler);
    }

    public BasicClientCookie getBsidCookie()
    {
        return bsidCookie;
    }

    public BasicClientCookie getSessionCookie()
    {
        return sessionCookie;
    }

    public void post(RequestPool requestpool, Object obj, String s, HttpRequestParams httprequestparams, HttpResponseHandler httpresponsehandler)
    {
        request(requestpool, obj, s, HttpRequest.RequestType.Post, httprequestparams, httpresponsehandler);
    }

    public void registerSchemes()
    {
        if (!schemesRegistered)
        {
            SchemeRegistry schemeregistry = httpConnectionManager.getSchemeRegistry();
            schemeregistry.register(new Scheme("http", 80, new PlainSocketFactory()));
            schemeregistry.register(new Scheme("https", 443, SSLSocketFactory.getSocketFactory()));
            schemesRegistered = true;
        }
    }

    public void setLocaleCookie(String s, String s1)
    {
        s = new BasicClientCookie("_appLocale", s);
        s.setDomain(s1);
        s.setPath("/");
        addCookie(s);
    }

    public void setSandboxCredentials()
    {
        httpClient.getCredentialsProvider().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("wish", "$andb0x111"));
    }

    public void setTestingCredentials()
    {
        httpClient.getCredentialsProvider().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("", ""));
    }

    public void setUserAgent(String s)
    {
        HttpProtocolParams.setUserAgent(httpClient.getParams(), s);
    }

    public void setXsrfCookie(String s)
    {
        BasicClientCookie basicclientcookie = new BasicClientCookie("_xsrf", "1");
        basicclientcookie.setDomain(s);
        basicclientcookie.setPath("/");
        addCookie(basicclientcookie);
    }

}
