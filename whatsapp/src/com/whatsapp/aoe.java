// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, WebImagePicker, i2

class aoe
    implements android.view.View.OnClickListener
{

    final WebImagePicker a;

    aoe(WebImagePicker webimagepicker)
    {
        a = webimagepicker;
        super();
    }

    public void onClick(View view)
    {
        int i;
        i = App.am;
        view = (String)view.getTag();
        break MISSING_BLOCK_LABEL_13;
label0:
        while (true) 
        {
            do
            {
                return;
            } while (view == null || WebImagePicker.c(a) == null);
            Iterator iterator = WebImagePicker.h(a).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                i2 i2_1 = (i2)iterator.next();
                if (!view.equals(i2_1.e))
                {
                    break;
                }
                WebImagePicker.a(a, i2_1);
            } while (i != 0 && i == 0);
            break; /* Loop/switch isn't completed */
        }
    }
}
