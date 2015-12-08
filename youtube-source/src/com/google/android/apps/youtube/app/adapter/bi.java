// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            bg, bl, ae

final class bi extends bg
{

    final Context a;

    bi(Context context)
    {
        a = context;
        super();
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new bl(a, view, viewgroup, (byte)0);
    }
}
