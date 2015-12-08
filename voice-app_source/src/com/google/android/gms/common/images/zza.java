// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzki;
import com.google.android.gms.internal.zzkj;
import java.lang.ref.WeakReference;

public abstract class com.google.android.gms.common.images.zza
{
    static final class zza
    {

        public final Uri uri;

        public boolean equals(Object obj)
        {
            if (!(obj instanceof zza))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            } else
            {
                return zzt.equal(((zza)obj).uri, uri);
            }
        }

        public int hashCode()
        {
            return zzt.hashCode(new Object[] {
                uri
            });
        }

        public zza(Uri uri1)
        {
            uri = uri1;
        }
    }

    public static final class zzb extends com.google.android.gms.common.images.zza
    {

        private WeakReference zzZl;

        private void zza(ImageView imageview, Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            boolean flag3;
            int j;
            if (!flag1 && !flag2)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (!flag3 || !(imageview instanceof zzki)) goto _L2; else goto _L1
_L1:
            j = ((zzki)imageview).zznr();
            if (zzZe == 0 || j != zzZe) goto _L2; else goto _L3
_L3:
            return;
_L2:
            flag = zzb(flag, flag1);
            if (zzZf && drawable != null)
            {
                drawable = drawable.getConstantState().newDrawable();
            }
            Object obj = drawable;
            if (flag)
            {
                obj = zza(imageview.getDrawable(), drawable);
            }
            imageview.setImageDrawable(((Drawable) (obj)));
            if (imageview instanceof zzki)
            {
                drawable = (zzki)imageview;
                int i;
                if (flag2)
                {
                    imageview = zzZc.uri;
                } else
                {
                    imageview = null;
                }
                drawable.zzi(imageview);
                if (flag3)
                {
                    i = zzZe;
                } else
                {
                    i = 0;
                }
                drawable.zzbo(i);
            }
            if (flag)
            {
                ((zzkg)obj).startTransition(250);
                return;
            }
            if (true) goto _L3; else goto _L4
_L4:
        }

        public boolean equals(Object obj)
        {
            if (!(obj instanceof zzb))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            Object obj1 = (zzb)obj;
            obj = (ImageView)zzZl.get();
            obj1 = (ImageView)((zzb) (obj1)).zzZl.get();
            boolean flag;
            if (obj1 != null && obj != null && zzt.equal(obj1, obj))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public int hashCode()
        {
            return 0;
        }

        protected void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            ImageView imageview = (ImageView)zzZl.get();
            if (imageview != null)
            {
                zza(imageview, drawable, flag, flag1, flag2);
            }
        }

        public zzb(ImageView imageview, int i)
        {
            super(null, i);
            com.google.android.gms.common.internal.zzb.zzq(imageview);
            zzZl = new WeakReference(imageview);
        }

        public zzb(ImageView imageview, Uri uri)
        {
            super(uri, 0);
            com.google.android.gms.common.internal.zzb.zzq(imageview);
            zzZl = new WeakReference(imageview);
        }
    }

    public static final class zzc extends com.google.android.gms.common.images.zza
    {

        private WeakReference zzZm;

        public boolean equals(Object obj)
        {
            if (!(obj instanceof zzc))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (zzc)obj;
            ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)zzZm.get();
            ImageManager.OnImageLoadedListener onimageloadedlistener1 = (ImageManager.OnImageLoadedListener)((zzc) (obj)).zzZm.get();
            boolean flag;
            if (onimageloadedlistener1 != null && onimageloadedlistener != null && zzt.equal(onimageloadedlistener1, onimageloadedlistener) && zzt.equal(((zzc) (obj)).zzZc, zzZc))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public int hashCode()
        {
            return zzt.hashCode(new Object[] {
                zzZc
            });
        }

        protected void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)zzZm.get();
                if (onimageloadedlistener != null)
                {
                    onimageloadedlistener.onImageLoaded(zzZc.uri, drawable, flag2);
                }
            }
        }

        public zzc(ImageManager.OnImageLoadedListener onimageloadedlistener, Uri uri)
        {
            super(uri, 0);
            com.google.android.gms.common.internal.zzb.zzq(onimageloadedlistener);
            zzZm = new WeakReference(onimageloadedlistener);
        }
    }


    final zza zzZc;
    protected int zzZd;
    protected int zzZe;
    protected boolean zzZf;
    protected ImageManager.OnImageLoadedListener zzZg;
    private boolean zzZh;
    private boolean zzZi;
    private boolean zzZj;
    protected int zzZk;

    public com.google.android.gms.common.images.zza(Uri uri, int i)
    {
        zzZd = 0;
        zzZe = 0;
        zzZf = false;
        zzZh = true;
        zzZi = false;
        zzZj = true;
        zzZc = new zza(uri);
        zzZe = i;
    }

    private Drawable zza(Context context, zzkj zzkj1, int i)
    {
        Resources resources = context.getResources();
        if (zzZk > 0)
        {
            com.google.android.gms.internal.zzkj.zza zza1 = new com.google.android.gms.internal.zzkj.zza(i, zzZk);
            Drawable drawable = (Drawable)zzkj1.get(zza1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((zzZk & 1) != 0)
                {
                    context = zza(resources, drawable1);
                }
                zzkj1.put(zza1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable zza(Resources resources, Drawable drawable)
    {
        return zzkh.zza(resources, drawable);
    }

    protected zzkg zza(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof zzkg)
            {
                drawable2 = ((zzkg)drawable).zznp();
            }
        } else
        {
            drawable2 = null;
        }
        return new zzkg(drawable2, drawable1);
    }

    void zza(Context context, Bitmap bitmap, boolean flag)
    {
        com.google.android.gms.common.internal.zzb.zzq(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((zzZk & 1) != 0)
        {
            bitmap1 = zzkh.zza(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (zzZg != null)
        {
            zzZg.onImageLoaded(zzZc.uri, context, true);
        }
        zza(((Drawable) (context)), flag, false, true);
    }

    void zza(Context context, zzkj zzkj1)
    {
        if (zzZj)
        {
            Drawable drawable = null;
            if (zzZd != 0)
            {
                drawable = zza(context, zzkj1, zzZd);
            }
            zza(drawable, false, true, false);
        }
    }

    void zza(Context context, zzkj zzkj1, boolean flag)
    {
        Drawable drawable = null;
        if (zzZe != 0)
        {
            drawable = zza(context, zzkj1, zzZe);
        }
        if (zzZg != null)
        {
            zzZg.onImageLoaded(zzZc.uri, drawable, false);
        }
        zza(drawable, flag, false, false);
    }

    protected abstract void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    protected boolean zzb(boolean flag, boolean flag1)
    {
        return zzZh && !flag1 && (!flag || zzZi);
    }

    public void zzbm(int i)
    {
        zzZe = i;
    }
}
