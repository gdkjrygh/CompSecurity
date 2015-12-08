// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.util.UserVoiceUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFAQPresenter

class this._cls0
    implements Runnable
{

    final this._cls0 this$0;

    public void run()
    {
        UserVoiceUtils.launchFeedback(cess._mth400(this._cls0.this));
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
