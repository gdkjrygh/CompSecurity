// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cgh;
import chp;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.request.param.CreateProfile;
import dui;
import dum;
import eyv;
import eyy;
import ezg;
import gmg;
import hkr;
import java.util.ArrayList;
import java.util.List;
import n;

public final class ProfilesAdapter extends BaseAdapter
{

    private final chp a;
    private final Context b;
    private final hkr c;
    private final gmg d;
    private final LayoutInflater e;
    private final eyv f;
    private final cgh g;
    private final eyy h;
    private final int i;
    private int j;
    private List k;
    private Profile l;
    private int m;
    private int n;

    public ProfilesAdapter(Context context, eyv eyv, int i1, eyy eyy1, gmg gmg, cgh cgh, hkr hkr1, 
            chp chp1)
    {
        a = chp1;
        c = hkr1;
        b = context;
        d = gmg;
        e = LayoutInflater.from(context);
        f = eyv;
        g = cgh;
        i = i1;
        h = eyy1;
        k = new ArrayList(eyy1.c());
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ezg.a().length];
                try
                {
                    a[ezg.c - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ezg.d - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ezg.a - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ezg.b - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[i - 1];
        JVM INSTR tableswitch 1 4: default 112
    //                   1 117
    //                   2 117
    //                   3 152
    //                   4 161;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        a();
        return;
_L2:
        m = context.getResources().getDimensionPixelSize(0x7f0802da);
        n = context.getResources().getDimensionPixelSize(0x7f0800cf);
        j = 0x7f030145;
        continue; /* Loop/switch isn't completed */
_L3:
        j = 0x7f030145;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 0x7f030144;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private Profile a(int i1)
    {
        return (Profile)k.get(i1);
    }

    static eyy a(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.h;
    }

    private void a()
    {
        if (h.h() && !c())
        {
            Object obj = b.getString(0x7f07037e);
            obj = CreateProfile.create("Personal", ((String) (obj)), ((String) (obj)));
            k.add(obj);
        }
    }

    static void a(ProfilesAdapter profilesadapter, boolean flag)
    {
        profilesadapter.a(flag);
    }

    private void a(n n1)
    {
        if (a != null && n1 != null)
        {
            a.a(n1);
        }
    }

    private void a(boolean flag)
    {
        n n1 = null;
        _cls1.a[i - 1];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 75
    //                   2 93
    //                   3 50
    //                   4 68;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        a(n1);
        return;
_L4:
        if (flag)
        {
            n1 = n.iv;
        } else
        {
            n1 = n.iw;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        n1 = n.jb;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag)
        {
            n1 = n.jn;
        } else
        {
            n1 = n.jp;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (flag)
        {
            n1 = n.ii;
        } else
        {
            n1 = n.ik;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    static boolean a(ProfilesAdapter profilesadapter, Profile profile)
    {
        return profilesadapter.c(profile);
    }

    static int b(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.i;
    }

    private void b()
    {
        n n1 = null;
        _cls1.a[i - 1];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 53
    //                   2 60
    //                   3 46;
           goto _L1 _L2 _L3 _L4
_L1:
        a(n1);
        return;
_L4:
        n1 = n.ix;
        continue; /* Loop/switch isn't completed */
_L2:
        n1 = n.jq;
        continue; /* Loop/switch isn't completed */
_L3:
        n1 = n.il;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private boolean b(int i1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (h.h())
        {
            flag = flag1;
            if (!c())
            {
                flag = flag1;
                if (i1 == getCount() - 1)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private static boolean b(Profile profile)
    {
        return !TextUtils.isEmpty(profile.getDefaultPaymentProfileUuid());
    }

    static void c(ProfilesAdapter profilesadapter)
    {
        profilesadapter.b();
    }

    private boolean c()
    {
        return i == ezg.d || i == ezg.c;
    }

    private boolean c(Profile profile)
    {
        while (dum.e(profile) || dui.a(c.c()) && b(profile) && dui.a(c.c(), profile.getDefaultPaymentProfileUuid())) 
        {
            return false;
        }
        return true;
    }

    static eyv d(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.f;
    }

    static Context e(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.b;
    }

    static cgh f(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.g;
    }

    static boolean g(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.c();
    }

    static int h(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.m;
    }

    static int i(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.n;
    }

    static Profile j(ProfilesAdapter profilesadapter)
    {
        return profilesadapter.l;
    }

    public final void a(Profile profile)
    {
        l = profile;
    }

    public final int getCount()
    {
        return k.size();
    }

    public final Object getItem(int i1)
    {
        return a(i1);
    }

    public final long getItemId(int i1)
    {
        return (long)i1;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        Profile profile = a(i1);
        View view1 = view;
        if (view == null)
        {
            view1 = e.inflate(j, viewgroup, false);
            if (i == ezg.a || c())
            {
                view = new NavigationDrawerViewHolder(view1);
            } else
            {
                view = new ViewHolder(view1);
            }
            view1.setTag(view);
        }
        ((ViewHolder)view1.getTag()).a(profile, b(i1));
        return view1;
    }

    public final void notifyDataSetChanged()
    {
        k = new ArrayList(h.c());
        a();
        super.notifyDataSetChanged();
    }

    private class NavigationDrawerViewHolder extends ViewHolder
    {
        private class ViewHolder
        {

            boolean b;
            Profile c;
            final ProfilesAdapter d;
            ImageView mAlertImageView;
            BadgeView mBadgeView;
            TextView mSubtitleTextView;
            TextView mTextView;

            private void a(boolean flag)
            {
                ImageView imageview = mAlertImageView;
                int i1;
                if (flag)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                imageview.setVisibility(i1);
            }

            protected final void a(Profile profile)
            {
                mBadgeView.setVisibility(0);
                ezc.a(mBadgeView, profile, ProfilesAdapter.f(d));
            }

            void a(Profile profile, boolean flag)
            {
                b(profile, flag);
                if (flag)
                {
                    mBadgeView.b();
                    return;
                } else
                {
                    a(c);
                    return;
                }
            }

            protected final void b(Profile profile, boolean flag)
            {
                int i1 = 0;
                c = profile;
                b = flag;
                mTextView.setText(dum.a(profile, ProfilesAdapter.e(d)));
                if (ProfilesAdapter.a(d, profile) && !b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                profile = mSubtitleTextView;
                if (!flag)
                {
                    i1 = 8;
                }
                profile.setVisibility(i1);
                a(flag);
            }

            public void onClickProvider()
            {
                boolean flag1 = c.equals(ProfilesAdapter.a(d).b());
                boolean flag;
                if (!ProfilesAdapter.a(d, c))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag1 || ProfilesAdapter.b(d) == ezg.b)
                {
                    ProfilesAdapter.a(d, flag);
                } else
                {
                    ProfilesAdapter.c(d);
                }
                ProfilesAdapter.d(d).a(c, b);
            }

            ViewHolder(View view)
            {
                d = ProfilesAdapter.this;
                super();
                ButterKnife.inject(this, view);
            }
        }


        final ProfilesAdapter a;
        RadioButton mRadioButton;
        LinearLayout mTextViewContainer;

        private void a(boolean flag)
        {
            RadioButton radiobutton = mRadioButton;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            radiobutton.setVisibility(i1);
        }

        final void a(Profile profile, boolean flag)
        {
            super.b(profile, flag);
            if (b)
            {
                mRadioButton.setVisibility(8);
                mAlertImageView.setVisibility(8);
                mBadgeView.setVisibility(0);
                mBadgeView.b();
                return;
            }
            a(profile);
            mBadgeView.a(-1);
            if (ProfilesAdapter.a(a, profile))
            {
                a(false);
                return;
            }
            a(true);
            Profile profile1;
            if (ProfilesAdapter.j(a) != null)
            {
                profile1 = ProfilesAdapter.j(a);
            } else
            {
                profile1 = ProfilesAdapter.a(a).b();
            }
            mRadioButton.setChecked(profile.equals(profile1));
        }

        NavigationDrawerViewHolder(View view)
        {
            a = ProfilesAdapter.this;
            super(view);
            if (ProfilesAdapter.g(ProfilesAdapter.this))
            {
                mTextViewContainer.setPadding(ProfilesAdapter.h(ProfilesAdapter.this), 0, 0, 0);
                mTextView.setTextAppearance(ProfilesAdapter.e(ProfilesAdapter.this), 0x7f0900fa);
                view.setBackgroundResource(0x7f0201fa);
                if (view.getLayoutParams() != null)
                {
                    view.getLayoutParams().height = ProfilesAdapter.i(ProfilesAdapter.this);
                }
            }
        }
    }

}
