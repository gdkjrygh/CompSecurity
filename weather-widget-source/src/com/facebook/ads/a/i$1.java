// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.ads.a:
//            i, ac

class 
    implements android.view..OnTouchListener
{

    final i a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            if (i.a(a))
            {
                view = new Intent();
                view.setAction("android.intent.action.VIEW");
                view.addCategory("android.intent.category.BROWSABLE");
                view.setData(Uri.parse(i.b(a).getAdChoicesLinkUrl()));
                a.getContext().startActivity(view);
            } else
            {
                i.c(a);
            }
            return true;
        } else
        {
            return false;
        }
    }

    t(i j)
    {
        a = j;
        super();
    }
}
