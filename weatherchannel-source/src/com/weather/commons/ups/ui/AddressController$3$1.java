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

class val.userData
    implements Runnable
{

    final essRow this$1;
    final String val$userData;

    public void run()
    {
        essRow.access._mth700(row).setQuery(val$userData, false);
        essRow.access._mth700(row).setTag(val$userData);
        essRow essrow;
        for (Iterator iterator = AddressController.access$800(_fld0).iterator(); iterator.hasNext(); moveCursorToStart(essRow.access._mth700(essrow)))
        {
            essrow = (essRow)iterator.next();
            essRow.access._mth700(essrow).clearFocus();
        }

    }

    essRow()
    {
        this$1 = final_essrow;
        val$userData = String.this;
        super();
    }

    // Unreferenced inner class com/weather/commons/ups/ui/AddressController$3

/* anonymous class */
    class AddressController._cls3
        implements Receiver
    {

        final AddressController this$0;
        final AddressController.AddressRow val$row;

        public void onCompletion(SavedLocation savedlocation, String s)
        {
            AddressController.access$900(AddressController.this).post(s. new AddressController._cls3._cls1());
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

            
            {
                this$0 = final_addresscontroller;
                row = AddressController.AddressRow.this;
                super();
            }
    }

}
