// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import org.codehaus.jackson.annotate.JsonMethod;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            VisibilityChecker

static class 
{

    static final int $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[];

    static 
    {
        $SwitchMap$org$codehaus$jackson$annotate$JsonMethod = new int[JsonMethod.values().length];
        try
        {
            $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.GETTER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.SETTER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.CREATOR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.FIELD.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.IS_GETTER.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.ALL.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
