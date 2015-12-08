// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.a.a.a.a.qu;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.d;
import com.google.android.apps.youtube.app.honeycomb.phone.EditVideoActivity;
import com.google.android.apps.youtube.app.honeycomb.phone.PostPairingActivity;
import com.google.android.apps.youtube.app.honeycomb.phone.ScreenManagementActivity;
import com.google.android.apps.youtube.app.honeycomb.phone.ScreenPairingActivity;
import com.google.android.apps.youtube.app.search.SearchType;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.q;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            SettingsActivity

public final class a
    implements am
{

    private final Activity a;
    private Class b;

    public a(Activity activity)
    {
        a = activity;
        b = i();
    }

    private void a(Intent intent)
    {
        if (b != null)
        {
            intent.putExtra("ancestor_classname", b.getCanonicalName());
        }
        a.startActivity(intent);
    }

    private void a(PaneDescriptor panedescriptor)
    {
        if (a instanceof WatchWhileActivity)
        {
            ((WatchWhileActivity)a).a(panedescriptor);
            return;
        } else
        {
            Intent intent = new Intent(a, com/google/android/apps/youtube/app/WatchWhileActivity);
            intent.setFlags(0x4000000);
            intent.putExtra("pane", panedescriptor);
            a(intent);
            return;
        }
    }

    private void a(WatchDescriptor watchdescriptor)
    {
        if (a instanceof WatchWhileActivity)
        {
            ((WatchWhileActivity)a).a(watchdescriptor);
            return;
        } else
        {
            Intent intent = new Intent(a, com/google/android/apps/youtube/app/WatchWhileActivity);
            intent.setFlags(0x4000000);
            intent.putExtra("watch", watchdescriptor);
            a(intent);
            return;
        }
    }

    private Class i()
    {
        Class class1 = null;
        String s = a.getIntent().getStringExtra("ancestor_classname");
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                class1 = Class.forName(s);
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                return null;
            }
        }
        return class1;
    }

    public final void a()
    {
        b = null;
    }

    public final void a(Uri uri)
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.a(uri));
    }

    public final void a(Uri uri, int j, boolean flag, WatchFeature watchfeature)
    {
        q q1 = q.a(uri);
        if (q1 != null)
        {
            uri = new WatchDescriptor(new PlaybackStartDescriptor("", q1.a, 0, 0, watchfeature));
            uri.setMustAuthenticate(flag);
            a(((WatchDescriptor) (uri)));
        } else
        if (PackageUtil.a(a))
        {
            throw new RuntimeException((new StringBuilder("Invalid playlist uri: ")).append(uri).toString());
        }
    }

    public final void a(Uri uri, com.google.android.apps.youtube.app.ui.ChannelStoreOutline.Category category)
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.a(uri, a.getString(category.stringId)));
    }

    public final void a(qu qu)
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.a(qu));
    }

    public final void a(Video video)
    {
        a(EditVideoActivity.a(a, video));
    }

    public final void a(String s)
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.a(s));
    }

    public final void a(String s, int j)
    {
        s = new PlaybackStartDescriptor("", s, j, 0, WatchFeature.OFFLINE);
        s.setOffline(true);
        a(new WatchDescriptor(s));
    }

    public final void a(String s, String s1)
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.a(s, s1));
    }

    public final void a(String s, String s1, int j, boolean flag, WatchFeature watchfeature, boolean flag1)
    {
        s = new WatchDescriptor(new PlaybackStartDescriptor(s1, s, j, 0, watchfeature));
        s.setMustAuthenticate(false);
        s.setSkipRemoteDialog(true);
        s.setNoAnimation(flag1);
        a(((WatchDescriptor) (s)));
    }

    public final void a(String s, boolean flag, WatchFeature watchfeature)
    {
        s = new WatchDescriptor(new PlaybackStartDescriptor(s, "", -1, 0, watchfeature));
        s.setMustAuthenticate(flag);
        a(((WatchDescriptor) (s)));
    }

    public final void b()
    {
        b = a.getClass();
    }

    public final void b(Uri uri)
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.b(uri));
    }

    public final void b(String s)
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.c(s));
    }

    public final void b(String s, int j)
    {
        a(ScreenPairingActivity.a(a, s, 0));
    }

    public final void c()
    {
        if (!(a instanceof WatchWhileActivity))
        {
            a(WatchWhileActivity.a(a));
        }
    }

    public final void c(String s)
    {
        if (a instanceof WatchWhileActivity)
        {
            ((WatchWhileActivity)a).a(s, null);
            return;
        } else
        {
            a(com.google.android.apps.youtube.app.fragments.navigation.d.a(SearchType.DEFAULT_SEARCH_TYPE, s, null));
            return;
        }
    }

    public final void d()
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.e());
    }

    public final void d(String s)
    {
        s = new PlaybackStartDescriptor(s, "", -1, 0, WatchFeature.OFFLINE);
        s.setOffline(true);
        a(new WatchDescriptor(s));
    }

    public final void e()
    {
        a(new Intent(a, com/google/android/apps/youtube/app/honeycomb/SettingsActivity));
    }

    public final void e(String s)
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.d(s));
    }

    public final void f()
    {
        a(new Intent(a, com/google/android/apps/youtube/app/honeycomb/phone/ScreenManagementActivity));
    }

    public final void g()
    {
        a(new Intent(a, com/google/android/apps/youtube/app/honeycomb/phone/PostPairingActivity));
    }

    public final void h()
    {
        a(com.google.android.apps.youtube.app.fragments.navigation.d.a());
    }
}
