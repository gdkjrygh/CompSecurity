// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import com.walmart.android.utils.HttpUtils;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.walmart.android.service:
//            DataCache, JobRunner, Utils, CancellableRunnable, 
//            AsyncCallback

public class HTTPService
{
    private static interface DownloadImage
    {

        public abstract Object convertToReturnType(Object obj);

        public abstract Object processData(byte abyte0[]);
    }

    private static class MySSLSocketFactory extends SSLSocketFactory
    {

        SSLContext sslContext;

        public Socket createSocket()
            throws IOException
        {
            return sslContext.getSocketFactory().createSocket();
        }

        public Socket createSocket(Socket socket, String s, int i, boolean flag)
            throws IOException, UnknownHostException
        {
            return sslContext.getSocketFactory().createSocket(socket, s, i, flag);
        }

        public MySSLSocketFactory(KeyStore keystore)
            throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
        {
            super(keystore);
            sslContext = SSLContext.getInstance("TLS");
            keystore = new _cls1();
            sslContext.init(null, new TrustManager[] {
                keystore
            }, null);
        }
    }


    private static final int MAX_IMAGE_JOBS = 50;
    private static final String TAG = com/walmart/android/service/HTTPService.getSimpleName();
    final Runnable mAddJobRunnable = new Runnable() {

        final HTTPService this$0;

        public void run()
        {
            mImageJobRunner.addJob(mCacheCleaner);
        }

            
            {
                this$0 = HTTPService.this;
                super();
            }
    };
    private final String mBaseURL;
    private final String mBaseURLSecure;
    private final android.graphics.BitmapFactory.Options mBitmapOptions = new android.graphics.BitmapFactory.Options();
    private final CancellableRunnable mCacheCleaner = new CancellableRunnable() {

        private boolean once;
        final HTTPService this$0;

        public boolean cancel()
        {
            return false;
        }

        public void run()
        {
            if (!once)
            {
                mImageCache.cleanup();
                once = true;
            } else
            {
                mImageCache.cleanupIfLargerThan(0x500000L);
            }
            if (Utils.isInForeground(mContext))
            {
                scheduleNewCacheCleaning();
            }
        }

            
            {
                this$0 = HTTPService.this;
                super();
            }
    };
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private final HttpClient mHttpImageClient;
    private final DataCache mImageCache;
    private final JobRunner mImageJobRunner = new JobRunner(50);

    public HTTPService(String s, String s1, Context context)
    {
        mContext = context;
        mBitmapOptions.inDither = false;
        mBaseURL = s;
        mBaseURLSecure = s1;
        mHttpImageClient = createHttpClient(context);
        mImageCache = new DataCache(context.getApplicationContext(), "images");
        mImageJobRunner.start();
        mImageJobRunner.addJob(mCacheCleaner);
    }

    public static HttpClient createHttpClient(Context context)
    {
        return createHttpClient(context, 7000, 20000);
    }

    public static HttpClient createHttpClient(Context context, int i, int j)
    {
        Object obj1 = new Scheme("http", PlainSocketFactory.getSocketFactory(), 80);
        Scheme scheme = new Scheme("https", SSLSocketFactory.getSocketFactory(), 443);
        Object obj = new SchemeRegistry();
        ((SchemeRegistry) (obj)).register(((Scheme) (obj1)));
        ((SchemeRegistry) (obj)).register(scheme);
        obj1 = new BasicHttpParams();
        if (i > 0)
        {
            HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj1)), i);
        }
        if (j > 0)
        {
            HttpConnectionParams.setSoTimeout(((HttpParams) (obj1)), j);
        }
        obj = new DefaultHttpClient(new ThreadSafeClientConnManager(((HttpParams) (obj1)), ((SchemeRegistry) (obj))), ((HttpParams) (obj1)));
        setUserAgent(((HttpClient) (obj)), context);
        return ((HttpClient) (obj));
    }

    public static HttpClient createUnsecureHTTPClient(Context context)
    {
        return createUnsecureHTTPClient(context, 7000);
    }

    public static HttpClient createUnsecureHTTPClient(Context context, int i)
    {
        Object obj;
        try
        {
            obj = KeyStore.getInstance(KeyStore.getDefaultType());
            ((KeyStore) (obj)).load(null, null);
            obj = new MySSLSocketFactory(((KeyStore) (obj)));
            ((SSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            BasicHttpParams basichttpparams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basichttpparams, i);
            HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basichttpparams, "UTF-8");
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
            obj = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            exception = new DefaultHttpClient();
        }
        setUserAgent(((HttpClient) (obj)), context);
        return ((HttpClient) (obj));
    }

    private void downloadImage(final String imageURL, final long expiry, final DownloadImage downloadImage, final AsyncCallback asyncCallback)
    {
        imageURL = new CancellableRunnable() {

            final HTTPService this$0;
            final AsyncCallback val$asyncCallback;
            final DownloadImage val$downloadImage;
            final long val$expiry;
            final String val$imageURL;

            public boolean cancel()
            {
                asyncCallback.onFailure(Integer.valueOf(0), null);
                return true;
            }

            public void run()
            {
                String s = Uri.encode(imageURL);
                byte abyte1[] = mImageCache.getData(s);
                boolean flag = false;
                byte abyte0[] = abyte1;
                if (abyte1 == null)
                {
                    abyte0 = getDataFromURL(imageURL);
                    flag = true;
                }
                if (abyte0 != null)
                {
                    Object obj = downloadImage.processData(abyte0);
                    if (obj != null)
                    {
                        asyncCallback.onSuccess(downloadImage.convertToReturnType(obj));
                        if (flag)
                        {
                            mImageCache.cacheData(s, abyte0, expiry);
                            scheduleNewCacheCleaning();
                        }
                        return;
                    } else
                    {
                        asyncCallback.onFailure(Integer.valueOf(0), null);
                        return;
                    }
                } else
                {
                    asyncCallback.onFailure(Integer.valueOf(0), null);
                    return;
                }
            }

            
            {
                this$0 = HTTPService.this;
                imageURL = s;
                downloadImage = downloadimage;
                asyncCallback = asynccallback;
                expiry = l;
                super();
            }
        };
        mImageJobRunner.addJob(imageURL);
    }

    private byte[] getDataFromURL(String s)
    {
        java.io.InputStream inputstream;
        java.io.InputStream inputstream1;
        String s1;
        java.io.InputStream inputstream2;
        String s2;
        java.io.InputStream inputstream3;
        String s3;
        java.io.InputStream inputstream4;
        String s4;
        java.io.InputStream inputstream5;
        byte abyte0[];
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String s6;
        StringBuilder stringbuilder;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj = null;
        if (s == null || "".equals(s.trim()))
        {
            return null;
        }
        abyte0 = null;
        obj5 = null;
        s6 = null;
        stringbuilder = null;
        inputstream1 = null;
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = abyte0;
        s3 = obj3;
        inputstream4 = obj5;
        s4 = obj4;
        inputstream5 = s6;
        inputstream = stringbuilder;
        Object obj6 = new HttpGet(s);
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = abyte0;
        s3 = obj3;
        inputstream4 = obj5;
        s4 = obj4;
        inputstream5 = s6;
        inputstream = stringbuilder;
        System.currentTimeMillis();
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = abyte0;
        s3 = obj3;
        inputstream4 = obj5;
        s4 = obj4;
        inputstream5 = s6;
        inputstream = stringbuilder;
        obj6 = mHttpImageClient.execute(((HttpUriRequest) (obj6)));
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = abyte0;
        s3 = obj3;
        inputstream4 = obj5;
        s4 = obj4;
        inputstream5 = s6;
        inputstream = stringbuilder;
        System.currentTimeMillis();
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = abyte0;
        s3 = obj3;
        inputstream4 = obj5;
        s4 = obj4;
        inputstream5 = s6;
        inputstream = stringbuilder;
        inputstream1 = ((HttpResponse) (obj6)).getEntity().getContent();
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = inputstream1;
        s3 = obj3;
        inputstream4 = inputstream1;
        s4 = obj4;
        inputstream5 = inputstream1;
        inputstream = inputstream1;
        abyte0 = IOUtils.toByteArray(inputstream1);
        s = abyte0;
_L6:
        s1 = s;
        inputstream2 = inputstream1;
        s2 = s;
        inputstream3 = inputstream1;
        s3 = s;
        inputstream4 = inputstream1;
        s4 = s;
        inputstream5 = inputstream1;
        inputstream = inputstream1;
        System.currentTimeMillis();
        Utils.closeQuietly(inputstream1);
_L3:
        return s;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = inputstream1;
        s3 = obj3;
        inputstream4 = inputstream1;
        s4 = obj4;
        inputstream5 = inputstream1;
        inputstream = inputstream1;
        long l = ((HttpResponse) (obj6)).getEntity().getContentLength();
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = inputstream1;
        s3 = obj3;
        inputstream4 = inputstream1;
        s4 = obj4;
        inputstream5 = inputstream1;
        inputstream = inputstream1;
        s6 = TAG;
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = inputstream1;
        s3 = obj3;
        inputstream4 = inputstream1;
        s4 = obj4;
        inputstream5 = inputstream1;
        inputstream = inputstream1;
        stringbuilder = (new StringBuilder()).append("Failed to read");
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        String s5 = "";
_L4:
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = inputstream1;
        s3 = obj3;
        inputstream4 = inputstream1;
        s4 = obj4;
        inputstream5 = inputstream1;
        inputstream = inputstream1;
        WLog.e(s6, stringbuilder.append(s5).append(" data from ").append(s).toString(), outofmemoryerror);
        s = obj;
        continue; /* Loop/switch isn't completed */
        s;
        inputstream = inputstream2;
        s.printStackTrace();
        Utils.closeQuietly(inputstream2);
        s = s1;
          goto _L3
_L2:
        s1 = obj1;
        inputstream2 = inputstream1;
        s2 = obj2;
        inputstream3 = inputstream1;
        s3 = obj3;
        inputstream4 = inputstream1;
        s4 = obj4;
        inputstream5 = inputstream1;
        inputstream = inputstream1;
        s5 = (new StringBuilder()).append(" (").append(l).append(" bytes of)").toString();
          goto _L4
        s;
        inputstream = inputstream3;
        s.printStackTrace();
        Utils.closeQuietly(inputstream3);
        s = s2;
          goto _L3
        s;
        inputstream = inputstream4;
        s.printStackTrace();
        Utils.closeQuietly(inputstream4);
        s = s3;
          goto _L3
        s;
        inputstream = inputstream5;
        s.printStackTrace();
        Utils.closeQuietly(inputstream5);
        s = s4;
          goto _L3
        s;
        Utils.closeQuietly(inputstream);
        throw s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void scheduleNewCacheCleaning()
    {
        mHandler.removeCallbacks(mAddJobRunnable);
        mHandler.postDelayed(mAddJobRunnable, 60000L);
    }

    private static void setUserAgent(HttpClient httpclient, Context context)
    {
        String s = "?";
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = s;
        }
        httpclient.getParams().setParameter("http.useragent", (new StringBuilder()).append("Android v").append(context).toString());
    }

    public transient HttpUriRequest createRequest(String s, String s1, String as[])
    {
        s = (new StringBuilder(mBaseURL)).append(s).append(s1);
        if (as != null)
        {
            int j = 1;
            int k = as.length;
            for (int i = 0; i < k; i++)
            {
                s1 = as[i];
                s.append("&p").append(j).append("=").append(Uri.encode(s1));
                j++;
            }

        }
        return new HttpGet(s.toString());
    }

    public HttpUriRequest createSecureHttpGetRequest(String s, String s1, Map map)
    {
        return HttpUtils.createGetRequest((new StringBuilder()).append(mBaseURLSecure).append(s).append(s1).toString(), map);
    }

    public HttpUriRequest createSecureHttpPostRequest(String s, String s1, Map map)
    {
        return HttpUtils.createPostRequest((new StringBuilder()).append(mBaseURLSecure).append(s).append(s1).toString(), map);
    }

    public HttpUriRequest createSecureHttpPutRequest(String s, String s1, Map map)
    {
        return HttpUtils.createPutRequest((new StringBuilder()).append(mBaseURLSecure).append(s).append(s1).toString(), map);
    }

    public transient HttpUriRequest createSecureRequest(String s, String s1, String as[])
    {
        s = new HttpPost((new StringBuilder()).append(mBaseURLSecure).append(s).append(s1).toString());
        if (as == null)
        {
            return s;
        }
        s1 = new ArrayList();
        int j = 1;
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s2 = as[i];
            s1.add(new BasicNameValuePair((new StringBuilder()).append("p").append(j).toString(), s2));
            j++;
        }

        try
        {
            s.setEntity(new UrlEncodedFormEntity(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return s;
        }
        return s;
    }

    public void downloadImageToStream(final String imageURL, long l, final OutputStream out, AsyncCallback asynccallback)
    {
        downloadImage(imageURL, l, new DownloadImage() {

            final HTTPService this$0;
            final String val$imageURL;
            final OutputStream val$out;

            public volatile Object convertToReturnType(Object obj)
            {
                return convertToReturnType((Boolean)obj);
            }

            public Void convertToReturnType(Boolean boolean1)
            {
                return null;
            }

            public Boolean processData(byte abyte0[])
            {
                try
                {
                    IOUtils.write(abyte0, out);
                }
                catch (IOException ioexception)
                {
                    WLog.e(HTTPService.TAG, (new StringBuilder()).append("Failed to write (").append(abyte0.length).append(" bytes of) image data from ").append(imageURL).toString(), ioexception);
                    return null;
                }
                return Boolean.valueOf(true);
            }

            public volatile Object processData(byte abyte0[])
            {
                return processData(abyte0);
            }

            
            {
                this$0 = HTTPService.this;
                out = outputstream;
                imageURL = s;
                super();
            }
        }, asynccallback);
    }

    public HttpClient getHttpImageClient()
    {
        return mHttpImageClient;
    }

    public void getImage(final String imageURL, long l, AsyncCallback asynccallback)
    {
        downloadImage(imageURL, l, new DownloadImage() {

            final HTTPService this$0;
            final String val$imageURL;

            public Bitmap convertToReturnType(Bitmap bitmap)
            {
                return bitmap;
            }

            public volatile Object convertToReturnType(Object obj)
            {
                return convertToReturnType((Bitmap)obj);
            }

            public Bitmap processData(byte abyte0[])
            {
                Bitmap bitmap;
                try
                {
                    bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, mBitmapOptions);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    WLog.e(HTTPService.TAG, (new StringBuilder()).append("Failed to decode (").append(abyte0.length).append(" bytes of) image data from ").append(imageURL).toString(), outofmemoryerror);
                    return null;
                }
                return bitmap;
            }

            public volatile Object processData(byte abyte0[])
            {
                return processData(abyte0);
            }

            
            {
                this$0 = HTTPService.this;
                imageURL = s;
                super();
            }
        }, asynccallback);
    }

    public Bitmap getImageFromURL(String s)
    {
        java.io.InputStream inputstream;
        java.io.InputStream inputstream1;
        java.io.InputStream inputstream2;
        java.io.InputStream inputstream3;
        String s1;
        String s2;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        if (s == null || "".equals(s.trim()))
        {
            return null;
        }
        obj2 = null;
        obj3 = null;
        obj1 = null;
        obj5 = new HttpGet(s);
        obj = null;
        obj4 = null;
        inputstream1 = null;
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = ((java.io.InputStream) (obj));
        inputstream = obj4;
        System.currentTimeMillis();
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = ((java.io.InputStream) (obj));
        inputstream = obj4;
        obj5 = mHttpImageClient.execute(((HttpUriRequest) (obj5)));
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = ((java.io.InputStream) (obj));
        inputstream = obj4;
        System.currentTimeMillis();
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = ((java.io.InputStream) (obj));
        inputstream = obj4;
        inputstream1 = ((HttpResponse) (obj5)).getEntity().getContent();
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = inputstream1;
        inputstream = inputstream1;
        obj = BitmapFactory.decodeStream(inputstream1, null, mBitmapOptions);
        s = ((String) (obj));
_L5:
        s1 = s;
        inputstream2 = inputstream1;
        s2 = s;
        inputstream3 = inputstream1;
        inputstream = inputstream1;
        System.currentTimeMillis();
        Utils.closeQuietly(inputstream1);
        return s;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = inputstream1;
        inputstream = inputstream1;
        long l = ((HttpResponse) (obj5)).getEntity().getContentLength();
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = inputstream1;
        inputstream = inputstream1;
        obj5 = TAG;
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = inputstream1;
        inputstream = inputstream1;
        StringBuilder stringbuilder = (new StringBuilder()).append("Failed to decode");
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        obj = "";
_L3:
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = inputstream1;
        inputstream = inputstream1;
        WLog.e(((String) (obj5)), stringbuilder.append(((String) (obj))).append(" image data from ").append(s).toString(), outofmemoryerror);
        s = obj1;
        continue; /* Loop/switch isn't completed */
        s;
        inputstream = inputstream2;
        s.printStackTrace();
        Utils.closeQuietly(inputstream2);
        return s1;
_L2:
        s1 = obj2;
        inputstream2 = inputstream1;
        s2 = obj3;
        inputstream3 = inputstream1;
        inputstream = inputstream1;
        obj = (new StringBuilder()).append(" (").append(l).append(" bytes of)").toString();
          goto _L3
        s;
        inputstream = inputstream3;
        s.printStackTrace();
        Utils.closeQuietly(inputstream3);
        return s2;
        s;
        Utils.closeQuietly(inputstream);
        throw s;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void getImageOld(final String imageURL, final long expiry, final AsyncCallback asyncCallback)
    {
        imageURL = new CancellableRunnable() {

            final HTTPService this$0;
            final AsyncCallback val$asyncCallback;
            final long val$expiry;
            final String val$imageURL;

            public boolean cancel()
            {
                asyncCallback.onFailure(Integer.valueOf(0), null);
                return true;
            }

            public void run()
            {
                String s = Uri.encode(imageURL);
                Bitmap bitmap1 = mImageCache.getImage(s);
                boolean flag = false;
                Bitmap bitmap = bitmap1;
                if (bitmap1 == null)
                {
                    bitmap = getImageFromURL(imageURL);
                    flag = true;
                }
                if (bitmap != null)
                {
                    asyncCallback.onSuccess(bitmap);
                    if (flag)
                    {
                        mImageCache.cacheImage(s, bitmap, expiry);
                        scheduleNewCacheCleaning();
                    }
                    return;
                } else
                {
                    asyncCallback.onFailure(Integer.valueOf(0), null);
                    return;
                }
            }

            
            {
                this$0 = HTTPService.this;
                imageURL = s;
                asyncCallback = asynccallback;
                expiry = l;
                super();
            }
        };
        mImageJobRunner.addJob(imageURL);
    }










    // Unreferenced inner class com/walmart/android/service/HTTPService$MySSLSocketFactory$1

/* anonymous class */
    class MySSLSocketFactory._cls1
        implements X509TrustManager
    {

        final MySSLSocketFactory this$0;

        public void checkClientTrusted(X509Certificate ax509certificate[], String s)
            throws CertificateException
        {
        }

        public void checkServerTrusted(X509Certificate ax509certificate[], String s)
            throws CertificateException
        {
        }

        public X509Certificate[] getAcceptedIssuers()
        {
            return null;
        }

            
            {
                this$0 = MySSLSocketFactory.this;
                super();
            }
    }

}
