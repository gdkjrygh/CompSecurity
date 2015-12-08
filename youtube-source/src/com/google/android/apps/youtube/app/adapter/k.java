// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, l, ae

public abstract class k extends g
{

    private Context a;
    private final int b;

    public k(Context context, int i)
    {
        c.a(context);
        a = context.getApplicationContext();
        b = i;
    }

    public ae a(View view, ViewGroup viewgroup)
    {
        return new l(this, a, view, b);
    }

    protected void a(Matrix matrix, ImageView imageview, BitmapDrawable bitmapdrawable)
    {
    }

    protected abstract void a(Object obj, View view, b b1);
}
