// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.app.Dialog;
import android.view.View;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.views.ConfirmDialogView;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            f

class k
    implements android.view.View.OnClickListener
{

    final f a;

    k(f f1)
    {
        a = f1;
        super();
    }

    public void onClick(View view)
    {
        f.b(a).dismiss();
        a.f.a(a.a, f.c(a).a(), f.c(a).b());
    }
}
