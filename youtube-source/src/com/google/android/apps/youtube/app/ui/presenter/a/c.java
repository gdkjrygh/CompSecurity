// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.d.b;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.youtube.f;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter.a:
//            b

final class c extends b
{

    final com.google.android.apps.youtube.app.ui.presenter.a.b a;

    private c(com.google.android.apps.youtube.app.ui.presenter.a.b b1)
    {
        a = b1;
        super();
    }

    c(com.google.android.apps.youtube.app.ui.presenter.a.b b1, byte byte0)
    {
        this(b1);
    }

    public final void a()
    {
        b.a(a).a().setBackgroundResource(f.a);
    }

    public final void a(Bitmap bitmap)
    {
        b.a(a).a().setBackgroundDrawable(null);
    }
}
