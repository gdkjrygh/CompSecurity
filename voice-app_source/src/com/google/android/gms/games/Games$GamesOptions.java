// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class Builder
    implements com.google.android.gms.common.api.onal
{
    public static final class Builder
    {

        boolean zzanC;
        boolean zzanD;
        int zzanE;
        boolean zzanF;
        int zzanG;
        String zzanH;
        ArrayList zzanI;

        public Games.GamesOptions build()
        {
            return new Games.GamesOptions(this, null);
        }

        public Builder setSdkVariant(int i)
        {
            zzanG = i;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag)
        {
            zzanD = flag;
            zzanE = 17;
            return this;
        }

        public Builder setShowConnectingPopup(boolean flag, int i)
        {
            zzanD = flag;
            zzanE = i;
            return this;
        }

        private Builder()
        {
            zzanC = false;
            zzanD = true;
            zzanE = 17;
            zzanF = false;
            zzanG = 4368;
            zzanH = null;
            zzanI = new ArrayList();
        }

        Builder(Games._cls1 _pcls1)
        {
            this();
        }
    }


    public final boolean zzanC;
    public final boolean zzanD;
    public final int zzanE;
    public final boolean zzanF;
    public final int zzanG;
    public final String zzanH;
    public final ArrayList zzanI;

    public static Builder builder()
    {
        return new Builder(null);
    }

    public Bundle zzrI()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", zzanC);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", zzanD);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", zzanE);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", zzanF);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", zzanG);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", zzanH);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", zzanI);
        return bundle;
    }

    private Builder()
    {
        zzanC = false;
        zzanD = true;
        zzanE = 17;
        zzanF = false;
        zzanG = 4368;
        zzanH = null;
        zzanI = new ArrayList();
    }

    zzanI(zzanI zzani)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        zzanC = builder1.zzanC;
        zzanD = builder1.zzanD;
        zzanE = builder1.zzanE;
        zzanF = builder1.zzanF;
        zzanG = builder1.zzanG;
        zzanH = builder1.zzanH;
        zzanI = builder1.zzanI;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
