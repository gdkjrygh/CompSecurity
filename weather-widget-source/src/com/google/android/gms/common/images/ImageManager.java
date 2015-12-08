// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzlf;
import com.google.android.gms.internal.zzlv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.common.images:
//            zza

public final class ImageManager
{
    private final class ImageReceiver extends ResultReceiver
    {

        private final Uri mUri;
        private final ArrayList zzabL = new ArrayList();
        final ImageManager zzabM;

        static ArrayList zza(ImageReceiver imagereceiver)
        {
            return imagereceiver.zzabL;
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.zzf(zzabM).execute(zzabM. new zzc(mUri, bundle));
        }

        public void zzb(com.google.android.gms.common.images.zza zza1)
        {
            com.google.android.gms.common.internal.zzb.zzch("ImageReceiver.addImageRequest() must be called in the main thread");
            zzabL.add(zza1);
        }

        public void zzc(com.google.android.gms.common.images.zza zza1)
        {
            com.google.android.gms.common.internal.zzb.zzch("ImageReceiver.removeImageRequest() must be called in the main thread");
            zzabL.remove(zza1);
        }

        public void zzoc()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            com.google.android.gms.common.images.ImageManager.zzb(zzabM).sendBroadcast(intent);
        }

        ImageReceiver(Uri uri)
        {
            zzabM = ImageManager.this;
            super(new Handler(Looper.getMainLooper()));
            mUri = uri;
        }
    }

    public static interface OnImageLoadedListener
    {

        public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
    }

    private static final class zza
    {

        static int zza(ActivityManager activitymanager)
        {
            return activitymanager.getLargeMemoryClass();
        }
    }

    private static final class zzb extends zzlf
    {

        private static int zzai(Context context)
        {
            ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
            int i;
            if ((context.getApplicationInfo().flags & 0x100000) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && zzlv.zzpO())
            {
                i = zza.zza(activitymanager);
            } else
            {
                i = activitymanager.getMemoryClass();
            }
            return (int)((float)(i * 0x100000) * 0.33F);
        }

        protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            zza(flag, (zza.zza)obj, (Bitmap)obj1, (Bitmap)obj2);
        }

        protected int sizeOf(Object obj, Object obj1)
        {
            return zza((zza.zza)obj, (Bitmap)obj1);
        }

        protected int zza(zza.zza zza1, Bitmap bitmap)
        {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        protected void zza(boolean flag, zza.zza zza1, Bitmap bitmap, Bitmap bitmap1)
        {
            super.entryRemoved(flag, zza1, bitmap, bitmap1);
        }

        public zzb(Context context)
        {
            super(zzai(context));
        }
    }

    private final class zzc
        implements Runnable
    {

        private final Uri mUri;
        final ImageManager zzabM;
        private final ParcelFileDescriptor zzabN;

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            com.google.android.gms.common.internal.zzb.zzci("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (zzabN == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(zzabN.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                zzabN.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.zzg(zzabM).post(zzabM. new zzf(mUri, ((Bitmap) (obj)), flag, countdownlatch));
            try
            {
                countdownlatch.await();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                Log.w("ImageManager", (new StringBuilder()).append("Latch interrupted while posting ").append(mUri).toString());
            }
            break MISSING_BLOCK_LABEL_164;
            outofmemoryerror;
            Log.e("ImageManager", (new StringBuilder()).append("OOM while loading bitmap for uri: ").append(mUri).toString(), outofmemoryerror);
            flag = true;
            outofmemoryerror = countdownlatch;
              goto _L3
        }

        public zzc(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
        {
            zzabM = ImageManager.this;
            super();
            mUri = uri;
            zzabN = parcelfiledescriptor;
        }
    }

    private final class zzd
        implements Runnable
    {

        final ImageManager zzabM;
        private final com.google.android.gms.common.images.zza zzabO;

        public void run()
        {
            com.google.android.gms.common.internal.zzb.zzch("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)ImageManager.zza(zzabM).get(zzabO);
            if (obj != null)
            {
                ImageManager.zza(zzabM).remove(zzabO);
                ((ImageReceiver) (obj)).zzc(zzabO);
            }
            zza.zza zza1 = zzabO.zzabQ;
            if (zza1.uri == null)
            {
                zzabO.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ImageManager.zzc(zzabM), true);
                return;
            }
            obj = ImageManager.zza(zzabM, zza1);
            if (obj != null)
            {
                zzabO.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)ImageManager.zzd(zzabM).get(zza1.uri);
            if (obj != null)
            {
                if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    zzabO.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ImageManager.zzc(zzabM), true);
                    return;
                }
                ImageManager.zzd(zzabM).remove(zza1.uri);
            }
            zzabO.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ImageManager.zzc(zzabM));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzabM).get(zza1.uri);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = zzabM. new ImageReceiver(zza1.uri);
                ImageManager.zze(zzabM).put(zza1.uri, obj);
            }
            ((ImageReceiver) (obj)).zzb(zzabO);
            if (!(zzabO instanceof zza.zzc))
            {
                ImageManager.zza(zzabM).put(zzabO, obj);
            }
            synchronized (ImageManager.zzoa())
            {
                if (!ImageManager.zzob().contains(zza1.uri))
                {
                    ImageManager.zzob().add(zza1.uri);
                    ((ImageReceiver) (obj)).zzoc();
                }
            }
            return;
            exception;
            obj1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzd(com.google.android.gms.common.images.zza zza1)
        {
            zzabM = ImageManager.this;
            super();
            zzabO = zza1;
        }
    }

    private static final class zze
        implements ComponentCallbacks2
    {

        private final zzb zzabG;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            zzabG.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                zzabG.evictAll();
            } else
            if (i >= 20)
            {
                zzabG.trimToSize(zzabG.size() / 2);
                return;
            }
        }

        public zze(zzb zzb1)
        {
            zzabG = zzb1;
        }
    }

    private final class zzf
        implements Runnable
    {

        private final Bitmap mBitmap;
        private final Uri mUri;
        final ImageManager zzabM;
        private boolean zzabP;
        private final CountDownLatch zzoR;

        private void zza(ImageReceiver imagereceiver, boolean flag)
        {
            imagereceiver = ImageReceiver.zza(imagereceiver);
            int j = imagereceiver.size();
            int i = 0;
            while (i < j) 
            {
                com.google.android.gms.common.images.zza zza1 = (com.google.android.gms.common.images.zza)imagereceiver.get(i);
                if (flag)
                {
                    zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), mBitmap, false);
                } else
                {
                    ImageManager.zzd(zzabM).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ImageManager.zzc(zzabM), false);
                }
                if (!(zza1 instanceof zza.zzc))
                {
                    ImageManager.zza(zzabM).remove(zza1);
                }
                i++;
            }
        }

        public void run()
        {
            com.google.android.gms.common.internal.zzb.zzch("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (mBitmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.zzh(zzabM) != null)
            {
                if (zzabP)
                {
                    ImageManager.zzh(zzabM).evictAll();
                    System.gc();
                    zzabP = false;
                    ImageManager.zzg(zzabM).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.zzh(zzabM).put(new zza.zza(mUri), mBitmap);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzabM).remove(mUri);
            if (imagereceiver != null)
            {
                zza(imagereceiver, flag);
            }
            zzoR.countDown();
            synchronized (ImageManager.zzoa())
            {
                ImageManager.zzob().remove(mUri);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzf(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            zzabM = ImageManager.this;
            super();
            mUri = uri;
            mBitmap = bitmap;
            zzabP = flag;
            zzoR = countdownlatch;
        }
    }


    private static final Object zzabB = new Object();
    private static HashSet zzabC = new HashSet();
    private static ImageManager zzabD;
    private static ImageManager zzabE;
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final ExecutorService zzabF = Executors.newFixedThreadPool(4);
    private final zzb zzabG;
    private final zzku zzabH = new zzku();
    private final Map zzabI = new HashMap();
    private final Map zzabJ = new HashMap();
    private final Map zzabK = new HashMap();

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            zzabG = new zzb(mContext);
            if (zzlv.zzpR())
            {
                zznZ();
            }
        } else
        {
            zzabG = null;
        }
    }

    public static ImageManager create(Context context)
    {
        return zzb(context, false);
    }

    static Bitmap zza(ImageManager imagemanager, zza.zza zza1)
    {
        return imagemanager.zza(zza1);
    }

    private Bitmap zza(zza.zza zza1)
    {
        if (zzabG == null)
        {
            return null;
        } else
        {
            return (Bitmap)zzabG.get(zza1);
        }
    }

    static Map zza(ImageManager imagemanager)
    {
        return imagemanager.zzabI;
    }

    static Context zzb(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    public static ImageManager zzb(Context context, boolean flag)
    {
        if (flag)
        {
            if (zzabE == null)
            {
                zzabE = new ImageManager(context, true);
            }
            return zzabE;
        }
        if (zzabD == null)
        {
            zzabD = new ImageManager(context, false);
        }
        return zzabD;
    }

    static zzku zzc(ImageManager imagemanager)
    {
        return imagemanager.zzabH;
    }

    static Map zzd(ImageManager imagemanager)
    {
        return imagemanager.zzabK;
    }

    static Map zze(ImageManager imagemanager)
    {
        return imagemanager.zzabJ;
    }

    static ExecutorService zzf(ImageManager imagemanager)
    {
        return imagemanager.zzabF;
    }

    static Handler zzg(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    static zzb zzh(ImageManager imagemanager)
    {
        return imagemanager.zzabG;
    }

    private void zznZ()
    {
        mContext.registerComponentCallbacks(new zze(zzabG));
    }

    static Object zzoa()
    {
        return zzabB;
    }

    static HashSet zzob()
    {
        return zzabC;
    }

    public void loadImage(ImageView imageview, int i)
    {
        zza(new zza.zzb(imageview, i));
    }

    public void loadImage(ImageView imageview, Uri uri)
    {
        zza(new zza.zzb(imageview, uri));
    }

    public void loadImage(ImageView imageview, Uri uri, int i)
    {
        imageview = new zza.zzb(imageview, uri);
        imageview.zzbt(i);
        zza(imageview);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        zza(new zza.zzc(onimageloadedlistener, uri));
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        onimageloadedlistener = new zza.zzc(onimageloadedlistener, uri);
        onimageloadedlistener.zzbt(i);
        zza(onimageloadedlistener);
    }

    public void zza(com.google.android.gms.common.images.zza zza1)
    {
        com.google.android.gms.common.internal.zzb.zzch("ImageManager.loadImage() must be called in the main thread");
        (new zzd(zza1)).run();
    }

}
