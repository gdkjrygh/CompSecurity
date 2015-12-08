// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.d.b;
import com.google.android.apps.youtube.core.utils.ah;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bk

final class bw extends b
{

    final bk a;

    private bw(bk bk1)
    {
        a = bk1;
        super();
    }

    bw(bk bk1, byte byte0)
    {
        this(bk1);
    }

    public final void a()
    {
    }

    public final void a(Bitmap bitmap)
    {
        bk.i(a).setImageBitmap(ah.a(bk.h(a), bitmap, 2.0F));
    }

    public final void a(ImageView imageview)
    {
        super.a(imageview);
        bk.j(a).setBackgroundDrawable(null);
    }
}
