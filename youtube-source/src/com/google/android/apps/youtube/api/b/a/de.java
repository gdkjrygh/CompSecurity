// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.api.jar.a.df;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            dg, df

public final class de
{

    private final dg a;
    private df b;

    public de(Handler handler, df df1)
    {
        b = (df)c.a(df1);
        a = new dg(this, handler);
        try
        {
            df1.a(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            return;
        }
    }

    public final void a()
    {
        b = null;
    }

    public final void a(com.google.android.apps.youtube.api.b.a.df df1)
    {
        a.a(df1);
    }
}
