// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.notifications;

import android.app.Notification;
import android.content.Context;
import android.net.Uri;
import java.util.Collection;

public interface NotificationCreator
{

    public abstract Notification create(Collection collection, Context context, Uri uri, int i, Integer integer, String s);

    public abstract int getNotificationId(Collection collection);

    public abstract boolean hasBackgroundImage();
}
