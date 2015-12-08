// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.support.v4.app.FragmentManager;
import android.view.View;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            EditConfigurationFragment

class this._cls0
    implements android.view.EditConfigurationFragment._cls2
{

    final EditConfigurationFragment this$0;

    public void onClick(View view)
    {
        getFragmentManager().popBackStack();
    }

    ()
    {
        this$0 = EditConfigurationFragment.this;
        super();
    }
}
