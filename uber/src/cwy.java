// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class cwy
{

    public static String a(Context context)
    {
        switch (rz.a(context))
        {
        default:
            return "unkown";

        case 10: // '\n'
            return "developer_error";

        case 8: // '\b'
            return "internal_error";

        case 5: // '\005'
            return "invalid_account";

        case 11: // '\013'
            return "license_check_failed";

        case 7: // '\007'
            return "network_error";

        case 6: // '\006'
            return "resolution_required";

        case 3: // '\003'
            return "service_disabled";

        case 9: // '\t'
            return "service_invalid";

        case 1: // '\001'
            return "service_missing";

        case 2: // '\002'
            return "service_version_update_required";

        case 4: // '\004'
            return "sign_in_required";

        case 0: // '\0'
            return "success";
        }
    }

    public static boolean b(Context context)
    {
        int i = rz.a(context);
        return i != 1 && i != 9;
    }

    public static String c(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "name_not_found";
        }
        return context;
    }
}
