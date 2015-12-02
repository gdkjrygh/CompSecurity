// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;
import android.widget.Button;

// Referenced classes of package com.whatsapp:
//            VerifySms

class o0 extends CountDownTimer
{

    final VerifySms a;

    o0(VerifySms verifysms, long l, long l1)
    {
        a = verifysms;
        super(l, l1);
    }

    public void onFinish()
    {
        VerifySms.o(a).setText(a.getString(0x7f0e0469));
        VerifySms.o(a).setEnabled(true);
    }

    public void onTick(long l)
    {
        VerifySms.o(a).setText(a.getString(0x7f0e046a, new Object[] {
            DateUtils.getRelativeTimeSpanString(System.currentTimeMillis() + l, System.currentTimeMillis(), 0L)
        }));
    }
}
