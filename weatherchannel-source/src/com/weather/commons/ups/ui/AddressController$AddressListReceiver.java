// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import com.weather.dal2.google.AddressList;
import com.weather.dal2.net.Receiver;

// Referenced classes of package com.weather.commons.ups.ui:
//            AddressController

private class <init>
    implements Receiver
{

    final AddressController this$0;

    public void onCompletion(AddressList addresslist, Void void1)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < addresslist.getCount())
                {
                    if (!addresslist.isAcceptableAddress(i))
                    {
                        break label0;
                    }
                    AddressController.access$1700(AddressController.this, addresslist);
                }
                return;
            }
            i++;
        } while (true);
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((AddressList)obj, (Void)obj1);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (Void)obj);
    }

    public void onError(Throwable throwable, Void void1)
    {
    }

    private ()
    {
        this$0 = AddressController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
