// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.core.player.ui:
//            g, h

public final class f
{

    private final int a;
    private final View b;
    private LinearLayout c;
    private final ImageView d;

    public f(Context context, h h, int i, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2)
    {
        a = i;
        b = LayoutInflater.from(context).inflate(l.ad, null);
        d = (ImageView)b.findViewById(j.bF);
        ((TextView)b.findViewById(j.fF)).setText(charsequence);
        ((TextView)b.findViewById(j.aH)).setText(charsequence1);
        charsequence = (TextView)b.findViewById(j.b);
        charsequence.setText(charsequence2);
        charsequence.setOnClickListener(new g(this, h));
        c = (LinearLayout)b.findViewById(j.bG);
        if (context.getResources().getConfiguration().orientation == 2)
        {
            c.setOrientation(0);
            return;
        } else
        {
            c.setOrientation(1);
            return;
        }
    }

    final View a()
    {
        return b;
    }

    final void a(Bitmap bitmap)
    {
        d.setImageBitmap(bitmap);
    }

    public final void a(boolean flag)
    {
        LinearLayout linearlayout = c;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        linearlayout.setOrientation(i);
    }

    public final int b()
    {
        return a;
    }
}
