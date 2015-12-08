// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            p, o

class q
    implements Runnable
{

    final Animation a;
    final p b;

    q(p p1, Animation animation)
    {
        b = p1;
        a = animation;
        super();
    }

    public void run()
    {
        b.a.a.startAnimation(a);
    }
}
