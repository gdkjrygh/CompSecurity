// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            Conversation

class yo
    implements Runnable
{

    final Conversation a;

    yo(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void run()
    {
        if (Conversation.Q(a) != null)
        {
            Conversation.Q(a).setVisibility(8);
        }
        if (Conversation.p(a) != null)
        {
            Conversation.p(a).setVisibility(8);
        }
        if (Conversation.O(a) != null && Conversation.O(a).getVisibility() != 8)
        {
            Conversation.O(a).setVisibility(8);
            TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -1F);
            translateanimation.setDuration(200L);
            Conversation.O(a).startAnimation(translateanimation);
        }
    }
}
