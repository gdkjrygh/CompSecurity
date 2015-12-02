// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.ubercab.client.feature.profiles.BadgeView;
import com.ubercab.client.feature.profiles.model.BadgeIcons;
import com.ubercab.rider.realtime.model.Image;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.ProfileTheme;
import java.util.List;
import java.util.Map;

public final class ezc
{

    public static int a(Context context, Profile profile)
    {
        ProfileTheme profiletheme = profile.getThemeFromChildAttributes();
        if (profiletheme == null || TextUtils.isEmpty(profiletheme.getColor()))
        {
            return b(context, profile);
        } else
        {
            return dtu.a(profiletheme.getColor());
        }
    }

    public static void a(BadgeView badgeview, Profile profile, cgh cgh1)
    {
        ProfileTheme profiletheme = profile.getThemeFromChildAttributes();
        if (profiletheme == null)
        {
            badgeview.a(null);
            b(badgeview, profile, cgh1);
            return;
        }
        badgeview.setBackgroundColor(a(badgeview.getContext(), profile));
        if (TextUtils.isEmpty(profiletheme.getInitials()))
        {
            badgeview.a(null);
            Map map = profiletheme.getLogos();
            if (map == null || map.isEmpty() || ((List)map.get("Large")).isEmpty() && ((List)map.get("Thumbnail")).isEmpty())
            {
                if (profiletheme.getIcon() == null)
                {
                    b(badgeview, profile, cgh1);
                    return;
                } else
                {
                    cgh1.a(BadgeIcons.getResIdForIcon(profiletheme.getIcon())).a(badgeview);
                    return;
                }
            } else
            {
                cgh1.a(((Image)gki.a((List)map.get("Large"), null)).getUrl()).a(badgeview);
                return;
            }
        } else
        {
            badgeview.setImageBitmap(null);
            badgeview.a(profiletheme.getInitials());
            return;
        }
    }

    public static int b(Context context, Profile profile)
    {
        context = context.getResources();
        int i;
        if (dum.j(profile))
        {
            i = 0x7f0d0069;
        } else
        {
            i = 0x7f0d006b;
        }
        return context.getColor(i);
    }

    private static void b(BadgeView badgeview, Profile profile, cgh cgh1)
    {
        badgeview.setBackgroundColor(a(badgeview.getContext(), profile));
        int i;
        if (dum.o(profile))
        {
            i = BadgeIcons.getResIdForIcon("house");
        } else
        {
            i = BadgeIcons.getResIdForIcon("briefcase");
        }
        cgh1.a(i).a(badgeview);
    }
}
