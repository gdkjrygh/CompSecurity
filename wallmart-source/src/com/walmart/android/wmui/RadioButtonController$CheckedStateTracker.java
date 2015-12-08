// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.widget.CompoundButton;

// Referenced classes of package com.walmart.android.wmui:
//            RadioButtonController

private class <init>
    implements android.widget.teTracker
{

    final RadioButtonController this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (RadioButtonController.access$100(RadioButtonController.this))
        {
            return;
        }
        RadioButtonController.access$102(RadioButtonController.this, true);
        if (RadioButtonController.access$200(RadioButtonController.this) != -1)
        {
            RadioButtonController.access$300(RadioButtonController.this, RadioButtonController.access$200(RadioButtonController.this), false);
        }
        RadioButtonController.access$102(RadioButtonController.this, false);
        int i = compoundbutton.getId();
        RadioButtonController.access$400(RadioButtonController.this, i);
    }

    private ()
    {
        this$0 = RadioButtonController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
