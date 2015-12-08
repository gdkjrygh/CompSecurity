// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapFullScreenPresenter, MappedData

class this._cls0 extends android.view.istener
{

    final InStoreMapFullScreenPresenter this$0;

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        motionevent = (new com.walmartlabs.anivia.("mapInteraction")).ing("action", "reopen card");
        MessageBus.getBus().post(motionevent);
        InStoreMapFullScreenPresenter.access$500(InStoreMapFullScreenPresenter.this);
        if (InStoreMapFullScreenPresenter.access$600(InStoreMapFullScreenPresenter.this) != null)
        {
            motionevent = ((urceDataAdapter)InStoreMapFullScreenPresenter.access$700(InStoreMapFullScreenPresenter.this)).getData(InStoreMapFullScreenPresenter.access$300(InStoreMapFullScreenPresenter.this).getCurrentItem());
            if (motionevent != null)
            {
                InStoreMapFullScreenPresenter.access$600(InStoreMapFullScreenPresenter.this).onItemSelected(motionevent.getSourcePosition());
            }
        }
        return false;
    }

    tionCallbacks()
    {
        this$0 = InStoreMapFullScreenPresenter.this;
        super();
    }
}
