// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzlk

public final class zzkg extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{
    private static final class zza extends Drawable
    {

        private static final zza zzZB = new zza();
        private static final zza zzZC = new zza();

        static zza zznq()
        {
            return zzZB;
        }

        public void draw(Canvas canvas)
        {
        }

        public android.graphics.drawable.Drawable.ConstantState getConstantState()
        {
            return zzZC;
        }

        public int getOpacity()
        {
            return -2;
        }

        public void setAlpha(int i)
        {
        }

        public void setColorFilter(ColorFilter colorfilter)
        {
        }


        private zza()
        {
        }
    }

    private static final class zza.zza extends android.graphics.drawable.Drawable.ConstantState
    {

        public int getChangingConfigurations()
        {
            return 0;
        }

        public Drawable newDrawable()
        {
            return zza.zznq();
        }

        private zza.zza()
        {
        }

    }

    static final class zzb extends android.graphics.drawable.Drawable.ConstantState
    {

        int zzZD;
        int zzZE;

        public int getChangingConfigurations()
        {
            return zzZD;
        }

        public Drawable newDrawable()
        {
            return new zzkg(this);
        }

        zzb(zzb zzb1)
        {
            if (zzb1 != null)
            {
                zzZD = zzb1.zzZD;
                zzZE = zzb1.zzZE;
            }
        }
    }


    private int mFrom;
    private long zzKT;
    private int zzZA;
    private boolean zzZh;
    private int zzZo;
    private int zzZp;
    private int zzZq;
    private int zzZr;
    private int zzZs;
    private boolean zzZt;
    private zzb zzZu;
    private Drawable zzZv;
    private Drawable zzZw;
    private boolean zzZx;
    private boolean zzZy;
    private boolean zzZz;

    public zzkg(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = zza.zznq();
        }
        zzZv = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = zzZu;
        drawable.zzZE = ((zzb) (drawable)).zzZE | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = zza.zznq();
        }
        zzZw = drawable;
        drawable.setCallback(this);
        drawable1 = zzZu;
        drawable1.zzZE = ((zzb) (drawable1)).zzZE | drawable.getChangingConfigurations();
    }

    zzkg(zzb zzb1)
    {
        zzZo = 0;
        zzZq = 255;
        zzZs = 0;
        zzZh = true;
        zzZu = new zzb(zzb1);
    }

    public boolean canConstantState()
    {
        if (!zzZx)
        {
            boolean flag;
            if (zzZv.getConstantState() != null && zzZw.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzZy = flag;
            zzZx = true;
        }
        return zzZy;
    }

    public void draw(Canvas canvas)
    {
        int i;
        int j;
        boolean flag;
        j = 1;
        i = 1;
        flag = false;
        zzZo;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 106
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        boolean flag1;
        j = zzZs;
        flag1 = zzZh;
        drawable = zzZv;
        drawable1 = zzZw;
        if (i != 0)
        {
            if (!flag1 || j == 0)
            {
                drawable.draw(canvas);
            }
            if (j == zzZq)
            {
                drawable1.setAlpha(zzZq);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        zzKT = SystemClock.uptimeMillis();
        zzZo = 2;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        if (zzKT >= 0L)
        {
            float f = (float)(SystemClock.uptimeMillis() - zzKT) / (float)zzZr;
            float f1;
            if (f >= 1.0F)
            {
                i = j;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                zzZo = 0;
            }
            f = Math.min(f, 1.0F);
            f1 = mFrom;
            zzZs = (int)(f * (float)(zzZp - mFrom) + f1);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(zzZq - j);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(zzZq);
        }
        if (j > 0)
        {
            drawable1.setAlpha(j);
            drawable1.draw(canvas);
            drawable1.setAlpha(zzZq);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | zzZu.zzZD | zzZu.zzZE;
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (canConstantState())
        {
            zzZu.zzZD = getChangingConfigurations();
            return zzZu;
        } else
        {
            return null;
        }
    }

    public int getIntrinsicHeight()
    {
        return Math.max(zzZv.getIntrinsicHeight(), zzZw.getIntrinsicHeight());
    }

    public int getIntrinsicWidth()
    {
        return Math.max(zzZv.getIntrinsicWidth(), zzZw.getIntrinsicWidth());
    }

    public int getOpacity()
    {
        if (!zzZz)
        {
            zzZA = Drawable.resolveOpacity(zzZv.getOpacity(), zzZw.getOpacity());
            zzZz = true;
        }
        return zzZA;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (zzlk.zzoR())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.invalidateDrawable(this);
            }
        }
    }

    public Drawable mutate()
    {
        if (!zzZt && super.mutate() == this)
        {
            if (!canConstantState())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            zzZv.mutate();
            zzZw.mutate();
            zzZt = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        zzZv.setBounds(rect);
        zzZw.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (zzlk.zzoR())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.scheduleDrawable(this, runnable, l);
            }
        }
    }

    public void setAlpha(int i)
    {
        if (zzZs == zzZq)
        {
            zzZs = i;
        }
        zzZq = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        zzZv.setColorFilter(colorfilter);
        zzZw.setColorFilter(colorfilter);
    }

    public void startTransition(int i)
    {
        mFrom = 0;
        zzZp = zzZq;
        zzZs = 0;
        zzZr = i;
        zzZo = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (zzlk.zzoR())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }

    public Drawable zznp()
    {
        return zzZw;
    }
}
