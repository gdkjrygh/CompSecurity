// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.gau.go.launcherex.gowidget.language.d;
import com.gau.go.launcherex.gowidget.language.e;
import com.go.gl.view.GLFrameLayout;
import com.go.gowidget.core.IGoWidget3D;
import com.go.weatherex.j.c.p;
import com.go.weatherex.j.c.r;
import com.go.weatherex.j.c.u;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            a

public abstract class GLGoWidgetFrame extends GLFrameLayout
    implements d, IGoWidget3D
{

    private r a;

    public GLGoWidgetFrame(Context context)
    {
        super(context);
        a = new a(this);
        a();
    }

    public GLGoWidgetFrame(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new a(this);
        a();
    }

    public GLGoWidgetFrame(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new a(this);
        a();
    }

    private void a()
    {
        mContext = new u(mContext);
        p.b(mContext);
        p.o().a(this);
        p.o().a(a);
    }

    public Resources getResources()
    {
        if (p.n())
        {
            return p.o().k().a();
        } else
        {
            return super.getResources();
        }
    }

    public String getString(int i)
    {
        return getResources().getString(i);
    }

    public void onDelete()
    {
        p.o().b(a);
        p.o().b(this);
    }

    public void onLanguageChanged(Resources resources)
    {
    }

    public void onRemove()
    {
    }
}
