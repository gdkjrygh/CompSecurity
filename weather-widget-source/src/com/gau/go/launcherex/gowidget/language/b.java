// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;

public class b extends Resources
{

    private String a;
    private Resources b;

    public b(Resources resources)
    {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        Object obj;
        obj = android/content/res/Resources.getDeclaredField("mCompatibilityInfo");
        ((Field) (obj)).setAccessible(true);
        obj = ((Field) (obj)).get(resources);
        if (obj != null)
        {
            try
            {
                Field field = android/content/res/Resources.getDeclaredField("mCompatibilityInfo");
                field.setAccessible(true);
                field.set(this, obj);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        resources = resources.getDisplayMetrics();
        obj = getDisplayMetrics();
        if (((DisplayMetrics) (resources)).density != ((DisplayMetrics) (obj)).density)
        {
            updateConfiguration(getConfiguration(), resources);
        }
        return;
    }

    public void a()
    {
        a = null;
        b = null;
    }

    public void a(String s, Resources resources)
    {
        a = s;
        b = resources;
    }

    public String[] getStringArray(int i)
    {
        if (b != null)
        {
            String s = getResourceEntryName(i);
            String as[];
            try
            {
                int j = b.getIdentifier(s, "array", a);
                as = b.getStringArray(j);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                exception = null;
            }
            if (as != null)
            {
                return as;
            }
        }
        return super.getStringArray(i);
    }

    public CharSequence getText(int i)
    {
        if (b != null)
        {
            Object obj = getResourceEntryName(i);
            try
            {
                int j = b.getIdentifier(((String) (obj)), "string", a);
                obj = b.getText(j);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                exception = null;
            }
            if (obj != null)
            {
                return ((CharSequence) (obj));
            }
        }
        return super.getText(i);
    }

    public CharSequence[] getTextArray(int i)
    {
        if (b != null)
        {
            String s = getResourceEntryName(i);
            String as[];
            try
            {
                int j = b.getIdentifier(s, "array", a);
                as = b.getStringArray(j);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                exception = null;
            }
            if (as != null)
            {
                return as;
            }
        }
        return super.getTextArray(i);
    }
}
