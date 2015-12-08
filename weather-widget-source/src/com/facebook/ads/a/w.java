// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.facebook.ads.a:
//            p, x

public class w extends AsyncTask
{

    private static final String a = com/facebook/ads/a/w.getSimpleName();
    private final ImageView b;
    private x c;

    public w(ImageView imageview)
    {
        b = imageview;
    }

    protected transient Bitmap a(String as[])
    {
        Object obj;
        String s;
        s = as[0];
        as = p.b();
        obj = new HttpGet(s);
        obj = as.execute(((org.apache.http.client.methods.HttpUriRequest) (obj))).getEntity();
        as = EntityUtils.toByteArray(((HttpEntity) (obj)));
        as = BitmapFactory.decodeByteArray(as, 0, as.length);
        ((HttpEntity) (obj)).consumeContent();
        return as;
        Exception exception;
        exception;
        as = null;
_L2:
        Log.e(a, (new StringBuilder()).append("Error downloading image: ").append(s).toString(), exception);
        return as;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public w a(x x1)
    {
        c = x1;
        return this;
    }

    protected void a(Bitmap bitmap)
    {
        b.setImageBitmap(bitmap);
        if (c != null)
        {
            c.d();
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }

}
