// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.os.AsyncTask;
import com.google.android.gms.gcm.b;
import java.io.IOException;

// Referenced classes of package com.wf.wellsfargomobile:
//            MainActivity

class ae extends AsyncTask
{

    final MainActivity a;

    ae(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    protected transient String a(Void avoid[])
    {
        try
        {
            if (MainActivity.d(a) == null)
            {
                MainActivity.a(a, b.a(a));
            }
            MainActivity.a(a, MainActivity.d(a).a(new String[] {
                MainActivity.e(a)
            }));
            MainActivity.a(a, a, MainActivity.f(a));
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[]) { }
        return "success";
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
