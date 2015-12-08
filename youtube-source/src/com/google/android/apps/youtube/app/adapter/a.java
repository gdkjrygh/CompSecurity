// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            k, b

public abstract class a extends k
{

    private final bc a;
    private final bj b;

    public a(Context context, bc bc1, bj bj1)
    {
        super(context, j.ah);
        a = (bc)c.a(bc1);
        b = (bj)c.a(bj1);
    }

    static bj a(a a1)
    {
        return a1.b;
    }

    protected abstract Uri a(Object obj);

    protected void a(Object obj, View view, b b1)
    {
        a.a(a(obj), new com.google.android.apps.youtube.app.adapter.b(this, b1));
    }
}
