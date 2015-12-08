// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.os.Handler;
import android.widget.SearchView;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.ups.ui:
//            AddressController

class dressRow
    implements Receiver
{

    final AddressController this$0;
    final dressRow val$row;

    public void onCompletion(SavedLocation savedlocation, final String userData)
    {
        AddressController.access$900(AddressController.this).post(new Runnable() {

            final AddressController._cls3 this$1;
            final String val$userData;

            public void run()
            {
                AddressController.AddressRow.access$700(row).setQuery(userData, false);
                AddressController.AddressRow.access$700(row).setTag(userData);
                AddressController.AddressRow addressrow;
                for (Iterator iterator = AddressController.access$800(this$0).iterator(); iterator.hasNext(); moveCursorToStart(AddressController.AddressRow.access$700(addressrow)))
                {
                    addressrow = (AddressController.AddressRow)iterator.next();
                    AddressController.AddressRow.access$700(addressrow).clearFocus();
                }

            }

            
            {
                this$1 = AddressController._cls3.this;
                userData = s;
                super();
            }
        });
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((SavedLocation)obj, (String)obj1);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (String)obj);
    }

    public void onError(Throwable throwable, String s)
    {
        ExceptionUtil.logExceptionError("AddressController", (new StringBuilder()).append("LocationReceiver.onError for location:").append(s).toString(), throwable);
    }

    dressRow()
    {
        this$0 = final_addresscontroller;
        val$row = dressRow.this;
        super();
    }
}
