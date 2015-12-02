// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.CountDownTimer;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            my, WebSessionsActivity, cz

class qb extends CountDownTimer
{

    final String a;
    final WebSessionsActivity b;

    qb(WebSessionsActivity websessionsactivity, long l, long l1, String s)
    {
        b = websessionsactivity;
        a = s;
        super(l, l1);
    }

    public void onFinish()
    {
        my.g(a);
        WebSessionsActivity.b(b).remove(a);
        WebSessionsActivity.d(b).a(my.g());
    }

    public void onTick(long l)
    {
    }
}
