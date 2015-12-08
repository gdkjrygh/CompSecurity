// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity

class this._cls0
    implements android.view.tener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        MainActivity.access$21(MainActivity.this).dismiss();
        quitDialogOpen = false;
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
