// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class d
{

    public static InputStream a(Context context, String s, String s1)
    {
        if (context == null || s == null || s1 == null)
        {
            return null;
        }
        try
        {
            context = context.getPackageManager().getResourcesForApplication(s).getAssets().open(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static XmlPullParser a(InputStream inputstream)
    {
        XmlPullParser xmlpullparser;
        try
        {
            xmlpullparser = XmlPullParserFactory.newInstance().newPullParser();
            xmlpullparser.setInput(inputstream, null);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return null;
        }
        return xmlpullparser;
    }

    public static InputStream b(Context context, String s, String s1)
    {
        if (context != null && s != null && s1 != null)
        {
            try
            {
                context = context.createPackageContext(s, 3);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                context = null;
            }
            if (context != null)
            {
                context = context.getResources();
                int i = context.getIdentifier(s1, "raw", s);
                if (i != 0)
                {
                    try
                    {
                        context = context.openRawResource(i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context.printStackTrace();
                        return null;
                    }
                    return context;
                }
            }
        }
        return null;
    }
}
