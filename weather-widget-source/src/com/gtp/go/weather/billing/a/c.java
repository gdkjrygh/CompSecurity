// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.a;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.theme.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c
{

    public static Map a(String s, Context context)
    {
        Object obj;
        obj = null;
        s = d.b(context, s, "countries_paytype");
        if (s != null) goto _L2; else goto _L1
_L1:
        s = obj;
_L4:
        return s;
_L2:
        XmlPullParser xmlpullparser;
        xmlpullparser = d.a(s);
        s = obj;
        if (xmlpullparser == null) goto _L4; else goto _L3
_L3:
        context = new HashMap();
        int i;
        try
        {
            i = xmlpullparser.getEventType();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return context;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return context;
        }
        s = context;
        if (i == 1) goto _L4; else goto _L5
_L5:
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        s = xmlpullparser.getName();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (s.equals("country"))
        {
            context.put(xmlpullparser.getAttributeValue(null, "language"), xmlpullparser.getAttributeValue(null, "paytype"));
        }
        i = xmlpullparser.next();
        break MISSING_BLOCK_LABEL_45;
    }
}
