// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Binder;

// Referenced classes of package com.go.weatherex.j.c:
//            v

public class u extends ContextWrapper
{

    private static Context a;
    private static Context b;

    public u(Context context)
    {
        super(context);
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        try
        {
            a = new v(createPackageContext("com.gau.go.launcherex.gowidget.weatherwidget", 3));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Are you kidding me?");
        }
        b = new v(createPackageContext(a.getPackageManager().getNameForUid(Binder.getCallingUid()), 2));
        return;
        context;
        throw new RuntimeException("Are you kidding me?");
    }

    public Context a()
    {
        return b;
    }

    public Context getApplicationContext()
    {
        return a;
    }
}
