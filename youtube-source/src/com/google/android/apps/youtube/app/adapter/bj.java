// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            bg, bm, ae

final class bj extends bg
{

    final Context a;
    final int b;

    bj(Context context, int i)
    {
        a = context;
        b = i;
        super();
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new bm(a, view, viewgroup, b, (byte)0);
    }
}
