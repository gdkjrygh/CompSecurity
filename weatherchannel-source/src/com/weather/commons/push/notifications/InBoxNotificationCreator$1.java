// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.notifications;

import android.content.Context;
import android.content.res.Resources;
import com.weather.commons.share.ShareMessageSupportForMedia;
import com.weather.commons.share.ShareableMessage;
import com.weather.util.app.AbstractTwcApplication;
import java.util.Collection;

// Referenced classes of package com.weather.commons.push.notifications:
//            InBoxNotificationCreator

class val.alerts extends ShareMessageSupportForMedia
{

    final InBoxNotificationCreator this$0;
    final Collection val$alerts;

    public CharSequence getSubject(ShareableMessage shareablemessage)
    {
        return String.format(AbstractTwcApplication.getRootContext().getResources().getQuantityString(InBoxNotificationCreator.access$000(InBoxNotificationCreator.this), val$alerts.size()), new Object[] {
            shareablemessage.getMessageBody()
        });
    }

    (int i, int j, int k, Collection collection)
    {
        this$0 = final_inboxnotificationcreator;
        val$alerts = collection;
        super(Context.this, i, j, k);
    }
}
