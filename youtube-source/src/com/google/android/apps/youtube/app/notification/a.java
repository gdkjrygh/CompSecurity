// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.notification;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.youtube.n;

// Referenced classes of package com.google.android.apps.youtube.app.notification:
//            d, GcmBroadcastReceiver

final class a
    implements b
{

    final GcmBroadcastReceiver a;
    private final Context b;
    private final String c;
    private final String d;
    private final kz e;
    private final Resources f;

    private a(GcmBroadcastReceiver gcmbroadcastreceiver, Context context, String s, String s1, kz kz, Resources resources)
    {
        a = gcmbroadcastreceiver;
        super();
        b = context;
        c = s;
        d = s1;
        e = kz;
        f = resources;
    }

    a(GcmBroadcastReceiver gcmbroadcastreceiver, Context context, String s, String s1, kz kz, Resources resources, byte byte0)
    {
        this(gcmbroadcastreceiver, context, s, s1, kz, resources);
    }

    public final void a(Object obj, Exception exception)
    {
        L.b("Error retrieving thumbnail image for notification: ", exception);
        obj = BitmapFactory.decodeResource(f, n.a);
        com.google.android.apps.youtube.app.notification.d.a(b, c, d, ((Bitmap) (obj)), e);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        com.google.android.apps.youtube.app.notification.d.a(b, c, d, ((Bitmap) (obj)), e);
    }
}
