// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.ads.a.ac;
import com.facebook.ads.a.b;
import com.facebook.ads.a.c;
import com.facebook.ads.a.n;
import com.facebook.ads.a.w;

// Referenced classes of package com.facebook.ads:
//            AdSize

public class NativeAd extends ac
{

    private volatile boolean loadRequested;

    public NativeAd(Context context, String s)
    {
        super(context, s, AdSize.INTERSTITIAL, n.i, false);
    }

    public static void downloadAndDisplayImage(Image image, ImageView imageview)
    {
        (new w(imageview)).execute(new String[] {
            image.getUrl()
        });
    }

    public void loadAd()
    {
        if (loadRequested)
        {
            IllegalStateException illegalstateexception = new IllegalStateException("Ad already loaded");
            c.a(b.a(illegalstateexception));
            throw illegalstateexception;
        } else
        {
            loadRequested = true;
            super.loadAd();
            return;
        }
    }

    private class Image
    {

        private final int height;
        private final String url;
        private final int width;

        public static Image fromJSONObject(JSONObject jsonobject)
        {
            String s;
            if (jsonobject != null)
            {
                if ((s = jsonobject.optString("url")) != null)
                {
                    return new Image(s, jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
                }
            }
            return null;
        }

        public int getHeight()
        {
            return height;
        }

        public String getUrl()
        {
            return url;
        }

        public int getWidth()
        {
            return width;
        }

        private Image(String s, int i, int j)
        {
            url = s;
            width = i;
            height = j;
        }
    }

}
