// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import android.widget.AdapterView;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmart.android.app.wishlist:
//            FindListPresenter

class this._cls0
    implements android.widget.lectedListener
{

    final FindListPresenter this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        FindListPresenter.access$500(FindListPresenter.this).show();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = FindListPresenter.this;
        super();
    }
}
