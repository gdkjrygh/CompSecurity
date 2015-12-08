// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.d.c;
import com.google.android.apps.youtube.core.utils.ah;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cr

final class cz extends c
{

    final cr a;

    cz(cr cr1, Context context, ImageView imageview)
    {
        a = cr1;
        super(context, imageview, null);
    }

    protected final void a()
    {
        super.a();
        cr.o(a).setBackgroundDrawable(null);
    }

    public final void a(Uri uri, Bitmap bitmap)
    {
        super.a(uri, bitmap);
        cr.n(a).setImageBitmap(ah.a(com.google.android.apps.youtube.app.ui.cr.c(a), bitmap, 2.0F));
    }

    public final volatile void a(Object obj, Object obj1)
    {
        a((Uri)obj, (Bitmap)obj1);
    }
}
