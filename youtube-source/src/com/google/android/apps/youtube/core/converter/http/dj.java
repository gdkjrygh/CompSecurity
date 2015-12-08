// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.f;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.datalib.legacy.model.Survey;
import com.google.android.apps.youtube.datalib.legacy.model.ar;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            dn, dm, dl, dk

public final class dj
{

    private static final Map a = new SurveyConverter._cls1();
    private static final Map b = new SurveyConverter._cls2();
    private static final e c = (new f()).a("/document", new dn()).a("/document/question", new dm()).a("/document/question/options", new dl()).a("/document/question/additional_beacon_urls", new dk()).a();
    private final n d;

    public dj(n n1)
    {
        d = (n)com.google.android.apps.youtube.common.fromguava.c.a(n1);
    }

    static Map a()
    {
        return a;
    }

    static String b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.decode(s);
        }
    }

    static Map b()
    {
        return b;
    }

    public final Survey a(String s)
    {
        s = new ByteArrayInputStream(s.getBytes());
        try
        {
            s = ((ar)d.a(s, c)).a();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ConverterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ConverterException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ConverterException(s);
        }
        return s;
    }

}
