// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.view.View;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.ups.ui:
//            AddressController

private class <init>
    implements android.view.uttonListener
{

    final AddressController this$0;

    public void onClick(View view)
    {
        view = AddressController.access$800(AddressController.this).iterator();
        do
        {
            if (!view.hasNext())
            {
                break;
            }
            <init> <init>1 = (this._cls0)view.next();
            if (<init>1.le())
            {
                continue;
            }
            <init>1.ble(true);
            break;
        } while (true);
        _mth000(AddressController.access$1300(AddressController.this)).setVisibility(0);
        if (AddressController.access$1400(AddressController.this).le())
        {
            AddressController.access$1500(AddressController.this).setVisibility(8);
        }
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
