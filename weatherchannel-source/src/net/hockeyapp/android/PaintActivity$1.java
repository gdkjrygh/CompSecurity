// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.DialogInterface;

// Referenced classes of package net.hockeyapp.android:
//            PaintActivity

class this._cls0
    implements android.content.OnClickListener
{

    final PaintActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            finish();
            break;
        }
    }

    kListener()
    {
        this$0 = PaintActivity.this;
        super();
    }
}
