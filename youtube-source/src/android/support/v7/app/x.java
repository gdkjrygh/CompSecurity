// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.media.ad;
import android.support.v7.media.u;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            u

final class x
    implements android.view.View.OnClickListener
{

    final android.support.v7.app.u a;

    x(android.support.v7.app.u u1)
    {
        a = u1;
        super();
    }

    public final void onClick(View view)
    {
        if (u.d(a).e())
        {
            u.e(a);
            u.b().n();
        }
        a.dismiss();
    }
}
