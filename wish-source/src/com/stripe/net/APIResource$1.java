// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;


// Referenced classes of package com.stripe.net:
//            APIResource

static class questMethod
{

    static final int $SwitchMap$com$stripe$net$APIResource$RequestMethod[];

    static 
    {
        $SwitchMap$com$stripe$net$APIResource$RequestMethod = new int[questMethod.values().length];
        try
        {
            $SwitchMap$com$stripe$net$APIResource$RequestMethod[questMethod.GET.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$stripe$net$APIResource$RequestMethod[questMethod.POST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$stripe$net$APIResource$RequestMethod[questMethod.DELETE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
