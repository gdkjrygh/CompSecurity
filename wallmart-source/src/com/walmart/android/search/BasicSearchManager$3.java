// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.view.View;

// Referenced classes of package com.walmart.android.search:
//            BasicSearchManager

class this._cls0
    implements android.view.archManager._cls3
{

    final BasicSearchManager this$0;

    public void onClick(View view)
    {
        if (BasicSearchManager.access$000(BasicSearchManager.this) != null)
        {
            BasicSearchManager.access$000(BasicSearchManager.this).onVoiceSearchRequested();
        }
    }

    VoiceSearchRequestedListener()
    {
        this$0 = BasicSearchManager.this;
        super();
    }
}
