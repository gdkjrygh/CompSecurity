// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.view.bl;
import com.go.gl.view.GLFrameLayout;
import com.go.gl.view.GLLayoutInflater;
import com.go.gl.view.GLView;

public abstract class GLWidgetChildView extends GLFrameLayout
{

    private bl a;
    protected GLLayoutInflater mInflater;

    public GLWidgetChildView(Context context, bl bl)
    {
        super(context);
        mInflater = GLLayoutInflater.from(context);
        mInflater.inflate(getContentViewLayoutId(), this);
        a = bl;
    }

    public void cleanUp()
    {
    }

    public bl getChildViewType()
    {
        return a;
    }

    public abstract int getContentViewLayoutId();

    protected final void unSetComponentOnClickListener(GLView glview)
    {
        if (glview != null)
        {
            glview.setOnClickListener(null);
        }
    }

    protected final void unSetComponentOnLongClickListener(GLView glview)
    {
        if (glview != null)
        {
            glview.setOnLongClickListener(null);
        }
    }
}
