// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.zzbg;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzqi

public class zzqs
{

    private String zzaPw;

    public zzqs()
    {
        zzaPw = "https://www.google-analytics.com";
    }

    private String zzff(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            zzbg.e((new StringBuilder()).append("Cannot encode the string: ").append(s).toString());
            return "";
        }
        return s1;
    }

    public void zzfj(String s)
    {
        zzaPw = s;
        zzbg.zzaD((new StringBuilder()).append("The Ctfe server endpoint was changed to: ").append(s).toString());
    }

    public String zzt(List list)
    {
        return (new StringBuilder()).append(zzaPw).append("/gtm/android?").append(zzu(list)).toString();
    }

    String zzu(List list)
    {
        boolean flag = true;
        if (list.size() > 1)
        {
            flag = false;
        }
        zzx.zzZ(flag);
        if (list.isEmpty())
        {
            return "";
        }
        zzqi zzqi1 = (zzqi)list.get(0);
        StringBuilder stringbuilder;
        if (!zzqi1.zzBt().trim().equals(""))
        {
            list = zzqi1.zzBt().trim();
        } else
        {
            list = "-1";
        }
        stringbuilder = new StringBuilder();
        if (zzqi1.zzBq() != null)
        {
            stringbuilder.append(zzqi1.zzBq());
        } else
        {
            stringbuilder.append("id");
        }
        stringbuilder.append("=").append(zzff(zzqi1.getContainerId())).append("&").append("pv").append("=").append(zzff(list));
        if (zzqi1.zzBs())
        {
            stringbuilder.append("&gtm_debug=x");
        }
        return stringbuilder.toString();
    }
}
