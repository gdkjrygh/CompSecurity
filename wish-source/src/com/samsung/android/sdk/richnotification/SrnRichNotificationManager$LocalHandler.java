// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotificationManager

private static class <init> extends Handler
{

    private static final String CALLBACK_EXTRA_ERROR = "error";
    private static final String CALLBACK_EXTRA_UUID = "uuid";
    private static final String CALLBACK_EXTRA_UUID_LIST = "uuid_list";
    private static final int CALLBACK_TYPE_ALL_REMOVED = 2;
    private static final int CALLBACK_TYPE_ERROR = 3;
    private static final int CALLBACK_TYPE_READ = 0;
    private static final int CALLBACK_TYPE_REMOVED = 1;
    private final WeakReference mManagerRef;

    private void handleAllRemoved(SrnRichNotificationManager srnrichnotificationmanager, Bundle bundle)
    {
        bundle = bundle.getStringArrayList("uuid_list");
        if (bundle == null)
        {
            Log.e("RichNotification", "RICH_NOTIFICATION_CALLBACK_ALL_REMOVED : uuid list is null.");
        } else
        {
            bundle = bundle.iterator();
            while (bundle.hasNext()) 
            {
                String s = (String)bundle.next();
                try
                {
                    notifyRemoved(srnrichnotificationmanager, UUID.fromString(s));
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    Log.e("RichNotification", String.format("RICH_NOTIFICATION_CALLBACK_ALL_REMOVED : uuid is not formatted correctly. (%s)", new Object[] {
                        s
                    }));
                }
            }
        }
    }

    private void handleCallbacks(SrnRichNotificationManager srnrichnotificationmanager, Bundle bundle, int i)
    {
        String s = bundle.getString("uuid");
        if (s != null) goto _L2; else goto _L1
_L1:
        Log.e("RichNotification", "RICH_NOTIFICATION_CALLBACK : uuid is null.");
_L4:
        return;
_L2:
        UUID uuid;
        try
        {
            uuid = UUID.fromString(s);
        }
        // Misplaced declaration of an exception variable
        catch (SrnRichNotificationManager srnrichnotificationmanager)
        {
            Log.e("RichNotification", String.format("RICH_NOTIFICATION_CALLBACK : uuid is not formatted correctly. (%s)", new Object[] {
                s
            }));
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            return;

        case 0: // '\0'
            Log.d("RichNotification", (new StringBuilder("RICH_NOTIFICATION_CALLBACK_READ : ")).append(s).toString());
            srnrichnotificationmanager = SrnRichNotificationManager.access$0(srnrichnotificationmanager).iterator();
            while (srnrichnotificationmanager.hasNext()) 
            {
                (()srnrichnotificationmanager.next()).onRead(uuid);
            }
            break;

        case 1: // '\001'
            notifyRemoved(srnrichnotificationmanager, uuid);
            return;

        case 3: // '\003'
            i = bundle.getInt("error", 0);
            Log.d("RichNotification", (new StringBuilder("RICH_NOTIFICATION_CALLBACK_REMOVED : ")).append(s).append(", ").append(i).toString());
            bundle = (i);
            srnrichnotificationmanager = SrnRichNotificationManager.access$0(srnrichnotificationmanager).iterator();
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        while (srnrichnotificationmanager.hasNext()) 
        {
            (()srnrichnotificationmanager.next()).onError(uuid, bundle);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void notifyRemoved(SrnRichNotificationManager srnrichnotificationmanager, UUID uuid)
    {
        Log.d("RichNotification", (new StringBuilder("RICH_NOTIFICATION_CALLBACK_REMOVED : ")).append(uuid).toString());
        srnrichnotificationmanager = SrnRichNotificationManager.access$0(srnrichnotificationmanager).iterator();
        do
        {
            if (!srnrichnotificationmanager.hasNext())
            {
                return;
            }
            (()srnrichnotificationmanager.next()).onRemoved(uuid);
        } while (true);
    }

    public void handleMessage(Message message)
    {
        SrnRichNotificationManager srnrichnotificationmanager = (SrnRichNotificationManager)mManagerRef.get();
        if (srnrichnotificationmanager == null)
        {
            return;
        }
        if (SrnRichNotificationManager.access$0(srnrichnotificationmanager) == null || SrnRichNotificationManager.access$0(srnrichnotificationmanager).size() == 0)
        {
            Log.w("RichNotification", "No event listener registered.");
            return;
        }
        message = (Bundle)message.obj;
        int i = message.getInt("notification.sdk.actiontype", -1);
        if (i == 2)
        {
            handleAllRemoved(srnrichnotificationmanager, message);
            return;
        } else
        {
            handleCallbacks(srnrichnotificationmanager, message, i);
            return;
        }
    }

    private (Context context, SrnRichNotificationManager srnrichnotificationmanager)
    {
        super(context.getMainLooper());
        mManagerRef = new WeakReference(srnrichnotificationmanager);
    }

    mManagerRef(Context context, SrnRichNotificationManager srnrichnotificationmanager, mManagerRef mmanagerref)
    {
        this(context, srnrichnotificationmanager);
    }
}
