// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.view.MotionEvent;

// Referenced classes of package uk.co.senab.photoview:
//            b

class c extends android.view.GestureDetector.SimpleOnGestureListener
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void onLongPress(MotionEvent motionevent)
    {
        if (b.a(a) != null)
        {
            b.a(a).onLongClick(a.c());
        }
    }
}
