// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.DialogInterface;

// Referenced classes of package net.hockeyapp.android:
//            UpdateActivity

class this._cls0
    implements android.content.nClickListener
{

    final UpdateActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        UpdateActivity.access$002(UpdateActivity.this, null);
        dialoginterface.cancel();
    }

    Listener()
    {
        this$0 = UpdateActivity.this;
        super();
    }
}
