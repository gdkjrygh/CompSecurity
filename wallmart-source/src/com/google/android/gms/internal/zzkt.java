// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class zzkt extends ImageView
{
    public static interface zza
    {

        public abstract Path zzl(int i, int j);
    }


    private Uri zzact;
    private int zzacu;
    private int zzacv;
    private zza zzacw;
    private int zzacx;
    private float zzacy;

    protected void onDraw(Canvas canvas)
    {
        if (zzacw != null)
        {
            canvas.clipPath(zzacw.zzl(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (zzacv != 0)
        {
            canvas.drawColor(zzacv);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        zzacx;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * zzacy);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / zzacy);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zzbv(int i)
    {
        zzacu = i;
    }

    public void zzj(Uri uri)
    {
        zzact = uri;
    }

    public int zzof()
    {
        return zzacu;
    }
}
