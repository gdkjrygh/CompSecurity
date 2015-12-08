// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view;

import android.view.View;

// Referenced classes of package com.walmartlabs.android.photo.view:
//            PhotoBaseView

class this._cls0
    implements android.view.ener
{

    final PhotoBaseView this$0;

    public void onClick(View view)
    {
        if (PhotoBaseView.access$000(PhotoBaseView.this) != null)
        {
            PhotoBaseView.access$000(PhotoBaseView.this).onPrimaryClicked();
        }
    }

    ttonListener()
    {
        this$0 = PhotoBaseView.this;
        super();
    }
}
