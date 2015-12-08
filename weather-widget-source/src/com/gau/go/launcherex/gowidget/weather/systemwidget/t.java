// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c;
import com.gau.go.launcherex.gowidget.weather.theme.d;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            n

public abstract class t
{

    private Context a;
    public String f;
    public String g;

    public t()
    {
        f = "com.gau.go.launcherex.gowidget.weatherwidget";
        g = "";
    }

    public InputStream a(int i)
    {
        InputStream inputstream = null;
        if (i != 0)
        {
            try
            {
                inputstream = a.getResources().openRawResource(i);
            }
            catch (Exception exception)
            {
                return null;
            }
        }
        return inputstream;
    }

    public abstract void a(n n1, XmlPullParser xmlpullparser);

    public boolean a(Context context)
    {
label0:
        {
            if (context.getPackageName().equals(f))
            {
                a = context;
            } else
            {
                try
                {
                    a = context.createPackageContext(f, 2);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    context.printStackTrace();
                }
            }
            if (a != null)
            {
                String s = h();
                InputStream inputstream = g(s);
                context = inputstream;
                if (inputstream == null)
                {
                    context = a(f(s.replace(".xml", "")));
                }
                if (context != null)
                {
                    break label0;
                }
            }
            return false;
        }
        XmlPullParser xmlpullparser = com.gau.go.launcherex.gowidget.weather.theme.d.a(context);
        if (xmlpullparser != null)
        {
            a(new n(), xmlpullparser);
        }
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return true;
    }

    public void b(String s)
    {
        g = s;
        f = com.gau.go.launcherex.gowidget.weather.globaltheme.c.b(g);
    }

    public int c(String s)
    {
        int i = 0;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                i = a.getResources().getIdentifier(s, "layout", f);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return 0;
            }
        }
        return i;
    }

    public abstract String c();

    public int d(String s)
    {
        int i = 0;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                i = a.getResources().getIdentifier(s, "id", f);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return 0;
            }
        }
        return i;
    }

    public int e(String s)
    {
        int i = 0;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                i = a.getResources().getIdentifier(s, "drawable", f);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return 0;
            }
        }
        return i;
    }

    public int f(String s)
    {
        int i = 0;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                i = a.getResources().getIdentifier(s, "raw", f);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return 0;
            }
        }
        return i;
    }

    public InputStream g(String s)
    {
        InputStream inputstream = null;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                inputstream = a.getResources().getAssets().open(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return inputstream;
    }

    public String g()
    {
        return f;
    }

    public String h()
    {
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.a(g))
        {
            return com.gau.go.launcherex.gowidget.weather.globaltheme.c.d(com.gau.go.launcherex.gowidget.weather.globaltheme.c.c(g));
        } else
        {
            return "systemwidget_weatherwidget.xml";
        }
    }
}
