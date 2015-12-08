// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            dk, d, dl, Protocol, 
//            b, az, dn, aw, 
//            c

public class dj
{

    private static final String a = com/paypal/android/sdk/onetouch/core/dj.getSimpleName();
    private final c b;
    private final aw c;
    private final b d;
    private dk e;

    public dj(aw aw1, c c1, b b1)
    {
        c = aw1;
        b = c1;
        d = b1;
    }

    public final void a(dl dl1, String s, Map map, Protocol protocol)
    {
        if (e == null || !e.a())
        {
            e = new dk(this);
            (new StringBuilder("created new fpti token:")).append(e);
        }
        new d();
        Object obj = (new StringBuilder("mobile:otc:")).append(dl1.a()).append(":");
        if (protocol != null)
        {
            protocol = protocol.name();
        } else
        {
            protocol = "";
        }
        protocol = ((StringBuilder) (obj)).append(protocol).toString();
        obj = (new StringBuilder("Android:")).append(s).append(":").toString();
        obj = (new StringBuilder()).append(protocol).append(":").append(((String) (obj)));
        if (dl1.b())
        {
            dl1 = "|error";
        } else
        {
            dl1 = "";
        }
        dl1 = ((StringBuilder) (obj)).append(dl1).toString();
        map = new HashMap(map);
        map.put("apid", (new StringBuilder()).append(d.b()).append("|2.1.1").append("|").append(d.e().getPackageName()).toString());
        map.put("bchn", "otc");
        map.put("bzsr", "mobile");
        map.put("e", "im");
        map.put("g", Integer.toString((new GregorianCalendar()).getTimeZone().getRawOffset() / 1000 / 60));
        map.put("lgin", "out");
        map.put("mapv", "2.1.1");
        map.put("mcar", d.c());
        map.put("mdvs", com.paypal.android.sdk.onetouch.core.d.a());
        map.put("mosv", com.paypal.android.sdk.onetouch.core.d.b());
        map.put("page", dl1);
        map.put("pgrp", protocol);
        map.put("rsta", Locale.getDefault().toString());
        map.put("srce", "otc");
        map.put("sv", "mobile");
        map.put("vers", (new StringBuilder("Android:")).append(s).append(":").toString());
        dl1 = new az(e.a, map);
        c.b(new dn(c, b, dl1));
    }

}
