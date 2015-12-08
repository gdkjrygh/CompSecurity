// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.gau.go.launcherex.gowidget.weather.theme.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.util:
//            m, l

public class n
{

    private static int a(Resources resources, String s, String s1)
    {
        return resources.getIdentifier(s1, "raw", s);
    }

    public static l a(Context context, String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        XmlPullParser xmlpullparser;
        int i;
        int j;
        try
        {
            context = context.createPackageContext(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_555;
        }
        context = context.getResources();
        i = a(((Resources) (context)), s, "widget_weatherwidget");
        if (i != 0)
        {
            context = context.openRawResource(i);
        } else
        {
            try
            {
                context = context.getAssets().open("widget_weatherwidget.xml");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                context = null;
            }
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_555;
        }
        xmlpullparser = d.a(context);
        if (xmlpullparser == null)
        {
            break MISSING_BLOCK_LABEL_555;
        }
        i = xmlpullparser.getEventType();
        context = null;
_L24:
        obj = context;
        if (i == 1) goto _L2; else goto _L1
_L1:
        if (i != 2) goto _L4; else goto _L3
_L3:
        obj = xmlpullparser.getName();
        if (obj == null) goto _L4; else goto _L5
_L5:
        if (!"widget_style".equals(obj)) goto _L7; else goto _L6
_L6:
        j = xmlpullparser.getAttributeCount();
        obj1 = new ArrayList(j);
        i = 0;
_L9:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        obj = obj1;
        ((ArrayList) (obj1)).add(new m());
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        i = 0;
_L10:
        context = ((Context) (obj1));
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        obj = obj1;
        ((m)((ArrayList) (obj1)).get(i)).a = Integer.parseInt(xmlpullparser.getAttributeValue(i));
        i++;
        if (true) goto _L10; else goto _L4
_L7:
        if (!"widget_theme_type".equals(obj)) goto _L12; else goto _L11
_L11:
        j = xmlpullparser.getAttributeCount();
        i = 0;
_L13:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (m)context.get(i);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        obj = new m();
        context.add(obj);
        obj.b = Integer.parseInt(xmlpullparser.getAttributeValue(i));
        i++;
        if (true) goto _L13; else goto _L4
_L4:
        XmlPullParserException xmlpullparserexception;
        obj2 = context;
        obj = context;
        int k;
        try
        {
            i = xmlpullparser.next();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParserException xmlpullparserexception)
        {
            context = ((Context) (obj));
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            context = ((Context) (obj2));
        }
          goto _L14
_L12:
        if (!"theme_new_preview".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        k = xmlpullparser.getAttributeCount();
        i = 0;
_L16:
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((m)context.get(i)).d = xmlpullparser.getAttributeValue(i);
        i++;
        if (true) goto _L16; else goto _L15
_L15:
        if (!"theme_preview".equals(obj)) goto _L4; else goto _L17
_L17:
        k = xmlpullparser.getAttributeCount();
        i = 0;
_L19:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ((m)context.get(i)).c = xmlpullparser.getAttributeValue(i);
        i++;
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L4; else goto _L20
_L20:
        xmlpullparserexception;
        context = null;
_L22:
        xmlpullparserexception.printStackTrace();
          goto _L2
        obj;
        context = null;
_L14:
        ((IOException) (obj)).printStackTrace();
        obj = context;
_L2:
        for (obj = context; obj == null || ((ArrayList) (obj)).isEmpty(); obj = null)
        {
            break MISSING_BLOCK_LABEL_550;
        }

        context = new l();
        context.a(s);
        for (s = ((ArrayList) (obj)).iterator(); s.hasNext(); context.a((m)s.next())) { }
        return context;
        obj;
          goto _L14
        xmlpullparserexception;
        if (true) goto _L22; else goto _L21
_L21:
        return null;
        if (true) goto _L24; else goto _L23
_L23:
    }
}
