// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;
import com.ubercab.client.feature.notification.NotificationActionReceiver;

public final class ekq
    implements icg
{

    final NotificationActionReceiver a;
    private final Context b;

    public ekq(NotificationActionReceiver notificationactionreceiver, Context context)
    {
        a = notificationactionreceiver;
        super();
        b = context;
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        Toast.makeText(b, b.getString(0x7f070631), 1).show();
    }
}
