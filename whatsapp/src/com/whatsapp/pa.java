// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            ProfilePhotoReminder, App, iz

class pa
    implements TextWatcher
{

    int a;
    final ProfilePhotoReminder b;

    pa(ProfilePhotoReminder profilephotoreminder)
    {
        b = profilephotoreminder;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
label0:
        {
            String s = editable.toString();
            c.a(editable, b);
            com.whatsapp.ProfilePhotoReminder.c(b).setText(Integer.toString(25 - s.length()));
            if (s.length() >= 25 && a == 0)
            {
                a = ProfilePhotoReminder.b(b).getInputType();
                if (a == 0)
                {
                    break label0;
                }
                ProfilePhotoReminder.b(b).setInputType(a | 0x80000);
                ProfilePhotoReminder.b(b).setText(s);
                ProfilePhotoReminder.b(b).setSelection(s.length());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (a != 0)
            {
                ProfilePhotoReminder.b(b).setInputType(a);
                a = 0;
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(ProfilePhotoReminder.b(b), charsequence);
    }
}
