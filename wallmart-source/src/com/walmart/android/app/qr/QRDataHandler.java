// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.walmart.android.app.qr:
//            SMILParser

public class QRDataHandler
{
    public static interface Callback
    {

        public abstract void onInitDone(int i, String s);
    }

    private class URLInitTask extends AsyncTask
    {

        final QRDataHandler this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            getData(as[0]);
            return null;
        }

        private URLInitTask()
        {
            this$0 = QRDataHandler.this;
            super();
        }

    }


    public static final int DEST_TYPE_BROWSE = 5;
    public static final int DEST_TYPE_INSTANT_VIDEO = 2;
    public static final int DEST_TYPE_ITEM_DETAILS = 6;
    public static final int DEST_TYPE_NON_WALMART = 0;
    public static final int DEST_TYPE_PRODUCT_PAGE = 1;
    public static final int DEST_TYPE_SEARCH = 4;
    public static final int DEST_TYPE_STATIC_PAGE = 3;
    public static final String TAG = com/walmart/android/app/qr/QRDataHandler.getSimpleName();
    private static final String WALMART_REDIRECT_URL = "http://wmtqr.us/getredirecturl.aspx?key=%s&src=wmtandroid";
    private static final String WALMART_SHORT_URL = "http://wmtqr.us/";
    private Callback mCallback;
    private Activity mContext;
    private String mDepartment;
    private int mDestinationType;
    private String mFinalURL;
    private Handler mHandler;
    private String mItemID;
    private String mKeyword;
    private String mMediaURL;

    public QRDataHandler(Activity activity)
    {
        mHandler = new Handler();
        mContext = activity;
    }

    private void getData(String s)
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        defaulthttpclient.setRedirectHandler(new RedirectHandler() {

            final QRDataHandler this$0;

            public URI getLocationURI(HttpResponse httpresponse, HttpContext httpcontext)
                throws ProtocolException
            {
                return null;
            }

            public boolean isRedirectRequested(HttpResponse httpresponse, HttpContext httpcontext)
            {
                return handleRedirect(httpresponse);
            }

            
            {
                this$0 = QRDataHandler.this;
                super();
            }
        });
        setUserAgent(defaulthttpclient, mContext);
        HttpGet httpget = new HttpGet();
        try
        {
            httpget.setURI(new URI(s));
            defaulthttpclient.execute(httpget);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    private void getSMILData(String s)
    {
        if (s != null && s.toLowerCase().endsWith(".smil"))
        {
            Services.get().getWalmartService().getStringFromURL(s, new AsyncCallbackOnThread(mHandler) {

                final QRDataHandler this$0;

                public void onFailureSameThread(Integer integer, String s1)
                {
                    Log.e(QRDataHandler.TAG, "Failed to retrieve SMIL data");
                    mCallback.onInitDone(1, null);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (String)obj1);
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((String)obj);
                }

                public void onSuccessSameThread(String s1)
                {
                    s1 = new SMILParser(s1);
                    mMediaURL = s1.getAppropriateMediaURL(mContext);
                    if (mItemID != null)
                    {
                        mCallback.onInitDone(1, null);
                        return;
                    } else
                    {
                        mCallback.onInitDone(2, null);
                        return;
                    }
                }

            
            {
                this$0 = QRDataHandler.this;
                super(handler);
            }
            });
            return;
        } else
        {
            Log.e(TAG, (new StringBuilder()).append("Invalid SMIL URL: ").append(s).toString());
            mCallback.onInitDone(1, null);
            return;
        }
    }

    public static String getTag()
    {
        return TAG;
    }

    private boolean handleRedirect(HttpResponse httpresponse)
    {
        httpresponse.getAllHeaders();
        httpresponse = httpresponse.getFirstHeader("Location");
        final Object url;
        if (httpresponse != null)
        {
            httpresponse = httpresponse.getValue();
            for (url = ""; httpresponse.length() != ((String) (url)).length(); httpresponse = URLDecoder.decode(httpresponse))
            {
                url = httpresponse;
            }

        } else
        {
            Log.w(TAG, "handleRedirect() unable to find location header!");
            url = null;
        }
        if (url != null)
        {
            mFinalURL = ((String) (url));
            if (((String) (url)).matches("http://mobile(-e[0-9])?\\.walmart\\.com.*"))
            {
                mHandler.post(new Runnable() {

                    final QRDataHandler this$0;
                    final String val$url;

                    public void run()
                    {
                        parseFinalURL(url);
                    }

            
            {
                this$0 = QRDataHandler.this;
                url = s;
                super();
            }
                });
            } else
            {
                mHandler.post(new Runnable() {

                    final QRDataHandler this$0;
                    final String val$url;

                    public void run()
                    {
                        mCallback.onInitDone(0, url);
                    }

            
            {
                this$0 = QRDataHandler.this;
                url = s;
                super();
            }
                });
            }
        } else
        {
            mHandler.post(new Runnable() {

                final QRDataHandler this$0;

                public void run()
                {
                    mCallback.onInitDone(0, null);
                }

            
            {
                this$0 = QRDataHandler.this;
                super();
            }
            });
        }
        return false;
    }

    private void parseFinalURL(String s)
    {
        Object obj;
        String as1[] = s.split("&");
        Object obj1 = new HashMap();
        int j = as1.length;
        int i = 0;
        while (i < j) 
        {
            String s4 = as1[i];
            String as[] = null;
            int k = s4.indexOf("=");
            if (k != -1)
            {
                as = new String[2];
                as[0] = s4.substring(0, k);
                as[1] = s4.substring(k + 1, s4.length());
            }
            if (as != null)
            {
                String s5 = as[0];
                String s1 = as[1];
                ((HashMap) (obj1)).put(s5, s1);
                if (s5.endsWith("itemId"))
                {
                    mItemID = s1.trim();
                } else
                if (s5.endsWith("/androidVideoUrl"))
                {
                    ((HashMap) (obj1)).put("videoUrl", s1);
                }
            }
            i++;
        }
        mDepartment = (String)((HashMap) (obj1)).get("department");
        mKeyword = (String)((HashMap) (obj1)).get("keyword");
        String s2 = (String)((HashMap) (obj1)).get("androidVideoUrl");
        obj = s2;
        if (s2 == null)
        {
            obj1 = (String)((HashMap) (obj1)).get("videoUrl");
            obj = s2;
            if (obj1 != null)
            {
                obj = ((String) (obj1)).replace("http://walmartcomsmil", "http://walmartcomandroid");
            }
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        byte byte0;
        byte byte1;
        byte1 = 3;
        s = Uri.parse(s);
        obj = s.getPathSegments();
        byte0 = byte1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        byte0 = byte1;
        if (((List) (obj)).size() <= 0) goto _L4; else goto _L5
_L5:
        String s3 = (String)((List) (obj)).get(((List) (obj)).size() - 1);
        if (!"searchr".equals(s3)) goto _L7; else goto _L6
_L6:
        obj = s.getQueryParameter("search_url");
        s = s.getQueryParameter("search_query");
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L9; else goto _L8
_L8:
        mKeyword = ((String) (obj));
        byte0 = 5;
_L4:
        mCallback.onInitDone(byte0, null);
        return;
_L9:
        byte0 = byte1;
        if (!TextUtils.isEmpty(s))
        {
            mKeyword = s;
            byte0 = 4;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        byte0 = byte1;
        if (((List) (obj)).size() > 1)
        {
            byte0 = byte1;
            if ("ip".equals(((List) (obj)).get(((List) (obj)).size() - 2)))
            {
                mItemID = s3;
                byte0 = 6;
            }
        }
        if (true) goto _L4; else goto _L2
_L2:
        getSMILData(((String) (obj)));
        return;
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

    public String getDepartment()
    {
        return mDepartment;
    }

    public int getDestionationType()
    {
        return mDestinationType;
    }

    public String getItemID()
    {
        return mItemID;
    }

    public String getKeyword()
    {
        return mKeyword;
    }

    public String getMediaURL()
    {
        return mMediaURL;
    }

    public String getProductURL()
    {
        return mFinalURL;
    }

    public void init(String s, Callback callback)
    {
        mCallback = callback;
        if (s.startsWith("http://wmtqr.us/"))
        {
            s = String.format("http://wmtqr.us/getredirecturl.aspx?key=%s&src=wmtandroid", new Object[] {
                s.substring("http://wmtqr.us/".length(), s.length())
            });
        }
        (new URLInitTask()).execute(new String[] {
            s
        });
    }







/*
    static String access$502(QRDataHandler qrdatahandler, String s)
    {
        qrdatahandler.mMediaURL = s;
        return s;
    }

*/


}
