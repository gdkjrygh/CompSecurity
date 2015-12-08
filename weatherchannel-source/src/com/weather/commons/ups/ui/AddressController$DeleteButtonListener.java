// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.view.View;
import java.util.List;

// Referenced classes of package com.weather.commons.ups.ui:
//            AddressController

private class <init>
    implements android.view.uttonListener
{

    private final int rowIndex;
    final AddressController this$0;

    public void onClick(View view)
    {
        int i = rowIndex + 1;
        do
        {
            if (i >= AddressController.access$800(AddressController.this).size())
            {
                break;
            }
            view = (this._cls0)AddressController.access$800(AddressController.this).get(i);
            <init> <init>1 = (this._cls0)AddressController.access$800(AddressController.this).get(i - 1);
            if (!view._mth0())
            {
                break;
            }
            <init>1._mth0(view);
            moveCursorToStart((view));
            i++;
        } while (true);
        (()AddressController.access$800(AddressController.this).get(i - 1)).(false);
        AddressController.access$300(AddressController.this);
        AddressController.access$1500(AddressController.this).setVisibility(0);
        if (!((this._cls0)AddressController.access$800(AddressController.this).get(1))._mth0())
        {
            (AddressController.access$1300(AddressController.this)).setVisibility(8);
        }
    }

    private (int i)
    {
        this$0 = AddressController.this;
        super();
        rowIndex = i;
    }

    rowIndex(int i, rowIndex rowindex)
    {
        this(i);
    }
}
