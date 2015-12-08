// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            h

class i
    implements android.view.View.OnClickListener
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public void onClick(View view)
    {
        if (view == h.a(a) && h.b(a) != null)
        {
            view = Message.obtain(h.b(a));
        } else
        if (view == h.c(a) && h.d(a) != null)
        {
            view = Message.obtain(h.d(a));
        } else
        if (view == h.e(a) && h.f(a) != null)
        {
            view = Message.obtain(h.f(a));
        } else
        {
            view = null;
        }
        if (view != null)
        {
            view.sendToTarget();
        }
        h.h(a).obtainMessage(1, h.g(a)).sendToTarget();
    }
}
