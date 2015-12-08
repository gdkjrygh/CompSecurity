// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import org.codehaus.jackson.map.Serializers;
import org.codehaus.jackson.map.util.ArrayBuilders;

// Referenced classes of package org.codehaus.jackson.map.ser:
//            BeanSerializerFactory, BeanSerializerModifier

public static class _modifiers extends org.codehaus.jackson.map.mpl
{

    protected static final BeanSerializerModifier NO_MODIFIERS[] = new BeanSerializerModifier[0];
    protected static final Serializers NO_SERIALIZERS[] = new Serializers[0];
    protected final Serializers _additionalKeySerializers[];
    protected final Serializers _additionalSerializers[];
    protected final BeanSerializerModifier _modifiers[];

    public boolean hasKeySerializers()
    {
        return _additionalKeySerializers.length > 0;
    }

    public boolean hasSerializerModifiers()
    {
        return _modifiers.length > 0;
    }

    public boolean hasSerializers()
    {
        return _additionalSerializers.length > 0;
    }

    public Iterable keySerializers()
    {
        return ArrayBuilders.arrayAsIterable(_additionalKeySerializers);
    }

    public Iterable serializerModifiers()
    {
        return ArrayBuilders.arrayAsIterable(_modifiers);
    }

    public Iterable serializers()
    {
        return ArrayBuilders.arrayAsIterable(_additionalSerializers);
    }

    public org.codehaus.jackson.map.mpl withAdditionalKeySerializers(Serializers serializers1)
    {
        if (serializers1 == null)
        {
            throw new IllegalArgumentException("Can not pass null Serializers");
        } else
        {
            serializers1 = (Serializers[])ArrayBuilders.insertInListNoDup(_additionalKeySerializers, serializers1);
            return new <init>(_additionalSerializers, serializers1, _modifiers);
        }
    }

    public org.codehaus.jackson.map.mpl withAdditionalSerializers(Serializers serializers1)
    {
        if (serializers1 == null)
        {
            throw new IllegalArgumentException("Can not pass null Serializers");
        } else
        {
            return new <init>((Serializers[])ArrayBuilders.insertInListNoDup(_additionalSerializers, serializers1), _additionalKeySerializers, _modifiers);
        }
    }

    public org.codehaus.jackson.map.mpl withSerializerModifier(BeanSerializerModifier beanserializermodifier)
    {
        if (beanserializermodifier == null)
        {
            throw new IllegalArgumentException("Can not pass null modifier");
        } else
        {
            beanserializermodifier = (BeanSerializerModifier[])ArrayBuilders.insertInListNoDup(_modifiers, beanserializermodifier);
            return new <init>(_additionalSerializers, _additionalKeySerializers, beanserializermodifier);
        }
    }


    public ()
    {
        this(null, null, null);
    }

    protected <init>(Serializers aserializers[], Serializers aserializers1[], BeanSerializerModifier abeanserializermodifier[])
    {
        Serializers aserializers2[] = aserializers;
        if (aserializers == null)
        {
            aserializers2 = NO_SERIALIZERS;
        }
        _additionalSerializers = aserializers2;
        aserializers = aserializers1;
        if (aserializers1 == null)
        {
            aserializers = NO_SERIALIZERS;
        }
        _additionalKeySerializers = aserializers;
        aserializers = abeanserializermodifier;
        if (abeanserializermodifier == null)
        {
            aserializers = NO_MODIFIERS;
        }
        _modifiers = aserializers;
    }
}
