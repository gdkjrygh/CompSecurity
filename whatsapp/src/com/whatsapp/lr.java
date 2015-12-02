// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.whatsapp:
//            ContactPicker

class lr
    implements com.actionbarsherlock.view.MenuItem.OnActionExpandListener
{

    final ContactPicker a;

    lr(ContactPicker contactpicker)
    {
        a = contactpicker;
        super();
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        ContactPicker.a(a, "");
        ContactPicker.e(a);
        ContactPicker.b(a);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return true;
    }
}
