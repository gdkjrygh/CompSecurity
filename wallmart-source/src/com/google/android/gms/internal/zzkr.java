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
//            zzlv

public final class zzkr extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{
    private static final class zza extends Drawable
    {

        private static final zza zzacp = new zza();
        private static final zza zzacq = new zza();

        static zza zzoe()
        {
            return zzacp;
        }

        public void draw(Canvas canvas)
        {
        }

        public android.graphics.drawable.Drawable.ConstantState getConstantState()
        {
            return zzacq;
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
            return zza.zzoe();
        }

        private zza.zza()
        {
        }

    }

    static final class zzb extends android.graphics.drawable.Drawable.ConstantState
    {

        int zzacr;
        int zzacs;

        public int getChangingConfigurations()
        {
            return zzacr;
        }

        public Drawable newDrawable()
        {
            return new zzkr(this);
        }

        zzb(zzb zzb1)
        {
            if (zzb1 != null)
            {
                zzacr = zzb1.zzacr;
                zzacs = zzb1.zzacs;
            }
        }
    }


    private int mFrom;
    private long zzMS;
    private boolean zzabV;
    private int zzacc;
    private int zzacd;
    private int zzace;
    private int zzacf;
    private int zzacg;
    private boolean zzach;
    private zzb zzaci;
    private Drawable zzacj;
    private Drawable zzack;
    private boolean zzacl;
    private boolean zzacm;
    private boolean zzacn;
    private int zzaco;

    public zzkr(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = zza.zzoe();
        }
        zzacj = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = zzaci;
        drawable.zzacs = ((zzb) (drawable)).zzacs | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = zza.zzoe();
        }
        zzack = drawable;
        drawable.setCallback(this);
        drawable1 = zzaci;
        drawable1.zzacs = ((zzb) (drawable1)).zzacs | drawable.getChangingConfigurations();
    }

    zzkr(zzb zzb1)
    {
        zzacc = 0;
        zzace = 255;
        zzacg = 0;
        zzabV = true;
        zzaci = new zzb(zzb1);
    }

    public boolean canConstantState()
    {
        if (!zzacl)
        {
            boolean flag;
            if (zzacj.getConstantState() != null && zzack.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzacm = flag;
            zzacl = true;
        }
        return zzacm;
    }

    public void draw(Canvas canvas)
    {
        int i;
        int j;
        boolean flag;
        j = 1;
        i = 1;
        flag = false;
        zzacc;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 106
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        boolean flag1;
        j = zzacg;
        flag1 = zzabV;
        drawable = zzacj;
        drawable1 = zzack;
        if (i != 0)
        {
            if (!flag1 || j == 0)
            {
                drawable.draw(canvas);
            }
            if (j == zzace)
            {
                drawable1.setAlpha(zzace);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        zzMS = SystemClock.uptimeMillis();
        zzacc = 2;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        if (zzMS >= 0L)
        {
            float f = (float)(SystemClock.uptimeMillis() - zzMS) / (float)zzacf;
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
                zzacc = 0;
            }
            f = Math.min(f, 1.0F);
            f1 = mFrom;
            zzacg = (int)(f * (float)(zzacd - mFrom) + f1);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(zzace - j);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(zzace);
        }
        if (j > 0)
        {
            drawable1.setAlpha(j);
            drawable1.draw(canvas);
            drawable1.setAlpha(zzace);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | zzaci.zzacr | zzaci.zzacs;
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (canConstantState())
        {
            zzaci.zzacr = getChangingConfigurations();
            return zzaci;
        } else
        {
            return null;
        }
    }

    public int getIntrinsicHeight()
    {
        return Math.max(zzacj.getIntrinsicHeight(), zzack.getIntrinsicHeight());
    }

    public int getIntrinsicWidth()
    {
        return Math.max(zzacj.getIntrinsicWidth(), zzack.getIntrinsicWidth());
    }

    public int getOpacity()
    {
        if (!zzacn)
        {
            zzaco = Drawable.resolveOpacity(zzacj.getOpacity(), zzack.getOpacity());
            zzacn = true;
        }
        return zzaco;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (zzlv.zzpO())
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
        if (!zzach && super.mutate() == this)
        {
            if (!canConstantState())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            zzacj.mutate();
            zzack.mutate();
            zzach = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        zzacj.setBounds(rect);
        zzack.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (zzlv.zzpO())
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
        if (zzacg == zzace)
        {
            zzacg = i;
        }
        zzace = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        zzacj.setColorFilter(colorfilter);
        zzack.setColorFilter(colorfilter);
    }

    public void startTransition(int i)
    {
        mFrom = 0;
        zzacd = zzace;
        zzacg = 0;
        zzacf = i;
        zzacc = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (zzlv.zzpO())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }

    public Drawable zzod()
    {
        return zzack;
    }
}
