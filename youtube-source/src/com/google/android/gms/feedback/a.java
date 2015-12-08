// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.feedback:
//            ErrorReport

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ErrorReport errorreport, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, errorreport.versionCode);
        b.a(parcel, 2, errorreport.applicationErrorReport, i, false);
        b.a(parcel, 3, errorreport.description, false);
        b.a(parcel, 4, errorreport.packageVersion);
        b.a(parcel, 5, errorreport.packageVersionName, false);
        b.a(parcel, 6, errorreport.device, false);
        b.a(parcel, 7, errorreport.buildId, false);
        b.a(parcel, 8, errorreport.buildType, false);
        b.a(parcel, 9, errorreport.model, false);
        b.a(parcel, 10, errorreport.product, false);
        b.a(parcel, 11, errorreport.buildFingerprint, false);
        b.a(parcel, 12, errorreport.sdk_int);
        b.a(parcel, 13, errorreport.release, false);
        b.a(parcel, 14, errorreport.incremental, false);
        b.a(parcel, 15, errorreport.codename, false);
        b.a(parcel, 17, errorreport.brand, false);
        b.a(parcel, 16, errorreport.board, false);
        b.a(parcel, 19, errorreport.systemLog, false);
        b.a(parcel, 18, errorreport.runningApplications, false);
        b.a(parcel, 21, errorreport.anrStackTraces, false);
        b.a(parcel, 20, errorreport.eventLog, false);
        b.a(parcel, 23, errorreport.screenshotBytes, false);
        b.a(parcel, 22, errorreport.screenshot, false);
        b.a(parcel, 25, errorreport.screenshotWidth);
        b.a(parcel, 24, errorreport.screenshotHeight);
        b.a(parcel, 27, errorreport.networkType);
        b.a(parcel, 26, errorreport.phoneType);
        b.a(parcel, 29, errorreport.account, false);
        b.a(parcel, 28, errorreport.networkName, false);
        b.a(parcel, 31, errorreport.psdBundle, false);
        b.a(parcel, 30, errorreport.localeString, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k1 = 0;
        ApplicationErrorReport applicationerrorreport = null;
        String s17 = null;
        int j1 = 0;
        String s16 = null;
        String s15 = null;
        String s14 = null;
        String s13 = null;
        String s12 = null;
        String s11 = null;
        String s10 = null;
        int i1 = 0;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String as2[] = null;
        String as1[] = null;
        String as[] = null;
        String s4 = null;
        String s3 = null;
        byte abyte0[] = null;
        int l = 0;
        int k = 0;
        int j = 0;
        int i = 0;
        String s2 = null;
        String s1 = null;
        String s = null;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < l1)
            {
                int i2 = parcel.readInt();
                switch (0xffff & i2)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i2);
                    break;

                case 1: // '\001'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
                    break;

                case 2: // '\002'
                    applicationerrorreport = (ApplicationErrorReport)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i2, ApplicationErrorReport.CREATOR);
                    break;

                case 3: // '\003'
                    s17 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 4: // '\004'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
                    break;

                case 5: // '\005'
                    s16 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 6: // '\006'
                    s15 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 7: // '\007'
                    s14 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 8: // '\b'
                    s13 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 9: // '\t'
                    s12 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 10: // '\n'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 11: // '\013'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 12: // '\f'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
                    break;

                case 13: // '\r'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 14: // '\016'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 15: // '\017'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 17: // '\021'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 16: // '\020'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 19: // '\023'
                    as1 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i2);
                    break;

                case 18: // '\022'
                    as2 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i2);
                    break;

                case 21: // '\025'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 20: // '\024'
                    as = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i2);
                    break;

                case 23: // '\027'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i2);
                    break;

                case 22: // '\026'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 25: // '\031'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
                    break;

                case 24: // '\030'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
                    break;

                case 27: // '\033'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
                    break;

                case 26: // '\032'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i2);
                    break;

                case 29: // '\035'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 28: // '\034'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;

                case 31: // '\037'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i2);
                    break;

                case 30: // '\036'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i2);
                    break;
                }
            } else
            if (parcel.dataPosition() != l1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(l1).toString(), parcel);
            } else
            {
                return new ErrorReport(k1, applicationerrorreport, s17, j1, s16, s15, s14, s13, s12, s11, s10, i1, s9, s8, s7, s6, s5, as2, as1, as, s4, s3, abyte0, l, k, j, i, s2, s1, s, bundle);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ErrorReport[i];
    }
}
