// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.animation;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class FlipAnimation extends Animation
{

    private Camera camera;
    private float centerX;
    private float centerY;
    private boolean forwardAnimation;
    private View fromView;
    private View toView;
    private boolean visibilitySwapped;

    public FlipAnimation(View view, View view1, boolean flag)
    {
        fromView = view;
        toView = view1;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        forwardAnimation = flag;
        setDuration(500L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        double d = 3.1415926535897931D * (double)f;
        float f2 = (float)((180D * d) / 3.1415926535897931D);
        float f1 = f2;
        if (f >= 0.5F)
        {
            f = f2 - 180F;
            f1 = f;
            if (!visibilitySwapped)
            {
                fromView.setVisibility(8);
                toView.setVisibility(0);
                visibilitySwapped = true;
                f1 = f;
            }
        }
        f = f1;
        if (forwardAnimation)
        {
            f = -f1;
        }
        transformation = transformation.getMatrix();
        camera.save();
        camera.translate(0.0F, 0.0F, (float)(150D * Math.sin(d)));
        camera.rotateY(f);
        camera.getMatrix(transformation);
        camera.restore();
        transformation.preTranslate(-centerX, -centerY);
        transformation.postTranslate(centerX, centerY);
    }

    public void initialize(int i, int j, int k, int l)
    {
        super.initialize(i, j, k, l);
        camera = new Camera();
        centerX = i / 2;
        centerY = j / 2;
    }
}
