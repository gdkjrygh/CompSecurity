// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AppContentSection
    extends Parcelable, Freezable
{

    public abstract List getActions();

    public abstract Bundle getExtras();

    public abstract String getId();

    public abstract String getTitle();

    public abstract String getType();

    public abstract String zzrP();

    public abstract List zzrZ();

    public abstract String zzsb();

    public abstract List zzsj();

    public abstract String zzsk();
}
