// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.FaceDetector;
import com.google.android.apps.youtube.common.fromguava.c;

public final class o
{

    private final int a;
    private final int b;
    private final FaceDetector c;
    private final int d;
    private final int e;
    private final float f;
    private android.media.FaceDetector.Face g[];

    public o(float f1, int i, int j)
    {
        boolean flag1 = true;
        super();
        g = new android.media.FaceDetector.Face[5];
        boolean flag;
        if (f1 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "cropRatio must be > 0");
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "bitmapWidth must be > 0");
        if (j > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "bitmapHeight must be > 0");
        d = j;
        e = i;
        f = f1;
        a = (int)((float)j * 0.125F);
        b = (int)((float)j * 0.875F);
        c = new FaceDetector(i, j, 5);
    }

    public final Rect a(Bitmap bitmap)
    {
        if ((float)e / (float)d > f)
        {
            int i = (int)((float)e / f);
            return new Rect((e - i) / 2, 0, i, d);
        }
        int i1 = (int)((float)d / f);
        int j1 = c.findFaces(bitmap, g);
        if (j1 == 0)
        {
            int j = Math.min((d - i1) / 3, b - i1);
            return new Rect(0, j, e, i1 + j);
        }
        bitmap = new PointF();
        float f1 = 0.0F;
        for (int k = 0; k < j1; k++)
        {
            g[k].getMidPoint(bitmap);
            f1 += ((PointF) (bitmap)).y + g[k].eyesDistance() / 2.0F;
        }

        int l = (int)(f1 / (float)j1 - (float)(i1 / 2));
        l = Math.min(Math.max(a, l), b - i1);
        return new Rect(0, l, e, i1 + l);
    }
}
