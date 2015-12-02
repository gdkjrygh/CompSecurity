// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import com.ubercab.rider.realtime.model.Upgrade;
import hnm;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_ParcelableUpgrade

public abstract class ParcelableUpgrade
    implements Parcelable, hnm
{

    public ParcelableUpgrade()
    {
    }

    public static ParcelableUpgrade create(Upgrade upgrade)
    {
        Shape_ParcelableUpgrade shape_parcelableupgrade = new Shape_ParcelableUpgrade();
        shape_parcelableupgrade.setDownloadURL(upgrade.getDownloadURL());
        shape_parcelableupgrade.setVersion(upgrade.getVersion());
        shape_parcelableupgrade.setReleaseNotesHTML(upgrade.getReleaseNotesHTML());
        return shape_parcelableupgrade;
    }

    public static ParcelableUpgrade create(String s, String s1, String s2)
    {
        Shape_ParcelableUpgrade shape_parcelableupgrade = new Shape_ParcelableUpgrade();
        shape_parcelableupgrade.setDownloadURL(s);
        shape_parcelableupgrade.setVersion(s1);
        shape_parcelableupgrade.setReleaseNotesHTML(s2);
        return shape_parcelableupgrade;
    }
}
