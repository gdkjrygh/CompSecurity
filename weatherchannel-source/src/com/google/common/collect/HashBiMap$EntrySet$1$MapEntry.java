// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, HashBiMap

class delegate extends AbstractMapEntry
{

    delegate _flddelegate;
    final delegate this$2;

    public Object getKey()
    {
        return _flddelegate._flddelegate;
    }

    public Object getValue()
    {
        return _flddelegate._flddelegate;
    }

    public Object setValue(Object obj)
    {
        Object obj1 = _flddelegate._flddelegate;
        int i = HashBiMap.access$300(obj);
        if (i == _flddelegate._flddelegate && Objects.equal(obj, obj1))
        {
            return obj;
        }
        boolean flag;
        if (HashBiMap.access$600(this._cls2.this._flddelegate._flddelegate, obj, i) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "value already present: %s", new Object[] {
            obj
        });
        HashBiMap.access$200(_fld2, _flddelegate);
        obj = new delegate(_flddelegate._flddelegate, _flddelegate._flddelegate, obj, i);
        HashBiMap.access$700(this._cls2.this._flddelegate._flddelegate, ((this._cls2) (obj)));
        odCount = HashBiMap.access$000(odCount);
        if (odCount == _flddelegate)
        {
            this._cls2.this._flddelegate = ((this._cls2) (obj));
        }
        _flddelegate = ((delegate) (obj));
        return obj1;
    }

    ( 1)
    {
        this$2 = this._cls2.this;
        super();
        _flddelegate = 1;
    }

    // Unreferenced inner class com/google/common/collect/HashBiMap$EntrySet$1

/* anonymous class */
    class HashBiMap.EntrySet._cls1 extends HashBiMap.Itr
    {

        final HashBiMap.EntrySet this$1;

        volatile Object output(HashBiMap.BiEntry bientry)
        {
            return output(bientry);
        }

        java.util.Map.Entry output(HashBiMap.BiEntry bientry)
        {
            return new HashBiMap.EntrySet._cls1.MapEntry(bientry);
        }

            
            {
                this$1 = HashBiMap.EntrySet.this;
                super(this$0);
            }
    }

}
