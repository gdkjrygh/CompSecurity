// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.alipay;

import android.content.Context;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.sms.SmsReceiver;
import dfp;
import euz;
import hog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AlipayVerificationCodeReceiver extends SmsReceiver
{

    private static final long b;
    public euz a;
    private boolean c;
    private final hog d = new hog();

    public AlipayVerificationCodeReceiver()
    {
    }

    private String a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Object obj = (SmsMessage)list.next();
            obj = d.a(((SmsMessage) (obj)).getMessageBody());
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return ((String) (obj));
            }
        }

        return null;
    }

    protected final void a(Context context, List list)
    {
        if (!c)
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
            c = true;
        }
        context = a(list);
        if (TextUtils.isEmpty(context))
        {
            return;
        } else
        {
            a.a(context, b);
            return;
        }
    }

    static 
    {
        b = TimeUnit.MINUTES.toMillis(30L);
    }
}
