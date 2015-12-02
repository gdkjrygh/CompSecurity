// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            MultipleContactPicker

class yn
    implements Runnable
{

    final MultipleContactPicker a;

    yn(MultipleContactPicker multiplecontactpicker)
    {
        a = multiplecontactpicker;
        super();
    }

    public void run()
    {
        a.getListView().setSelection(0);
    }
}
