// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.youtube.app.d.r;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.distiller.model.b;
import com.google.android.apps.youtube.datalib.distiller.model.c;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            b, f, g

public final class w extends com.google.android.apps.youtube.app.ui.presenter.b
{

    public w(Activity activity, bj bj, com.google.android.apps.youtube.app.ui.presenter.f f, g g, r r)
    {
        super(View.inflate(activity, l.R, null), activity, bj, f, g, r);
    }

    public final volatile View a(f f, c c)
    {
        return super.a(f, (b)c);
    }

    public final volatile View a(f f, Object obj)
    {
        return super.a(f, (b)obj);
    }
}
