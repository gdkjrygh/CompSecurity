// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.mixpanel.android.mpmetrics.MPConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewSnapshot, UIThreadSet

private static class 
    implements Callable
{

    private final mLiveActivities mCachedBitmap = new nit>();
    private final int mClientDensity = 160;
    private final DisplayMetrics mDisplayMetrics = new DisplayMetrics();
    private UIThreadSet mLiveActivities;
    private final List mRootViews = new ArrayList();

    private void takeScreenshot( )
    {
        Object obj;
        Boolean boolean1;
        Boolean boolean2;
        Object obj1;
        View view;
        view = .otView;
        boolean1 = null;
        float f;
        float f1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            obj = android/view/View.getDeclaredMethod("createSnapshot", new Class[] {
                android/graphics/Bitmap$Config, Integer.TYPE, Boolean.TYPE
            });
            ((Method) (obj)).setAccessible(true);
            obj = (Bitmap)((Method) (obj)).invoke(view, new Object[] {
                android.graphics..RootViewInfo.rootView, Integer.valueOf(-1), Boolean.valueOf(false)
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            obj = boolean1;
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.Snapshot", "Can't call createSnapshot, will use drawCache", nosuchmethodexception);
                obj = boolean1;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.d("MixpanelAPI.Snapshot", "Can't call createSnapshot with arguments", ((Throwable) (obj)));
            obj = boolean1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.Snapshot", "Exception when calling createSnapshot", ((Throwable) (obj)));
            obj = boolean1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.Snapshot", "Can't access createSnapshot, using drawCache", ((Throwable) (obj)));
            obj = boolean1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.Snapshot", "createSnapshot didn't return a bitmap?", ((Throwable) (obj)));
            obj = boolean1;
        }
        boolean1 = null;
        boolean2 = null;
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        boolean2 = Boolean.valueOf(view.isDrawingCacheEnabled());
        boolean1 = boolean2;
        view.setDrawingCacheEnabled(true);
        boolean1 = boolean2;
        view.buildDrawingCache(true);
        boolean1 = boolean2;
        try
        {
            obj1 = view.getDrawingCache();
        }
        catch (RuntimeException runtimeexception)
        {
            nosuchmethodexception = boolean1;
            obj1 = obj;
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.Snapshot", (new StringBuilder("Can't take a bitmap snapshot of view ")).append(view).append(", skipping for now.").toString(), runtimeexception);
                nosuchmethodexception = boolean1;
                obj1 = obj;
            }
        }
        f = 1.0F;
        f1 = f;
        if (obj1 != null)
        {
            i = ((Bitmap) (obj1)).getDensity();
            if (i != 0)
            {
                f = 160F / (float)i;
            }
            i = ((Bitmap) (obj1)).getWidth();
            j = ((Bitmap) (obj1)).getHeight();
            k = (int)((double)((float)((Bitmap) (obj1)).getWidth() * f) + 0.5D);
            l = (int)((double)((float)((Bitmap) (obj1)).getHeight() * f) + 0.5D);
            f1 = f;
            if (i > 0)
            {
                f1 = f;
                if (j > 0)
                {
                    f1 = f;
                    if (k > 0)
                    {
                        f1 = f;
                        if (l > 0)
                        {
                            mCachedBitmap.create(k, l, 160, ((Bitmap) (obj1)));
                            f1 = f;
                        }
                    }
                }
            }
        }
        if (boolean2 != null && !boolean2.booleanValue())
        {
            view.setDrawingCacheEnabled(false);
        }
        .ale = f1;
        .reenshot = mCachedBitmap;
        return;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        Iterator iterator;
        mRootViews.clear();
        iterator = mLiveActivities.getAll().iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = mRootViews.size();
        i = 0;
_L4:
        if (i >= j)
        {
            return mRootViews;
        }
        break MISSING_BLOCK_LABEL_128;
_L2:
        Object obj = (Activity)iterator.next();
        String s = obj.getClass().getCanonicalName();
        View view = ((Activity) (obj)).getWindow().getDecorView().getRootView();
        ((Activity) (obj)).getWindowManager().getDefaultDisplay().getMetrics(mDisplayMetrics);
        obj = new nit>(s, view);
        mRootViews.add(obj);
          goto _L3
        takeScreenshot((takeScreenshot)mRootViews.get(i));
        i++;
          goto _L4
    }

    public void findInActivities(UIThreadSet uithreadset)
    {
        mLiveActivities = uithreadset;
    }

    public ()
    {
    }
}
