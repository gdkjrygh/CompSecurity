// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubercab.rider.realtime.model.TripDriver;

public final class fut
{

    public static void a(Context context, String s)
    {
        try
        {
            context.startActivity(new Intent("android.intent.action.CALL", Uri.parse((new StringBuilder("tel:")).append(s).toString())));
            return;
        }
        catch (SecurityException securityexception)
        {
            b(context, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            cwm.a(context, context.getString(0x7f0702d2));
        }
    }

    public static boolean a(drc drc1)
    {
        return !drc1.i();
    }

    public static boolean a(drc drc1, gmg gmg1, TripDriver tripdriver)
    {
        return !drc1.e() && !a(gmg1, tripdriver);
    }

    public static boolean a(gmg gmg1, TripDriver tripdriver)
    {
        return gmg1.a(dbf.bW) && !tripdriver.getIsCallButtonEnabled();
    }

    public static void b(Context context, String s)
    {
        try
        {
            context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder("tel:")).append(s).toString())));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            cwm.a(context, context.getString(0x7f0702d2));
        }
    }

    public static void c(Context context, String s)
    {
        try
        {
            context.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder("sms:")).append(s).toString())));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            cwm.a(context, context.getString(0x7f0702d4));
        }
    }
}
