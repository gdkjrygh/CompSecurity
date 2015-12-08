// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.widget.SearchView;
import com.weather.dal2.google.AddressList;

// Referenced classes of package com.weather.commons.ups.ui:
//            AddressController

class val.result
    implements Runnable
{

    final AddressController this$0;
    final AddressList val$result;

    public void run()
    {
        if (dressRow.access._mth700(AddressController.access$1300(AddressController.this)).getQuery().toString().isEmpty())
        {
            dressRow.access._mth700(AddressController.access$1300(AddressController.this)).setQuery(val$result.getFormattedAddress(0), true);
            dressRow.access._mth700(AddressController.access$1300(AddressController.this)).setTag(val$result.getFormattedAddress(0));
            moveCursorToStart(dressRow.access._mth700(AddressController.access$1300(AddressController.this)));
        }
    }

    dressRow()
    {
        this$0 = final_addresscontroller;
        val$result = AddressList.this;
        super();
    }
}
