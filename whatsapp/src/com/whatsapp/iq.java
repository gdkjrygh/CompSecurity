// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.EditText;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            za, ProfilePhotoReminder, fe

class iq
    implements za
{

    final ProfilePhotoReminder a;

    iq(ProfilePhotoReminder profilephotoreminder)
    {
        a = profilephotoreminder;
        super();
    }

    public void a()
    {
    }

    public void a(int i)
    {
        ProfilePhotoReminder.a(a).dismiss();
        int j = ProfilePhotoReminder.b(a).getSelectionStart();
        int k = ProfilePhotoReminder.b(a).getSelectionEnd();
        StringBuilder stringbuilder;
        int l;
        if (j > k)
        {
            l = k;
            k = j;
        } else
        {
            l = j;
        }
        stringbuilder = new StringBuilder(ProfilePhotoReminder.b(a).getText().toString());
        stringbuilder.replace(l, k, c.a(i));
        if (stringbuilder.length() <= 25)
        {
            ProfilePhotoReminder.b(a).setText(stringbuilder);
            if (l <= ProfilePhotoReminder.b(a).length() - c.h(i))
            {
                ProfilePhotoReminder.b(a).setSelection(l + c.h(i));
                return;
            }
        }
    }
}
