// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            EditVideoActivity

final class h
    implements b
{

    final EditVideoActivity a;

    private h(EditVideoActivity editvideoactivity)
    {
        a = editvideoactivity;
        super();
    }

    h(EditVideoActivity editvideoactivity, byte byte0)
    {
        this(editvideoactivity);
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.app.honeycomb.phone.EditVideoActivity.b(a).setImageDrawable(null);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        com.google.android.apps.youtube.app.honeycomb.phone.EditVideoActivity.b(a).setImageBitmap(((Bitmap) (obj)));
    }
}
