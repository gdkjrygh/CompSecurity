// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;
import android.view.View;
import java.io.IOException;

// Referenced classes of package com.sessionm.ui:
//            ImageViewContainer

class this._cls0
    implements android.view.._cls2
{

    final ImageViewContainer this$0;

    public void onClick(View view)
    {
        view = ImageViewContainer.access$200(ImageViewContainer.this);
        if (view != null)
        {
            ImageViewContainer.access$300(ImageViewContainer.this, view);
        }
_L2:
        return;
        view;
        if (Log.isLoggable("SessionM.ImageView", 6))
        {
            Log.e("SessionM.ImageView", "error saving image.", view);
        }
        if (ImageViewContainer.access$100(ImageViewContainer.this) != null)
        {
            ImageViewContainer.access$100(ImageViewContainer.this).onError(ImageViewContainer.this);
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    stener()
    {
        this$0 = ImageViewContainer.this;
        super();
    }
}
