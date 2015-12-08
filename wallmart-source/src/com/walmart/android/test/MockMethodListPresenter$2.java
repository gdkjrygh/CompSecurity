// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.test;

import android.content.DialogInterface;
import com.walmart.android.service.MockManager;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.test:
//            MockMethodListPresenter

class val.offset
    implements android.content.tener
{

    final MockMethodListPresenter this$0;
    final String val$method;
    final ArrayList val$mockResponseNameList;
    final int val$offset;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (i < MockMethodListPresenter.access$100().length)
        {
            if (i == 0)
            {
                MockManager.getInstance(MockMethodListPresenter.access$000(MockMethodListPresenter.this)).clearMockResponse(MockMethodListPresenter.access$200(MockMethodListPresenter.this), val$method);
            }
            return;
        } else
        {
            dialoginterface = (String)val$mockResponseNameList.get(i - val$offset);
            MockManager.getInstance(MockMethodListPresenter.access$000(MockMethodListPresenter.this)).enableMockResponse(MockMethodListPresenter.access$200(MockMethodListPresenter.this), val$method, dialoginterface);
            return;
        }
    }

    ()
    {
        this$0 = final_mockmethodlistpresenter;
        val$method = s;
        val$mockResponseNameList = arraylist;
        val$offset = I.this;
        super();
    }
}
