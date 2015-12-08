// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.l;
import com.google.android.gms.dynamic.n;

// Referenced classes of package com.google.android.gms.internal:
//            bh, ka, bi, db, 
//            p, bl, cz, bo

public final class br
    implements SafeParcelable
{

    public static final bh CREATOR = new bh();
    public final cz en;
    public final bo gJ;
    public final ka gK;
    public final bi gL;
    public final db gM;
    public final p gN;
    public final String gO;
    public final boolean gP;
    public final String gQ;
    public final bl gR;
    public final int gS;
    public final int orientation;
    public final String url;
    public final int versionCode;

    br(int i, bo bo, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int i1, String s2, cz cz)
    {
        versionCode = i;
        gJ = bo;
        gK = (ka)n.a(l.a(ibinder));
        gL = (bi)n.a(l.a(ibinder1));
        gM = (db)n.a(l.a(ibinder2));
        gN = (p)n.a(l.a(ibinder3));
        gO = s;
        gP = flag;
        gQ = s1;
        gR = (bl)n.a(l.a(ibinder4));
        orientation = j;
        gS = i1;
        url = s2;
        en = cz;
    }

    public br(bo bo, ka ka1, bi bi1, bl bl1, cz cz)
    {
        versionCode = 1;
        gJ = bo;
        gK = ka1;
        gL = bi1;
        gM = null;
        gN = null;
        gO = null;
        gP = false;
        gQ = null;
        gR = bl1;
        orientation = -1;
        gS = 4;
        url = null;
        en = cz;
    }

    public br(ka ka1, bi bi1, bl bl1, db db1, int i, cz cz)
    {
        versionCode = 1;
        gJ = null;
        gK = ka1;
        gL = bi1;
        gM = db1;
        gN = null;
        gO = null;
        gP = false;
        gQ = null;
        gR = bl1;
        orientation = i;
        gS = 1;
        url = null;
        en = cz;
    }

    public br(ka ka1, bi bi1, bl bl1, db db1, boolean flag, int i, cz cz)
    {
        versionCode = 1;
        gJ = null;
        gK = ka1;
        gL = bi1;
        gM = db1;
        gN = null;
        gO = null;
        gP = flag;
        gQ = null;
        gR = bl1;
        orientation = i;
        gS = 2;
        url = null;
        en = cz;
    }

    public br(ka ka1, bi bi1, p p1, bl bl1, db db1, boolean flag, int i, 
            String s, cz cz)
    {
        versionCode = 1;
        gJ = null;
        gK = ka1;
        gL = bi1;
        gM = db1;
        gN = p1;
        gO = null;
        gP = flag;
        gQ = null;
        gR = bl1;
        orientation = i;
        gS = 3;
        url = s;
        en = cz;
    }

    public br(ka ka1, bi bi1, p p1, bl bl1, db db1, boolean flag, int i, 
            String s, String s1, cz cz)
    {
        versionCode = 1;
        gJ = null;
        gK = ka1;
        gL = bi1;
        gM = db1;
        gN = p1;
        gO = s1;
        gP = flag;
        gQ = s;
        gR = bl1;
        orientation = i;
        gS = 3;
        url = null;
        en = cz;
    }

    public static br a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/br.getClassLoader());
            intent = (br)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, br br1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", br1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    final IBinder aa()
    {
        return n.a(gK).asBinder();
    }

    final IBinder ab()
    {
        return n.a(gL).asBinder();
    }

    final IBinder ac()
    {
        return n.a(gM).asBinder();
    }

    final IBinder ad()
    {
        return n.a(gN).asBinder();
    }

    final IBinder ae()
    {
        return n.a(gR).asBinder();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bh.a(this, parcel, i);
    }

}
