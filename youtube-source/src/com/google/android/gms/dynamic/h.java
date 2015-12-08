// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.e;

// Referenced classes of package com.google.android.gms.dynamic:
//            b

final class h
    implements android.view.View.OnClickListener
{

    final Context a;
    final int b;
    final b c;

    h(b b1, Context context, int i)
    {
        c = b1;
        a = context;
        b = i;
        super();
    }

    public final void onClick(View view)
    {
        a.startActivity(e.a(a, b, -1));
    }
}
