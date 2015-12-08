// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, HashBiMap

class delegate extends AbstractMapEntry
{

    unt _flddelegate;
    final unt this$3;

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
        if (HashBiMap.access$400(this._cls3.this._flddelegate._flddelegate._flddelegate, obj, i) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "value already present: %s", new Object[] {
            obj
        });
        HashBiMap.access$200(_fld3, _flddelegate);
        obj = new delegate(obj, i, _flddelegate._flddelegate, _flddelegate._flddelegate);
        HashBiMap.access$700(this._cls3.this._flddelegate._flddelegate._flddelegate, ((this._cls3) (obj)));
        unt = HashBiMap.access$000(unt);
        return obj1;
    }

    ( 1)
    {
        this$3 = this._cls3.this;
        super();
        _flddelegate = 1;
    }

    // Unreferenced inner class com/google/common/collect/HashBiMap$Inverse$1

/* anonymous class */
    class HashBiMap.Inverse._cls1 extends Maps.EntrySet
    {

        final HashBiMap.Inverse this$1;

        public Iterator iterator()
        {
            return new HashBiMap.Inverse._cls1._cls1();
        }

        Map map()
        {
            return HashBiMap.Inverse.this;
        }

            
            {
                this$1 = HashBiMap.Inverse.this;
                super();
            }
    }


    // Unreferenced inner class com/google/common/collect/HashBiMap$Inverse$1$1

/* anonymous class */
    class HashBiMap.Inverse._cls1._cls1 extends HashBiMap.Itr
    {

        final HashBiMap.Inverse._cls1 this$2;

        volatile Object output(HashBiMap.BiEntry bientry)
        {
            return output(bientry);
        }

        java.util.Map.Entry output(HashBiMap.BiEntry bientry)
        {
            return new HashBiMap.Inverse._cls1._cls1.InverseEntry(bientry);
        }

            
            {
                this$2 = HashBiMap.Inverse._cls1.this;
                super(this$0);
            }
    }

}
