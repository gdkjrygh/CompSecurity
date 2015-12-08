// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.image;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk.image:
//            DownloadImageTask

public class ImageCache
{

    private static ImageCache instance;
    private Map cache;
    private int capacity;
    private List mru;

    public ImageCache()
    {
        capacity = 20;
        cache = new HashMap(capacity);
        mru = new ArrayList();
    }

    public static ImageCache getInstance()
    {
        if (instance == null)
        {
            instance = new ImageCache();
        }
        return instance;
    }

    public void loadImage(String s, ImageView imageview)
    {
        if (cache.containsKey(s))
        {
            imageview.setImageBitmap((Bitmap)cache.get(s));
            mru.remove(s);
            mru.add(s);
            return;
        } else
        {
            (new DownloadImageTask(s, imageview)).execute(new Void[0]);
            return;
        }
    }

    public void purge()
    {
        cache.clear();
        mru.clear();
    }

    public void set(String s, Bitmap bitmap)
    {
        if (cache.containsKey(s))
        {
            cache.put(s, bitmap);
            mru.remove(s);
            mru.add(s);
            return;
        }
        if (cache.size() == capacity)
        {
            String s1 = (String)mru.get(0);
            cache.remove(s1);
            mru.remove(0);
        }
        cache.put(s, bitmap);
        mru.add(s);
    }
}
