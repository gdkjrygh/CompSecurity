// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.e.n;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.ag;
import com.google.android.youtube.h;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            ak, ae, al

public class DefaultLiveOverlay extends FrameLayout
    implements android.view.View.OnClickListener, ak
{

    private final b a;
    private final Resources b;
    private final TextView c;
    private final ImageView d;
    private final Handler e;
    private al f;

    public DefaultLiveOverlay(Context context)
    {
        this(context, h.ah);
    }

    public DefaultLiveOverlay(Context context, int i)
    {
        super(context);
        a = new n();
        b = context.getResources();
        e = new Handler(context.getMainLooper());
        c = new TextView(context);
        c.setGravity(17);
        c.setTextColor(-1);
        c.setBackgroundColor(0xff000000);
        addView(c, -1, -1);
        d = new ImageView(context);
        d.setImageResource(i);
        d.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        d.setOnClickListener(this);
        d.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        addView(d);
        setClickable(true);
        setVisibility(4);
    }

    static ImageView a(DefaultLiveOverlay defaultliveoverlay)
    {
        return defaultliveoverlay.d;
    }

    private void a(View view)
    {
        boolean flag = false;
        Object obj = c;
        int i;
        if (view == c)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = d;
        if (view == d)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 4;
        }
        ((ImageView) (obj)).setVisibility(i);
    }

    static void a(DefaultLiveOverlay defaultliveoverlay, View view)
    {
        defaultliveoverlay.a(view);
    }

    public final void a(long l, boolean flag, boolean flag1)
    {
        long l1 = a.a();
        if (l1 < l)
        {
            c.setText(b.getString(p.co, new Object[] {
                ag.a(getContext(), l, flag, flag1)
            }));
            a(((View) (c)));
            e.postDelayed(new ae(this), l - l1);
        } else
        {
            a(((View) (d)));
        }
        setVisibility(0);
    }

    public final View b()
    {
        return this;
    }

    public final PlayerOverlaysLayout.LayoutParams c()
    {
        return new PlayerOverlaysLayout.LayoutParams(-1, -1, true);
    }

    public final void d()
    {
        setVisibility(4);
    }

    public void onClick(View view)
    {
        if (f != null && view == d)
        {
            setVisibility(4);
            f.b();
            return;
        } else
        {
            L.b("Play button clicked in LiveOverlay, but no listener was registered");
            return;
        }
    }

    public void setListener(al al1)
    {
        f = (al)com.google.android.apps.youtube.common.fromguava.c.a(al1, "listener cannot be null");
    }
}
