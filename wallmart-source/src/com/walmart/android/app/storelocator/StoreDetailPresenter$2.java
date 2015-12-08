// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.storelocator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.data.WalmartStore;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.storelocator:
//            StoreDetailPresenter

class val.departmentNameTextString
    implements android.view..StoreDetailPresenter._cls2
{

    final StoreDetailPresenter this$0;
    final String val$departmentNameTextString;
    final String val$phoneNumber;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(val$phoneNumber).toString()));
        if (view.resolveActivity(StoreDetailPresenter.access$100(StoreDetailPresenter.this).getPackageManager()) != null)
        {
            StoreDetailPresenter.access$100(StoreDetailPresenter.this).startActivity(view);
            GoogleAnalytics.trackEvent("Store Details", String.format(Locale.US, "Call %s", new Object[] {
                val$departmentNameTextString
            }), StoreDetailPresenter.access$200(StoreDetailPresenter.this).getId());
            StoreDetailPresenter.access$300(StoreDetailPresenter.this, "callDepartment");
        }
    }

    A()
    {
        this$0 = final_storedetailpresenter;
        val$phoneNumber = s;
        val$departmentNameTextString = String.this;
        super();
    }
}
