// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.view.View;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity

class this._cls0
    implements android.view.ener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        view = (new StringBuilder(String.valueOf(getString(0x7f080050)))).append(getPackageName()).toString();
        MainActivity.access$23(MainActivity.this, view);
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
