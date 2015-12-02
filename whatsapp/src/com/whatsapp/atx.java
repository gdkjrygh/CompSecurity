// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            WebSessionsActivity

class atx extends bv
{

    final WebSessionsActivity b;

    atx(WebSessionsActivity websessionsactivity)
    {
        b = websessionsactivity;
        super();
    }

    public void a(View view)
    {
        (new WebSessionsActivity.LogoutAllConfirmationDialogFragment()).show(b.getSupportFragmentManager(), null);
    }
}
