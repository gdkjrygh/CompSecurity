// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.a.a.a.a.bg;
import com.google.a.a.a.a.ih;
import com.google.android.apps.youtube.common.e.c;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.gsf.f;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.core:
//            au

public class ax
    implements au
{

    protected final ContentResolver b;
    protected final String c;

    public ax(ContentResolver contentresolver, String s)
    {
        b = contentresolver;
        c = s;
    }

    private static ih a(JSONObject jsonobject)
    {
        ih ih1 = new ih();
        ih1.b = jsonobject.getInt("capability");
        jsonobject = jsonobject.getJSONArray("features");
        ih1.c = new int[jsonobject.length()];
        for (int i = 0; i < jsonobject.length(); i++)
        {
            ih1.c[i] = jsonobject.getInt(i);
        }

        return ih1;
    }

    private static int[] a(String s)
    {
        int i = 0;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = new int[0];
_L4:
        return s;
_L2:
        String as[] = s.split(",");
        int ai[] = new int[as.length];
        int k = as.length;
        int j = 0;
        do
        {
            s = ai;
            if (i >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            s = as[i];
            try
            {
                ai[j] = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException("Improperly formatted experiment ID string encountered.");
            }
            j++;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static bg b(String s)
    {
        bg bg1;
        boolean flag;
        flag = false;
        bg1 = new bg();
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return bg1;
_L2:
        JSONArray jsonarray;
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Improper JSON syntax encountered in capabilities override.", s);
        }
        if (!s.has("supportedCapabilities"))
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonarray = s.getJSONArray("supportedCapabilities");
        bg1.c = new ih[jsonarray.length()];
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonarray.length())
                {
                    break;
                }
                bg1.c[i] = a(jsonarray.getJSONObject(i));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException("Improper capabilities override syntax encountered.", s);
            }
            i++;
        } while (true);
        if (!s.has("disabledCapabilities")) goto _L1; else goto _L3
_L3:
        s = s.getJSONArray("disabledCapabilities");
        bg1.d = new ih[s.length()];
        i = ((flag) ? 1 : 0);
_L5:
        if (i >= s.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        bg1.d[i] = a(s.getJSONObject(i));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final int A()
    {
        return a("analytics_sample_ratio", g());
    }

    public final String B()
    {
        return a("analytics_category_suffix", ((String) (null)));
    }

    public final com.google.android.apps.youtube.core.async.GDataRequest.Version C()
    {
        return com.google.android.apps.youtube.core.async.GDataRequest.Version.parse(a("gdata_version", "2.1"));
    }

    public final boolean D()
    {
        return a("enable_device_retention", true);
    }

    public final String E()
    {
        return a("experiment_id", ((String) (null)));
    }

    public final boolean F()
    {
        return a("use_innertube_playlist_service", false);
    }

    public final boolean G()
    {
        return a("device_supports_3d_playback", false);
    }

    public final Pair H()
    {
        String s = a("doritos_cookie_domain", ((String) (null)));
        String s1 = a("doritos_cookie_name", ((String) (null)));
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return null;
        } else
        {
            return new Pair(s, s1);
        }
    }

    public final boolean I()
    {
        return a("device_supports_720p_playback", true);
    }

    public final boolean J()
    {
        return a("can_use_texture_surface", true);
    }

    public final int K()
    {
        return a("pudl_ad_frequency_cap", 420);
    }

    public final int L()
    {
        return a("pudl_ad_asset_frequency_cap", 1);
    }

    public final int M()
    {
        return a("pudl_ad_asset_time_to_live", 0x3f480);
    }

    public final int N()
    {
        return a("pudl_ad_lact_skippable", 1800);
    }

    public final int O()
    {
        return a("pudl_ad_lact_nonskippable", 0);
    }

    public final boolean P()
    {
        return a("use_offline_http_service_for_pings", true);
    }

    public final int Q()
    {
        return a("offline_resync_continuation_deferred_service_threshold_seconds", 5);
    }

    public final boolean R()
    {
        return a("attempt_offline_resync_on_expired_continuation", true);
    }

    public final int S()
    {
        return a("maximum_consecutive_skipped_unplayable_videos", 10);
    }

    public final String T()
    {
        return a("adsense_query_domain", "googleads.g.doubleclick.net");
    }

    public final String U()
    {
        return a("adsense_query_domain", "/pagead/ads");
    }

    public final String V()
    {
        return com.google.android.gsf.f.a(b, "device_country", null);
    }

    public final boolean W()
    {
        return a("companion_ad_enabled", false);
    }

    protected final int a(String s, int i)
    {
        return com.google.android.gsf.f.a(b, (new StringBuilder()).append(c).append(":").append(s).toString(), i);
    }

    protected final long a(String s, long l)
    {
        return com.google.android.gsf.f.a(b, (new StringBuilder()).append(c).append(":").append(s).toString(), l);
    }

    protected final String a(String s, String s1)
    {
        return com.google.android.gsf.f.a(b, (new StringBuilder()).append(c).append(":").append(s).toString(), s1);
    }

    protected final boolean a(String s, boolean flag)
    {
        return com.google.android.gsf.f.a(b, (new StringBuilder()).append(c).append(":").append(s).toString(), flag);
    }

    public final int[] a(Context context)
    {
        String s = null;
        if (PackageUtil.a(context))
        {
            s = a("innertube_experiment_ids", ((String) (null)));
        }
        return a(s);
    }

    public final bg b(Context context)
    {
        Object obj = null;
        if (PackageUtil.b(context))
        {
            obj = a("innertube_capability_overrides", ((String) (null)));
        }
        obj = b(((String) (obj)));
        if (PackageUtil.a(context) && ((bg) (obj)).e == null)
        {
            context = new ih();
            context.b = 0x31e0800;
            context.c = (new int[] {
                0x2e6ea0a
            });
            obj.c = (ih[])com.google.android.apps.youtube.common.e.c.a(((bg) (obj)).c, new ih[] {
                context
            });
        }
        return ((bg) (obj));
    }

    public final boolean c(Context context)
    {
        if (PackageUtil.a(context))
        {
            return true;
        } else
        {
            return a("csi_enabled", false);
        }
    }

    public String f()
    {
        return a("analytics_property_id", ((String) (null)));
    }

    protected int g()
    {
        return 1;
    }

    public final boolean g_()
    {
        return a("is_low_end_mobile_network", false);
    }

    public boolean t()
    {
        return false;
    }

    public final long x()
    {
        return a("task_master_delay_before_startup_millis", TimeUnit.SECONDS.toMillis(10L));
    }

    public final boolean y()
    {
        return a("analytics_enabled", true);
    }

    public final int z()
    {
        return a("analytics_update_secs", 30);
    }
}
