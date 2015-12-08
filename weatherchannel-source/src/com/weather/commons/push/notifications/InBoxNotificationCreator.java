// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.notifications;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.base.Function;
import com.weather.commons.push.alertmessages.AlertMessage;
import com.weather.commons.share.AlertUrlSharer;
import com.weather.commons.share.ShareMessageSupportForMedia;
import com.weather.commons.share.ShareableMessage;
import com.weather.util.app.AbstractTwcApplication;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.weather.commons.push.notifications:
//            AbstractNotificationCreator

public class InBoxNotificationCreator extends AbstractNotificationCreator
{

    private final int inBoxTitleResourceId;
    private final int notificationId;
    private final int shareSubjectQuantityResourceIdentifier;
    private final Function shareableFactory;

    public InBoxNotificationCreator(int i, int j, Class class1, int k, String s, Function function)
    {
        super(class1, s);
        inBoxTitleResourceId = i;
        notificationId = j;
        shareSubjectQuantityResourceIdentifier = k;
        shareableFactory = function;
    }

    protected void addContent(android.support.v4.app.NotificationCompat.Builder builder, Collection collection, Context context, AlertMessage alertmessage)
    {
        AlertUrlSharer alerturlsharer;
        if (collection.size() > 1)
        {
            builder.setContentTitle(context.getString(inBoxTitleResourceId, new Object[] {
                Integer.valueOf(collection.size())
            }));
            builder.setContentText((new StringBuilder()).append(alertmessage.getPresentationName()).append(": ").append(alertmessage.getDescription()).toString());
            builder.setNumber(collection.size());
            android.support.v4.app.NotificationCompat.InboxStyle inboxstyle = new android.support.v4.app.NotificationCompat.InboxStyle();
            AlertMessage alertmessage1;
            for (Iterator iterator = collection.iterator(); iterator.hasNext(); inboxstyle.addLine((new StringBuilder()).append(alertmessage1.getPresentationName()).append(": ").append(alertmessage1.getDescription()).toString()))
            {
                alertmessage1 = (AlertMessage)iterator.next();
            }

            inboxstyle.setSummaryText("");
            builder.setStyle(inboxstyle);
        } else
        {
            builder.setContentTitle(alertmessage.getDescription());
            builder.setContentText(alertmessage.getPresentationName());
            builder.setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(alertmessage.getPresentationName()).setSummaryText(""));
        }
        alerturlsharer = new AlertUrlSharer(AbstractTwcApplication.getRootContext(), new ShareMessageSupportForMedia(shareSubjectQuantityResourceIdentifier, com.weather.commons.R.string.share_twitter_prefix, com.weather.commons.R.string.share_chooser_title, collection) {

            final InBoxNotificationCreator this$0;
            final Collection val$alerts;

            public CharSequence getSubject(ShareableMessage shareablemessage)
            {
                return String.format(AbstractTwcApplication.getRootContext().getResources().getQuantityString(shareSubjectQuantityResourceIdentifier, alerts.size()), new Object[] {
                    shareablemessage.getMessageBody()
                });
            }

            
            {
                this$0 = InBoxNotificationCreator.this;
                alerts = collection;
                super(final_context, i, j, k);
            }
        });
        builder.setPriority(alertmessage.getPriority());
        builder.addAction(com.weather.commons.R.drawable.ic_action_share, context.getResources().getString(com.weather.commons.R.string.share), alerturlsharer.getPendingIntent((ShareableMessage)shareableFactory.apply(collection), notificationId));
    }

    public int getNotificationId(Collection collection)
    {
        return notificationId;
    }

    public boolean hasBackgroundImage()
    {
        return false;
    }

}
