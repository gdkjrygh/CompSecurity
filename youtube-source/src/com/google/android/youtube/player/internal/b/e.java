// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal.b;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.player.internal.ai;
import com.google.android.youtube.player.internal.as;
import com.google.android.youtube.player.internal.at;
import com.google.android.youtube.player.internal.c;
import com.google.android.youtube.player.internal.dynamic.YouTubeDynamicCode;
import com.google.android.youtube.player.internal.g;

// Referenced classes of package com.google.android.youtube.player.internal.b:
//            c, b

public final class e extends com.google.android.youtube.player.internal.b.c
{

    public e()
    {
    }

    public final c a(Context context, String s, as as, at at)
    {
        return new ai(context, s, context.getPackageName(), b.d(context), as, at);
    }

    public final g a(Activity activity, c c1, boolean flag)
    {
        return YouTubeDynamicCode.a(activity, c1.a(), flag);
    }
}
