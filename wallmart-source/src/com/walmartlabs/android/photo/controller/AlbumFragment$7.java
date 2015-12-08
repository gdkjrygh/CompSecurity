// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            AlbumFragment, LearnMoreActivity

class this._cls0
    implements android.view.ener
{

    final AlbumFragment this$0;

    public void onClick(View view)
    {
        startActivity(new Intent(getActivity(), com/walmartlabs/android/photo/controller/LearnMoreActivity));
    }

    y()
    {
        this$0 = AlbumFragment.this;
        super();
    }
}
