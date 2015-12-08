// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import com.weather.commons.facade.FollowMeCurrentWeatherFacade;

// Referenced classes of package com.weather.Weather.chat:
//            ChatActivity, ChatOverlayViewer

class ntWeatherFacade
    implements Runnable
{

    final ChatActivity this$0;
    final FollowMeCurrentWeatherFacade val$change;

    public void run()
    {
        ChatActivity.access$1102(ChatActivity.this, val$change.currentWeatherFacade);
        ChatActivity.access$500(ChatActivity.this).update(ChatActivity.access$1100(ChatActivity.this), ChatActivity.access$1000(ChatActivity.this));
    }

    ntWeatherFacade()
    {
        this$0 = final_chatactivity;
        val$change = FollowMeCurrentWeatherFacade.this;
        super();
    }
}
