// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefsUtil
{
    private static class PrefsUtilHolder
    {

        public static final PrefsUtil INSTANCE = new PrefsUtil();


        private PrefsUtilHolder()
        {
        }
    }


    private SharedPreferences feedbackTokenPrefs;
    private android.content.SharedPreferences.Editor feedbackTokenPrefsEditor;
    private SharedPreferences nameEmailSubjectPrefs;
    private android.content.SharedPreferences.Editor nameEmailSubjectPrefsEditor;

    private PrefsUtil()
    {
    }


    public static void applyChanges(android.content.SharedPreferences.Editor editor)
    {
        if (applySupported().booleanValue())
        {
            editor.apply();
            return;
        } else
        {
            editor.commit();
            return;
        }
    }

    public static Boolean applySupported()
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        return Boolean.valueOf(false);
    }

    public static PrefsUtil getInstance()
    {
        return PrefsUtilHolder.INSTANCE;
    }

    public String getFeedbackTokenFromPrefs(Context context)
    {
        if (context != null)
        {
            feedbackTokenPrefs = context.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
            if (feedbackTokenPrefs != null)
            {
                return feedbackTokenPrefs.getString("net.hockeyapp.android.prefs_key_feedback_token", null);
            }
        }
        return null;
    }

    public String getNameEmailFromPrefs(Context context)
    {
        if (context != null)
        {
            nameEmailSubjectPrefs = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
            if (nameEmailSubjectPrefs != null)
            {
                return nameEmailSubjectPrefs.getString("net.hockeyapp.android.prefs_key_name_email", null);
            }
        }
        return null;
    }

    public void saveFeedbackTokenToPrefs(Context context, String s)
    {
        if (context != null)
        {
            feedbackTokenPrefs = context.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
            if (feedbackTokenPrefs != null)
            {
                feedbackTokenPrefsEditor = feedbackTokenPrefs.edit();
                feedbackTokenPrefsEditor.putString("net.hockeyapp.android.prefs_key_feedback_token", s);
                applyChanges(feedbackTokenPrefsEditor);
            }
        }
    }

    public void saveNameEmailSubjectToPrefs(Context context, String s, String s1, String s2)
    {
        if (context != null)
        {
            nameEmailSubjectPrefs = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
            if (nameEmailSubjectPrefs != null)
            {
                nameEmailSubjectPrefsEditor = nameEmailSubjectPrefs.edit();
                if (s == null || s1 == null || s2 == null)
                {
                    nameEmailSubjectPrefsEditor.putString("net.hockeyapp.android.prefs_key_name_email", null);
                } else
                {
                    nameEmailSubjectPrefsEditor.putString("net.hockeyapp.android.prefs_key_name_email", String.format("%s|%s|%s", new Object[] {
                        s, s1, s2
                    }));
                }
                applyChanges(nameEmailSubjectPrefsEditor);
            }
        }
    }
}
