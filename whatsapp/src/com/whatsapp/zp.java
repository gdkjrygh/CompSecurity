// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.ConditionVariable;

// Referenced classes of package com.whatsapp:
//            SpamWarningActivity, Main

class zp extends Thread
{

    final SpamWarningActivity a;

    zp(SpamWarningActivity spamwarningactivity)
    {
        a = spamwarningactivity;
        super();
    }

    public void run()
    {
        SpamWarningActivity.c().block();
        Intent intent = new Intent(null, null, a, Main.g());
        a.startActivity(intent);
        a.finish();
    }
}
