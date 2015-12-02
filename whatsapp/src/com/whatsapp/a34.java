// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            WebImagePicker

class a34
    implements com.actionbarsherlock.widget.SearchView.OnCloseListener
{

    final WebImagePicker a;

    a34(WebImagePicker webimagepicker)
    {
        a = webimagepicker;
        super();
    }

    public boolean onClose()
    {
        return true;
    }
}
