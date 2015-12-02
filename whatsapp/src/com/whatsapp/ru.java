// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            ProfilePhotoReminder, qk

class ru
    implements android.view.View.OnClickListener
{

    final ProfilePhotoReminder a;

    ru(ProfilePhotoReminder profilephotoreminder)
    {
        a = profilephotoreminder;
        super();
    }

    public void onClick(View view)
    {
        qk.a(ProfilePhotoReminder.d(a), a, 12);
    }
}
