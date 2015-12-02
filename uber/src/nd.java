// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

public final class nd
{

    public final Bundle a;
    public final AdRequestParcel b;
    public final AdSizeParcel c;
    public final String d;
    public final ApplicationInfo e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public final Bundle i;
    public final VersionInfoParcel j;
    public final int k;
    public final List l;
    public final Bundle m;
    public final boolean n;
    public final Messenger o;
    public final int p;
    public final int q;
    public final float r;
    public final String s;
    public final boolean t;
    public final int u;
    public final long v;
    public final String w;
    public final List x;

    public nd(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s1, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s2, 
            String s3, VersionInfoParcel versioninfoparcel, Bundle bundle1, List list, Bundle bundle2, boolean flag, Messenger messenger, 
            int i1, int j1, float f1, String s4, boolean flag1, int k1, long l1, String s5, List list1)
    {
        a = bundle;
        b = adrequestparcel;
        c = adsizeparcel;
        d = s1;
        e = applicationinfo;
        f = packageinfo;
        g = s2;
        h = s3;
        j = versioninfoparcel;
        i = bundle1;
        n = flag;
        o = messenger;
        p = i1;
        q = j1;
        r = f1;
        if (list != null && list.size() > 0)
        {
            k = 2;
            l = list;
        } else
        {
            k = 0;
            l = null;
        }
        m = bundle2;
        s = s4;
        t = flag1;
        u = k1;
        v = l1;
        w = s5;
        x = list1;
    }
}
