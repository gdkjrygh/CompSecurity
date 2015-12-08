// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.v4.util.LruCache;
import com.contextlogic.wish.api.data.WishUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TransientCache
{
    private class LockedBitmapContainer
    {

        public Bitmap bitmap;
        public boolean locked;
        final TransientCache this$0;

        private LockedBitmapContainer()
        {
            this$0 = TransientCache.this;
            super();
        }

    }


    private static final int IMAGE_CACHE_SIZE = 0x200000;
    private static TransientCache _instance = new TransientCache();
    private ConcurrentHashMap cacheContents;
    private ConcurrentHashMap cachedFonts;
    private LruCache imageCache;

    private TransientCache()
    {
        cacheContents = new ConcurrentHashMap();
        cachedFonts = new ConcurrentHashMap();
        imageCache = new LruCache(0x200000) {

            final TransientCache this$0;

            protected volatile int sizeOf(Object obj, Object obj1)
            {
                return sizeOf((String)obj, (LockedBitmapContainer)obj1);
            }

            protected int sizeOf(String s, LockedBitmapContainer lockedbitmapcontainer)
            {
                return lockedbitmapcontainer.bitmap.getWidth() * lockedbitmapcontainer.bitmap.getHeight();
            }

            
            {
                this$0 = TransientCache.this;
                super(i);
            }
        };
    }

    private Typeface createFont(Context context, String s)
    {
        try
        {
            context = Typeface.createFromAsset(context.getAssets(), s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    private String getImageCacheKey(String s, int i, int j)
    {
        StringBuilder stringbuilder = new StringBuilder(s.length() + 15);
        stringbuilder.append(i);
        stringbuilder.append("#");
        stringbuilder.append(j);
        stringbuilder.append("#");
        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    public static TransientCache getInstance()
    {
        return _instance;
    }

    public void cacheFolloweeMapping(HashMap hashmap)
    {
        cacheContents.put("followee_mapping", hashmap);
    }

    public void cacheFriendInfoMapping(HashMap hashmap)
    {
        cacheContents.put("friend_info_mapping", hashmap);
    }

    public void cacheFriendMapping(HashMap hashmap)
    {
        cacheContents.put("friend_mapping", hashmap);
    }

    public void cacheGoogleFriendMapping(HashMap hashmap)
    {
        cacheContents.put("google_friend_mapping", hashmap);
    }

    public void cacheImage(String s, Bitmap bitmap, int i, int j)
    {
        LockedBitmapContainer lockedbitmapcontainer = new LockedBitmapContainer();
        lockedbitmapcontainer.bitmap = bitmap;
        lockedbitmapcontainer.locked = false;
        imageCache.put(getImageCacheKey(s, i, j), lockedbitmapcontainer);
    }

    public void cachePersonalizedTags(ArrayList arraylist, String s)
    {
        cacheContents.put((new StringBuilder()).append("personalizedtags_").append(s).toString(), arraylist);
    }

    public void cachePopularCategories(ArrayList arraylist)
    {
        cacheContents.put("popular_categories", arraylist);
    }

    public void cacheUser(WishUser wishuser)
    {
        cacheContents.put((new StringBuilder()).append("u").append(wishuser.getUserId()).toString(), wishuser);
    }

    public void clearCache()
    {
        cacheContents.clear();
        imageCache.evictAll();
    }

    public HashMap getCachedFolloweeMapping()
    {
        return (HashMap)cacheContents.get("followee_mapping");
    }

    public HashMap getCachedFriendInfoMapping()
    {
        return (HashMap)cacheContents.get("friend_info_mapping");
    }

    public HashMap getCachedFriendMapping()
    {
        return (HashMap)cacheContents.get("friend_mapping");
    }

    public HashMap getCachedGoogleFriendMapping()
    {
        return (HashMap)cacheContents.get("google_friend_mapping");
    }

    public Bitmap getCachedImage(String s, int i, int j)
    {
        Object obj = null;
        LockedBitmapContainer lockedbitmapcontainer = (LockedBitmapContainer)imageCache.get(getImageCacheKey(s, i, j));
        s = obj;
        if (lockedbitmapcontainer != null)
        {
            try
            {
                s = lockedbitmapcontainer.bitmap.copy(lockedbitmapcontainer.bitmap.getConfig(), false);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return s;
    }

    public ArrayList getCachedPersonalizedTags(String s)
    {
        return (ArrayList)cacheContents.get((new StringBuilder()).append("personalizedtags_").append(s).toString());
    }

    public ArrayList getCachedPopularCategories()
    {
        return (ArrayList)cacheContents.get("popular_categories");
    }

    public WishUser getCachedUser(String s)
    {
        return (WishUser)cacheContents.get((new StringBuilder()).append("u").append(s).toString());
    }

    public Typeface getTypefaceForStyle(Context context, int i)
    {
        Typeface typeface = (Typeface)cachedFonts.get(Integer.valueOf(i));
        Object obj = typeface;
        if (typeface == null)
        {
            if (i == 1)
            {
                context = createFont(context, "Roboto-Bold.ttf");
            } else
            if (i == 2)
            {
                context = createFont(context, "Roboto-Italic.ttf");
            } else
            if (i == 3)
            {
                context = createFont(context, "Roboto-BoldItalic.ttf");
            } else
            {
                context = createFont(context, "Roboto-Regular.ttf");
            }
            obj = context;
            if (context != null)
            {
                cachedFonts.put(Integer.valueOf(i), context);
                obj = context;
            }
        }
        return ((Typeface) (obj));
    }

    public void lockCachedImage(String s, int i, int j)
    {
        s = (LockedBitmapContainer)imageCache.get(getImageCacheKey(s, i, j));
        if (s != null)
        {
            s.locked = true;
        }
    }

    public boolean removedCachedImage(String s, int i, int j)
    {
label0:
        {
            boolean flag = true;
            s = getImageCacheKey(s, i, j);
            LockedBitmapContainer lockedbitmapcontainer = (LockedBitmapContainer)imageCache.get(s);
            if (lockedbitmapcontainer != null)
            {
                if (!lockedbitmapcontainer.locked)
                {
                    break label0;
                }
                flag = false;
            }
            return flag;
        }
        imageCache.remove(s);
        return true;
    }

    public void unlockCachedImage(String s, int i, int j)
    {
        s = (LockedBitmapContainer)imageCache.get(getImageCacheKey(s, i, j));
        if (s != null)
        {
            s.locked = false;
        }
    }

}
