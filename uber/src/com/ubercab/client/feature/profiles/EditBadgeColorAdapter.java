// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cev;
import cgh;
import cgt;
import com.ubercab.client.feature.profiles.model.BadgeIcons;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.ProfileTheme;
import ezc;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            BadgeView

final class EditBadgeColorAdapter extends BaseAdapter
{

    private final cev a;
    private final LayoutInflater b;
    private final List c;
    private final cgh d;
    private String e;
    private String f;
    private int g;

    EditBadgeColorAdapter(Context context, List list, Profile profile, cgh cgh1, cev cev)
    {
        b = LayoutInflater.from(context);
        c = list;
        list = profile.getThemeFromChildAttributes();
        if (list != null)
        {
            f = list.getInitials();
            e = list.getIcon();
            g = ezc.a(context, profile);
        }
        d = cgh1;
        a = cev;
    }

    static cev a(EditBadgeColorAdapter editbadgecoloradapter)
    {
        return editbadgecoloradapter.a;
    }

    private static void a(BadgeView badgeview)
    {
        badgeview.a(null);
        badgeview.setImageBitmap(null);
    }

    private static void a(BadgeView badgeview, String s, String s1, int i, cgh cgh1)
    {
        badgeview.setBackgroundColor(i);
        if (TextUtils.isEmpty(s1))
        {
            badgeview.a(null);
            if (s != null)
            {
                cgh1.a(BadgeIcons.getResIdForIcon(s)).a(badgeview);
            }
            return;
        } else
        {
            badgeview.setImageBitmap(null);
            badgeview.a(s1);
            return;
        }
    }

    private Integer b(int i)
    {
        return (Integer)c.get(i);
    }

    public final String a()
    {
        return e;
    }

    final void a(int i)
    {
        g = i;
        notifyDataSetChanged();
    }

    final void a(String s)
    {
        e = s;
        f = null;
        notifyDataSetChanged();
    }

    final void b(String s)
    {
        e = null;
        f = s;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return b(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(0x7f03005a, viewgroup, false);
            view1.setTag(new ViewHolder(view1));
        }
        view = (ViewHolder)view1.getTag();
        i = b(i).intValue();
        if (i == g)
        {
            ((ViewHolder) (view)).mBadgeView.a(false);
            a(((ViewHolder) (view)).mBadgeView);
            a(((ViewHolder) (view)).mBadgeView, e, f, g, d);
        } else
        {
            a(((ViewHolder) (view)).mBadgeView);
            ((ViewHolder) (view)).mBadgeView.a(true);
        }
        ((ViewHolder) (view)).mBadgeView.setBackgroundColor(i);
        return view1;
    }

    private class ViewHolder
    {

        final EditBadgeColorAdapter a;
        BadgeView mBadgeView;

        void onColorSelected()
        {
            EditBadgeColorAdapter.a(a).c(new ezk(mBadgeView.a()));
        }

        ViewHolder(View view)
        {
            a = EditBadgeColorAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
