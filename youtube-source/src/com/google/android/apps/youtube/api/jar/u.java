// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            v

public final class u extends Dialog
{

    private final v a;
    private final View b;
    private final ViewGroup c;
    private ViewGroup d;

    public u(Context context, v v1, View view)
    {
        super((Context)com.google.android.apps.youtube.common.fromguava.c.a(context, "context cannot be null"), 0x103000a);
        a = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1, "listener cannot be null");
        b = (View)com.google.android.apps.youtube.common.fromguava.c.a(view, "playerView cannot be null");
        c = new FrameLayout(context);
        setContentView(c);
    }

    public final void onBackPressed()
    {
        a.b();
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return a.a(i, keyevent) || super.onKeyDown(i, keyevent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyevent)
    {
        return a.b(i, keyevent) || super.onKeyUp(i, keyevent);
    }

    protected final void onStart()
    {
        super.onStart();
        d = (ViewGroup)b.getParent();
        d.removeView(b);
        c.addView(b, -1, -1);
        a.a();
    }

    protected final void onStop()
    {
        c.removeView(b);
        d.addView(b);
        a.a();
        super.onStop();
    }
}
