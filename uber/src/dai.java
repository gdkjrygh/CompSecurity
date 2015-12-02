// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class dai
{

    private SharedPreferences a;
    private bjw b;

    public dai(SharedPreferences sharedpreferences, bjw bjw1)
    {
        a = sharedpreferences;
        b = bjw1;
    }

    public final List a()
    {
        String s = a.getString("user_sign_in_names", "");
        if (TextUtils.isEmpty(s))
        {
            return new ArrayList();
        } else
        {
            return (List)b.a(s, (new bmj() {

                final dai a;

            
            {
                a = dai.this;
                super();
            }
            }).getType());
        }
    }

    public final void a(String s)
    {
        List list;
        if (!TextUtils.isEmpty(s))
        {
            if (!(list = a()).contains(s))
            {
                list.add(s);
                a.edit().putString("user_sign_in_names", b.a(list)).apply();
                return;
            }
        }
    }
}
