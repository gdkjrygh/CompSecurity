// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;

public interface INotificationSideChannel
    extends IInterface
{

    public abstract void cancel(String s, int i, String s1);

    public abstract void cancelAll(String s);

    public abstract void notify(String s, int i, String s1, Notification notification);
}
