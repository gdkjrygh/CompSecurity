// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import java.util.Calendar;

// Referenced classes of package com.mapbar.android.location:
//            o

public final class n
{

    public String a;
    private String b;
    private o c;
    private Calendar d;
    private Calendar e;

    public n()
    {
        d = null;
        e = null;
    }

    public n(String s)
        throws Exception
    {
        d = null;
        e = null;
        s = s.trim();
        String as[] = s.split("&");
        if (as.length <= 0)
        {
            throw new Exception("API Key \u5B57\u6BB5\u6570\u91CF\u65E0\u6548");
        }
        String s1 = as[0];
        if (s1 == null)
        {
            throw new Exception("Fingerprint is null");
        }
        a = s1;
        if (as.length > 1)
        {
            String s2 = as[1];
            if (s2 == null)
            {
                throw new Exception("uid \u53C2\u6570\u65E0\u6548\u3002");
            }
            s2 = s2.trim();
            if (s2.length() > 16)
            {
                throw new Exception("uid \u53C2\u6570\u957F\u5EA6\u5FC5\u987B\u5C0F\u4E8E 16\u3002");
            }
            b = s2.trim();
        }
        if (as.length > 2)
        {
            c = o.a(Integer.parseInt(as[2]));
        }
        if (as.length > 3)
        {
            if (!as[3].equals(""))
            {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(Long.parseLong(as[3], 16));
                d = calendar;
            } else
            {
                d = null;
            }
        }
        if (as.length > 4)
        {
            if (!as[4].equals(""))
            {
                Calendar calendar1 = Calendar.getInstance();
                calendar1.setTimeInMillis(Long.parseLong(as[4], 16));
                e = calendar1;
            } else
            {
                e = null;
            }
        }
        if (s == null)
        {
            throw new Exception("key \u53C2\u6570\u65E0\u6548\u3002");
        } else
        {
            s.trim();
            return;
        }
    }

    public final String toString()
    {
        String s;
        String s1;
        String s2;
        String s3;
        if (d == null)
        {
            s = "";
        } else
        {
            s = Long.toHexString(d.getTimeInMillis());
        }
        if (e == null)
        {
            s1 = "";
        } else
        {
            s1 = Long.toHexString(e.getTimeInMillis());
        }
        if (b == null)
        {
            s2 = "";
        } else
        {
            s2 = b;
        }
        if (c == null)
        {
            s3 = "";
        } else
        {
            s3 = String.valueOf(c.ordinal());
        }
        return (new StringBuilder()).append(a).append("&").append(s2).append("&").append(s3).append("&").append(s).append("&").append(s1).toString();
    }
}
