// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.view.View;

// Referenced classes of package com.walmartlabs.ui:
//            FloatLabel

class this._cls0
    implements android.view.hangeListener
{

    final FloatLabel this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (FloatLabel.access$000(FloatLabel.this) == 0)
        {
            view = FloatLabel.this;
            int i;
            if (flag)
            {
                i = FloatLabel.access$100(FloatLabel.this);
            } else
            {
                i = FloatLabel.access$200(FloatLabel.this);
            }
            view.setTextColor(i);
        }
    }

    istener()
    {
        this$0 = FloatLabel.this;
        super();
    }
}
