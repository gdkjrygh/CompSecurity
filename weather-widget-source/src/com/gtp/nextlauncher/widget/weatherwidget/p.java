// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import com.go.gl.graphics.BitmapGLDrawable;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.graphics.NinePatchGLDrawable;

public class p
{

    public static GLDrawable a(Context context, int i)
    {
        context = context.getResources().getDrawable(i);
        if (context instanceof BitmapDrawable)
        {
            return new BitmapGLDrawable((BitmapDrawable)context);
        }
        if (context instanceof NinePatchDrawable)
        {
            return new NinePatchGLDrawable((NinePatchDrawable)context);
        } else
        {
            return null;
        }
    }
}
