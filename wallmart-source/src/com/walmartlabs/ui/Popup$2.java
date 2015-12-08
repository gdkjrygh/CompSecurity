// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.walmartlabs.ui:
//            Popup

class this._cls0
    implements android.view.ouchListener
{

    final Popup this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (Popup.access$100(Popup.this))
        {
            dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    stener()
    {
        this$0 = Popup.this;
        super();
    }
}
