// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import com.walmartlabs.utils.WLog;
import java.util.Collections;

// Referenced classes of package com.walmartlabs.ui:
//            PagingShelfListAdapter

class is._cls0 extends llback
{

    final this._cls1 this$1;

    public void onDataReceived(Object aobj[], boolean flag)
    {
        WLog.d(PagingShelfListAdapter.access$300(), (new StringBuilder()).append("onDataReceived() isLastPage=").append(flag).toString());
        if (flag)
        {
            PagingShelfListAdapter.access$402(_fld0, true);
        }
        Collections.addAll(PagingShelfListAdapter.access$500(_fld0), aobj);
        cess._mth602(this._cls1.this, cess._mth700(this._cls1.this));
        cess._mth702(this._cls1.this, PagingShelfListAdapter.access$200());
        notifyDataSetChanged();
        if (cess._mth600(this._cls1.this) == cess._mth800(this._cls1.this) && PagingShelfListAdapter.access$900(_fld0) != null)
        {
            PagingShelfListAdapter.access$900(_fld0).onInitialPageLoaded();
        }
    }

    public void onGetDataFailed()
    {
        cess._mth702(this._cls1.this, PagingShelfListAdapter.access$200());
    }

    adedListener()
    {
        this$1 = this._cls1.this;
        super(_fld0);
    }
}
