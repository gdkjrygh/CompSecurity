// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk;

import android.content.Context;
import android.content.Intent;
import com.uservoice.uservoicesdk.activity.ContactActivity;
import com.uservoice.uservoicesdk.activity.ForumActivity;
import com.uservoice.uservoicesdk.activity.PortalActivity;
import com.uservoice.uservoicesdk.activity.PostIdeaActivity;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk:
//            Session, Config

public class UserVoice
{

    public UserVoice()
    {
    }

    public static String getVersion()
    {
        return "0.0.1";
    }

    public static void init(Config config, Context context)
    {
        Session.reset();
        Babayaga.init(context);
        Babayaga.setUserTraits(config.getUserTraits());
        Session.getInstance().setContext(context);
        Session.getInstance().setConfig(config);
    }

    public static void launchContactUs(Context context)
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_CHANNEL);
        context.startActivity(new Intent(context, com/uservoice/uservoicesdk/activity/ContactActivity));
    }

    public static void launchForum(Context context)
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_CHANNEL);
        context.startActivity(new Intent(context, com/uservoice/uservoicesdk/activity/ForumActivity));
    }

    public static void launchPostIdea(Context context)
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_CHANNEL);
        context.startActivity(new Intent(context, com/uservoice/uservoicesdk/activity/PostIdeaActivity));
    }

    public static void launchUserVoice(Context context)
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_CHANNEL);
        context.startActivity(new Intent(context, com/uservoice/uservoicesdk/activity/PortalActivity));
    }

    public static void setExternalId(String s, String s1)
    {
        Session.getInstance().setExternalId(s, s1);
    }

    public static void track(String s)
    {
        track(s, null);
    }

    public static void track(String s, Map map)
    {
        Babayaga.track(s, map);
    }
}
