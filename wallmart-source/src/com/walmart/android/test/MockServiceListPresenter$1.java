// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.test;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.walmart.android.test:
//            MockServiceListPresenter, MockMethodListPresenter

class ringListAdapter
    implements android.widget.ener
{

    final MockServiceListPresenter this$0;
    final ringListAdapter val$mockServiceListAdapter;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = val$mockServiceListAdapter.getString(i);
        adapterview = new MockMethodListPresenter(MockServiceListPresenter.access$000(MockServiceListPresenter.this), adapterview);
        MockServiceListPresenter.access$100(MockServiceListPresenter.this, adapterview);
    }

    ringListAdapter()
    {
        this$0 = final_mockservicelistpresenter;
        val$mockServiceListAdapter = ringListAdapter.this;
        super();
    }
}
