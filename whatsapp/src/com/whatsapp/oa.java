// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            App

public class oa extends Animation
{

    private int a;
    private Camera b;
    private boolean c;
    private ImageView d;

    oa(ImageView imageview, int i)
    {
        d = imageview;
        a = i;
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i;
label0:
        {
            super.applyTransformation(f, transformation);
            i = (int)(180F * f) % 360;
            transformation = transformation.getMatrix();
            b.save();
            b.translate(0.0F, 0.0F, (float)((double)d.getWidth() * Math.sin((3.1415926535897931D * (double)i) / 180D)));
            if (i < 90)
            {
                b.rotateY(i);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b.rotateY(i + 180);
        }
        b.getMatrix(transformation);
        b.restore();
        transformation.preTranslate(-d.getWidth() / 2, -d.getHeight() / 2);
        transformation.postTranslate(d.getWidth() / 2, d.getHeight() / 2);
        if (i > 90 && !c)
        {
            c = true;
            d.setImageResource(a);
        }
    }

    public void initialize(int i, int j, int k, int l)
    {
        super.initialize(i, j, k, l);
        b = new Camera();
    }
}
