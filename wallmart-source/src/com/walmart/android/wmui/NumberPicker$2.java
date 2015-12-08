// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.os.Handler;

// Referenced classes of package com.walmart.android.wmui:
//            NumberPicker

class this._cls0
    implements Runnable
{

    final NumberPicker this$0;

    public void run()
    {
        if (NumberPicker.access$000(NumberPicker.this))
        {
            changeCurrent(mCurrent + 1);
            NumberPicker.access$200(NumberPicker.this).postDelayed(this, NumberPicker.access$100(NumberPicker.this));
        } else
        if (NumberPicker.access$300(NumberPicker.this))
        {
            changeCurrent(mCurrent - 1);
            NumberPicker.access$200(NumberPicker.this).postDelayed(this, NumberPicker.access$100(NumberPicker.this));
            return;
        }
    }

    ()
    {
        this$0 = NumberPicker.this;
        super();
    }
}
