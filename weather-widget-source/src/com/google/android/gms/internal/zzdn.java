// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzhv, zzew, zzip, 
//            zziq, zzdi, zzan, zzhu, 
//            zzhq

public final class zzdn
    implements zzdg
{
    public static class zza extends zzhq
    {

        private final String zzF;
        private final zzip zzoL;
        private final String zzxn = "play.google.com";
        private final String zzxo = "market";
        private final int zzxp = 10;

        public void onStop()
        {
        }

        public Intent zzY(String s)
        {
            s = Uri.parse(s);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(0x10000000);
            intent.setData(s);
            return intent;
        }

        public void zzdG()
        {
            Object obj;
            int i;
            i = 0;
            obj = zzF;
_L11:
            if (i >= 10) goto _L2; else goto _L1
_L1:
            Object obj1;
            boolean flag;
            obj1 = new URL(((String) (obj)));
            flag = "play.google.com".equalsIgnoreCase(((URL) (obj1)).getHost());
            if (!flag) goto _L3; else goto _L2
_L2:
            obj = zzY(((String) (obj)));
            zzoL.getContext().startActivity(((Intent) (obj)));
            return;
_L3:
            if (!"market".equalsIgnoreCase(((URL) (obj1)).getProtocol())) goto _L4; else goto _L2
_L4:
            HttpURLConnection httpurlconnection = (HttpURLConnection)((URL) (obj1)).openConnection();
            Map map;
            int j;
            zzp.zzbx().zza(zzoL.getContext(), zzoL.zzgV().zzIz, false, httpurlconnection);
            j = httpurlconnection.getResponseCode();
            map = httpurlconnection.getHeaderFields();
            if (j < 300 || j > 399)
            {
                break MISSING_BLOCK_LABEL_365;
            }
            obj1 = null;
            if (!map.containsKey("Location")) goto _L6; else goto _L5
_L5:
            obj1 = (List)map.get("Location");
_L10:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_365;
            }
            if (((List) (obj1)).size() <= 0)
            {
                break MISSING_BLOCK_LABEL_365;
            }
            obj1 = (String)((List) (obj1)).get(0);
_L15:
            if (!TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L8; else goto _L7
_L7:
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Arrived at landing page, this ideally should not happen. Will open it in browser.");
            httpurlconnection.disconnect();
              goto _L2
_L6:
            if (!map.containsKey("location")) goto _L10; else goto _L9
_L9:
            obj1 = (List)map.get("location");
              goto _L10
_L8:
            httpurlconnection.disconnect();
            i++;
            obj = obj1;
              goto _L11
            obj1;
            httpurlconnection.disconnect();
            throw obj1;
            obj1;
_L14:
            com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Error while parsing ping URL: ").append(((String) (obj))).toString(), ((Throwable) (obj1)));
              goto _L2
            obj1;
_L13:
            com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Error while pinging URL: ").append(((String) (obj))).toString(), ((Throwable) (obj1)));
              goto _L2
            obj1;
_L12:
            com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Error while pinging URL: ").append(((String) (obj))).toString(), ((Throwable) (obj1)));
              goto _L2
            Object obj2;
            obj2;
            obj = obj1;
            obj1 = obj2;
              goto _L12
            obj2;
            obj = obj1;
            obj1 = obj2;
              goto _L13
            obj2;
            obj = obj1;
            obj1 = obj2;
              goto _L14
            obj1 = "";
              goto _L15
        }

        public zza(zzip zzip1, String s)
        {
            zzoL = zzip1;
            zzF = s;
        }
    }

    public static class zzb
    {

        public Intent zza(Intent intent, ResolveInfo resolveinfo)
        {
            intent = new Intent(intent);
            intent.setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
            return intent;
        }

        public ResolveInfo zza(Context context, Intent intent)
        {
            return zza(context, intent, new ArrayList());
        }

        public ResolveInfo zza(Context context, Intent intent, ArrayList arraylist)
        {
            List list;
            int i;
            context = context.getPackageManager();
            if (context == null)
            {
                return null;
            }
            list = context.queryIntentActivities(intent, 0x10000);
            context = context.resolveActivity(intent, 0x10000);
            if (list == null || context == null)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            i = 0;
_L3:
            if (i >= list.size())
            {
                break MISSING_BLOCK_LABEL_107;
            }
            intent = (ResolveInfo)list.get(i);
            if (context == null || !((ResolveInfo) (context)).activityInfo.name.equals(((ResolveInfo) (intent)).activityInfo.name)) goto _L2; else goto _L1
_L1:
            arraylist.addAll(list);
            return context;
_L2:
            i++;
              goto _L3
            context = null;
              goto _L1
        }

        public Intent zzb(Context context, Map map)
        {
            Object obj;
            Object obj2;
            Object obj3;
            obj = null;
            obj2 = (ActivityManager)context.getSystemService("activity");
            obj3 = (String)map.get("u");
            if (!TextUtils.isEmpty(((CharSequence) (obj3)))) goto _L2; else goto _L1
_L1:
            map = obj;
_L4:
            return map;
_L2:
            Object obj1 = Uri.parse(((String) (obj3)));
            boolean flag = Boolean.parseBoolean((String)map.get("use_first_package"));
            boolean flag1 = Boolean.parseBoolean((String)map.get("use_running_process"));
            Intent intent;
            if ("http".equalsIgnoreCase(((Uri) (obj1)).getScheme()))
            {
                map = ((Uri) (obj1)).buildUpon().scheme("https").build();
            } else
            if ("https".equalsIgnoreCase(((Uri) (obj1)).getScheme()))
            {
                map = ((Uri) (obj1)).buildUpon().scheme("http").build();
            } else
            {
                map = null;
            }
            obj3 = new ArrayList();
            intent = zzd(((Uri) (obj1)));
            map = zzd(map);
            obj1 = zza(context, intent, ((ArrayList) (obj3)));
            if (obj1 != null)
            {
                return zza(intent, ((ResolveInfo) (obj1)));
            }
            if (map == null)
            {
                break; /* Loop/switch isn't completed */
            }
            map = zza(context, map);
            if (map == null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = zza(intent, map);
            map = ((Map) (obj1));
            if (zza(context, ((Intent) (obj1))) != null) goto _L4; else goto _L3
_L3:
            if (((ArrayList) (obj3)).size() == 0)
            {
                return intent;
            }
            if (!flag1 || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_315;
            }
            context = ((ActivityManager) (obj2)).getRunningAppProcesses();
            if (context == null)
            {
                break MISSING_BLOCK_LABEL_315;
            }
            map = ((ArrayList) (obj3)).iterator();
_L6:
            if (!map.hasNext())
            {
                break MISSING_BLOCK_LABEL_315;
            }
            obj1 = (ResolveInfo)map.next();
            obj2 = context.iterator();
_L8:
            if (!((Iterator) (obj2)).hasNext()) goto _L6; else goto _L5
_L5:
            if (!((android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj2)).next()).processName.equals(((ResolveInfo) (obj1)).activityInfo.packageName)) goto _L8; else goto _L7
_L7:
            return zza(intent, ((ResolveInfo) (obj1)));
            if (flag)
            {
                return zza(intent, (ResolveInfo)((ArrayList) (obj3)).get(0));
            } else
            {
                return intent;
            }
        }

        public Intent zzd(Uri uri)
        {
            if (uri == null)
            {
                return null;
            } else
            {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(0x10000000);
                intent.setData(uri);
                intent.setAction("android.intent.action.VIEW");
                return intent;
            }
        }

        public zzb()
        {
        }
    }


    private final zze zzxj;
    private final zzew zzxk;
    private final zzdi zzxm;

    public zzdn(zzdi zzdi1, zze zze1, zzew zzew1)
    {
        zzxm = zzdi1;
        zzxj = zze1;
        zzxk = zzew1;
    }

    private static void zza(Context context, Map map)
    {
        if (TextUtils.isEmpty((String)map.get("u")))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Destination url cannot be empty.");
            return;
        }
        map = (new zzb()).zzb(context, map);
        try
        {
            context.startActivity(map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(context.getMessage());
        }
    }

    private static void zzb(zzip zzip1, Map map)
    {
        map = (String)map.get("u");
        if (TextUtils.isEmpty(map))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Destination url cannot be empty.");
            return;
        } else
        {
            (new zza(zzip1, map)).zzgn();
            return;
        }
    }

    private static boolean zzc(Map map)
    {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzd(Map map)
    {
        map = (String)map.get("o");
        if (map != null)
        {
            if ("p".equalsIgnoreCase(map))
            {
                return zzp.zzbz().zzgw();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return zzp.zzbz().zzgv();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return zzp.zzbz().zzgx();
            }
        }
        return -1;
    }

    private void zzm(boolean flag)
    {
        if (zzxk != null)
        {
            zzxk.zzn(flag);
        }
    }

    public void zza(zzip zzip1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Action missing from an open GMSG.");
        } else
        {
            if (zzxj != null && !zzxj.zzbe())
            {
                zzxj.zzp((String)map.get("u"));
                return;
            }
            zziq zziq1 = zzip1.zzgS();
            if ("expand".equalsIgnoreCase(s))
            {
                if (zzip1.zzgW())
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    zzm(false);
                    zziq1.zza(zzc(map), zzd(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                zzip1 = (String)map.get("u");
                zzm(false);
                if (zzip1 != null)
                {
                    zziq1.zza(zzc(map), zzd(map), zzip1);
                    return;
                } else
                {
                    zziq1.zza(zzc(map), zzd(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                zzip1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (zzxm != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        zzxm.zza(zzip1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        zzxm.zza(zzip1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                if ("app".equalsIgnoreCase(s) && "true".equalsIgnoreCase((String)map.get("play_store")))
                {
                    zzb(zzip1, map);
                    return;
                }
                if ("app".equalsIgnoreCase(s) && "true".equalsIgnoreCase((String)map.get("system_browser")))
                {
                    zza(zzip1.getContext(), map);
                    return;
                }
                zzm(true);
                zzan zzan1 = zzip1.zzgU();
                s = (String)map.get("u");
                if (!TextUtils.isEmpty(s))
                {
                    String s1 = s;
                    if (zzan1 != null)
                    {
                        s1 = s;
                        if (zzan1.zzb(Uri.parse(s)))
                        {
                            s1 = zzp.zzbx().zzd(zzip1.getContext(), s, zzip1.zzha());
                        }
                    }
                    zzip1 = zzp.zzbx().zza(zzip1, s1);
                } else
                {
                    zzip1 = s;
                }
                zziq1.zza(new AdLauncherIntentInfoParcel((String)map.get("i"), zzip1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
