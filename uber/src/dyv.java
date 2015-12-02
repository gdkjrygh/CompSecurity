// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.ubercab.client.feature.addressbook.UploadContactsIntentService;
import java.util.concurrent.TimeUnit;

public class dyv
{

    private static final int a = dyv.getName().hashCode();
    private static final long b;
    private final gju c;
    private final gmg d;
    private final cys e;
    private final dal f;

    public dyv(gmg gmg1, cys cys1, dal dal1, gju gju1)
    {
        d = gmg1;
        e = cys1;
        f = dal1;
        c = gju1;
    }

    private static void a(Context context, long l)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        context = PendingIntent.getService(context, a, UploadContactsIntentService.a(context), 0x8000000);
        alarmmanager.set(1, gju.a() + l, context);
    }

    public final boolean a(Context context)
    {
        if (e.a("android.permission.READ_CONTACTS") && !d.b(dbf.w))
        {
            long l = f.Y();
            long l1 = gju.a();
            if (l1 - l > (long)(int)TimeUnit.DAYS.toMillis(d.a(dbf.aa, "min_delay_days", 7L)) || l > l1)
            {
                f.b(l1);
                a(context, b);
                return true;
            }
        }
        return false;
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(10L);
    }
}
