// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, c9

class atn
    implements android.content.DialogInterface.OnClickListener
{

    final DialogToastPreferenceActivity a;

    atn(DialogToastPreferenceActivity dialogtoastpreferenceactivity)
    {
        a = dialogtoastpreferenceactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(500);
        if (DialogToastPreferenceActivity.a(a) != null)
        {
            DialogToastPreferenceActivity.a(a).a();
        }
    }
}
