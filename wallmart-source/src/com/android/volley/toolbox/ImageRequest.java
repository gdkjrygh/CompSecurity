// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

// Referenced classes of package com.android.volley.toolbox:
//            HttpHeaderParser

public class ImageRequest extends Request
{

    private static final float IMAGE_BACKOFF_MULT = 2F;
    private static final int IMAGE_MAX_RETRIES = 2;
    private static final int IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final android.graphics.Bitmap.Config mDecodeConfig;
    private final com.android.volley.Response.Listener mListener;
    private final int mMaxHeight;
    private final int mMaxWidth;

    public ImageRequest(String s, com.android.volley.Response.Listener listener, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.Response.ErrorListener errorlistener)
    {
        super(0, s, errorlistener);
        setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0F));
        mListener = listener;
        mDecodeConfig = config;
        mMaxWidth = i;
        mMaxHeight = j;
    }

    private Response doParse(NetworkResponse networkresponse)
    {
        Object obj = networkresponse.data;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (mMaxWidth == 0 && mMaxHeight == 0)
        {
            options.inPreferredConfig = mDecodeConfig;
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
        } else
        {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            int i = options.outWidth;
            int j = options.outHeight;
            int k = getResizedDimension(mMaxWidth, mMaxHeight, i, j);
            int l = getResizedDimension(mMaxHeight, mMaxWidth, j, i);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i, j, k, l);
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            if (obj != null && (((Bitmap) (obj)).getWidth() > k || ((Bitmap) (obj)).getHeight() > l))
            {
                Bitmap bitmap = Bitmap.createScaledBitmap(((Bitmap) (obj)), k, l, true);
                ((Bitmap) (obj)).recycle();
                obj = bitmap;
            }
        }
        if (obj == null)
        {
            return Response.error(new ParseError(networkresponse));
        } else
        {
            return Response.success(obj, HttpHeaderParser.parseCacheHeaders(networkresponse));
        }
    }

    static int findBestSampleSize(int i, int j, int k, int l)
    {
        double d = Math.min((double)i / (double)k, (double)j / (double)l);
        float f;
        for (f = 1.0F; (double)(2.0F * f) <= d; f *= 2.0F) { }
        return (int)f;
    }

    private static int getResizedDimension(int i, int j, int k, int l)
    {
        if (i == 0 && j == 0)
        {
            return k;
        }
        if (i == 0)
        {
            double d = (double)j / (double)l;
            return (int)((double)k * d);
        }
        if (j == 0)
        {
            return i;
        }
        double d1 = (double)l / (double)k;
        k = i;
        if ((double)i * d1 > (double)j)
        {
            k = (int)((double)j / d1);
        }
        return k;
    }

    protected void deliverResponse(Bitmap bitmap)
    {
        mListener.onResponse(bitmap);
    }

    protected volatile void deliverResponse(Object obj)
    {
        deliverResponse((Bitmap)obj);
    }

    public com.android.volley.Request.Priority getPriority()
    {
        return com.android.volley.Request.Priority.LOW;
    }

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        obj;
        JVM INSTR monitorenter ;
        Response response;
        synchronized (sDecodeLock)
        {
            response = doParse(networkresponse);
        }
        return response;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        VolleyLog.e("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(networkresponse.data.length), getUrl()
        });
        networkresponse = Response.error(new ParseError(outofmemoryerror));
        obj;
        JVM INSTR monitorexit ;
        return networkresponse;
        networkresponse;
        obj;
        JVM INSTR monitorexit ;
        throw networkresponse;
    }

}
