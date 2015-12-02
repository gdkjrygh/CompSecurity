// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.SmsMessage;
import com.ubercab.client.core.app.RiderApplication;
import java.util.concurrent.TimeUnit;

public final class gjd
    implements drh
{

    public static final long a;
    giz b;

    public gjd(Context context)
    {
        ((RiderApplication)context.getApplicationContext()).b().a(this);
    }

    public final String a()
    {
        return "com.uber.SMS_RECEIVER";
    }

    public final boolean a(SmsMessage smsmessage)
    {
        if (b.c())
        {
            if ((smsmessage = dur.a(smsmessage.getMessageBody())) != null)
            {
                b.b(smsmessage);
                b.a(smsmessage);
                return true;
            }
        }
        return false;
    }

    public final void b()
    {
        b.d();
    }

    public final void c()
    {
        b.d();
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(60L);
    }
}
