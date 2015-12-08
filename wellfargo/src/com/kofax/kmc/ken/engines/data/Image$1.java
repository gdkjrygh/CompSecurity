// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

class Info
{

    static final int $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[];
    static final int $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[];

    static 
    {
        $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization = new int[tmapSerialization.values().length];
        try
        {
            $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[tmapSerialization.IMAGE_REP_FILE_BUFFERED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[tmapSerialization.IMAGE_REP_BITMAP_NONE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[tmapSerialization.IMAGE_REP_BOTH_STORED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[tmapSerialization.IMAGE_REP_BOTH_BUFFERED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[tmapSerialization.IMAGE_REP_NONE_NONE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[tmapSerialization.IMAGE_REP_FILE_STORED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo = new int[ErrorInfo.values().length];
        try
        {
            $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_GN_FILE_NOT_FOUND.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_GN_OUT_OF_MEMORY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_ED_FILE_STILL_REMAINS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_ED_FILE_EXISTS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_ED_IMAGELEAK.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
