// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.search:
//            BasicSearchManager

class this._cls0
    implements android.widget.onListener
{

    final BasicSearchManager this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        requestSearch();
        return false;
    }

    ()
    {
        this$0 = BasicSearchManager.this;
        super();
    }
}
