// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.Log;
import android.util.LruCache;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.mixpanel.android.mpmetrics.MPConfig;
import com.mixpanel.android.mpmetrics.ResourceIds;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            PropertyDescription, Caller, UIThreadSet

class ViewSnapshot
{
    private static class CachedBitmap
    {

        private Bitmap mCached;
        private final Paint mPaint = new Paint(2);

        public void recreate(int i, int j, int k, Bitmap bitmap)
        {
            this;
            JVM INSTR monitorenter ;
            if (mCached == null || mCached.getWidth() != i) goto _L2; else goto _L1
_L1:
            int l = mCached.getHeight();
            if (l == j) goto _L3; else goto _L2
_L2:
            mCached = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.RGB_565);
_L4:
            if (mCached != null)
            {
                mCached.setDensity(k);
            }
_L3:
            if (mCached != null)
            {
                (new Canvas(mCached)).drawBitmap(bitmap, 0.0F, 0.0F, mPaint);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            OutOfMemoryError outofmemoryerror;
            outofmemoryerror;
            mCached = null;
              goto _L4
            bitmap;
            throw bitmap;
        }

        public void writeBitmapJSON(android.graphics.Bitmap.CompressFormat compressformat, int i, OutputStream outputstream)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (mCached != null && mCached.getWidth() != 0 && mCached.getHeight() != 0) goto _L2; else goto _L1
_L1:
            outputstream.write("null".getBytes());
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            outputstream.write(34);
            compressformat = new Base64OutputStream(outputstream, 2);
            mCached.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, compressformat);
            compressformat.flush();
            outputstream.write(34);
            if (true) goto _L4; else goto _L3
_L3:
            compressformat;
            throw compressformat;
        }

        public CachedBitmap()
        {
            mCached = null;
        }
    }

    private static class ClassNameCache extends LruCache
    {

        protected volatile Object create(Object obj)
        {
            return create((Class)obj);
        }

        protected String create(Class class1)
        {
            return class1.getCanonicalName();
        }

        public ClassNameCache(int i)
        {
            super(i);
        }
    }

    private static class RootViewFinder
        implements Callable
    {

        private final CachedBitmap mCachedBitmap = new CachedBitmap();
        private final int mClientDensity = 160;
        private final DisplayMetrics mDisplayMetrics = new DisplayMetrics();
        private UIThreadSet mLiveActivities;
        private final List mRootViews = new ArrayList();

        private void takeScreenshot(RootViewInfo rootviewinfo)
        {
            Object obj;
            Boolean boolean1;
            Boolean boolean2;
            Object obj1;
            View view;
            view = rootviewinfo.rootView;
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
                    android.graphics.Bitmap.Config.RGB_565, Integer.valueOf(-1), Boolean.valueOf(false)
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
                                mCachedBitmap.recreate(k, l, 160, ((Bitmap) (obj1)));
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
            rootviewinfo.scale = f1;
            rootviewinfo.screenshot = mCachedBitmap;
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
            obj = new RootViewInfo(s, view);
            mRootViews.add(obj);
              goto _L3
            takeScreenshot((RootViewInfo)mRootViews.get(i));
            i++;
              goto _L4
        }

        public void findInActivities(UIThreadSet uithreadset)
        {
            mLiveActivities = uithreadset;
        }

        public RootViewFinder()
        {
        }
    }

    private static class RootViewInfo
    {

        public final String activityName;
        public final View rootView;
        public float scale;
        public CachedBitmap screenshot;

        public RootViewInfo(String s, View view)
        {
            activityName = s;
            rootView = view;
            screenshot = null;
            scale = 1.0F;
        }
    }


    private static final String LOGTAG = "MixpanelAPI.Snapshot";
    private static final int MAX_CLASS_NAME_CACHE_SIZE = 255;
    private final ClassNameCache mClassnameCache = new ClassNameCache(255);
    private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    private final List mProperties;
    private final ResourceIds mResourceIds;
    private final RootViewFinder mRootViewFinder = new RootViewFinder();

    public ViewSnapshot(List list, ResourceIds resourceids)
    {
        mProperties = list;
        mResourceIds = resourceids;
    }

    private void addProperties(JsonWriter jsonwriter, View view)
        throws IOException
    {
        Class class1 = view.getClass();
        Iterator iterator = mProperties.iterator();
label0:
        do
        {
            Object obj;
            Object obj1;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        return;
                    }
                    obj = (PropertyDescription)iterator.next();
                } while (!((PropertyDescription) (obj)).targetClass.isAssignableFrom(class1) || ((PropertyDescription) (obj)).accessor == null);
                obj1 = ((PropertyDescription) (obj)).accessor.applyMethod(view);
            } while (obj1 == null);
            if (obj1 instanceof Number)
            {
                jsonwriter.name(((PropertyDescription) (obj)).name).value((Number)obj1);
                continue;
            }
            if (obj1 instanceof Boolean)
            {
                jsonwriter.name(((PropertyDescription) (obj)).name).value(((Boolean)obj1).booleanValue());
                continue;
            }
            if (obj1 instanceof ColorStateList)
            {
                jsonwriter.name(((PropertyDescription) (obj)).name).value(Integer.valueOf(((ColorStateList)obj1).getDefaultColor()));
                continue;
            }
            if (obj1 instanceof Drawable)
            {
                obj1 = (Drawable)obj1;
                Rect rect = ((Drawable) (obj1)).getBounds();
                jsonwriter.name(((PropertyDescription) (obj)).name);
                jsonwriter.beginObject();
                jsonwriter.name("classes");
                jsonwriter.beginArray();
                obj = obj1.getClass();
                do
                {
                    if (obj == java/lang/Object)
                    {
                        jsonwriter.endArray();
                        jsonwriter.name("dimensions");
                        jsonwriter.beginObject();
                        jsonwriter.name("left").value(rect.left);
                        jsonwriter.name("right").value(rect.right);
                        jsonwriter.name("top").value(rect.top);
                        jsonwriter.name("bottom").value(rect.bottom);
                        jsonwriter.endObject();
                        if (obj1 instanceof ColorDrawable)
                        {
                            obj = (ColorDrawable)obj1;
                            jsonwriter.name("color").value(((ColorDrawable) (obj)).getColor());
                        }
                        jsonwriter.endObject();
                        continue label0;
                    }
                    jsonwriter.value(((Class) (obj)).getCanonicalName());
                    obj = ((Class) (obj)).getSuperclass();
                } while (true);
            }
            jsonwriter.name(((PropertyDescription) (obj)).name).value(obj1.toString());
        } while (true);
    }

    private void snapshotView(JsonWriter jsonwriter, View view)
        throws IOException
    {
        Object obj;
        int i;
        i = view.getId();
        float f;
        float f1;
        Class class1;
        int j;
        if (-1 == i)
        {
            obj = null;
        } else
        {
            obj = mResourceIds.nameForId(i);
        }
        jsonwriter.beginObject();
        jsonwriter.name("hashCode").value(view.hashCode());
        jsonwriter.name("id").value(i);
        jsonwriter.name("mp_id_name").value(((String) (obj)));
        obj = view.getContentDescription();
        if (obj == null)
        {
            jsonwriter.name("contentDescription").nullValue();
        } else
        {
            jsonwriter.name("contentDescription").value(((CharSequence) (obj)).toString());
        }
        obj = view.getTag();
        if (obj == null)
        {
            jsonwriter.name("tag").nullValue();
        } else
        if (obj instanceof CharSequence)
        {
            jsonwriter.name("tag").value(obj.toString());
        }
        jsonwriter.name("top").value(view.getTop());
        jsonwriter.name("left").value(view.getLeft());
        jsonwriter.name("width").value(view.getWidth());
        jsonwriter.name("height").value(view.getHeight());
        jsonwriter.name("scrollX").value(view.getScrollX());
        jsonwriter.name("scrollY").value(view.getScrollY());
        jsonwriter.name("visibility").value(view.getVisibility());
        f = 0.0F;
        f1 = 0.0F;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            f = view.getTranslationX();
            f1 = view.getTranslationY();
        }
        jsonwriter.name("translationX").value(f);
        jsonwriter.name("translationY").value(f1);
        jsonwriter.name("classes");
        jsonwriter.beginArray();
        obj = view.getClass();
        do
        {
            jsonwriter.value((String)mClassnameCache.get(obj));
            class1 = ((Class) (obj)).getSuperclass();
            if (class1 == java/lang/Object)
            {
                break;
            }
            obj = class1;
        } while (class1 != null);
        jsonwriter.endArray();
        addProperties(jsonwriter, view);
        obj = view.getLayoutParams();
        if (!(obj instanceof android.widget.RelativeLayout.LayoutParams)) goto _L2; else goto _L1
_L1:
        obj = ((android.widget.RelativeLayout.LayoutParams)obj).getRules();
        jsonwriter.name("layoutRules");
        jsonwriter.beginArray();
        j = obj.length;
        i = 0;
_L10:
        if (i < j) goto _L4; else goto _L3
_L3:
        jsonwriter.endArray();
_L2:
        jsonwriter.name("subviews");
        jsonwriter.beginArray();
        if (!(view instanceof ViewGroup)) goto _L6; else goto _L5
_L5:
        obj = (ViewGroup)view;
        j = ((ViewGroup) (obj)).getChildCount();
        i = 0;
_L11:
        if (i < j) goto _L7; else goto _L6
_L6:
        jsonwriter.endArray();
        jsonwriter.endObject();
        if (!(view instanceof ViewGroup)) goto _L9; else goto _L8
_L8:
        view = (ViewGroup)view;
        j = view.getChildCount();
        i = 0;
_L12:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_585;
        }
_L9:
        return;
_L4:
        jsonwriter.value(obj[i]);
        i++;
          goto _L10
_L7:
        View view2 = ((ViewGroup) (obj)).getChildAt(i);
        if (view2 != null)
        {
            jsonwriter.value(view2.hashCode());
        }
        i++;
          goto _L11
        View view1 = view.getChildAt(i);
        if (view1 != null)
        {
            snapshotView(jsonwriter, view1);
        }
        i++;
          goto _L12
    }

    List getProperties()
    {
        return mProperties;
    }

    void snapshotViewHierarchy(JsonWriter jsonwriter, View view)
        throws IOException
    {
        jsonwriter.beginArray();
        snapshotView(jsonwriter, view);
        jsonwriter.endArray();
    }

    public void snapshots(UIThreadSet uithreadset, OutputStream outputstream)
        throws IOException
    {
        mRootViewFinder.findInActivities(uithreadset);
        uithreadset = new FutureTask(mRootViewFinder);
        mMainThreadHandler.post(uithreadset);
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(outputstream);
        Object obj = Collections.emptyList();
        outputstreamwriter.write("[");
        int i;
        int j;
        try
        {
            uithreadset = (List)uithreadset.get(1L, TimeUnit.SECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            uithreadset = ((UIThreadSet) (obj));
            if (MPConfig.DEBUG)
            {
                Log.d("MixpanelAPI.Snapshot", "Screenshot interrupted, no screenshot will be sent.", interruptedexception);
                uithreadset = ((UIThreadSet) (obj));
            }
        }
        catch (TimeoutException timeoutexception)
        {
            uithreadset = ((UIThreadSet) (obj));
            if (MPConfig.DEBUG)
            {
                Log.i("MixpanelAPI.Snapshot", "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", timeoutexception);
                uithreadset = ((UIThreadSet) (obj));
            }
        }
        catch (ExecutionException executionexception)
        {
            uithreadset = ((UIThreadSet) (obj));
            if (MPConfig.DEBUG)
            {
                Log.e("MixpanelAPI.Snapshot", "Exception thrown during screenshot attempt", executionexception);
                uithreadset = ((UIThreadSet) (obj));
            }
        }
        j = uithreadset.size();
        i = 0;
        do
        {
            if (i >= j)
            {
                outputstreamwriter.write("]");
                outputstreamwriter.flush();
                return;
            }
            if (i > 0)
            {
                outputstreamwriter.write(",");
            }
            obj = (RootViewInfo)uithreadset.get(i);
            outputstreamwriter.write("{");
            outputstreamwriter.write("\"activity\":");
            outputstreamwriter.write(JSONObject.quote(((RootViewInfo) (obj)).activityName));
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"scale\":");
            outputstreamwriter.write(String.format("%s", new Object[] {
                Float.valueOf(((RootViewInfo) (obj)).scale)
            }));
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"serialized_objects\":");
            JsonWriter jsonwriter = new JsonWriter(outputstreamwriter);
            jsonwriter.beginObject();
            jsonwriter.name("rootObject").value(((RootViewInfo) (obj)).rootView.hashCode());
            jsonwriter.name("objects");
            snapshotViewHierarchy(jsonwriter, ((RootViewInfo) (obj)).rootView);
            jsonwriter.endObject();
            jsonwriter.flush();
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"screenshot\":");
            outputstreamwriter.flush();
            ((RootViewInfo) (obj)).screenshot.writeBitmapJSON(android.graphics.Bitmap.CompressFormat.PNG, 100, outputstream);
            outputstreamwriter.write("}");
            i++;
        } while (true);
    }
}
