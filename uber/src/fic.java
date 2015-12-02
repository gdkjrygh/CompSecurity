// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.ubercab.client.feature.share.ShareActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class fic
{

    private static final List a = (new gkf()).a(new fid("com.google.android.talk", 100)).a(new fid("com.android.mms", 90)).a(new fid("com.facebook.orca", 80)).a(new fid("com.bbm", 40)).a(new fid("com.groupme.android", 30)).a(new fid("com.viber.voip", 20)).a(new fid("com.skype.raider", 10)).a(new fid("com.whatsapp", 95, "US", 70)).a(new fid("com.tencent.mm", 50, "ZH", 200)).a(new fid("com.sina.weibo", 40, "ZH", 150)).a(new fid("jp.naver.line.android", 40, "JP", 200)).a(new fid("com.kakao.talk", 40, "KR", 200)).a();
    private final Context b;
    private String c;
    private String d;
    private final Set e = new HashSet();
    private final List f = new ArrayList();

    public fic(Context context)
    {
        b = context;
    }

    private static String a(Context context)
    {
        return android.provider.Telephony.Sms.getDefaultSmsPackage(context);
    }

    private void a(Intent intent, String s, String s1)
    {
        PackageManager packagemanager = b.getPackageManager();
        intent = packagemanager.queryIntentActivities(intent, 0).iterator();
        do
        {
            if (!intent.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)intent.next();
            ActivityInfo activityinfo = resolveinfo.activityInfo;
            if (activityinfo != null)
            {
                String s2 = activityinfo.packageName;
                if (!e.contains(s2) && !"com.google.android.apps.docs.app.SendTextToClipboardActivity".equals(activityinfo.name))
                {
                    e.add(s2);
                    Intent intent1 = new Intent();
                    intent1.setAction("android.intent.action.SEND");
                    intent1.setType("text/plain");
                    if (!TextUtils.isEmpty(s))
                    {
                        intent1.putExtra("android.intent.extra.SUBJECT", s);
                    }
                    intent1.putExtra("android.intent.extra.TEXT", cxf.b(s1));
                    intent1.setComponent(new ComponentName(s2, activityinfo.name));
                    f.add(new LabeledIntent(intent1, s2, activityinfo.loadLabel(packagemanager), resolveinfo.getIconResource()));
                }
            }
        } while (true);
    }

    private Intent b()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("uber_share://cancel"));
        return new LabeledIntent(intent, b.getPackageName(), b.getResources().getString(0x7f07009a), 0);
    }

    private fic b(String s, String s1)
    {
        if (!cwm.b(b, s1) || e.contains(s1))
        {
            return this;
        } else
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.setPackage(s1);
            intent.putExtra("android.intent.extra.TEXT", s);
            a(intent, null, s);
            return this;
        }
    }

    private void b(Intent intent)
    {
        Iterator iterator = b.getPackageManager().queryIntentActivities(intent, 0).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ActivityInfo activityinfo = ((ResolveInfo)iterator.next()).activityInfo;
            if (activityinfo == null || e.contains(activityinfo.packageName))
            {
                continue;
            }
            e.add(activityinfo.packageName);
            f.add(intent);
            break;
        } while (true);
    }

    private static Intent c(String s, String s1)
    {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData((new android.net.Uri.Builder()).scheme("mailto").appendQueryParameter("subject", s).build());
        if (!TextUtils.isEmpty(s1))
        {
            intent.putExtra("android.intent.extra.TEXT", s1);
        }
        return intent;
    }

    private static Intent f(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData((new android.net.Uri.Builder()).scheme("uber_share").authority("copy").appendQueryParameter("text", s).build());
        return intent;
    }

    private List g(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fid fid1 = (fid)iterator.next();
            if (cwm.b(b, fid1.a()) && !e.contains(fid1.a()))
            {
                arraylist.add(fid1);
            }
        } while (true);
        Collections.sort(arraylist, new Comparator(s) {

            final String a;
            final fic b;

            private int a(fid fid2, fid fid3)
            {
                return fid3.a(a) - fid2.a(a);
            }

            public final int compare(Object obj, Object obj1)
            {
                return a((fid)obj, (fid)obj1);
            }

            
            {
                b = fic.this;
                a = s;
                super();
            }
        });
        return arraylist;
    }

    public final fic a(String s)
    {
        d = s;
        return this;
    }

    public final fic a(String s, String s1)
    {
        a(c(s, s1), s, s1);
        return this;
    }

    public final fic a(String s, String s1, List list)
    {
        Intent intent = new Intent(b, com/ubercab/client/feature/share/ShareActivity);
        intent.putExtra("com.ubercab.EXTRA_CONFIRM_DIALOG", true);
        intent.putExtra("subject", s);
        intent.putExtra("body", s1);
        intent.putStringArrayListExtra("exclude", new ArrayList(list));
        s = new LabeledIntent(intent, b.getPackageName(), b.getResources().getString(0x7f0703ec), 0x7f0201b2);
        f.add(s);
        e.add(b.getPackageName());
        return this;
    }

    public final void a()
    {
        Intent intent;
        String s;
        if (d != null)
        {
            intent = f(d);
        } else
        {
            intent = b();
        }
        if (c != null)
        {
            s = c;
        } else
        {
            s = b.getString(0x7f0703e8);
        }
        intent = Intent.createChooser(intent, s);
        if (!f.isEmpty())
        {
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Intent[])f.toArray(new Intent[f.size()]));
        }
        b.startActivity(intent);
    }

    public final void a(Intent intent)
    {
        if (intent != null)
        {
            f.add(intent);
        }
    }

    public final fic b(String s)
    {
        c = s;
        return this;
    }

    public final fic c(String s)
    {
        for (Iterator iterator = g(Locale.getDefault().getCountry()).iterator(); iterator.hasNext(); b(s, ((fid)iterator.next()).a())) { }
        return this;
    }

    public final fic d(String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            String s1 = a(b);
            if (s1 != null)
            {
                b(s, s1);
            }
            return this;
        } else
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("sms:"));
            intent.putExtra("sms_body", s);
            b(intent);
            return this;
        }
    }

    public final fic e(String s)
    {
        a((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", s), null, s);
        return this;
    }

}
