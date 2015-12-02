// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.uspout.internal.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.ubercab.network.uspout.model.ApplicationName;

// Referenced classes of package com.ubercab.network.uspout.internal.model:
//            Shape_App

public abstract class App
{

    public App()
    {
    }

    public static App create(Context context, ApplicationName applicationname)
    {
        Object obj = null;
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        return (new Shape_App()).setType(applicationname.getAppName()).setVersion(context);
    }

    public abstract String getType();

    public abstract String getVersion();

    public abstract App setType(String s);

    public abstract App setVersion(String s);
}
