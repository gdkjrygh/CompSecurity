// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.animation.Animator;

// Referenced classes of package com.ubercab.client.core.ui:
//            CircleView

final class a
    implements Runnable
{

    final Animator a;
    final CircleView b;

    public final void run()
    {
        a.end();
    }

    (CircleView circleview, Animator animator)
    {
        b = circleview;
        a = animator;
        super();
    }
}
