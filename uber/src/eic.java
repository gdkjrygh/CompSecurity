// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.ubercab.client.core.model.Group;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.client.feature.music.MusicActivity;
import com.ubercab.client.feature.music.MusicSearchFragment;
import com.ubercab.client.feature.music.PlayableItemGridFragment;
import com.ubercab.client.feature.music.PlaylistListFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class eic extends FragmentPagerAdapter
{

    private final boolean a;
    private final List b;
    private final String c;
    private final TunesProvider d;

    public eic(Context context, FragmentManager fragmentmanager, boolean flag, List list, TunesProvider tunesprovider)
    {
        super(fragmentmanager);
        if (flag && tunesprovider != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (a)
        {
            context = context.getString(0x7f0702c5);
        } else
        {
            context = null;
        }
        c = context;
        b = list;
        d = tunesprovider;
        if (d != null)
        {
            a(d.getId());
        }
    }

    private void a(String s)
    {
        if (!"rdio".equals(s)) goto _L2; else goto _L1
_L1:
        Iterator iterator = b.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        s = (Group)iterator.next();
        if (!"Browse".equals(s.getName())) goto _L6; else goto _L5
_L5:
        if (s != null)
        {
            b.remove(s);
        }
_L2:
        return;
_L4:
        s = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public final int getCount()
    {
        int j = b.size();
        int i = j;
        if (a)
        {
            i = j + 1;
        }
        return i;
    }

    public final Fragment getItem(int i)
    {
        if (i == b.size() && a)
        {
            TunesProvider tunesprovider;
            if (d == null)
            {
                tunesprovider = TunesProvider.create();
            } else
            {
                tunesprovider = d;
            }
            return MusicSearchFragment.a(tunesprovider);
        }
        Group group = (Group)b.get(i);
        if (MusicActivity.f().contains(group.getType()))
        {
            return PlayableItemGridFragment.a(group, d);
        } else
        {
            return PlaylistListFragment.a(group);
        }
    }

    public final CharSequence getPageTitle(int i)
    {
        if (i == b.size() && a)
        {
            return c;
        } else
        {
            return ((Group)b.get(i)).getName();
        }
    }
}
