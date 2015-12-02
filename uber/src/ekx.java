// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.ubercab.client.feature.notification.NotificationActionActivity;

public final class ekx
{

    public static PendingIntent a(Context context, int i, String s)
    {
        Intent intent = new Intent("com.ubercab.client.ACTION_DELETE");
        intent.putExtra("com.ubercab.client.EXTRA_ID", i);
        intent.putExtra("com.ubercab.client.EXTRA_TAG", s);
        return PendingIntent.getBroadcast(context, i + 1000, intent, 0x8000000);
    }

    public static PendingIntent a(Context context, int i, String s, boolean flag)
    {
        if (flag)
        {
            Intent intent = new Intent();
            intent.setClass(context, com/ubercab/client/feature/notification/NotificationActionActivity);
            intent.setFlags(0x10000000);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("com.ubercab.client.EXTRA_ACTION", s);
            intent.putExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER", i);
            return PendingIntent.getActivity(context, s.hashCode(), intent, 0x8000000);
        } else
        {
            Intent intent1 = new Intent();
            intent1.setAction("com.ubercab.client.ACTION_CLICK");
            intent1.putExtra("com.ubercab.client.EXTRA_ACTION", s);
            intent1.putExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER", i);
            return PendingIntent.getBroadcast(context, s.hashCode(), intent1, 0x8000000);
        }
    }
}
