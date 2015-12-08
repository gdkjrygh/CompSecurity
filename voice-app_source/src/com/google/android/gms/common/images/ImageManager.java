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
import com.google.android.gms.internal.zzkj;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzlk;
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
        private final ArrayList zzYX = new ArrayList();
        final ImageManager zzYY;

        static ArrayList zza(ImageReceiver imagereceiver)
        {
            return imagereceiver.zzYX;
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.zzf(zzYY).execute(zzYY. new zzc(mUri, bundle));
        }

        public void zzb(com.google.android.gms.common.images.zza zza1)
        {
            com.google.android.gms.common.internal.zzb.zzbY("ImageReceiver.addImageRequest() must be called in the main thread");
            zzYX.add(zza1);
        }

        public void zzc(com.google.android.gms.common.images.zza zza1)
        {
            com.google.android.gms.common.internal.zzb.zzbY("ImageReceiver.removeImageRequest() must be called in the main thread");
            zzYX.remove(zza1);
        }

        public void zzno()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            com.google.android.gms.common.images.ImageManager.zzb(zzYY).sendBroadcast(intent);
        }

        ImageReceiver(Uri uri)
        {
            zzYY = ImageManager.this;
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

    private static final class zzb extends zzku
    {

        private static int zzag(Context context)
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
            if (i != 0 && zzlk.zzoR())
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
            super(zzag(context));
        }
    }

    private final class zzc
        implements Runnable
    {

        private final Uri mUri;
        final ImageManager zzYY;
        private final ParcelFileDescriptor zzYZ;

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            com.google.android.gms.common.internal.zzb.zzbZ("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (zzYZ == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(zzYZ.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                zzYZ.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.zzg(zzYY).post(zzYY. new zzf(mUri, ((Bitmap) (obj)), flag, countdownlatch));
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
            zzYY = ImageManager.this;
            super();
            mUri = uri;
            zzYZ = parcelfiledescriptor;
        }
    }

    private final class zzd
        implements Runnable
    {

        final ImageManager zzYY;
        private final com.google.android.gms.common.images.zza zzZa;

        public void run()
        {
            com.google.android.gms.common.internal.zzb.zzbY("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)ImageManager.zza(zzYY).get(zzZa);
            if (obj != null)
            {
                ImageManager.zza(zzYY).remove(zzZa);
                ((ImageReceiver) (obj)).zzc(zzZa);
            }
            zza.zza zza1 = zzZa.zzZc;
            if (zza1.uri == null)
            {
                zzZa.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ImageManager.zzc(zzYY), true);
                return;
            }
            obj = ImageManager.zza(zzYY, zza1);
            if (obj != null)
            {
                zzZa.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)ImageManager.zzd(zzYY).get(zza1.uri);
            if (obj != null)
            {
                if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    zzZa.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ImageManager.zzc(zzYY), true);
                    return;
                }
                ImageManager.zzd(zzYY).remove(zza1.uri);
            }
            zzZa.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ImageManager.zzc(zzYY));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzYY).get(zza1.uri);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = zzYY. new ImageReceiver(zza1.uri);
                ImageManager.zze(zzYY).put(zza1.uri, obj);
            }
            ((ImageReceiver) (obj)).zzb(zzZa);
            if (!(zzZa instanceof zza.zzc))
            {
                ImageManager.zza(zzYY).put(zzZa, obj);
            }
            synchronized (ImageManager.zznm())
            {
                if (!ImageManager.zznn().contains(zza1.uri))
                {
                    ImageManager.zznn().add(zza1.uri);
                    ((ImageReceiver) (obj)).zzno();
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
            zzYY = ImageManager.this;
            super();
            zzZa = zza1;
        }
    }

    private static final class zze
        implements ComponentCallbacks2
    {

        private final zzb zzYS;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            zzYS.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                zzYS.evictAll();
            } else
            if (i >= 20)
            {
                zzYS.trimToSize(zzYS.size() / 2);
                return;
            }
        }

        public zze(zzb zzb1)
        {
            zzYS = zzb1;
        }
    }

    private final class zzf
        implements Runnable
    {

        private final Bitmap mBitmap;
        private final Uri mUri;
        final ImageManager zzYY;
        private boolean zzZb;
        private final CountDownLatch zzoD;

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
                    zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), mBitmap, false);
                } else
                {
                    ImageManager.zzd(zzYY).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ImageManager.zzc(zzYY), false);
                }
                if (!(zza1 instanceof zza.zzc))
                {
                    ImageManager.zza(zzYY).remove(zza1);
                }
                i++;
            }
        }

        public void run()
        {
            com.google.android.gms.common.internal.zzb.zzbY("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (mBitmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.zzh(zzYY) != null)
            {
                if (zzZb)
                {
                    ImageManager.zzh(zzYY).evictAll();
                    System.gc();
                    zzZb = false;
                    ImageManager.zzg(zzYY).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.zzh(zzYY).put(new zza.zza(mUri), mBitmap);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzYY).remove(mUri);
            if (imagereceiver != null)
            {
                zza(imagereceiver, flag);
            }
            zzoD.countDown();
            synchronized (ImageManager.zznm())
            {
                ImageManager.zznn().remove(mUri);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzf(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            zzYY = ImageManager.this;
            super();
            mUri = uri;
            mBitmap = bitmap;
            zzZb = flag;
            zzoD = countdownlatch;
        }
    }


    private static final Object zzYN = new Object();
    private static HashSet zzYO = new HashSet();
    private static ImageManager zzYP;
    private static ImageManager zzYQ;
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final ExecutorService zzYR = Executors.newFixedThreadPool(4);
    private final zzb zzYS;
    private final zzkj zzYT = new zzkj();
    private final Map zzYU = new HashMap();
    private final Map zzYV = new HashMap();
    private final Map zzYW = new HashMap();

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            zzYS = new zzb(mContext);
            if (zzlk.zzoU())
            {
                zznl();
            }
        } else
        {
            zzYS = null;
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
        if (zzYS == null)
        {
            return null;
        } else
        {
            return (Bitmap)zzYS.get(zza1);
        }
    }

    static Map zza(ImageManager imagemanager)
    {
        return imagemanager.zzYU;
    }

    static Context zzb(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    public static ImageManager zzb(Context context, boolean flag)
    {
        if (flag)
        {
            if (zzYQ == null)
            {
                zzYQ = new ImageManager(context, true);
            }
            return zzYQ;
        }
        if (zzYP == null)
        {
            zzYP = new ImageManager(context, false);
        }
        return zzYP;
    }

    static zzkj zzc(ImageManager imagemanager)
    {
        return imagemanager.zzYT;
    }

    static Map zzd(ImageManager imagemanager)
    {
        return imagemanager.zzYW;
    }

    static Map zze(ImageManager imagemanager)
    {
        return imagemanager.zzYV;
    }

    static ExecutorService zzf(ImageManager imagemanager)
    {
        return imagemanager.zzYR;
    }

    static Handler zzg(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    static zzb zzh(ImageManager imagemanager)
    {
        return imagemanager.zzYS;
    }

    private void zznl()
    {
        mContext.registerComponentCallbacks(new zze(zzYS));
    }

    static Object zznm()
    {
        return zzYN;
    }

    static HashSet zznn()
    {
        return zzYO;
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
        imageview.zzbm(i);
        zza(imageview);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        zza(new zza.zzc(onimageloadedlistener, uri));
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        onimageloadedlistener = new zza.zzc(onimageloadedlistener, uri);
        onimageloadedlistener.zzbm(i);
        zza(onimageloadedlistener);
    }

    public void zza(com.google.android.gms.common.images.zza zza1)
    {
        com.google.android.gms.common.internal.zzb.zzbY("ImageManager.loadImage() must be called in the main thread");
        (new zzd(zza1)).run();
    }

}
