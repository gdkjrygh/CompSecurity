// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class zzki extends ImageView
{
    public static interface zza
    {

        public abstract Path zzk(int i, int j);
    }


    private Uri zzZF;
    private int zzZG;
    private int zzZH;
    private zza zzZI;
    private int zzZJ;
    private float zzZK;

    protected void onDraw(Canvas canvas)
    {
        if (zzZI != null)
        {
            canvas.clipPath(zzZI.zzk(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (zzZH != 0)
        {
            canvas.drawColor(zzZH);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        zzZJ;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * zzZK);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / zzZK);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zzbo(int i)
    {
        zzZG = i;
    }

    public void zzi(Uri uri)
    {
        zzZF = uri;
    }

    public int zznr()
    {
        return zzZG;
    }
}
