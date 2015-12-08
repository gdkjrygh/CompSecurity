// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            h, k

final class l extends h
{

    final k a;

    l(k k1, Context context, View view, int i)
    {
        a = k1;
        super(context, view, i);
    }

    protected final void a(Matrix matrix, ImageView imageview, BitmapDrawable bitmapdrawable)
    {
        a.a(matrix, imageview, bitmapdrawable);
    }

    protected final void a(Object obj, View view, b b)
    {
        a.a(obj, view, b);
    }
}
