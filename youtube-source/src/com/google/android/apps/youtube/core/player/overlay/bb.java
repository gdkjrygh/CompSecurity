// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.app.Dialog;
import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bc, bd

public final class bb
{

    private final Context a;
    private Dialog b;

    public bb(Context context)
    {
        a = (Context)c.a(context, "context cannot be null");
    }

    public final void a()
    {
        if (b != null && b.isShowing())
        {
            b.dismiss();
        }
        b = null;
    }

    public final void a(List list, bd bd)
    {
        c.a(bd, "listener cannot be null");
        a();
        list = new ArrayAdapter(a, 0x1090011, list);
        bd = new bc(this, list, bd);
        b = (new aa(a)).setTitle(p.fQ).setSingleChoiceItems(list, 0, bd).create();
        b.show();
    }
}
