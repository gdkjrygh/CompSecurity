// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, ai, ay, bc, 
//            ae

public final class bb extends g
{

    private final ai a;
    private final ay b;

    public bb(ai ai1, ay ay1)
    {
        a = (ai)c.a(ai1, "videoRendererFactory cannot be null");
        b = (ay)c.a(ay1, "transferRendererFactory cannot be null");
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new bc(this, view, viewgroup, a.a(view, viewgroup), b.a(view, viewgroup));
    }

    public final boolean a(Transfer transfer)
    {
        return b.a(transfer);
    }
}
