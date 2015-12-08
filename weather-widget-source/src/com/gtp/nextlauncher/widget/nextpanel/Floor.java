// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.geometry.ColorGLObjectRender;
import com.go.gl.graphics.geometry.GLPath;
import com.go.gl.view.GLRelativeLayout;

public class Floor extends GLRelativeLayout
{

    private float a;
    private ColorGLObjectRender b;
    private GLPath c;
    private GLPath d;
    private GLPath e;
    private int f;
    private int g;

    public Floor(Context context)
    {
        super(context);
        a = 1000F;
        b = new ColorGLObjectRender();
        f = 200;
        g = 30;
        a(context);
    }

    private void a(Context context)
    {
        setBackgroundColor(0xffffff);
        b.setColor(0x44ffffff);
        c = new GLPath();
        c.setStrokeWidth(8F, 8F);
        d = new GLPath();
        d.setStrokeWidth(8F, 8F);
        d.setDrawMode(false);
        e = new GLPath();
        e.setStrokeWidth(8F, 8F);
        e.setDrawMode(false);
    }

    private void a(GLCanvas glcanvas)
    {
        boolean flag = false;
        c.update(glcanvas);
        c.setDrawMode(false);
        for (int i = 1; i < 9; i++)
        {
            int l = glcanvas.save();
            glcanvas.translate(0.0F, -mHeight, -a * (float)i);
            b.draw(glcanvas, c);
            glcanvas.restoreToCount(l);
        }

        d.update(glcanvas);
        e.update(glcanvas);
        int j = 0;
        int i1;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (j >= g / 2 - 1)
            {
                break;
            }
            i1 = glcanvas.save();
            glcanvas.translate(f * j, 0.0F, 0.0F);
            b.draw(glcanvas, d);
            glcanvas.restoreToCount(i1);
            j++;
        } while (true);
        for (; i1 > -(g / 2 - 1); i1--)
        {
            int k = glcanvas.save();
            glcanvas.translate(f * i1, 0.0F, 0.0F);
            b.draw(glcanvas, e);
            glcanvas.restoreToCount(k);
        }

    }

    public void draw(GLCanvas glcanvas)
    {
        a(glcanvas);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        c.reset();
        d.reset();
        e.reset();
        c.lineTo((i / 2 + f / 2) - (g / 2 - 1) * f, 0.0F);
        c.lineTo(i / 2 + f / 2 + (g / 2 - 2) * f, 0.0F);
        d.lineTo(i / 2 + 100, -j, 0.0F);
        d.lineTo(i / 2 + 100, -j, -a * 10F);
        e.lineTo(i / 2 - 100, -j, 0.0F);
        e.lineTo(i / 2 - 100, -j, -a * 10F);
        c.setFixedViewVector(0.0F, 1.0F, 1.0F);
        d.setFixedViewVector(-1F, 1.0F, 0.0F);
        e.setFixedViewVector(1.0F, 1.0F, 0.0F);
    }
}
