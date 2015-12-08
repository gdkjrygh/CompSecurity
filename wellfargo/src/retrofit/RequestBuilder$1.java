// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


class 
{

    static final int $SwitchMap$retrofit$RestMethodInfo$ParamUsage[];
    static final int $SwitchMap$retrofit$RestMethodInfo$RequestType[];

    static 
    {
        $SwitchMap$retrofit$RestMethodInfo$ParamUsage = new int[ramUsage.values().length];
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.PATH.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.ENCODED_PATH.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.QUERY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.ENCODED_QUERY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.QUERY_MAP.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.ENCODED_QUERY_MAP.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.HEADER.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.FIELD.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.FIELD_MAP.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.PART.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.PART_MAP.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage[ramUsage.BODY.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        $SwitchMap$retrofit$RestMethodInfo$RequestType = new int[questType.values().length];
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$RequestType[questType.FORM_URL_ENCODED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$RequestType[questType.MULTIPART.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$RequestType[questType.SIMPLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
