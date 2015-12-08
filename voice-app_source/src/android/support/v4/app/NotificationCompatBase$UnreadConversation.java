// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;

// Referenced classes of package android.support.v4.app:
//            NotificationCompatBase

public static abstract class Factory
{
    public static interface Factory
    {

        public abstract NotificationCompatBase.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l);
    }


    abstract long getLatestTimestamp();

    abstract String[] getMessages();

    abstract String getParticipant();

    abstract String[] getParticipants();

    abstract PendingIntent getReadPendingIntent();

    abstract Factory getRemoteInput();

    abstract PendingIntent getReplyPendingIntent();

    public Factory()
    {
    }
}
