// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UrlSettingsManager
{

    private static final String TAG = com/walmart/android/app/moremenu/UrlSettingsManager.getSimpleName();
    private static final Map URL_SETS = new HashMap();
    private PreferenceFragment mPrefFragment;
    private String mUrlPreferenceName;
    private Set mUrls;
    private String mUrlsFileName;

    public UrlSettingsManager(PreferenceFragment preferencefragment, String s, String s1)
    {
        mUrlsFileName = s;
        mUrlPreferenceName = s1;
        mPrefFragment = preferencefragment;
        mUrls = new HashSet();
        URL_SETS.put(s1, mUrls);
    }

    public static Set getUrlSet(String s)
    {
        return (Set)URL_SETS.get(s);
    }

    private void updateSummary(SharedPreferences sharedpreferences, String s)
    {
        mPrefFragment.findPreference(s).setSummary(sharedpreferences.getString(s, ""));
    }

    public void addUrl(String s)
    {
        mUrls.add(s);
    }

    public boolean onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s.equals(mUrlPreferenceName))
        {
            updateSummary(sharedpreferences, s);
            mUrls.add(sharedpreferences.getString(s, ""));
            writeUrls();
            return true;
        } else
        {
            return false;
        }
    }

    public void readUrls()
    {
        Object obj;
        obj = mPrefFragment.getActivity();
        ((Activity) (obj)).openFileOutput(mUrlsFileName, 32768).close();
        obj = new BufferedReader(new InputStreamReader(((Activity) (obj)).openFileInput(mUrlsFileName)));
_L2:
        String s = ((BufferedReader) (obj)).readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (mUrls.contains(s)) goto _L2; else goto _L1
_L1:
        mUrls.add(s);
          goto _L2
        obj;
        Log.e(TAG, ((Exception) (obj)).toString());
        return;
        ((BufferedReader) (obj)).close();
        return;
    }

    public void setDefaultUrl(String s)
    {
        SharedPreferences sharedpreferences = mPrefFragment.getPreferenceScreen().getSharedPreferences();
        if (!sharedpreferences.contains(mUrlPreferenceName))
        {
            sharedpreferences.edit().putString(mUrlPreferenceName, s).commit();
        }
        updateSummary(sharedpreferences, mUrlPreferenceName);
    }

    public void writeUrls()
    {
        Object obj;
        try
        {
            obj = new BufferedWriter(new OutputStreamWriter(mPrefFragment.getActivity().openFileOutput(mUrlsFileName, 0)));
            String s;
            for (Iterator iterator = mUrls.iterator(); iterator.hasNext(); ((BufferedWriter) (obj)).write((new StringBuilder()).append(s).append("\n").toString()))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.i(TAG, ((Exception) (obj)).toString());
            return;
        }
        ((BufferedWriter) (obj)).close();
        return;
    }

}
