// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.view.View;
import com.uservoice.uservoicesdk.dialog.UnhelpfulDialogFragment;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ArticleActivity

class this._cls0
    implements android.view.er
{

    final ArticleActivity this$0;

    public void onClick(View view)
    {
        (new UnhelpfulDialogFragment()).show(getSupportFragmentManager(), "UnhelpfulDialogFragment");
    }

    ent()
    {
        this$0 = ArticleActivity.this;
        super();
    }
}
