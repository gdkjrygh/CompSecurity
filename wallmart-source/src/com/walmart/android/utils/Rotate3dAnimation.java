// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class Rotate3dAnimation extends Animation
{

    private Camera mCamera;
    private final float mCenterX;
    private final float mCenterY;
    private final float mDepthZ;
    private final float mFromDegrees;
    private final boolean mReverse;
    private final float mToDegrees;

    public Rotate3dAnimation(float f, float f1, float f2, float f3, float f4, boolean flag)
    {
        mFromDegrees = f;
        mToDegrees = f1;
        mCenterX = f2;
        mCenterY = f3;
        mDepthZ = f4;
        mReverse = flag;
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        float f1 = mFromDegrees;
        float f2 = mToDegrees;
        float f3 = mCenterX;
        float f4 = mCenterY;
        Camera camera = mCamera;
        transformation = transformation.getMatrix();
        camera.save();
        if (mReverse)
        {
            camera.translate(0.0F, 0.0F, mDepthZ * f);
        } else
        {
            camera.translate(0.0F, 0.0F, mDepthZ * (1.0F - f));
        }
        camera.rotateY(f1 + (f2 - f1) * f);
        camera.getMatrix(transformation);
        camera.restore();
        transformation.preTranslate(-f3, -f4);
        transformation.postTranslate(f3, f4);
    }

    public void initialize(int i, int j, int k, int l)
    {
        super.initialize(i, j, k, l);
        mCamera = new Camera();
    }
}
