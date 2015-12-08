// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.walmartlabs.android.photo.gcm.request.PhotoMessageFactory;
import com.walmartlabs.android.photo.service.order.PrintNotificationManager;
import com.walmartlabs.android.photo.util.PhotoLogger;
import java.util.Iterator;
import java.util.Set;

public class PhotoGcmHelper
{

    private static final String TAG = com/walmartlabs/android/photo/gcm/PhotoGcmHelper.getSimpleName();

    public PhotoGcmHelper()
    {
    }

    private static String messageToString(Intent intent)
    {
        if (intent != null)
        {
            StringBuilder stringbuilder = (new StringBuilder("Incoming GCM message: ")).append(intent.getAction()).append("\n");
            intent = intent.getExtras();
            if (intent == null || intent.size() == 0)
            {
                stringbuilder.append("   ").append("[No extras in intent]\n");
            } else
            {
                Iterator iterator = intent.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    stringbuilder.append("   ").append(s).append(" - ").append(String.valueOf(intent.get(s))).append("\n");
                }
            }
            return stringbuilder.toString();
        } else
        {
            return "";
        }
    }

    public static void onReceive(Context context, Intent intent)
    {
        PhotoLogger.get().d(TAG, messageToString(intent));
        intent = PhotoMessageFactory.get().createMessageFromIntent(intent);
        if (intent != null)
        {
            PrintNotificationManager.get(context).showOrderStatusNotification(intent);
        }
    }

}
