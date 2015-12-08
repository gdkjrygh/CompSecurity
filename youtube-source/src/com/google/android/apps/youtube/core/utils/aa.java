// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.f;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            ac, ab, af, ae, 
//            ad

public final class aa
{

    static int a(float f1)
    {
        return (int)(1000F * f1);
    }

    static int a(int i)
    {
        switch (i)
        {
        case 7: // '\007'
        default:
            return 34;

        case 0: // '\0'
            return 9;

        case 1: // '\001'
            return 10;

        case 2: // '\002'
            return 12;

        case 3: // '\003'
            return 17;

        case 4: // '\004'
            return 18;

        case 5: // '\005'
            return 20;

        case 6: // '\006'
            return 33;

        case 8: // '\b'
            return 36;
        }
    }

    public static e a()
    {
        f f1 = new f();
        f1.a("/transcript", new ac()).a("/transcript/text", new ab());
        f1.a("/timedtext", new af()).a("/timedtext/window", new ae()).a("/timedtext/text", new ad());
        return f1.a();
    }

    static String a(Attributes attributes, String as[])
    {
        for (int i = 0; i < as.length; i++)
        {
            String s = attributes.getValue(as[i]);
            if (s != null)
            {
                return s;
            }
        }

        return null;
    }
}
