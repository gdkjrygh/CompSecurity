// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.SubtitlesColorListPreference;
import com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences;
import com.google.android.apps.youtube.core.ui.SubtitleWindowView;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleWindowSettings;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleWindowSnapshot;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import com.google.android.youtube.s;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            p, n

public class  extends PreferenceFragment
    implements android.content.geListener
{

    private SharedPreferences a;
    private PreferenceCategory b;
    private boolean c;
    private Resources d;
    private View e;
    private SubtitleWindowView f;

    private void a()
    {
        String s1;
        boolean flag1;
        flag1 = true;
        s1 = a.getString("subtitles_edge_type", null);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag;
        i = Integer.parseInt(s1);
        flag = flag1;
        if (i == 1) goto _L4; else goto _L3
_L3:
        if (i != 2) goto _L2; else goto _L5
_L5:
        flag = flag1;
_L4:
        findPreference("subtitles_edge_color").setEnabled(flag);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    static void a(findPreference findpreference)
    {
        findpreference.e();
    }

    static SubtitleWindowView b(e e1)
    {
        return e1.f;
    }

    private void b()
    {
        String s1 = a.getString("subtitles_background_color", null);
        boolean flag;
        if (s1 != null && com.google.android.apps.youtube.core.player.overlay..nal() != Integer.parseInt(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        findPreference("subtitles_background_opacity").setEnabled(flag);
    }

    private void c()
    {
        String s1 = a.getString("subtitles_window_color", null);
        boolean flag;
        if (s1 != null && com.google.android.apps.youtube.core.player.overlay..nal() != Integer.parseInt(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        findPreference("subtitles_window_opacity").setEnabled(flag);
    }

    private void d()
    {
        boolean flag1 = true;
        String s1;
        boolean flag;
        if (findPreference("subtitles_custom_options") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = a.getString("subtitles_style", null);
        if (s1 == null || com.google.android.apps.youtube.core.player.overlay.e.getCustomStyleValue() != Integer.parseInt(s1))
        {
            flag1 = false;
        }
        if (!flag1 && flag)
        {
            ((PreferenceScreen)findPreference("subtitles_settings")).removePreference(b);
        } else
        if (flag1 && !flag)
        {
            ((PreferenceScreen)findPreference("subtitles_settings")).addPreference(b);
            return;
        }
    }

    private void e()
    {
        SubtitlesStyle subtitlesstyle = SubtitlesPreferences.a(a);
        f.setTextBackgroundColor(subtitlesstyle.getBackgroundColor());
        f.setBackgroundColor(subtitlesstyle.getWindowColor());
        f.setEdgeColor(subtitlesstyle.getEdgeColor());
        f.setEdgeType(subtitlesstyle.getEdgeType());
        f.setTextColor(subtitlesstyle.getForegroundColor());
        f.setTypeface(com.google.android.apps.youtube.core.player.overlay.pefaceFromFontValue(subtitlesstyle.getTypeface(), d.getAssets()));
        float f1 = SubtitlesPreferences.b(a);
        f1 = SubtitlesPreferences.a(getActivity(), f1, e.getWidth(), e.getHeight());
        f.setTextSize(f1);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        addPreferencesFromResource(s.i);
        a = getPreferenceManager().getSharedPreferences();
        a.registerOnSharedPreferenceChangeListener(this);
        d = getResources();
        bundle = (ListPreference)findPreference("subtitles_scale");
        ListPreference listpreference = (ListPreference)findPreference("subtitles_style");
        ListPreference listpreference1 = (ListPreference)findPreference("subtitles_font");
        SubtitlesColorListPreference subtitlescolorlistpreference = (SubtitlesColorListPreference)findPreference("subtitles_text_color");
        ListPreference listpreference2 = (ListPreference)findPreference("subtitles_text_opacity");
        ListPreference listpreference3 = (ListPreference)findPreference("subtitles_edge_type");
        SubtitlesColorListPreference subtitlescolorlistpreference1 = (SubtitlesColorListPreference)findPreference("subtitles_edge_color");
        SubtitlesColorListPreference subtitlescolorlistpreference2 = (SubtitlesColorListPreference)findPreference("subtitles_background_color");
        ListPreference listpreference4 = (ListPreference)findPreference("subtitles_background_opacity");
        SubtitlesColorListPreference subtitlescolorlistpreference3 = (SubtitlesColorListPreference)findPreference("subtitles_window_color");
        ListPreference listpreference5 = (ListPreference)findPreference("subtitles_window_opacity");
        p.a(d, bundle, listpreference, listpreference1, subtitlescolorlistpreference, listpreference2, listpreference3, subtitlescolorlistpreference1, subtitlescolorlistpreference2, listpreference4, subtitlescolorlistpreference3, listpreference5);
        c = true;
        b = (PreferenceCategory)findPreference("subtitles_custom_options");
        a();
        b();
        c();
        d();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.aM, null);
        viewgroup = getString(p.eq);
        viewgroup = new SubtitleWindowSnapshot(0, 0, viewgroup, viewgroup, new SubtitleWindowSettings(34, 50, 95, true, false));
        f = (SubtitleWindowView)layoutinflater.findViewById(j.dM);
        f.setWindowSnapshot(viewgroup);
        f.setWrapText(true);
        f.setVisibility(4);
        e = layoutinflater.findViewById(j.bC);
        return layoutinflater;
    }

    public void onDestroy()
    {
        a.unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    public void onResume()
    {
        super.onResume();
        e.post(new n(this));
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s1)
    {
        if (!c) goto _L2; else goto _L1
_L1:
        if (!"subtitles_style".equals(s1)) goto _L4; else goto _L3
_L3:
        sharedpreferences = (ListPreference)findPreference(s1);
        sharedpreferences.setSummary(sharedpreferences.getEntry());
        d();
_L6:
        e();
_L2:
        return;
_L4:
        if ("subtitles_edge_type".equals(s1))
        {
            sharedpreferences = (ListPreference)findPreference(s1);
            sharedpreferences.setSummary(sharedpreferences.getEntry());
            a();
        } else
        if ("subtitles_background_color".equals(s1))
        {
            sharedpreferences = (ListPreference)findPreference(s1);
            sharedpreferences.setSummary(sharedpreferences.getEntry());
            b();
        } else
        if ("subtitles_window_color".equals(s1))
        {
            sharedpreferences = (ListPreference)findPreference(s1);
            sharedpreferences.setSummary(sharedpreferences.getEntry());
            c();
        } else
        if ("subtitles_text_opacity".equals(s1) || "subtitles_window_opacity".equals(s1) || "subtitles_background_opacity".equals(s1) || "subtitles_font".equals(s1) || "subtitles_text_color".equals(s1) || "subtitles_edge_color".equals(s1))
        {
            ((ListPreference)findPreference(s1)).setSummary("%s");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public ()
    {
    }
}
