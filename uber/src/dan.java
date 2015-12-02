// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.text.TextUtils;

public final class dan
{

    public static void a(SharedPreferences sharedpreferences, String s)
    {
        Object obj;
        obj = sharedpreferences.getString(s, null);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return;
        }
        try
        {
            obj = Boolean.valueOf(((String) (obj)));
            sharedpreferences.edit().putBoolean(s, ((Boolean) (obj)).booleanValue()).apply();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            ijg.d((new StringBuilder("Unable to upgrade key to boolean: ")).append(s).toString(), new Object[] {
                sharedpreferences
            });
        }
        return;
    }
}
