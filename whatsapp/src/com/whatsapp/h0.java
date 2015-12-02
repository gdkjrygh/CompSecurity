// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.animation.Animation;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            ConversationsFragment, y2

class h0
    implements android.view.animation.Animation.AnimationListener
{

    final int a;
    final ConversationsFragment b;

    h0(ConversationsFragment conversationsfragment, int i)
    {
        b = conversationsfragment;
        a = i;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        ConversationsFragment.h(b).post(new y2(this));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
