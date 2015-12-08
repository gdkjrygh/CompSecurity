// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            UploadActivity

final class ai
    implements android.content.DialogInterface.OnCancelListener
{

    final UploadActivity a;

    ai(UploadActivity uploadactivity)
    {
        a = uploadactivity;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
    }
}
