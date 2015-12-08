// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.feedback:
//            a

public class ErrorReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int TYPE_USER_INITIATED_BUG_REPORT = 11;
    public String account;
    public String anrStackTraces;
    public ApplicationErrorReport applicationErrorReport;
    public String board;
    public String brand;
    public String buildFingerprint;
    public String buildId;
    public String buildType;
    public String codename;
    public String description;
    public String device;
    public String eventLog[];
    public String incremental;
    public String localeString;
    public String model;
    public String networkName;
    public int networkType;
    public int packageVersion;
    public String packageVersionName;
    public int phoneType;
    public String product;
    public Bundle psdBundle;
    public String release;
    public String runningApplications[];
    public String screenshot;
    public byte screenshotBytes[];
    public int screenshotHeight;
    public int screenshotWidth;
    public int sdk_int;
    public String systemLog[];
    public final int versionCode;

    public ErrorReport()
    {
        applicationErrorReport = new ApplicationErrorReport();
        versionCode = 1;
    }

    ErrorReport(int i, ApplicationErrorReport applicationerrorreport, String s, int j, String s1, String s2, String s3, 
            String s4, String s5, String s6, String s7, int k, String s8, String s9, 
            String s10, String s11, String s12, String as[], String as1[], String as2[], String s13, 
            String s14, byte abyte0[], int l, int i1, int j1, int k1, String s15, 
            String s16, String s17, Bundle bundle)
    {
        applicationErrorReport = new ApplicationErrorReport();
        versionCode = i;
        applicationErrorReport = applicationerrorreport;
        description = s;
        packageVersion = j;
        packageVersionName = s1;
        device = s2;
        buildId = s3;
        buildType = s4;
        model = s5;
        product = s6;
        buildFingerprint = s7;
        sdk_int = k;
        release = s8;
        incremental = s9;
        codename = s10;
        board = s11;
        brand = s12;
        runningApplications = as;
        systemLog = as1;
        eventLog = as2;
        anrStackTraces = s13;
        screenshot = s14;
        screenshotBytes = abyte0;
        screenshotHeight = l;
        screenshotWidth = i1;
        phoneType = j1;
        networkType = k1;
        networkName = s15;
        account = s16;
        localeString = s17;
        psdBundle = bundle;
    }

    public static ErrorReport fromByteArray(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = (ErrorReport)CREATOR.createFromParcel(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] toByteArray()
    {
        Parcel parcel = Parcel.obtain();
        writeToParcel(parcel, 0);
        byte abyte0[] = parcel.marshall();
        parcel.recycle();
        return abyte0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
