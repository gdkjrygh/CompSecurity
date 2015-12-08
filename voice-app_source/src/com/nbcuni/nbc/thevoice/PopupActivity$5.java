// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.os.CountDownTimer;
import android.widget.RelativeLayout;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupActivity

class this._cls0 extends CountDownTimer
{

    final PopupActivity this$0;

    public void onFinish()
    {
        PopupActivity.access$12(PopupActivity.this).setVisibility(8);
        PopupActivity.access$13(PopupActivity.this).setVisibility(0);
    }

    public void onTick(long l)
    {
    }

    (long l, long l1)
    {
        this$0 = PopupActivity.this;
        super(l, l1);
    }
}
