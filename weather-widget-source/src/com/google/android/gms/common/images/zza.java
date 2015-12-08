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
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzkr;
import com.google.android.gms.internal.zzks;
import com.google.android.gms.internal.zzkt;
import com.google.android.gms.internal.zzku;
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
                return zzw.equal(((zza)obj).uri, uri);
            }
        }

        public int hashCode()
        {
            return zzw.hashCode(new Object[] {
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

        private WeakReference zzabZ;

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
            if (!flag3 || !(imageview instanceof zzkt)) goto _L2; else goto _L1
_L1:
            j = ((zzkt)imageview).zzof();
            if (zzabS == 0 || j != zzabS) goto _L2; else goto _L3
_L3:
            return;
_L2:
            flag = zzb(flag, flag1);
            if (zzabT && drawable != null)
            {
                drawable = drawable.getConstantState().newDrawable();
            }
            Object obj = drawable;
            if (flag)
            {
                obj = zza(imageview.getDrawable(), drawable);
            }
            imageview.setImageDrawable(((Drawable) (obj)));
            if (imageview instanceof zzkt)
            {
                drawable = (zzkt)imageview;
                int i;
                if (flag2)
                {
                    imageview = zzabQ.uri;
                } else
                {
                    imageview = null;
                }
                drawable.zzj(imageview);
                if (flag3)
                {
                    i = zzabS;
                } else
                {
                    i = 0;
                }
                drawable.zzbv(i);
            }
            if (flag)
            {
                ((zzkr)obj).startTransition(250);
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
            obj = (ImageView)zzabZ.get();
            obj1 = (ImageView)((zzb) (obj1)).zzabZ.get();
            boolean flag;
            if (obj1 != null && obj != null && zzw.equal(obj1, obj))
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
            ImageView imageview = (ImageView)zzabZ.get();
            if (imageview != null)
            {
                zza(imageview, drawable, flag, flag1, flag2);
            }
        }

        public zzb(ImageView imageview, int i)
        {
            super(null, i);
            com.google.android.gms.common.internal.zzb.zzr(imageview);
            zzabZ = new WeakReference(imageview);
        }

        public zzb(ImageView imageview, Uri uri)
        {
            super(uri, 0);
            com.google.android.gms.common.internal.zzb.zzr(imageview);
            zzabZ = new WeakReference(imageview);
        }
    }

    public static final class zzc extends com.google.android.gms.common.images.zza
    {

        private WeakReference zzaca;

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
            ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)zzaca.get();
            ImageManager.OnImageLoadedListener onimageloadedlistener1 = (ImageManager.OnImageLoadedListener)((zzc) (obj)).zzaca.get();
            boolean flag;
            if (onimageloadedlistener1 != null && onimageloadedlistener != null && zzw.equal(onimageloadedlistener1, onimageloadedlistener) && zzw.equal(((zzc) (obj)).zzabQ, zzabQ))
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
            return zzw.hashCode(new Object[] {
                zzabQ
            });
        }

        protected void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)zzaca.get();
                if (onimageloadedlistener != null)
                {
                    onimageloadedlistener.onImageLoaded(zzabQ.uri, drawable, flag2);
                }
            }
        }

        public zzc(ImageManager.OnImageLoadedListener onimageloadedlistener, Uri uri)
        {
            super(uri, 0);
            com.google.android.gms.common.internal.zzb.zzr(onimageloadedlistener);
            zzaca = new WeakReference(onimageloadedlistener);
        }
    }


    final zza zzabQ;
    protected int zzabR;
    protected int zzabS;
    protected boolean zzabT;
    protected ImageManager.OnImageLoadedListener zzabU;
    private boolean zzabV;
    private boolean zzabW;
    private boolean zzabX;
    protected int zzabY;

    public com.google.android.gms.common.images.zza(Uri uri, int i)
    {
        zzabR = 0;
        zzabS = 0;
        zzabT = false;
        zzabV = true;
        zzabW = false;
        zzabX = true;
        zzabQ = new zza(uri);
        zzabS = i;
    }

    private Drawable zza(Context context, zzku zzku1, int i)
    {
        Resources resources = context.getResources();
        if (zzabY > 0)
        {
            com.google.android.gms.internal.zzku.zza zza1 = new com.google.android.gms.internal.zzku.zza(i, zzabY);
            Drawable drawable = (Drawable)zzku1.get(zza1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((zzabY & 1) != 0)
                {
                    context = zza(resources, drawable1);
                }
                zzku1.put(zza1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable zza(Resources resources, Drawable drawable)
    {
        return zzks.zza(resources, drawable);
    }

    protected zzkr zza(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof zzkr)
            {
                drawable2 = ((zzkr)drawable).zzod();
            }
        } else
        {
            drawable2 = null;
        }
        return new zzkr(drawable2, drawable1);
    }

    void zza(Context context, Bitmap bitmap, boolean flag)
    {
        com.google.android.gms.common.internal.zzb.zzr(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((zzabY & 1) != 0)
        {
            bitmap1 = zzks.zza(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (zzabU != null)
        {
            zzabU.onImageLoaded(zzabQ.uri, context, true);
        }
        zza(((Drawable) (context)), flag, false, true);
    }

    void zza(Context context, zzku zzku1)
    {
        if (zzabX)
        {
            Drawable drawable = null;
            if (zzabR != 0)
            {
                drawable = zza(context, zzku1, zzabR);
            }
            zza(drawable, false, true, false);
        }
    }

    void zza(Context context, zzku zzku1, boolean flag)
    {
        Drawable drawable = null;
        if (zzabS != 0)
        {
            drawable = zza(context, zzku1, zzabS);
        }
        if (zzabU != null)
        {
            zzabU.onImageLoaded(zzabQ.uri, drawable, false);
        }
        zza(drawable, flag, false, false);
    }

    protected abstract void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    protected boolean zzb(boolean flag, boolean flag1)
    {
        return zzabV && !flag1 && (!flag || zzabW);
    }

    public void zzbt(int i)
    {
        zzabS = i;
    }
}
