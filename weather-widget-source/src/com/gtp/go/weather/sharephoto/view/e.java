// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            LikeUnlikeAnimView

public class e
{

    public static void a(Context context, ViewGroup viewgroup)
    {
        if (context == null || viewgroup == null)
        {
            return;
        } else
        {
            context = (LikeUnlikeAnimView)LayoutInflater.from(context).inflate(0x7f0300e8, null);
            viewgroup.addView(context, -1, -1);
            context.a();
            return;
        }
    }

    public static void b(Context context, ViewGroup viewgroup)
    {
        if (context == null || viewgroup == null)
        {
            return;
        } else
        {
            context = (LikeUnlikeAnimView)LayoutInflater.from(context).inflate(0x7f0300e8, null);
            viewgroup.addView(context, -1, -1);
            context.b();
            return;
        }
    }
}
