// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            ObjectMapper

static class faultTyping
{

    static final int $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[];

    static 
    {
        $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping = new int[faultTyping.values().length];
        try
        {
            $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[faultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[faultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[faultTyping.NON_FINAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
