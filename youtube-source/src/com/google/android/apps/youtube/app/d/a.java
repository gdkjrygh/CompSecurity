// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            b, c, e

public final class a
{

    public static void a(Context context, bj bj1, Uri uri, ImageView imageview)
    {
        a(context, bj1, uri, imageview, ((com.google.android.apps.youtube.app.d.e) (new b())));
    }

    public static void a(Context context, bj bj1, Uri uri, ImageView imageview, com.google.android.apps.youtube.app.d.e e1)
    {
        c.a(context);
        c.a(bj1);
        c.a(uri);
        c.a(imageview);
        Handler handler1 = imageview.getHandler();
        Handler handler = handler1;
        if (handler1 == null)
        {
            handler = new Handler(Looper.getMainLooper());
        }
        bj1.a(uri, e.a(handler, new com.google.android.apps.youtube.app.d.c(context, imageview, e1)));
    }
}
