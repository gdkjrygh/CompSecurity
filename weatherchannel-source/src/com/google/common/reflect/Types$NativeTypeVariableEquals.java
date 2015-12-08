// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.lang.reflect.Type;

// Referenced classes of package com.google.common.reflect:
//            Types

static final class 
{

    static final boolean NATIVE_TYPE_VARIABLE_ONLY;

    static 
    {
        boolean flag = false;
        if (!com/google/common/reflect/Types$NativeTypeVariableEquals.getTypeParameters()[0].equals(Types.newArtificialTypeVariable(com/google/common/reflect/Types$NativeTypeVariableEquals, "X", new Type[0])))
        {
            flag = true;
        }
        NATIVE_TYPE_VARIABLE_ONLY = flag;
    }

    ()
    {
    }
}
