// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.upload;

import android.widget.TextView;
import com.walmartlabs.android.photo.util.RefreshTimer;

// Referenced classes of package com.walmartlabs.android.photo.view.upload:
//            UploadProgressView

class this._cls0 extends RefreshTimer
{

    final UploadProgressView this$0;

    public void onRefresh()
    {
        UploadProgressView.access$102(UploadProgressView.this, UploadProgressView.access$100(UploadProgressView.this).concat("."));
        if (UploadProgressView.access$100(UploadProgressView.this).length() > 3)
        {
            UploadProgressView.access$102(UploadProgressView.this, "");
        }
        UploadProgressView.access$200(UploadProgressView.this).setText(UploadProgressView.access$100(UploadProgressView.this));
        UploadProgressView.access$300(UploadProgressView.this).start();
    }

    (long l)
    {
        this$0 = UploadProgressView.this;
        super(l);
    }
}
