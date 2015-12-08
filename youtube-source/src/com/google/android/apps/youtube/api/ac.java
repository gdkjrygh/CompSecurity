// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.f;
import com.google.android.youtube.q;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.youtube.api:
//            ApiPlayer

public final class ac extends Dialog
{

    private final Activity a;
    private final boolean b;
    private final ApiPlayer c;

    public ac(Activity activity, View view, ApiPlayer apiplayer, String s, String s1, ArrayList arraylist, int i, 
            int j, boolean flag, boolean flag1, boolean flag2)
    {
        super(activity, a(flag1, flag2));
        byte byte0;
        if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1) || arraylist != null && !arraylist.isEmpty())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag2, "One of videoId, playlistId or videoIds must not be null or empty");
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        com.google.android.apps.youtube.common.fromguava.c.a(view);
        c = (ApiPlayer)com.google.android.apps.youtube.common.fromguava.c.a(apiplayer);
        b = flag1;
        if (flag1)
        {
            FrameLayout framelayout = new FrameLayout(getContext());
            framelayout.setBackgroundResource(0x1080011);
            framelayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -2, 17));
            activity.getWindow().setBackgroundDrawableResource(f.b);
            view = framelayout;
        } else
        {
            view.setBackgroundColor(0xff000000);
        }
        activity = new FrameLayout(getContext());
        if (flag1)
        {
            byte0 = -2;
        } else
        {
            byte0 = -1;
        }
        activity.addView(view, new android.widget.FrameLayout.LayoutParams(-1, byte0, 17));
        setContentView(activity);
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        apiplayer.b(arraylist, i, j);
_L6:
        return;
_L4:
        apiplayer.a(arraylist, i, j);
        return;
_L2:
        if (s1 != null)
        {
            if (flag)
            {
                apiplayer.b(s1, i, j);
                return;
            } else
            {
                apiplayer.a(s1, i, j);
                return;
            }
        }
        if (s != null)
        {
            if (flag)
            {
                apiplayer.b(s, j);
                return;
            } else
            {
                apiplayer.a(s, j);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static int a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            if (flag1)
            {
                return q.d;
            } else
            {
                return q.c;
            }
        } else
        {
            return q.e;
        }
    }

    public final void a()
    {
        c.p();
    }

    public final boolean b()
    {
        return b;
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (a.onKeyDown(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (a.onKeyUp(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected final void onStop()
    {
        if (!a.isFinishing())
        {
            a.finish();
        }
        super.onStop();
    }
}
