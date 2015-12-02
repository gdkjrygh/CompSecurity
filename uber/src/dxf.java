// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.location.LocationManager;

public final class dxf
{

    public static boolean a(Context context)
    {
        boolean flag;
        boolean flag1;
        try
        {
            context = (LocationManager)context.getSystemService("location");
            flag = context.isProviderEnabled("network");
            flag1 = context.isProviderEnabled("gps");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return flag || flag1;
    }

    public static boolean b(Context context)
    {
        int i = rz.a(context);
        return i != 1 && i != 9;
    }
}
