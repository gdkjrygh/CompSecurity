// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.notifications;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.NotificationDismissReceiver;
import com.weather.commons.push.alertmessages.AlertMessage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.weather.commons.push.notifications:
//            NotificationCreator

public abstract class AbstractNotificationCreator
    implements NotificationCreator
{

    private final Class handlingActivity;
    private final String moduleId;

    protected AbstractNotificationCreator(Class class1, String s)
    {
        handlingActivity = class1;
        moduleId = s;
    }

    private PendingIntent getContentIntent(Context context, AlertMessage alertmessage, int i)
    {
        Intent intent = new Intent(context, handlingActivity);
        Bundle bundle = new Bundle();
        bundle.putString(AlertResponseField.PRODUCT.getName(), alertmessage.getProductCode());
        bundle.putString(AlertResponseField.LOCATION_CODE.getName(), alertmessage.getLocationCode());
        bundle.putString(AlertResponseField.LOC_TYPE.getName(), alertmessage.getLocType());
        bundle.putString(AlertResponseField.LOCATION.getName(), alertmessage.getLocation());
        bundle.putString(AlertResponseField.OFFICE_ID.getName(), alertmessage.getOfficeId());
        bundle.putString(AlertResponseField.ETNPHENOM.getName(), alertmessage.getPhenom());
        bundle.putString(AlertResponseField.SIGNIFICANCE.getName(), alertmessage.getSignificance());
        bundle.putString(AlertResponseField.ETN.getName(), alertmessage.getEtn());
        bundle.putString(AlertResponseField.COUNTRY_CODE.getName(), alertmessage.getCountryCode());
        bundle.putString(AlertResponseField.ARTICLE_ID.getName(), alertmessage.getArticleId());
        bundle.putString("com.weather.moduleId", moduleId);
        bundle.putSerializable("com.weather.extraAdTargeting", new HashMap(alertmessage.getAdTargeting()));
        intent.putExtras(bundle);
        context = TaskStackBuilder.create(context);
        context.addParentStack(handlingActivity);
        context.addNextIntent(intent);
        return context.getPendingIntent(i, 0x8000000);
    }

    private PendingIntent getDismissedIntent(Context context, AlertMessage alertmessage, int i)
    {
        Intent intent = new Intent(context, com/weather/commons/push/NotificationDismissReceiver);
        Bundle bundle = new Bundle();
        bundle.putString(AlertResponseField.PRODUCT.getName(), alertmessage.getProductCode());
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast(context.getApplicationContext(), i, intent, 0x10000000);
    }

    protected abstract void addContent(android.support.v4.app.NotificationCompat.Builder builder, Collection collection, Context context, AlertMessage alertmessage);

    public final Notification create(Collection collection, Context context, Uri uri, int i, Integer integer, String s)
    {
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context);
        collection = sortList(collection);
        AlertMessage alertmessage = (AlertMessage)collection.iterator().next();
        int j = getNotificationId(collection);
        builder.setContentIntent(getContentIntent(context, alertmessage, j));
        builder.setDeleteIntent(getDismissedIntent(context, alertmessage, j));
        builder.setContentInfo(s);
        builder.setAutoCancel(true);
        builder.setDefaults(i);
        builder.setColor(alertmessage.getColor(context));
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            builder.setLargeIcon(alertmessage.getLargeIcon(context));
        }
        builder.setSmallIcon(alertmessage.getSmallIcon(), alertmessage.getSmallIconLevel());
        if (uri != null)
        {
            builder.setSound(uri);
        }
        if (integer != null)
        {
            builder.setLights(integer.intValue(), 300, 2000);
        }
        addContent(builder, collection, context, alertmessage);
        return builder.build();
    }

    protected Collection sortList(Collection collection)
    {
        return collection;
    }
}
