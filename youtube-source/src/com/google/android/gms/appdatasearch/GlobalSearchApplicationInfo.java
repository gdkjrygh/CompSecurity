// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ab

public class GlobalSearchApplicationInfo
    implements SafeParcelable
{

    public static final ab CREATOR = new ab();
    public static final int NO_RESOURCE_ID = 0;
    public final String defaultIntentAction;
    public final String defaultIntentActivity;
    public final String defaultIntentData;
    public final int iconId;
    final int jE;
    public final int labelId;
    final String packageName;
    public final int settingsDescriptionId;

    public GlobalSearchApplicationInfo(int i, int j, int k, String s, String s1, String s2)
    {
        this(null, i, j, k, s, s1, s2);
    }

    GlobalSearchApplicationInfo(int i, String s, int j, int k, int l, String s1, String s2, 
            String s3)
    {
        jE = i;
        packageName = s;
        labelId = j;
        settingsDescriptionId = k;
        iconId = l;
        defaultIntentAction = s1;
        defaultIntentData = s2;
        defaultIntentActivity = s3;
    }

    public GlobalSearchApplicationInfo(String s, int i, int j, int k, String s1, String s2, String s3)
    {
        this(2, s, i, j, k, s1, s2, s3);
    }

    public int describeContents()
    {
        ab ab1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof GlobalSearchApplicationInfo)
            {
                if (!TextUtils.equals(packageName, ((GlobalSearchApplicationInfo) (obj = (GlobalSearchApplicationInfo)obj)).packageName) || labelId != ((GlobalSearchApplicationInfo) (obj)).labelId || settingsDescriptionId != ((GlobalSearchApplicationInfo) (obj)).settingsDescriptionId || iconId != ((GlobalSearchApplicationInfo) (obj)).iconId || !TextUtils.equals(defaultIntentAction, ((GlobalSearchApplicationInfo) (obj)).defaultIntentAction) || !TextUtils.equals(defaultIntentData, ((GlobalSearchApplicationInfo) (obj)).defaultIntentData) || !TextUtils.equals(defaultIntentActivity, ((GlobalSearchApplicationInfo) (obj)).defaultIntentActivity))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public String getPackageName()
    {
        return packageName;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("{").append(packageName).append(";labelId=").append(Integer.toHexString(labelId)).append(";settingsDescriptionId=").append(Integer.toHexString(settingsDescriptionId)).append(";iconId=").append(Integer.toHexString(iconId)).append(";defaultIntentAction=").append(defaultIntentAction).append(";defaultIntentData=").append(defaultIntentData).append(";defaultIntentActivity=").append(defaultIntentActivity).append("}").toString();
    }

    GlobalSearchApplicationInfo w(String s)
    {
        return new GlobalSearchApplicationInfo(jE, s, labelId, settingsDescriptionId, iconId, defaultIntentAction, defaultIntentData, defaultIntentActivity);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ab ab1 = CREATOR;
        ab.a(this, parcel);
    }

}
