// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.gau.go.launcherex.gowidget.language.d;
import com.gau.go.launcherex.gowidget.language.e;
import com.go.weatherex.j.c.p;
import com.go.weatherex.j.c.r;
import com.go.weatherex.j.c.u;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            p

public abstract class GoWidgetFrame extends FrameLayout
    implements d
{

    private r a;

    public GoWidgetFrame(Context context)
    {
        super(new u(context));
        a = new com.gau.go.launcherex.gowidget.framework.p(this);
        a();
    }

    public GoWidgetFrame(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GoWidgetFrame(Context context, AttributeSet attributeset, int i)
    {
        super(new u(context), attributeset, i);
        a = new com.gau.go.launcherex.gowidget.framework.p(this);
        a();
    }

    private void a()
    {
        p.b(getContext());
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

    public void onDelete(int i)
    {
        p.o().b(a);
        p.o().b(this);
    }

    public void onLanguageChanged(Resources resources)
    {
    }

    public void onRemove(int i)
    {
    }
}
