// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;


// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            ExoplayerUtil

static class 
{

    static final int $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType[];

    static 
    {
        $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType = new int[values().length];
        try
        {
            $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType[HLS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType[DASH.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType[OTHER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
