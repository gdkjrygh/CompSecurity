// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class <init>
{

    boolean zzanC;
    boolean zzanD;
    int zzanE;
    boolean zzanF;
    int zzanG;
    String zzanH;
    ArrayList zzanI;

    public <init> build()
    {
        return new <init>(this, null);
    }

    public <init> setSdkVariant(int i)
    {
        zzanG = i;
        return this;
    }

    public zzanG setShowConnectingPopup(boolean flag)
    {
        zzanD = flag;
        zzanE = 17;
        return this;
    }

    public zzanE setShowConnectingPopup(boolean flag, int i)
    {
        zzanD = flag;
        zzanE = i;
        return this;
    }

    private ()
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
}
