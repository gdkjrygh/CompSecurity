// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import com.walmart.android.wmui.RadioButtonController;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SortFilterDialogFragment

class val.sortController
    implements android.view.terDialogFragment._cls1
{

    final SortFilterDialogFragment this$0;
    final RadioButtonController val$filterController;
    final RadioButtonController val$sortController;

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131756574: 
        case 2131756576: 
        case 2131756578: 
        case 2131756580: 
        case 2131756582: 
        default:
            return;

        case 2131756573: 
            val$filterController.check(0x7f10061e);
            return;

        case 2131756575: 
            val$filterController.check(0x7f100620);
            return;

        case 2131756577: 
            val$filterController.check(0x7f100622);
            return;

        case 2131756579: 
            val$sortController.check(0x7f100624);
            return;

        case 2131756581: 
            val$sortController.check(0x7f100626);
            return;

        case 2131756583: 
            val$sortController.check(0x7f100628);
            break;
        }
    }

    A()
    {
        this$0 = final_sortfilterdialogfragment;
        val$filterController = radiobuttoncontroller;
        val$sortController = RadioButtonController.this;
        super();
    }
}
