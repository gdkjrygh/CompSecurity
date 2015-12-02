// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.ubercab.rider.realtime.model.Profile;

public final class dum
{

    public static String a(Profile profile, Context context)
    {
        if (TextUtils.isEmpty(profile.getNameFromChildAttributes()))
        {
            if ("Personal".equals(profile.getType()))
            {
                return context.getString(0x7f070350);
            } else
            {
                return context.getString(0x7f070075);
            }
        } else
        {
            return profile.getNameFromChildAttributes();
        }
    }

    public static boolean a(Profile profile)
    {
        return "Business".equals(profile.getType());
    }

    public static boolean b(Profile profile)
    {
        return !TextUtils.isEmpty(profile.getDefaultPaymentProfileUuid());
    }

    public static boolean c(Profile profile)
    {
        return "Business".equals(profile.getType());
    }

    public static boolean d(Profile profile)
    {
        return !"ManagedBusiness".equals(profile.getType());
    }

    public static boolean e(Profile profile)
    {
        return "ManagedBusiness".equals(profile.getType());
    }

    public static boolean f(Profile profile)
    {
        return "Personal".equals(profile.getType());
    }

    public static boolean g(Profile profile)
    {
        return "Business".equals(profile.getType());
    }

    public static boolean h(Profile profile)
    {
        return profile != null && a(profile) && profile.getIsExpensingEnabled();
    }

    public static boolean i(Profile profile)
    {
        return "Business".equals(profile.getType());
    }

    public static boolean j(Profile profile)
    {
        return "ManagedBusiness".equals(profile.getType()) || "Business".equals(profile.getType());
    }

    public static boolean k(Profile profile)
    {
        return !"ManagedBusiness".equals(profile.getType());
    }

    public static boolean l(Profile profile)
    {
        return "Personal".equals(profile.getType());
    }

    public static boolean m(Profile profile)
    {
        return "ManagedBusiness".equals(profile.getType());
    }

    public static boolean n(Profile profile)
    {
        return "Personal".equals(profile.getType());
    }

    public static boolean o(Profile profile)
    {
        return "Personal".equals(profile.getType());
    }

    public static boolean p(Profile profile)
    {
        return !"ManagedBusiness".equals(profile.getType());
    }

    public static boolean q(Profile profile)
    {
        return "ManagedBusiness".equals(profile.getType());
    }
}
