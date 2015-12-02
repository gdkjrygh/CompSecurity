// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            st, App, d9, ProfileInfoActivity

class ad7
    implements android.view.View.OnClickListener
{

    final ProfileInfoActivity a;

    ad7(ProfileInfoActivity profileinfoactivity)
    {
        a = profileinfoactivity;
        super();
    }

    public void onClick(View view)
    {
        view = new st(this);
        String s = App.x(a);
        (new d9(a, 0x7f0e03a7, s, view, 25, 0, 0x7f0e02a6)).show();
    }
}
