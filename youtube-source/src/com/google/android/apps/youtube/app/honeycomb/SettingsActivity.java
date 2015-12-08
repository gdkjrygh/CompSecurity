// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.PreferenceActivity;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.compat.i;
import com.google.android.apps.youtube.app.ui.hb;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.at;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.core.utils.v;
import com.google.android.youtube.h;
import com.google.android.youtube.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            g, a, e, f

public class SettingsActivity extends PreferenceActivity
    implements i
{

    private static Set d;
    private ax a;
    private hb b;
    private a c;

    public SettingsActivity()
    {
    }

    static ax a(SettingsActivity settingsactivity)
    {
        return settingsactivity.a;
    }

    private static void a(String s1, List list)
    {
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.preference.PreferenceActivity.Header header = (android.preference.PreferenceActivity.Header)iterator.next();
            if (!header.fragment.equals(s1))
            {
                continue;
            }
            list.remove(header);
            break;
        } while (true);
    }

    public static void a(Enum aenum[], int j, ListPreference listpreference, int k, Resources resources)
    {
        String as[];
        int l;
        int i1;
        int j1;
        boolean flag;
        if (aenum.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        as = new String[aenum.length];
        j1 = aenum.length;
        l = 0;
        i1 = 0;
        for (; l < j1; l++)
        {
            as[i1] = aenum[l].toString();
            i1++;
        }

        listpreference.setEntries(as);
        listpreference.setEntryValues(as);
        if (listpreference.getEntry() == null)
        {
            listpreference.setValueIndex(j);
        }
        listpreference.setSummary(resources.getString(k, new Object[] {
            listpreference.getEntry()
        }));
        listpreference.setOnPreferenceChangeListener(new g(resources, k));
    }

    public final SupportActionBar K()
    {
        SupportActionBar supportactionbar = new SupportActionBar(this);
        supportactionbar.a(getResources().getDrawable(h.a));
        return supportactionbar;
    }

    protected final am a()
    {
        if (c == null)
        {
            c = new a(this);
        }
        return c;
    }

    protected boolean isValidFragment(String s1)
    {
        if (d == null)
        {
            HashSet hashset = new HashSet();
            d = hashset;
            hashset.add(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$AboutPrefsFragment.getName());
            d.add(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$GeneralPrefsFragment.getName());
            d.add(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$SearchPrefsFragment.getName());
            d.add(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$SendToTvPrefsFragment.getName());
            d.add(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$SubtitlesPrefsFragment.getName());
            if (PackageUtil.b(this))
            {
                d.add(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$DeveloperPrefsFragment.getName());
            }
            if (PackageUtil.a(this))
            {
                d.add(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$DogfoodPrefsFragment.getName());
            }
            if (p.a(this))
            {
                d.add(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$OfflinePrefsFragment.getName());
            }
        }
        return d.contains(s1);
    }

    public void onBuildHeaders(List list)
    {
        loadHeadersFromResource(s.g, list);
        a = ((YouTubeApplication)getApplication()).d();
        if (!p.a(this))
        {
            a(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$OfflinePrefsFragment.getName(), list);
        }
        if (PackageUtil.a(this)) goto _L2; else goto _L1
_L1:
        a(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$DogfoodPrefsFragment.getName(), list);
_L4:
        if (!PackageUtil.b(this))
        {
            a(com/google/android/apps/youtube/app/honeycomb/SettingsActivity$DeveloperPrefsFragment.getName(), list);
        }
        return;
_L2:
        String s1 = com/google/android/apps/youtube/app/honeycomb/SettingsActivity$DogfoodPrefsFragment.getName();
        Iterator iterator = list.iterator();
        android.preference.PreferenceActivity.Header header;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            header = (android.preference.PreferenceActivity.Header)iterator.next();
        } while (!header.fragment.equals(s1));
        header.title = "Dogfood";
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        SupportActionBar.a(this).a(com.google.android.apps.youtube.app.compat.SupportActionBar.HomeAction.UP, true);
        a = ((YouTubeApplication)getApplication()).d();
        b = new hb(this);
        a().b();
    }

    protected Dialog onCreateDialog(int j)
    {
        switch (j)
        {
        default:
            return super.onCreateDialog(j);

        case 1002: 
            return (new aa(this)).setMessage(com.google.android.youtube.p.ax).setPositiveButton(0x104000a, new e(this)).setNegativeButton(0x1040000, null).create();

        case 1014: 
            android.app.AlertDialog.Builder builder = (new aa(this)).setTitle(com.google.android.youtube.p.fw);
            int k = com.google.android.youtube.c.b;
            if (a.aW().a())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            return builder.setSingleChoiceItems(k, j, new f(this)).create();

        case 1021: 
            return b.a();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        a.ba().a(getClass().getSimpleName());
    }

    public boolean onSearchRequested()
    {
        return false;
    }

    protected void onStart()
    {
        super.onStart();
        a.O().c();
    }
}
