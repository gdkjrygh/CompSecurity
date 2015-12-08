// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.golauncher.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.ref.WeakReference;

class a
{

    private WeakReference a;

    public a(Activity activity)
    {
        a = new WeakReference(activity);
    }

    private SharedPreferences d()
    {
        if (a.get() != null)
        {
            return PreferenceManager.getDefaultSharedPreferences((Context)a.get());
        } else
        {
            return null;
        }
    }

    public Activity a()
    {
        return (Activity)a.get();
    }

    protected boolean a(String s, Boolean boolean1)
    {
        Object obj = d();
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean(s, boolean1.booleanValue());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            return true;
        } else
        {
            return false;
        }
    }

    protected boolean a(String s, String s1)
    {
        Object obj = d();
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString(s, s1);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            return true;
        } else
        {
            return false;
        }
    }

    protected boolean a(String s, boolean flag)
    {
        SharedPreferences sharedpreferences = d();
        boolean flag1 = flag;
        if (sharedpreferences != null)
        {
            flag1 = sharedpreferences.getBoolean(s, flag);
        }
        return flag1;
    }

    protected String b()
    {
        return (new StringBuilder()).append(((Activity)a.get()).getPackageName()).append("_preferences").toString();
    }

    protected String b(String s, String s1)
    {
        SharedPreferences sharedpreferences = d();
        String s2 = s1;
        if (sharedpreferences != null)
        {
            s2 = sharedpreferences.getString(s, s1);
        }
        return s2;
    }

    public void c()
    {
        if (a != null)
        {
            a.clear();
        }
    }
}
