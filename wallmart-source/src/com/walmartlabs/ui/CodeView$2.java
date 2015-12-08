// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.view.View;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmartlabs.ui:
//            CodeView

class this._cls0
    implements android.view.kListener
{

    final CodeView this$0;

    public void onClick(View view)
    {
        ViewUtil.showKeyboard(view);
    }

    Util()
    {
        this$0 = CodeView.this;
        super();
    }
}
