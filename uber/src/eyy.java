// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.model.ProfileResponseError;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.ProfileTheme;
import com.ubercab.rider.realtime.model.ProfileThemeOption;
import com.ubercab.rider.realtime.request.param.CreateProfile;
import com.ubercab.rider.realtime.request.param.UpdateProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class eyy
{

    private final cev a;
    private final gmg b;
    private final hsq c;
    private final dkl d;
    private final hkl e;
    private final dal f;
    private boolean g;
    private icl h;
    private List i;
    private Map j;
    private Profile k;

    public eyy(dkl dkl1, hkl hkl1, cev cev1, gmg gmg1, dal dal1, hsq hsq1)
    {
        g = true;
        a = cev1;
        d = dkl1;
        e = hkl1;
        b = gmg1;
        c = hsq1;
        i = new ArrayList();
        j = new HashMap();
        f = dal1;
    }

    static cev a(eyy eyy1)
    {
        return eyy1.a;
    }

    private static com.ubercab.client.feature.profiles.model.ProfileTheme a(ProfileTheme profiletheme)
    {
        if (profiletheme != null)
        {
            return com.ubercab.client.feature.profiles.model.ProfileTheme.create(profiletheme.getInitials(), profiletheme.getIcon(), profiletheme.getLogos(), profiletheme.getColor());
        } else
        {
            return com.ubercab.client.feature.profiles.model.ProfileTheme.createEmpty();
        }
    }

    private void a(UpdateProfile updateprofile)
    {
        d.a(updateprofile, f.z());
    }

    static void a(eyy eyy1, UpdateProfile updateprofile)
    {
        eyy1.a(updateprofile);
    }

    static void a(eyy eyy1, List list)
    {
        eyy1.a(list);
    }

    private void a(List list)
    {
        i = gkk.a(gki.a(list, new gka() {

            final eyy a;

            private static boolean a(Profile profile)
            {
                return profile != null;
            }

            public final boolean apply(Object obj)
            {
                return a((Profile)obj);
            }

            
            {
                a = eyy.this;
                super();
            }
        }));
        b(list);
        n();
        if (i.size() > 0)
        {
            i();
        }
        a.c(new ezo());
    }

    private Profile b(String s)
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            Profile profile = (Profile)iterator.next();
            if (profile.getUuid().equals(s))
            {
                return profile;
            }
        }

        return null;
    }

    private void b(List list)
    {
        Profile profile = f.a(this);
        Object obj = profile;
        if (profile == null)
        {
            list = (Profile)gki.a(list, null);
            obj = list;
            if (list != null)
            {
                f.a(list);
                obj = list;
            }
        }
        k = ((Profile) (obj));
    }

    private static void c(String s)
    {
        ijg.c("Could not find a Profile associated with the TroyProfileThemeOption uuid %s", new Object[] {
            s
        });
    }

    private void e(Profile profile)
    {
        k = profile;
        f.a(profile);
    }

    private void k()
    {
        d.a(f.z());
    }

    private boolean l()
    {
        return !b.a(dbf.cg, dbt.b) && i.size() > 1 && g;
    }

    private void m()
    {
        if (((hoi)c.a()).d("profiles_key"))
        {
            ezb ezb1 = (ezb)((hoi)c.a()).a("profiles_key", ezb);
            if (ezb1 != null && ezb1.a != null)
            {
                i = ezb1.a;
                b(i);
            }
        }
    }

    private void n()
    {
        ((hoi)c.a()).a("profiles_key", ezb.a(i));
    }

    public final Profile a(String s)
    {
label0:
        {
            if (s == null)
            {
                break label0;
            }
            Iterator iterator = i.iterator();
            Profile profile;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                profile = (Profile)iterator.next();
            } while (!profile.getUuid().equals(s));
            return profile;
        }
        return null;
    }

    public final eza a(Profile profile)
    {
        return new eza(this, profile, (byte)0);
    }

    public final void a()
    {
        i.clear();
        j.clear();
        ((hoi)c.a()).a("profiles_key");
        g = true;
        if (h != null && !h.c())
        {
            h.b();
        }
        f.M();
    }

    public final void a(Profile profile, String s)
    {
        profile = UpdateProfile.create(profile);
        profile.setDefaultPaymentProfileUuid(s);
        d.a(profile, f.z());
    }

    public final void a(Profile profile, String s, int i1, String s1, String s2)
    {
        com.ubercab.client.feature.profiles.model.ProfileTheme profiletheme = a(profile.getThemeFromChildAttributes());
        profiletheme.setColor(dtu.a(i1));
        if (TextUtils.isEmpty(s2))
        {
            profiletheme.setInitials(null);
        } else
        {
            profiletheme.setInitials(s2);
        }
        profiletheme.setIcon(s1);
        profile = UpdateProfile.create(profile);
        profile.setTheme(profiletheme);
        profile.setName(s);
        d.a(profile, f.z());
    }

    public final void a(Profile profile, List list)
    {
        profile = UpdateProfile.create(profile);
        profile.setSelectedSummaryPeriods(list);
        d.a(profile, f.z());
    }

    public final void a(Profile profile, boolean flag)
    {
        profile = UpdateProfile.create(profile);
        profile.setIsExpensingEnabled(flag);
        d.a(profile, f.z());
    }

    public final void a(CreateProfile createprofile, CreateProfile createprofile1)
    {
        if (f.z() == null)
        {
            return;
        }
        if (createprofile1 != null)
        {
            createprofile1.setUserUuid(f.z());
        }
        createprofile.setUserUuid(f.z());
        h = e.a(f.z(), createprofile1, createprofile).a(ico.a()).a(new eyz(this, (byte)0));
    }

    public final Profile b()
    {
        return k;
    }

    public final ProfileThemeOption b(Profile profile)
    {
        return (ProfileThemeOption)j.get(profile.getUuid());
    }

    public final void b(Profile profile, String s)
    {
        profile = UpdateProfile.create(profile);
        profile.setEmail(s);
        d.a(profile, f.z());
    }

    public final List c()
    {
        if (b.a(dbf.cg, dbt.b))
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(i);
        }
    }

    final void c(Profile profile)
    {
        e(profile);
        a.c(new ezm(profile));
    }

    public final void d()
    {
        f.L();
    }

    public final void d(Profile profile)
    {
        e(profile);
        g = true;
    }

    public final void e()
    {
        a.a(this);
        m();
        k();
    }

    public final boolean f()
    {
        return b.a(dbf.aI) && l();
    }

    public final boolean g()
    {
        return b.a(dbf.aI) && b.a(dbf.cf) && f.N() < 3 && !l();
    }

    public final boolean h()
    {
        return b.a(dbf.aI) && b.a(dbf.cg) && !l();
    }

    public final void i()
    {
        d.b(f.z());
    }

    public final void j()
    {
        if (!f())
        {
            g = false;
        }
    }

    public final void onGetProfileThemeOptionsResponseEvent(dlx dlx1)
    {
        if (dlx1.a() != null)
        {
            for (dlx1 = dlx1.a().iterator(); dlx1.hasNext();)
            {
                ProfileThemeOption profilethemeoption = (ProfileThemeOption)dlx1.next();
                Profile profile = b(profilethemeoption.getProfileUuid());
                if (profile != null)
                {
                    j.put(profile.getUuid(), profilethemeoption);
                } else
                {
                    c(profilethemeoption.getProfileUuid());
                }
            }

        } else
        {
            if (dlx1.b() != null)
            {
                dlx1 = dlx1.b().getMessage();
            } else
            {
                dlx1 = "";
            }
            ijg.d("Profiles", new Object[] {
                (new StringBuilder("Error in onGetProfileThemeOptionsResponseEvent = ")).append(dlx1).toString()
            });
        }
        a.c(new ezt());
    }

    public final void onGetTroyProfilesResponseEvent(dly dly1)
    {
        if (!dly1.i() || dly1.a() == null)
        {
            return;
        } else
        {
            a(dly1.a());
            return;
        }
    }

    public final void onUpdateProfileResponseEvent(dns dns1)
    {
        if (!dns1.k())
        {
            dns1 = dns1.a();
            for (int i1 = 0; i1 < i.size(); i1++)
            {
                if (dns1.getUuid().equals(((Profile)i.get(i1)).getUuid()))
                {
                    i.set(i1, dns1);
                    if (k != null && k.getUuid().equals(dns1.getUuid()))
                    {
                        k = dns1;
                    }
                    n();
                    a.c(new ezu(dns1));
                    return;
                }
            }

            ijg.d("Profiles", new Object[] {
                "Could not find a Profile with uuid = %s to update after UpdateProfileResponseEvent.", dns1.getUuid()
            });
            return;
        }
        if (dns1.b() != null)
        {
            dns1 = dns1.b().getMessage();
        } else
        {
            dns1 = "Error updating profile";
        }
        ijg.d("Profiles", new Object[] {
            dns1
        });
    }
}
