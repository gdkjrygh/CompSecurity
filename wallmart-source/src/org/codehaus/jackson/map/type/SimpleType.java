// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.type;

import java.util.Collection;
import java.util.Map;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.type:
//            TypeBase

public final class SimpleType extends TypeBase
{

    protected final String _typeNames[];
    protected final JavaType _typeParameters[];

    protected SimpleType(Class class1)
    {
        this(class1, null, null, null, null);
    }

    protected SimpleType(Class class1, String as[], JavaType ajavatype[])
    {
        this(class1, as, ajavatype, null, null);
    }

    protected SimpleType(Class class1, String as[], JavaType ajavatype[], Object obj, Object obj1)
    {
        super(class1, 0, obj, obj1);
        if (as == null || as.length == 0)
        {
            _typeNames = null;
            _typeParameters = null;
            return;
        } else
        {
            _typeNames = as;
            _typeParameters = ajavatype;
            return;
        }
    }

    public static SimpleType construct(Class class1)
    {
        if (java/util/Map.isAssignableFrom(class1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not construct SimpleType for a Map (class: ").append(class1.getName()).append(")").toString());
        }
        if (java/util/Collection.isAssignableFrom(class1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not construct SimpleType for a Collection (class: ").append(class1.getName()).append(")").toString());
        }
        if (class1.isArray())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not construct SimpleType for an array (class: ").append(class1.getName()).append(")").toString());
        } else
        {
            return new SimpleType(class1);
        }
    }

    public static SimpleType constructUnsafe(Class class1)
    {
        return new SimpleType(class1, null, null, null, null);
    }

    protected JavaType _narrow(Class class1)
    {
        return new SimpleType(class1, _typeNames, _typeParameters, _valueHandler, _typeHandler);
    }

    protected String buildCanonicalName()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(_class.getName());
        if (_typeParameters != null && _typeParameters.length > 0)
        {
            stringbuilder.append('<');
            boolean flag = true;
            JavaType ajavatype[] = _typeParameters;
            int j = ajavatype.length;
            int i = 0;
            while (i < j) 
            {
                JavaType javatype = ajavatype[i];
                if (flag)
                {
                    flag = false;
                } else
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append(javatype.toCanonical());
                i++;
            }
            stringbuilder.append('>');
        }
        return stringbuilder.toString();
    }

    public JavaType containedType(int i)
    {
        if (i < 0 || _typeParameters == null || i >= _typeParameters.length)
        {
            return null;
        } else
        {
            return _typeParameters[i];
        }
    }

    public int containedTypeCount()
    {
        if (_typeParameters == null)
        {
            return 0;
        } else
        {
            return _typeParameters.length;
        }
    }

    public String containedTypeName(int i)
    {
        if (i < 0 || _typeNames == null || i >= _typeNames.length)
        {
            return null;
        } else
        {
            return _typeNames[i];
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        JavaType ajavatype[];
        flag = flag1;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (obj.getClass() != getClass())
        {
            continue; /* Loop/switch isn't completed */
        }
        SimpleType simpletype = (SimpleType)obj;
        flag = flag1;
        if (simpletype._class != _class)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = _typeParameters;
        ajavatype = simpletype._typeParameters;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (ajavatype == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (ajavatype.length != 0) goto _L4; else goto _L3
_L3:
        return true;
        flag = flag1;
        if (ajavatype != null)
        {
            flag = flag1;
            if (obj.length == ajavatype.length)
            {
                int i = 0;
                int j = obj.length;
label0:
                do
                {
label1:
                    {
                        if (i >= j)
                        {
                            break label1;
                        }
                        flag = flag1;
                        if (!obj[i].equals(ajavatype[i]))
                        {
                            break label0;
                        }
                        i++;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
        return true;
    }

    public StringBuilder getErasedSignature(StringBuilder stringbuilder)
    {
        return _classSignature(_class, stringbuilder, true);
    }

    public StringBuilder getGenericSignature(StringBuilder stringbuilder)
    {
        _classSignature(_class, stringbuilder, false);
        Object obj = stringbuilder;
        if (_typeParameters != null)
        {
            stringbuilder.append('<');
            obj = _typeParameters;
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                stringbuilder = obj[i].getGenericSignature(stringbuilder);
            }

            stringbuilder.append('>');
            obj = stringbuilder;
        }
        ((StringBuilder) (obj)).append(';');
        return ((StringBuilder) (obj));
    }

    public boolean isContainerType()
    {
        return false;
    }

    public JavaType narrowContentsBy(Class class1)
    {
        throw new IllegalArgumentException("Internal error: SimpleType.narrowContentsBy() should never be called");
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(40);
        stringbuilder.append("[simple type, class ").append(buildCanonicalName()).append(']');
        return stringbuilder.toString();
    }

    public JavaType widenContentsBy(Class class1)
    {
        throw new IllegalArgumentException("Internal error: SimpleType.widenContentsBy() should never be called");
    }

    public JavaType withContentTypeHandler(Object obj)
    {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
    }

    public SimpleType withContentValueHandler(Object obj)
    {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenValueHandler()");
    }

    public volatile JavaType withContentValueHandler(Object obj)
    {
        return withContentValueHandler(obj);
    }

    public SimpleType withTypeHandler(Object obj)
    {
        return new SimpleType(_class, _typeNames, _typeParameters, _valueHandler, obj);
    }

    public volatile JavaType withTypeHandler(Object obj)
    {
        return withTypeHandler(obj);
    }

    public SimpleType withValueHandler(Object obj)
    {
        if (obj == _valueHandler)
        {
            return this;
        } else
        {
            return new SimpleType(_class, _typeNames, _typeParameters, obj, _typeHandler);
        }
    }

    public volatile JavaType withValueHandler(Object obj)
    {
        return withValueHandler(obj);
    }
}
