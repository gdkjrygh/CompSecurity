// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.test;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.walmart.android.test:
//            MockMethodListPresenter

class tringListAdapter
    implements android.widget.tener
{

    final MockMethodListPresenter this$0;
    final tringListAdapter val$mockMethodListAdapter;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = val$mockMethodListAdapter.getString(i);
        buildMockResponseOptions(MockMethodListPresenter.access$000(MockMethodListPresenter.this), adapterview).show();
    }

    tringListAdapter()
    {
        this$0 = final_mockmethodlistpresenter;
        val$mockMethodListAdapter = tringListAdapter.this;
        super();
    }
}
