// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            WebImagePicker

class fr
    implements android.view.View.OnClickListener
{

    final WebImagePicker a;

    fr(WebImagePicker webimagepicker)
    {
        a = webimagepicker;
        super();
    }

    public void onClick(View view)
    {
        WebImagePicker.g(a);
    }
}
