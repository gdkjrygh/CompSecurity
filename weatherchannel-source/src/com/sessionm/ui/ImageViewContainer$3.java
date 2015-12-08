// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.view.View;

// Referenced classes of package com.sessionm.ui:
//            ImageViewContainer

class this._cls0
    implements android.view.._cls3
{

    final ImageViewContainer this$0;

    public void onClick(View view)
    {
        if (ImageViewContainer.access$100(ImageViewContainer.this) != null)
        {
            ImageViewContainer.access$100(ImageViewContainer.this).onCanceled(ImageViewContainer.this);
        }
    }

    stener()
    {
        this$0 = ImageViewContainer.this;
        super();
    }
}
