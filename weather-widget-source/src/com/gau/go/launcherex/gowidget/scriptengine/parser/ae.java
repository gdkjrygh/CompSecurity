// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.gtp.a.a.b.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            u, z

public class ae
{

    private u a;
    private Context b;
    private boolean c;

    public ae(Context context)
    {
        b = context;
        a = new u();
    }

    private boolean a(Context context, String s, z z1)
    {
        Resources resources;
        int i;
        resources = context.getResources();
        i = resources.getIdentifier(s.replaceFirst("/", "_").replace(".xml", ""), "raw", context.getPackageName());
        if (i == 0) goto _L2; else goto _L1
_L1:
        java.io.InputStream inputstream1 = resources.openRawResource(i);
_L6:
        java.io.InputStream inputstream = inputstream1;
        android.content.res.Resources.NotFoundException notfoundexception;
        if (inputstream1 == null)
        {
            try
            {
                inputstream = context.getAssets().open(s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                notfoundexception = null;
            }
        }
        if (inputstream == null) goto _L4; else goto _L3
_L3:
        context = XmlPullParserFactory.newInstance();
        context.setNamespaceAware(true);
        context = context.newPullParser();
        context.setInput(inputstream, "utf-8");
        a.a(context, z1);
        return true;
        notfoundexception;
        notfoundexception.printStackTrace();
_L2:
        inputstream1 = null;
        continue; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
_L4:
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public z a(String s, String s1)
    {
        Context context;
        if (s1.equals(b.getPackageName()))
        {
            s1 = new z(s1);
            a(b, s, ((z) (s1)));
            c = true;
            return s1;
        }
        context = b;
        Context context1 = b.createPackageContext(s1, 3);
        boolean flag;
        context = context1;
        flag = true;
_L1:
        if (flag)
        {
            s1 = new z(s1);
            android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
            if (!a(context, s, ((z) (s1))))
            {
                c = false;
                s1.j();
                s1 = new z(b.getPackageName());
                a(b, s, ((z) (s1)));
                return s1;
            } else
            {
                c = true;
                return s1;
            }
        } else
        {
            c = false;
            s1 = new z(b.getPackageName());
            a(b, s, ((z) (s1)));
            return s1;
        }
        namenotfoundexception;
        namenotfoundexception.printStackTrace();
        flag = false;
          goto _L1
    }

    public boolean a()
    {
        return c;
    }

    public z b(String s, String s1)
    {
        Context context;
        boolean flag;
        c = false;
        if (s1.equals(b.getPackageName()))
        {
            s1 = new z(s1);
            c = a(b, s, s1);
            return s1;
        }
        context = b;
        flag = true;
        Context context1 = b.createPackageContext(s1, 3);
        context = context1;
_L1:
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        if (flag)
        {
            s1 = new z(s1);
            c = a(context, s, s1);
            return s1;
        } else
        {
            s1 = new z(b.getPackageName());
            c = a(b, s, s1);
            return s1;
        }
        namenotfoundexception;
        if (com.gtp.a.a.b.c.a())
        {
            namenotfoundexception.printStackTrace();
        }
        flag = false;
          goto _L1
    }
}
