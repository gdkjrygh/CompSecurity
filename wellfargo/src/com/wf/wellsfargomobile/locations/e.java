// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.wf.wellsfargomobile.ai;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            LocationListActivity

class e
    implements Runnable
{

    final String a;
    final String b;
    final LocationListActivity c;

    e(LocationListActivity locationlistactivity, String s, String s1)
    {
        c = locationlistactivity;
        a = s;
        b = s1;
        super();
    }

    public void run()
    {
        try
        {
            ai ai1 = new ai();
            Bundle bundle = new Bundle();
            bundle.putInt("DIALOG_ICON", -1);
            bundle.putString("DIALOG_TITLE", a);
            bundle.putString("DIALOG_MESSAGE", b);
            ai1.setArguments(bundle);
            ai1.show(c.getSupportFragmentManager(), "MessageDialogFragment");
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }
}
