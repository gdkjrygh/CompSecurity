// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            zzkr

private static final class zza extends Drawable
{
    private static final class zza extends android.graphics.drawable.Drawable.ConstantState
    {

        public int getChangingConfigurations()
        {
            return 0;
        }

        public Drawable newDrawable()
        {
            return zzkr.zza.zzoe();
        }

        private zza()
        {
        }

        zza(zzkr._cls1 _pcls1)
        {
            this();
        }
    }


    private static final zzacq zzacp = new <init>();
    private static final zza zzacq = new zza(null);

    static zzoe zzoe()
    {
        return zzacp;
    }

    public void draw(Canvas canvas)
    {
    }

    public android.graphics.drawable.ConstantState getConstantState()
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
