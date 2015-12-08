// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            o, q

final class p
    implements android.view.View.OnTouchListener
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        while (!view.isEnabled() || motionevent.getAction() != 0 || o.a(a) == null) 
        {
            return false;
        }
        float f = ((float)(o.b(a) * 1000) * motionevent.getX()) / (float)(view.getRight() - view.getLeft());
        o.a(a).a((int)f);
        return true;
    }
}
