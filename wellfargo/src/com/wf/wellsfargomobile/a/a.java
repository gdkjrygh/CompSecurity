// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.a;

import android.content.Context;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.h;
import com.wf.wellsfargomobile.util.d;

// Referenced classes of package com.wf.wellsfargomobile.a:
//            b

public class a
{

    public static String a()
    {
        return "https://m.wellsfargo.com/mba";
    }

    public static String a(Context context)
    {
        return com.wf.wellsfargomobile.a.b.a(context);
    }

    public static String b()
    {
        return "https://m.wellsfargo.com/fastlook";
    }

    public static String c()
    {
        return "https://connect.secure.wellsfargo.com";
    }

    public static String d()
    {
        return "https://connect.secure.wellsfargo.com";
    }

    public static String e()
    {
        return "https://online.wellsfargo.com/";
    }

    public static String f()
    {
        return "https://www.wellsfargo.com/locator";
    }

    public static String g()
    {
        return "";
    }

    public static String h()
    {
        return "Google Play Store";
    }

    public static String i()
    {
        if (WFApp.d())
        {
            return "120340";
        } else
        {
            return "606580";
        }
    }

    public static String j()
    {
        return "September 30, 2015";
    }

    public static String k()
    {
        return "October 20, 2015";
    }

    public static String[] l()
    {
        return h.b;
    }

    public static String m()
    {
        return "604623778323";
    }

    public static String[] n()
    {
        return h.a;
    }

    public static CharSequence o()
    {
        return "https://m.wellsfargo.com/mba/frontPorch/whatsnew.action";
    }

    public static String p()
    {
        if (WFApp.d())
        {
            return "https://www.wellsfargo.com/security/security-online-banking";
        } else
        {
            return (new StringBuilder()).append(a()).append(WFApp.g.getString(0x7f080177)).toString();
        }
    }

    public static String q()
    {
        if (WFApp.d())
        {
            if (d.e.equals(WFApp.R()))
            {
                return "https://www.wellsfargoadvisors.com/wfa/privacy-security-legal.htm";
            } else
            {
                return "https://www.wellsfargo.com/privacy-security/";
            }
        } else
        {
            return (new StringBuilder()).append(a()).append(WFApp.g.getString(0x7f080175)).toString();
        }
    }

    public static String r()
    {
        if (WFApp.d())
        {
            return "https://www.wellsfargo.com/help/quick-guide";
        } else
        {
            return (new StringBuilder()).append(a()).append(WFApp.g.getString(0x7f080176)).toString();
        }
    }
}
