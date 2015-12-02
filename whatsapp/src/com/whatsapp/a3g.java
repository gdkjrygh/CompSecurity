// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            ProfileInfoActivity, og

class a3g
    implements Runnable
{

    final ProfileInfoActivity a;

    a3g(ProfileInfoActivity profileinfoactivity)
    {
        a = profileinfoactivity;
        super();
    }

    public void run()
    {
        if (ProfileInfoActivity.a(a).q == 0 && ProfileInfoActivity.a(a).u == 0)
        {
            ProfileInfoActivity.c(a).setVisibility(4);
        }
    }
}
