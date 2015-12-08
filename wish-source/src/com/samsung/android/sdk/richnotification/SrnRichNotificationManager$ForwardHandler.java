// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.gson.Gson;
import java.util.UUID;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotificationManager, GsonHelper, SrnRichNotification, ErrorToast

private static class <init> extends Handler
{

    private static final int FORWARD_DISMISS = 1;
    private static final int FORWARD_DISMISS_ALL = 2;
    private static final int FORWARD_NOTIFY = 0;
    private static final int FORWARD_SHOW_ERROR_TOAST = 3;
    private final Context mContext;

    private void handleDismiss(UUID uuid)
    {
        Intent intent = new Intent("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_FORWARD");
        intent.putExtra("ACTION_RICH_NOTIFICATION_FORWARD_TYPE", "RICH_NOTIFICATION_DISMISS");
        intent.putExtra("notification.sdk.uuid", uuid.toString());
        SrnRichNotificationManager.access$1(mContext, intent);
    }

    private void handleDismissAll()
    {
        Intent intent = new Intent("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_FORWARD");
        intent.putExtra("ACTION_RICH_NOTIFICATION_FORWARD_TYPE", "RICH_NOTIFICATION_DISMISS_ALL");
        SrnRichNotificationManager.access$1(mContext, intent);
    }

    private void handleNotify(SrnRichNotification srnrichnotification)
    {
        Intent intent = new Intent("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_FORWARD");
        String s = GsonHelper.getGson().toJson(srnrichnotification);
        intent.putExtra("ACTION_RICH_NOTIFICATION_FORWARD_TYPE", "RICH_NOTIFICATION_SEND");
        intent.putExtra("notification.sdk.message", s);
        intent.putExtra("notification.sdk.uuid", srnrichnotification.getUuid().toString());
        intent.putExtra("ASSOCIATED_NOTI_ID", srnrichnotification.getAssociatedAndroidNotification());
        intent.putExtra("ASSOCIATED_NOTI_TAG", srnrichnotification.getAssociatedAndroidNotificationTag());
        SrnRichNotificationManager.access$1(mContext, intent);
    }

    private void handleShowErrorToast(ErrorToast errortoast)
    {
        Intent intent = new Intent("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_FORWARD");
        intent.putExtra("ACTION_RICH_NOTIFICATION_FORWARD_TYPE", "RICH_NOTIFICATION_SHOW_ERROR_TOAST");
        intent.putExtra("notification.sdk.uuid", errortoast.getUuid().toString());
        intent.putExtra("notification.sdk.message", GsonHelper.getGson().toJson(errortoast));
        SrnRichNotificationManager.access$1(mContext, intent);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            handleNotify((SrnRichNotification)message.obj);
            return;

        case 1: // '\001'
            handleDismiss((UUID)message.obj);
            return;

        case 2: // '\002'
            handleDismissAll();
            return;

        case 3: // '\003'
            handleShowErrorToast((ErrorToast)message.obj);
            break;
        }
    }

    private (Context context, Looper looper)
    {
        super(looper);
        mContext = context;
    }

    mContext(Context context, Looper looper, mContext mcontext)
    {
        this(context, looper);
    }
}
