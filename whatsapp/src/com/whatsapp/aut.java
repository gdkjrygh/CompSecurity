// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            ProfilePhotoReminder, og

class aut
    implements Runnable
{

    final ProfilePhotoReminder a;

    aut(ProfilePhotoReminder profilephotoreminder)
    {
        a = profilephotoreminder;
        super();
    }

    public void run()
    {
        if (ProfilePhotoReminder.d(a).q == 0 && ProfilePhotoReminder.d(a).u == 0)
        {
            ProfilePhotoReminder.e(a).setVisibility(4);
        }
    }
}
