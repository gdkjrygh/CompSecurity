// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import com.actionbarsherlock.widget.SearchView;

// Referenced classes of package com.whatsapp:
//            WebImagePicker

class earchView extends SearchView
{

    final WebImagePicker b;

    public boolean isIconified()
    {
        return false;
    }

    earchView(WebImagePicker webimagepicker, Context context)
    {
        b = webimagepicker;
        super(context);
    }
}
