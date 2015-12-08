// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.InflateException;
import android.view.MenuInflater;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            p, j, q

public final class o
{

    private final Context a;
    private final MenuInflater b;

    public o(Context context, MenuInflater menuinflater)
    {
        a = (Context)c.a(context);
        b = (MenuInflater)c.a(menuinflater);
    }

    public final void a(int i, j j1)
    {
        b.inflate(i, new p(j1));
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        XmlResourceParser xmlresourceparser;
        XmlResourceParser xmlresourceparser1;
        XmlResourceParser xmlresourceparser2;
        xmlresourceparser = null;
        xmlresourceparser2 = null;
        xmlresourceparser1 = null;
        XmlResourceParser xmlresourceparser3 = a.getResources().getXml(i);
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        i = xmlresourceparser3.getEventType();
          goto _L3
_L5:
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        i = xmlresourceparser3.next();
          goto _L3
_L11:
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        if (!xmlresourceparser3.getName().equals("item")) goto _L5; else goto _L4
_L4:
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        i = xmlresourceparser3.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "id", 0);
        if (i == 0) goto _L5; else goto _L6
_L6:
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        int k = xmlresourceparser3.getAttributeIntValue("http://schemas.android.com/apk/res/android", "showAsAction", -1);
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        q q1 = j1.c(i);
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        q1.b(k);
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        k = xmlresourceparser3.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "actionLayout", -1);
        if (k <= 0) goto _L5; else goto _L7
_L7:
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        q1 = j1.c(i);
        if (q1 == null) goto _L5; else goto _L8
_L8:
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        q1.a(k);
          goto _L5
        j1;
        xmlresourceparser = xmlresourceparser1;
        throw new InflateException("Error inflating menu XML", j1);
        j1;
        if (xmlresourceparser != null)
        {
            xmlresourceparser.close();
        }
        throw j1;
_L10:
        if (xmlresourceparser3 != null)
        {
            xmlresourceparser3.close();
        }
_L2:
        return;
        j1;
        xmlresourceparser = xmlresourceparser2;
        throw new InflateException("Error inflating menu XML", j1);
_L3:
        i;
        JVM INSTR tableswitch 1 2: default 372
    //                   1 321
    //                   2 89;
           goto _L9 _L10 _L11
_L9:
        if (true) goto _L5; else goto _L12
_L12:
    }
}
