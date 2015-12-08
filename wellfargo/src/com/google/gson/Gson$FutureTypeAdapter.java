// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson:
//            TypeAdapter

class  extends TypeAdapter
{

    private TypeAdapter _flddelegate;

    public Object read(JsonReader jsonreader)
    {
        if (_flddelegate == null)
        {
            throw new IllegalStateException();
        } else
        {
            return _flddelegate.read(jsonreader);
        }
    }

    public void setDelegate(TypeAdapter typeadapter)
    {
        if (_flddelegate != null)
        {
            throw new AssertionError();
        } else
        {
            _flddelegate = typeadapter;
            return;
        }
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        if (_flddelegate == null)
        {
            throw new IllegalStateException();
        } else
        {
            _flddelegate.write(jsonwriter, obj);
            return;
        }
    }

    ()
    {
    }
}
