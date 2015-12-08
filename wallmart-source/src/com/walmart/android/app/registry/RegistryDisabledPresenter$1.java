// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.registry;

import android.view.View;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.GooglePlay;

// Referenced classes of package com.walmart.android.app.registry:
//            RegistryDisabledPresenter

class this._cls0 extends OnSingleClickListener
{

    final RegistryDisabledPresenter this$0;

    public void onSingleClick(View view)
    {
        GooglePlay.launch(RegistryDisabledPresenter.access$000(RegistryDisabledPresenter.this));
    }

    (Presenter presenter)
    {
        this$0 = RegistryDisabledPresenter.this;
        super(presenter);
    }
}
