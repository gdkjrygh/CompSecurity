// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

public final class iu
{

    private Activity a;

    public iu(Activity activity)
    {
        a = activity;
    }

    public final String a(String s)
    {
        it it1 = new it(a);
        String s1;
        if (s.contains("bizcontext="))
        {
            String s2 = it1.a(s);
            s1 = s;
            s = s2;
        } else
        {
            s1 = (new StringBuilder(String.valueOf(s))).append("&bizcontext=\"{\"appkey\":\"2014052600006128\"}\"").toString();
            s = it1.a(s1);
        }
        if (TextUtils.equals(s, "failed"))
        {
            s = it1.a(s1);
            s1 = s;
            if (TextUtils.equals(s, "failed"))
            {
                s1 = iv.b();
            }
        } else
        {
            s1 = s;
            if (TextUtils.isEmpty(s))
            {
                return iv.a();
            }
        }
        return s1;
    }

    public final boolean a()
    {
        PackageInfo packageinfo;
        int i;
        try
        {
            packageinfo = a.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 128);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        if (packageinfo == null)
        {
            return false;
        }
        i = packageinfo.versionCode;
label0:
        {
            if (i >= 73)
            {
                return true;
            }
            break label0;
        }
    }
}
