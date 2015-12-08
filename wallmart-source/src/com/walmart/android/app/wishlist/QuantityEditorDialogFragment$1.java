// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.DialogInterface;
import com.walmart.android.wmui.NumberPicker;

// Referenced classes of package com.walmart.android.app.wishlist:
//            QuantityEditorDialogFragment

class val.initialValue
    implements android.content.
{

    final QuantityEditorDialogFragment this$0;
    final int val$initialValue;
    final NumberPicker val$numberPicker;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (QuantityEditorDialogFragment.access$000(QuantityEditorDialogFragment.this) != null)
        {
            i = val$numberPicker.getCurrent();
            if (i != val$initialValue)
            {
                QuantityEditorDialogFragment.access$000(QuantityEditorDialogFragment.this).onNewQuantity(i);
            }
        }
    }

    NewQuantityListener()
    {
        this$0 = final_quantityeditordialogfragment;
        val$numberPicker = numberpicker;
        val$initialValue = I.this;
        super();
    }
}
