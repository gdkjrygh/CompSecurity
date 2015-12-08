// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

// Referenced classes of package com.google.gson.internal:
//            ObjectConstructor, ConstructorConstructor

class val.type
    implements ObjectConstructor
{

    final ConstructorConstructor this$0;
    final InstanceCreator val$rawTypeCreator;
    final Type val$type;

    public Object construct()
    {
        return val$rawTypeCreator.createInstance(val$type);
    }

    ()
    {
        this$0 = final_constructorconstructor;
        val$rawTypeCreator = instancecreator;
        val$type = Type.this;
        super();
    }
}
