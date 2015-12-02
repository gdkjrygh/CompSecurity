// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class p extends Animation
{

    private final float a;
    private final float b;
    protected final float c;
    private Camera d;
    private final float e;
    private final boolean f;
    protected final float g;

    public p(float f1, float f2, float f3, float f4, float f5, boolean flag)
    {
        g = f1;
        c = f2;
        b = f3;
        e = f4;
        a = f5;
        f = flag;
    }

    protected void applyTransformation(float f1, Transformation transformation)
    {
        float f2 = g;
        float f3 = c;
        float f4 = b;
        float f5 = e;
        Camera camera = d;
        transformation = transformation.getMatrix();
        camera.save();
        camera.translate(0.0F, 0.0F, (float)((double)a * Math.sin(3.1415926535897931D * (double)f1)));
        camera.rotateY(f2 + (f3 - f2) * f1);
        camera.getMatrix(transformation);
        camera.restore();
        transformation.preTranslate(-f4, -f5);
        transformation.postTranslate(f4, f5);
    }

    public void initialize(int i, int j, int k, int l)
    {
        super.initialize(i, j, k, l);
        d = new Camera();
    }
}
