// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.zzbg;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzpy

public class zzqi
{

    private String zzaLc;

    public zzqi()
    {
        zzaLc = "https://www.google-analytics.com";
    }

    private String zzeQ(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            zzbg.zzaz((new StringBuilder()).append("Cannot encode the string: ").append(s).toString());
            return "";
        }
        return s1;
    }

    public void zzeU(String s)
    {
        zzaLc = s;
        zzbg.zzaA((new StringBuilder()).append("The Ctfe server endpoint was changed to: ").append(s).toString());
    }

    public String zzt(List list)
    {
        return (new StringBuilder()).append(zzaLc).append("/gtm/android?").append(zzu(list)).toString();
    }

    String zzu(List list)
    {
        boolean flag = true;
        if (list.size() > 1)
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzu.zzV(flag);
        if (list.isEmpty())
        {
            return "";
        }
        zzpy zzpy1 = (zzpy)list.get(0);
        StringBuilder stringbuilder;
        if (!zzpy1.zzAd().trim().equals(""))
        {
            list = zzpy1.zzAd().trim();
        } else
        {
            list = "-1";
        }
        stringbuilder = new StringBuilder();
        if (zzpy1.zzAa() != null)
        {
            stringbuilder.append(zzpy1.zzAa());
        } else
        {
            stringbuilder.append("id");
        }
        stringbuilder.append("=").append(zzeQ(zzpy1.getContainerId())).append("&").append("pv").append("=").append(zzeQ(list));
        if (zzpy1.zzAc())
        {
            stringbuilder.append("&gtm_debug=x");
        }
        return stringbuilder.toString();
    }
}
